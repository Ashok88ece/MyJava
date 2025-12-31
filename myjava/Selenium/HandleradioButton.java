package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleradioButton {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();

		//Normal Scenario Radio Button
		
		driver.findElement(By.id("java")).click();
		
		
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		
		int totalradiobtns = radio.size();
		
		System.out.println("Total Number of Radio Buttons:"+totalradiobtns);
		
		driver.quit();
	
		/*
		 * for(int i=0;i<radio.size();i++) {
		 * 
		 * System.out.println("Total Number of Radion Buttons:"+i);
		 * 
		 * }
		 */
		
	}

}
