package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	
	public void SetUp() {
		
		System.out.println("@BeforeSuite -- Setup system Property");
	}
	
	@BeforeTest
	
	public void launchbrowser() {
		System.out.println("@BeforeTest -- Launch Chrome Browser");
	}
	
	@BeforeClass
	
	public void login() {
		System.out.println("@BeforeClass -- Login to app");
	}
	
	@BeforeMethod
	
	public void enterURL() {
		System.out.println("@BeforeMethod -- Enter URL");
	}
	
	@Test
	
	public void googleTitle() {
		System.out.println("@Test--- Google Title Test");
	}
	
	@Test
	
	public void search() {
		System.out.println("@Test--- Search Test");
	}
	
	@Test
	
	public void googlelogo() {
		System.out.println("@Test--- Google logo Test");
	}
	@AfterMethod
	
	public void logout() {
		System.out.println("@AfterMethod -- Logout to app");
	}
	
    @AfterClass
	
	public void closebrowser() {
		System.out.println("@AfterClass -- Close Browser");
	}
	@AfterTest
	
	public void deleteallcookies() {
		System.out.println("@AfterTest -- Cookies Deleted");
	}
	
	@AfterSuite
	
	public void generatereports() {
	System.out.println("@AfterSuite -- Reports Generated");
	}
	

}
