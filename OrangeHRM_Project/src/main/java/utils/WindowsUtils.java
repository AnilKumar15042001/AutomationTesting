package utils;

import java.util.Set;

import org.openqa.selenium.WindowType;
import static components.AppCommon.driver;
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
	
	public static void createNewTabOrWindow(String type) {
		switch (type) {
		case "tab":driver.switchTo().newWindow(WindowType.TAB);
		break;
		case "window":driver.switchTo().newWindow(WindowType.WINDOW);
		break;
		default:System.out.println("Invalid window type!...");
		break;
		}
	}
	
	public static String getWindowTitle(String window) {
		return driver.switchTo().window(window).getTitle();
	}
	
	public static void handleWindowSize(String windowSize) {
		switch (windowSize) {
		case "max":driver.manage().window().maximize();
		break;
		case "min":driver.manage().window().minimize();
		break;
		case "full":driver.manage().window().fullscreen();
		break;
		default:System.out.println("Invalid inputs!...");
		break;
		}
	}
}
