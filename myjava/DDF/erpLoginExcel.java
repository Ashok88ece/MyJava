package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

public class erpLoginExcel {
	
	String [][] data=null;
	
	@DataProvider(name="ERPLogin")
	
	public String[][] loginDataProvider() throws BiffException, IOException{
		
		data = getExcelData();
		
		return data;
		
		
	}

	
	public String[][] getExcelData() throws BiffException, IOException {
		
		FileInputStream excel = new FileInputStream("C:\\Users\\x230\\Desktop\\DDF.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();
		
		String testData[][] = new String[rowcount-1][columncount];
		
		for(int i=1; i<rowcount; i++) {
			for(int j=0; j<columncount; j++) {
				
				testData[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		
		return testData;
	}
	@Test(dataProvider="ERPLogin")
	
	public void loginToErp(String username,String password) throws InterruptedException {
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:64237");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(username);;
		
		driver.findElement(By.id("identifierNext")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);;
		
		driver.findElement(By.id("passwordNext")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User not able to login - Invalid Credentials");
		
		System.out.println("Browser Title Verified: User Logged successfully");
		 
		driver.quit();
		
				
		}
	

}
