package WaitCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe") ;      // Set up the WebDriver (make sure the ChromeDriver is in the system path)
        WebDriver driver = new ChromeDriver();

        // Navigate to a test page (replace this with the URL of your choice)
        driver.get("https://www.saucedemo.com/");  // Use an actual URL here
        
        driver.manage().window().maximize();

        // Set up WebDriverWait with a timeout of 10 seconds (use Duration object)
        WebDriverWait wait = new WebDriverWait(driver, 20); // Timeout in seconds (deprecated in Selenium 4)


        try {
            // Wait until the button is clickable (using ExpectedConditions)
        	
            WebElement usernameField = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("user-name"))
            );

            usernameField.sendKeys("standard_user");
            System.out.println("Username entered successfully.");
        }  
        catch(Exception e) {
        	
        	System.out.println("Exception caught: " + e.getMessage());
        	
        }
            finally {
            // Close the browser after a brief wait
            driver.quit();
        }
    }
}

