package screenshot;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 * Traditional drop down
 * Select Tag drop down
 * 
 */
public class DropDownHandling {

	public static void selectDropValue(WebDriver driver) throws Exception{
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		//To verify the number of values in the drop down.
		List<WebElement> month_list = month_dd.getOptions();
		int total_month = month_list.size();
		System.out.println("Total month count is "+total_month);
		Assert.assertEquals(total_month, 13);

		
		
		WebElement default_value = month_dd.getFirstSelectedOption();
		System.out.println("Default selected is "+default_value.getText());
		
		//This will select march
		month_dd.selectByIndex(3);
		WebElement selected_value = month_dd.getFirstSelectedOption();
		System.out.println("After selected is "+selected_value.getText());
        Thread.sleep(3000);	
		
		//value with in the loop
		month_dd.selectByValue("8");
		
		Thread.sleep(3000);
		month_dd.selectByVisibleText("Apr");
		Thread.sleep(3000);
	}
}
