package artOfTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 //driver.get("https://artoftesting.com/");
		 
		// driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		 
		 //driver.quit();
		 
		 //driver.findElement(By.linkText("Java")).click();
		 
		 //WebElement btn = driver.findElement(By.linkText("Java"));
		// btn.click();
		 
		// driver.findElement(By.id("fname")).sendKeys("Art Of Testing");
		 
		// driver.findElement(By.id("fname")).clear();
		 
		// String text = driver.findElement(By.id("dblClkBtn")).getText();
		 
		// System.out.println("Text Name on Webelement :"+text);
		 
		 //Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		// dropdown.selectByVisibleText("Database Testing");
		 
		// List<WebElement> txt = driver.findElements(By.id(""));
		 
		// Actions action = new Actions(driver);
		 
		// WebElement button = driver.findElement(By.id("fname"));
		 
		 //action.contextClick(button).perform();
		 
		 //Thread.sleep(3000);
		 
		// driver.quit();
		 
		//Press Non Function Keys
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      // identify element
	      WebElement m=driver.findElement(By.id("search-strings"));
	      m.sendKeys("QA");
	      // type enter with sendKeys method and pass Keys.RETURN
	      m.sendKeys(Keys.RETURN);
	      
	     
	      driver.quit();
		 
	}

}
