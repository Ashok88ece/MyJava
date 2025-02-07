package PageFactoryWithoutAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {
	
	
	public static WebElement username;
	public static WebElement password;
	public static WebElement btnLogin;
	
	
	@Test
	public void login() {
		
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnLogin.click();
		
	}
	
	}
