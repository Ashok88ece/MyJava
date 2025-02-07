package advancedSelenium;

import java.util.function.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		boolean status = element.isDisplayed();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"));
		
		if(status) {
			System.out.println("Element is Displayed");
		}
		else {
			System.out.println("Element Not displayed");
		}
		
		

	}

}
