package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static utils.BrowserUtils.driver;

public class JavaScriptExecutorUtils {

	public static JavascriptExecutor executor;
	public static void scrollToElement(By by) {
		WebElement element=driver.findElement(by);
		executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
