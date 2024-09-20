package utils;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.WindowType;

import static utils.BrowserUtils.driver;
public class WindowsUtils {

	public static void handleWindows(String title) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			String data = getWindowTitle(window);
			System.out.println(data);
			if (data.equals(title)) {
				driver.close();
			}
		}
	}
	
	public static void createNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	public static void createNewWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
	
	public static String getWindowTitle(String window) {
		return driver.switchTo().window(window).getTitle();
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void minimizeWindow() {
		driver.manage().window().minimize();
	}
}
