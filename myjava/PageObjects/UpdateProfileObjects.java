 package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfileObjects {
	
	@FindBy(xpath="//*[contains(text(),'Inventory')]")
	public static WebElement Inventory;
	
	@FindBy(xpath="//*[@id=\"profilefrm\"]/div/div/div[3]/div[1]/div/input")
	public static WebElement updatecity;
	
	@FindBy(xpath="//*[@id=\"profilefrm\"]/div/div/div[5]/div/div/input")
	public static WebElement updatephoneno;
	
	@FindBy(xpath="//*[@id=\\\"profilefrm\\\"]/div/div/div[7]/div/button")
	public static WebElement submitbtn;
	

	/*
	 * public static WebElement clickmyprofile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"
	 * )); }
	 * 
	 * public static WebElement updatecity(WebDriver driver) { return
	 * driver.findElement(By.name("City")); }
	 * 
	 * public static WebElement updatephoneno(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * public static WebElement submitbtn(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button")); }
	 */
}
