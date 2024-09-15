package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utils.BrowserUtils.driver;

import java.time.Duration;
import java.util.List;

public class ElementUtils {

	public static WebElement element;
	public static Select select;

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// locate
	public static WebElement locateElement(By by) throws Exception {
		for (int i = 0; i < 5; i++) {
			try {
				element = driver.findElement(by);
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		return element;
	}

	// textbox
	public static void textField(By by, String value) throws Exception {
		locateElement(by).sendKeys(value);
	}

	// click
	public static void performClick(By by) throws Exception {
		locateElement(by).click();
	}

	// visibility
	public static boolean elementVisibility(By by) {
		try {
			locateElement(by).isDisplayed();
			return true;
		} catch (Exception e) {
			System.out.println("Element is not visible!...");
			return false;
		}
	}

	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public static String closeAlertAndGetItsText() {
		try {
			driver.switchTo().alert();
			if (isAlertPresent()) {
				driver.switchTo().alert().accept();
			}
			return driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present in this page!...");
			return e.getMessage();
		}
	}

	public static void selectElement(By selectField,By multiValues, String value) {
		try
		{
			if(ElementUtils.locateElement(selectField).getTagName().equals("select"))
			{
				select=new Select(ElementUtils.locateElement(selectField));
				select.selectByVisibleText(value);
			}
			else
			{
				List<WebElement> options = driver.findElements(multiValues);
				for (WebElement option : options) {
					if (option.getText().equalsIgnoreCase(value)) {
						option.click();
						break;
					}
				}
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
