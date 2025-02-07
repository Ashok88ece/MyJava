package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("selenium");
		Thread.sleep(4000);
		
		List <WebElement> optionlist = driver.findElements(By.name("q"));
		optionlist.size();
		System.out.println(optionlist.size());
		
		for (WebElement webElement : optionlist) {
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("selecting"+webElement.getText());
			break;
			}
			else {
				System.out.println("else part");
			}
		}

	}

}
