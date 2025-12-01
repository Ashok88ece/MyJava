package aSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WaitConditon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/waits");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("accept"));
		element.click();
		
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Alert Accepted and Browser Closed");
		driver.quit();
		
	
		
		
		

	}

}
