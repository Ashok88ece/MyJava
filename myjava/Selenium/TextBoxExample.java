package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement namebox = driver.findElement(By.id("name"));
		namebox.sendKeys("Ashokkkumar");
		
		Thread.sleep(3000);
		
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("Test");
		
		Thread.sleep(3000);
		/*
		 * String value =
		 * driver.findElement(By.xpath("//*[@id=\"HTML15\"]/h2")).getAttribute("value");
		 * System.out.println(value);
		 */

		driver.quit();
		
				}

}
