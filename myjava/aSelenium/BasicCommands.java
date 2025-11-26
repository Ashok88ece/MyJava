package aSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicCommands {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is:"+pageTitle);
		
		//driver.findElement(By.id("alertBtn")).click();
		
		//Alert alert= driver.switchTo().alert();
		//alert.accept();
		
		driver.findElement(By.id("confirmBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		
		String alerttext = alert.getText();
		System.out.println("Alert box Text Content:"+alerttext);
		alert.dismiss();
		System.out.println("Alert pop up cancel button clicked");
		
		WebElement element = driver.findElement(By.id("country"));
		
		Select select = new Select(element);
		select.selectByVisibleText("Canada");
		Thread.sleep(3000);
		System.out.println("From dropdown Canada Selected");
		select.selectByValue("usa");
		Thread.sleep(3000);
		System.out.println("From dropdown usa Selected");
		
		select.selectByIndex(2);
		//System.out.println("Alert Popup clicked ok");
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Selenium\\Screenshots\\Screen.png"));
		
		driver.quit();

	}

}
