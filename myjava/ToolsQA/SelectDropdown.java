package ToolsQA;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("fruits"));
		
		Select select = new Select(element);
		select.selectByIndex(1);
		System.out.println("Fruit Apple Selected");
		Thread.sleep(5000);
		select.selectByVisibleText("Orange");
		System.out.println("Fruit Orange Selected");
		

	}

}
