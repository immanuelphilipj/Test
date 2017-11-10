package basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import screenshot.DropDownHandling;
import screenshot.TestScreenShot;
import screenshot.TestScroll;

public class Browser {
	
	
	public static void main(String[] args){
		Browser br = new Browser();
		try {
			br.getBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void getBrowser() throws Exception{
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//driver.get("https://www.facebook.com/");
		
		
		
		//DropDownHandling.selectDropValue(driver);
		// To scroll the page down
		//TestScroll.ScrollMe(driver);
		//To capture screenshot
		//TestScreenShot.CaptureScreenshot(driver, "testname");
		
		//Thread.sleep(1000);
		/*driver.findElement(By.id("pwd")).sendKeys("Pass");
		TestScreenShot.CaptureScreenshot(driver,"Password");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		TestScreenShot.CaptureScreenshot(driver,"submit"); */
		driver.close();
		
		
		
	}

}
