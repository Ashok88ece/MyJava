package DDF;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ERPLogin {
	
	public WebDriver driver;
		
	@Test(dataProvider="ERPLogin")
	
	public void loginToErp(String username,String password) throws InterruptedException {
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
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
	
	@AfterMethod
	
	//public void teardown() {
		
	//	driver.quit();
	//}

	
	@DataProvider(name="ERPLogin")
	
	public Object[][] passData(){
		
		Object[][] data = new Object[5][2];
		
		data [0][0] = "envirocal81@gmail.com";
		
		data [0][1] = "ENVIROCAL81";
	       		
		data [1][0] = "envirocal82@gmail.com";
		
		data [1][1] = "ENVIROCAL82";
		
        data [2][0] = "envirocal83@gmail.com";
		
		data [2][1] = "ENVIROCAL83";
		
		data [3][0] = "envirocal90@gmail.com";
		
		data [3][1] = "ENVIROCAL90";
		
		data [4][0] = "envirocal91@gmail.com";
		
		data [4][1] = "ENVIROCAL91";
		return data;
		
        
	}
}
