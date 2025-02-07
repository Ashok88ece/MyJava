package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(name="identifier")
	public static WebElement username;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	public static WebElement button;
	
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	public static WebElement loginbutton;
	
	 
}
