package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.leafground.com/table.html");
		
		java.util.List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("Number of Columns "+ columncount);
		
		java.util.List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowcount =rows.size();
		System.out.println("Number of Rows "+ rowcount);
		
		

	}

}
