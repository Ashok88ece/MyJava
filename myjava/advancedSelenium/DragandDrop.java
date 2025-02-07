package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node03combpfco8yk146tigk6fwyrm25479.node0");
		
		WebElement From = driver.findElement(By.id("form:drag_content"));
		
		WebElement To = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		
		//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		actions.dragAndDrop(From, To).build().perform();
	

}
}