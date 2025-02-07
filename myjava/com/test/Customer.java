package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Customer {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	String Path = "C:\\Selenium\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://localhost:64237");
	WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));

	email_phone.sendKeys("ak6352689@gmail.com");

	driver.findElement(By.id("identifierNext")).click();

	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

	//WebDriverWait wait = new WebDriverWait(driver, 20);

	// wait.until(ExpectedConditions.elementToBeClickable(password));

	password.sendKeys("9677281258");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.id("passwordNext")).click();
	

	}
	
	@Test
	public void login() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
