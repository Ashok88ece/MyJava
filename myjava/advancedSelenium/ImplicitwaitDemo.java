package advancedSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitDemo {

	public static void main(String[] args) {
		  
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			
			driver.manage().window().maximize();
			
			Timeouts time = driver.manage().timeouts();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("Alert('welcome to Selenium')");
	}

}
