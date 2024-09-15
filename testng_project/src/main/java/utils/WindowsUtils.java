package utils;

import java.util.Set;
import static utils.BrowserUtils.driver;
public class WindowsUtils {

	public static void handleWindows(String title) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			String data = driver.switchTo().window(window).getTitle();
			System.out.println(data);
			if (data.equals(title)) {
				driver.close();
			}
		}
	}
}
