package ToolsQA;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://toolsqa.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of Links:"+links.size());
		
		//ForEach Loop through list and print the each list
		
		for(WebElement link:links) {
			
			System.out.println(link.getText());
			
		}
		
		driver.quit();

	}

}
