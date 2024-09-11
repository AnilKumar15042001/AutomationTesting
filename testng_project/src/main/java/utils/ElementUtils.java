package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static utils.BrowserUtils.driver;

import java.time.Duration;

public class ElementUtils {

	public static WebElement element;
	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static WebElement locateElement(By by) throws Exception {
		for(int i=0;i<5;i++)
		{
			try
			{
				element = driver.findElement(by);
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		return element;
	}
	
	public static void textField(By by,String value) throws Exception {
		locateElement(by).sendKeys(value);
	}
	
	public static void performClick(By by) throws Exception {
		locateElement(by).click();
	}
	
	public static boolean elementVisibility(By by) {
		boolean result=false;
		try
		{
			result=locateElement(by).isDisplayed();
		}
		catch (Exception e) {
			System.out.println("Element is not visible!...");
		}
		return result;
	}
}
