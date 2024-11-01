package utils;

import static components.AppCommon.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ElementUtils {

	public static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	//Frame
	public static boolean isFramePresent(By by) throws Exception {
		try {
			driver.switchTo().frame(locateElement(by));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static void exitFrame(By by) throws Exception {
		if(isFramePresent(by))
		{
			driver.switchTo().defaultContent();
		}
	}

	// locate
	public static WebElement locateElement(By by) throws Exception {
		for (int i=0;i<5;i++) {
			try {
				element = driver.findElement(by);
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		return element;
	}
	
	public static void clearText(By by,int ch) throws Exception {
		WebElement element=locateElement(by);
		switch (ch) {
		case 1:
			element.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
			break;
		case 2:
			element.sendKeys(Keys.CONTROL+"a","");
			break;
		case 3:
			int len=element.getAttribute("value").length();
			for(int i=0;i<len;i++)
			{
				element.sendKeys(Keys.BACK_SPACE);
			}
			break;
		case 4:
			actions=new Actions(driver);
			actions.doubleClick(element).perform();
			element.sendKeys(Keys.BACK_SPACE);
			break;

		default:System.out.println("Invalid choice!..."+ch);
			break;
		}
	}

	// textbox
	public static void textField(By by, String value) throws Exception {
		Assert.assertTrue(locateElement(by).isDisplayed() && locateElement(by).isEnabled(),"Text field is not displayed and not enabled");
		clearText(by, 1);
		locateElement(by).sendKeys(value);
	}
	
	//file size
	public static double findFileSize(String filePath)
	{
		File f=new File(filePath);
		long bytes=f.length();
		return ((double)bytes/1024)/1024;
	}
	
	public static Dimension findFileDimension(String filePath) throws IOException
	{
		File file=new File(filePath);
		BufferedImage img=ImageIO.read(file);
		int width=img.getWidth();
		int height=img.getHeight();
		return new Dimension(width,height);
	}
	
	//upload field
	public static void uploadField(By by, String value) throws Exception {
		Assert.assertTrue(locateElement(by).isDisplayed() || locateElement(by).isEnabled(),"Upload field is not displayed and not enabled");
		locateElement(by).sendKeys(value);
	}

	// click
	public static void performClick(By by) throws Exception {
		Assert.assertTrue(locateElement(by).isDisplayed() && locateElement(by).isEnabled(),"Element is not displayed and not enabled");
		locateElement(by).click();
	}
	
	public static void performButtonClick(By by) throws Exception {
		Assert.assertTrue(locateElement(by).isDisplayed() && locateElement(by).isEnabled(),"Button is not displayed and not enabled");
		if(!locateElement(by).isSelected())
		{
			locateElement(by).click();
		}
		else
		{
			System.out.println("Button is already selected!...");
		}
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

	public static void selectElement(By selectField, String value) {
		try
		{
			if(ElementUtils.locateElement(selectField).getTagName().equals("select"))
			{
				select=new Select(ElementUtils.locateElement(selectField));
				select.selectByVisibleText(value);
			}
		}
		catch (Exception e) {
			
		}
	}
	
	public static void selectElement(String value,By by) {
		try
		{
			List<WebElement> options = driver.findElements(by);
			for (WebElement option : options) {
				if (option.getText().equalsIgnoreCase(value)) {
					option.click();
					break;
				}
			}
		}
		catch (Exception e) {
			
		}
	}
	
	public static void autoSuggestDropDown(By inputBox,By listItem,String...value) throws Exception
	{
		textField(inputBox, value[0]);
		List<WebElement> options=driver.findElements(listItem);
		for(WebElement option:options)
		{
			if(option.getText().equals(value[1]))
			{
				option.click();
				break;
			}
		}
	}
	
	public static String elementText(By by) throws Exception {
		return locateElement(by).getText();
	}
}
