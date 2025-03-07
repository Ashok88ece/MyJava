package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("test@gmail.com");
		
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("Test");
		
		String value = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(value);

		
		WebElement clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disabledbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);
		
				}

}
