package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));

		Select select = new Select(dropdown1);
		select.selectByIndex(2); 
		
		Thread.sleep(3000);
		select.selectByValue("3");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		
		List<WebElement> listofOptions = select.getOptions();
		int size = listofOptions.size();
		System.out.println("Number of Options :"+ size);
		
		dropdown1.sendKeys("Appium");
		
		WebElement multipleselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multipleselectbox = new Select(multipleselect);
		multipleselectbox.selectByIndex(1);
		multipleselectbox.selectByIndex(2);
		multipleselectbox.selectByIndex(3);

	}

}
