package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "http://localhost:64237";
		String expectedTitle = "Sign in - Google accounts";
		String actualTitle = null;
		
		driver.get(url);
		
		actualTitle = driver.getTitle();
		
		
		if(actualTitle.contentEquals(expectedTitle)) {
			
			System.out.println("Expected Title is:"+expectedTitle);
			System.out.println("Actual Title is:"+actualTitle);
			System.out.println("TestPassed");
		}else {
			System.out.println("Expected Title is:"+expectedTitle);
			System.out.println("Actual Title is:"+actualTitle);
			System.out.println("TestFailed");
		}
		
		driver.close();

	}

}
