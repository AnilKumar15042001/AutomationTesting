package utils;

import static components.AppCommon.driver;
import static components.AppCommon.executor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class JavaScriptExecutorUtils {
	
	public static void scrollToElement(By by) throws Exception {
		WebElement element=ElementUtils.locateElement(by);
		executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollToElement(WebElement element) {
		executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static String getElementInnerText(By by) throws Exception
	{
		executor = (JavascriptExecutor) driver;
		String innerText = (String) executor.executeScript("return arguments[0].innerText;", ElementUtils.locateElement(by));
		return innerText;
	}
	
	public static void getAllInnerText(By by)
	{
		List<WebElement> elements=driver.findElements(by);
		executor=(JavascriptExecutor) driver;
		for(WebElement element:elements)
		{
			String innerText=(String) executor.executeScript("return arguments[0].innerText;", element);
			Reporter.log(innerText);
		}
	}
}
