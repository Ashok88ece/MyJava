package ToolsQA;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String FirstWindow = driver.getWindowHandle();
		
		System.out.println("First Window Handle Name:"+FirstWindow);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement element = driver.findElement(By.id("windowButton"));
		element.click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		System.out.println("WIndow Handles:"+windowhandles);
		
		List<String> list = new ArrayList<String>(windowhandles);
		
		driver.switchTo().window(list.get(0));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		

	}

}
