package artOfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
		WebElement  From = driver.findElement(By.id("draggable"));
		
		WebElement  To = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		//action.dragAndDrop(From, To).build().perform();
		action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		//driver.manage().window().setPosition(new Point(0,-1000));
		
		
	}

}
