package utils;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static components.AppCommon.wait;

public class WaitStatementUtils {
	
	public static void implicitly_Wait(WebDriver driver,int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static void fluentWait(WebDriver driver,ExpectedCondition<?> condition) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
							.withTimeout(Duration.ofSeconds(10))
							.pollingEvery(Duration.ofSeconds(2))
							.ignoring(NoSuchElementException.class,ElementNotInteractableException.class);
		wait.until(condition);
	}
	
	public static void explicitlyWait(WebDriver driver,ExpectedCondition<?> condition,int seconds) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(condition);
	}
}
