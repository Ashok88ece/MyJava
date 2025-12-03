package ToolsQA;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Check Box - IsSelected
		
		WebElement element = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
		boolean sportscheckbox = element.isSelected();
		
		if(sportscheckbox==false) {
			element.click();
			System.out.println("Sports Checkbox Selected");
		}
		
		//Check Box - IsDisplayed
		
		WebElement element1 = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
		boolean readingcheckbox = element1.isDisplayed();
		
		if(readingcheckbox==true) {
			element1.click();
			System.out.println("Reading Check Box Checked");
		}
		
		//IsEnabled CheckBox
		
		WebElement element2 = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
		boolean sportcheckbox = element2.isEnabled();
		
		if(sportcheckbox==true) {
			element2.click();
			System.out.println("Sporst Check Box Unchecked");
		}
		
		driver.quit();
		
		

	}

}
