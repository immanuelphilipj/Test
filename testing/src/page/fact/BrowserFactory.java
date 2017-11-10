package page.fact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver iDriver;
	//
	public static final String PATH = "C:\\Chrome\\chromedriver.exe";
	
	public static WebDriver myDriver(String browser, String url) throws InterruptedException{
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", PATH);
			iDriver = new ChromeDriver();
			iDriver.manage().window().maximize();
			iDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			iDriver.get(url);
			iDriver.close();		
	  }
		return iDriver;
	}
	

}
