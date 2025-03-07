package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/radio.html");

		driver.manage().window().maximize();
		
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		
		
		WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
	}

}
