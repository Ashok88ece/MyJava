package ToolsQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	

	/*
	 * Launch a new Chrome browser.
	 *  Open Shop.DemoQA.com 
	 *  Get Page Title name and Title length 
	 *  Print Page Title and Title length on the Eclipse Console. 
	 *  Get Page URL and verify if it is a correct page opened 
	 *  Get Page Source (HTML Source code) and Page Source length 
	 *  Print Page Length on Eclipse Console.
	 * Close the Browser.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Path = "C:\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url = "https://www.toolsqa.com";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		int titlelength = driver.getTitle().length();
		
		
		System.out.println("Page Title of the website is: "+title);
		
		System.out.println("Page Title Lenght of the website is: "+titlelength);
		
		String actualurl = driver.getCurrentUrl();
		
		if(actualurl.equals(url)) {
			System.out.println("Page URL successfully verified");
		}
		else {
			System.out.println("Page URL not matched");
		}
		
		String pagesource = driver.getPageSource();
		
		int pagesourcelength = pagesource.length();
		
		System.out.println("Page Source Length:"+pagesourcelength);
		
		driver.close();
	}

}
