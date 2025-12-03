package ToolsQA;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String Title = driver.getTitle();
		System.out.println("Page Title is:"+Title);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)");
		
		//SendKeys - Feature
		
		WebElement element = driver.findElement(By.id("firstName"));
		element.sendKeys("Ashok");
		System.out.println("String Ashok entered in First Name Field Using SendKeys Command");
		
		//Clear - Command
		
		WebElement element1 = driver.findElement(By.id("firstName"));
		element1.clear();
		System.out.println("String Ashok Cleared from First Name Field using Clear Command");
		
		//Click - Command
		
		WebElement element2 = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		element2.click();
		System.out.println("Gender Male Radio button Clicked");
		
		//IsDisplayed - Command
		
		WebElement element3 = driver.findElement(By.id("userNumber"));
		boolean mobilenumber = element3.isDisplayed();
		System.out.println("Whether Mobile Number Field Displayed or Not?"+mobilenumber);
		
		//IsEnabled - Command
		
		WebElement element4 = driver.findElement(By.id("userEmail"));
		boolean emailid = element4.isEnabled();
		System.out.println("To verify emailid field enabled or Not?"+emailid);
		
		//IsSelected - Command
		
		WebElement element5 = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		boolean maleradio = element5.isSelected();
		System.out.println("To Make sure Gender Male Radio button selected");
		
		//Get Text
		
		WebElement element6 = driver.findElement(By.id("dateOfBirth-label"));
		String FieldName = element6.getText();
		System.out.println("FieldName is:"+FieldName);
		
		//Get Tag
		
		WebElement element7 = driver.findElement(By.id("dateOfBirthInput"));
		String tagname = element7.getTagName();
		System.out.println("Column Tag Name is:"+tagname);
		
		//Get Attribute
		
		WebElement element8 = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		Point point = element8.getLocation();
		System.out.println("X - Coordinate:"+point.x +"Y - Coordinate: " +point.y);
		//String attribute = element8.getAttribute(tagname);
		//System.out.println("Attribute Name is :"+attribute);
		
		
		driver.quit();

	}

}
