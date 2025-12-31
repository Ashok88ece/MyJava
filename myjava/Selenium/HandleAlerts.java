package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		
		WebElement alertbtn = driver.findElement(By.id("alertBtn"));
		alertbtn.click();
		Thread.sleep(3000);
		
		
		//Simple Alert
		
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		Thread.sleep(3000);
		
		//Confirmation Alert
		
		WebElement confirmalert = driver.findElement(By.id("confirmBtn"));
		confirmalert.click();
		Thread.sleep(3000);
		
		Alert confirmalrt=driver.switchTo().alert();
		confirmalrt.accept();
		Thread.sleep(3000);
		
		//Prompt Alert
		
	    driver.findElement(By.id("promptBtn")).click();

		
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Ashok");
		
		alert.accept();
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
