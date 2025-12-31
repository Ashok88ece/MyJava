package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonOperations {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//1. Get Button Position
		WebElement getPositionButton = driver.findElement(By.name("start"));
		
		Point xypoint = getPositionButton.getLocation();
		int valuex = xypoint.getX();
		int valuey = xypoint.getY();
		
		System.out.println("X value is :"+valuex+ "Y value is: "+valuey );
		
		//2.Find button Color
		
		WebElement colorbutton = driver.findElement(By.name("start"));
		String color = colorbutton.getCssValue("background-color");
		System.out.println("Button color is :"+color);
		
		//3.Find button Size
		
		WebElement buttonsize = driver.findElement(By.name("start"));
		int height = buttonsize.getSize().getHeight();
		int width = buttonsize.getSize().getWidth();
		System.out.println("Height is :"+ height + " Width is :"+width);
		
		//4.Go to Home
		
		WebElement homebutton = driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[1]/a"));
		homebutton.click();
		
		driver.quit();
		

	}

}
