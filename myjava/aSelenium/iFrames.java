package aSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.switchTo().frame("frame2");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		

	}

}
