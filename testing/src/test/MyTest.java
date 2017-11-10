package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  Simple cucumber example
 */


public class MyTest {

	public static final String url = "C:\\Chrome\\chromedriver.exe";
	
	
	public static void main(String[] args) throws Exception{
		
		
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.close();
	}
	
}
