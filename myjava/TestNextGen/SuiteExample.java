package TestNextGen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void OpenBrowser() {
		
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void OpenAgoogle() {
		
		driver.get("https://www.google.com/");
		
	}
	@Test
	public void OpenBing() {
		
		driver.get("https://www.bing.com/");
	}
	@Test
	public void OpenWiki() {
		
		driver.get("https://www.wikipedia.org/");
	}
	@AfterSuite
	public void CloseBrowser() {
		
		driver.quit();
		endTime = System.currentTimeMillis();
		long TotalTime = endTime-startTime;
		System.out.println("Total Time:"+TotalTime);
		
	}

}
