package artOfTesting;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		 
		 //Browser Scroll Bar Operation
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scrollBy(0,2000)");
		 
		 //Browser Resize Operation
		 int width=600;
		 int height=400;
		 Dimension dimension = new Dimension(width,height);
		 driver.manage().window().setSize(dimension);
	}

}
