package PageObjectTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.UpdateProfileObjects;

public class UpdateProfileTest {
	
	@Test
	public void updateProfile() throws InterruptedException {
		

		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:64237");
		
		Thread.sleep(3000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("envirocal100@gmail.com");
		LoginPageObjects.button.click();
		Thread.sleep(4000);
		LoginPageObjects.password.sendKeys("Envirocal@100");
		LoginPageObjects.loginbutton.click();
		
		Thread.sleep(8000);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		 
		UpdateProfileObjects.Inventory.click();
		//UpdateProfileObjects.updatecity.sendKeys("Texas");
		//UpdateProfileObjects.updatephoneno.sendKeys("9087654321");
		//UpdateProfileObjects.submitbtn.click();
	}

}
