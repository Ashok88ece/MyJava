package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/button");
   
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snaps/img1.png");
		
		FileHandler.copy(src, dest);
		
		//Element Screenshot - Through Element we can get element screenshot
		
		WebElement element = driver.findElement(By.id("home"));
		
        File elementsrc = element.getScreenshotAs(OutputType.FILE);
		
		File elementdest = new File("./snaps/img2.png");
		
		FileHandler.copy(elementsrc, elementdest);
		
		
		
		WebElement info = driver.findElementByXPath("//div[@class='column is-3-desktop is-4-tablet']//div[@class='card-content']");
        
		elementsrc = info.getScreenshotAs(OutputType.FILE);
		
		elementdest = new File("./snaps/img3.png");
		
		FileHandler.copy(elementsrc, elementdest);

		driver.quit();
		

	}

}
