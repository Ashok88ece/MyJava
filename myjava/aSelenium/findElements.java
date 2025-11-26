package aSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of Links in this page:" +links.size());
		
		
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		
		driver.quit();

	}

}
