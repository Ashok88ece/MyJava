package advancedSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/upload.html");
			
			driver.manage().window().maximize();

			WebElement UploadButton = driver.findElement(By.name("filename"));
			
			UploadButton.click();
			Thread.sleep(3000);
			String file = "C:\\Ashok\\RSP_Release_Notes.xlsx";
			
			StringSelection selection = new StringSelection(file);
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			
			Robot robot = new Robot();
		
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			System.out.println("File UPloaded Successfully");
	}

}
