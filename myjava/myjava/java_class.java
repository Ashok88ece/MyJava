package myjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class java_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:64237");
		 }

	

}
