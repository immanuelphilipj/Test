package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestScroll {

	public static void ScrollMe(WebDriver driver) throws Exception{
		WebElement w = driver.findElement(By.id("contactform-email"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", w);
		
		
		driver.findElement(By.id("contactform-email")).sendKeys("Test");
		//Screenshot captured
		TestScreenShot.CaptureScreenshot(driver,"Username");
		System.out.println(w.getText());
		
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("alert('Welcome to Guru99');");

	}
}
