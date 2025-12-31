package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://letcode.in/window");
		
		driver.manage().window().maximize();
		
		//Get Current Window Handle
		String windowhandle = driver.getWindowHandle();
		
		System.out.println("First Window:"+windowhandle);
		
		
		driver.findElement(By.id("home")).click();
		Set<String> windowhandles =  driver.getWindowHandles();
		
		System.out.println(windowhandles);
		
		List<String> list = new ArrayList<String>(windowhandles);
		
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(list.get(0));
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		//String currenturl =driver.getCurrentUrl();
		//System.out.println(currenturl);
		
		
	}

}
