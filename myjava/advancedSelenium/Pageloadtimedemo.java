package advancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadtimedemo {

	public static void main(String[] args) {
		    
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Timeouts time = driver.manage().timeouts();
			
			time.pageLoadTimeout(3, TimeUnit.SECONDS);
			
			driver.get("http://www.google.com");
			
			System.out.println(driver.getTitle());
			

	}

}
