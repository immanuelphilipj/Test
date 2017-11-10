package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;



public class TestScreenShot {

	public static void CaptureScreenshot(WebDriver driver, String testname) throws Exception{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot_folder/"+testname+"facebook.png"));
		
	}
	
}
