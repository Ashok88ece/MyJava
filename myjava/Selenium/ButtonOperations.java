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
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		//1. Get Button Position
		WebElement getPositionButton = driver.findElement(By.id("position"));
		
		Point xypoint = getPositionButton.getLocation();
		int valuex = xypoint.getX();
		int valuey = xypoint.getY();
		
		System.out.println("X value is :"+valuex+ "Y value is: "+valuey );
		
		//2.Find button Color
		
		WebElement colorbutton = driver.findElement(By.id("color"));
		String color = colorbutton.getCssValue("background-color");
		System.out.println("Button color is :"+color);
		
		//3.Find button Size
		
		WebElement buttonsize = driver.findElement(By.id("size"));
		int height = buttonsize.getSize().getHeight();
		int weight = buttonsize.getSize().getWidth();
		System.out.println("Height is :"+ height + "Width is :"+weight);
		
		//4.Go to Home
		
		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();
		
		

	}

}
