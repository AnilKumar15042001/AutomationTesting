package utils;

import static utils.BrowserUtils.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.Scenario;

public class TakeScreenshotUtils {

	public static FileUtils fileUtils;
	
	public static TakesScreenshot getScreenShotObj() {
		return ((TakesScreenshot) driver);
	}
	
	public static File getFileObj() {
		return getScreenShotObj().getScreenshotAs(OutputType.FILE);
	}
	
	public static void getScreenShot(String fileName) throws IOException {
		FileUtils.copyFile(getFileObj(), new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\"+fileName));
	}
	
	public static void getElementScreenShot(By by,String fileName) throws WebDriverException, Exception {
		File source=((TakesScreenshot) ElementUtils.locateElement(by)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\"+fileName));
	}
}
