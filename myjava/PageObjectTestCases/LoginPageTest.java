package PageObjectTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

public class LoginPageTest {

	
	@Test
	public void Login() throws InterruptedException {
		
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:64237");
		
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("envirocal100@gmail.com");
		LoginPageObjects.button.click();
		Thread.sleep(4000);
		LoginPageObjects.password.sendKeys("Envirocal@100");
		LoginPageObjects.loginbutton.click();
		
		
		driver.getWindowHandle();
		
		driver.switchTo().window("");
		
		driver.switchTo().frame(0);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.getTitle();
		driver.navigate().refresh();
		driver.get("");
		driver.navigate().to("");
		
		driver.manage().window().maximize();
		String text = driver.findElement(By.id("")).getText();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		
		
	}
}
