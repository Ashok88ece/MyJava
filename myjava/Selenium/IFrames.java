package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		//List<WebElement> iframeelements = driver.findElements(By.tagName("iframe"));
		
		//System.out.println("Total Number of iframes in this page is: "+iframeelements.size());
		
		
		WebElement frameheading = driver.findElement(By.id("frame1"));
		String headingtext = frameheading.getText();
		
		System.out.println("Frame 1 Header is :"+headingtext);
		
		//Switch To frame by Index
		// driver.switchTo().frame(0);
		
		//Switch to frame by ID
		//driver.switchTo().frame("frame2");
		
		//Switch to the main window
		
		//driver.switchTo().defaultContent();

	}

}
