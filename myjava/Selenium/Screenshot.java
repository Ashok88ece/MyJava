package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.testim.io/");
		
		//Use TakesScreenshot method to capture the page
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		//Save the screenshot in desired location
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		//Path to the location for screenshot
		
		FileUtils.copyFile(src,new File("./snaps/img4.png"));
		
		System.out.println("Screenshot Captured");
		
		driver.quit();
		
		

	}

}
