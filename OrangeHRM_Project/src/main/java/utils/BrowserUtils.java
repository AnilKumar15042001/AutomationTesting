package utils;

import static components.AppCommon.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static void openBrowser() throws Exception {
		try {
			switch (PropertiesUtils.getKeyValue("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:System.out.println("Invalid Browser!...");
				return;
			}
			WaitStatementUtils.implicitly_Wait(driver, 10);
			WindowsUtils.handleWindowSize("max");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	 
//	@Parameters("browser")
//	public static void openBrowser(String browser) throws Exception {
//		switch (browser) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//			
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//			
//		default:System.out.println("Invalid Browser!...");
//		return;
//		}
//		WaitStatementUtils.implicitly_Wait(driver, 10);
//		WindowsUtils.handleWindowSize("max");
//	}

	public static void launchUrl() throws Exception {
		driver.get(PropertiesUtils.getPropertyValue().getProperty("url"));
	}

	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void navigatePage(String page) {
		switch (page) {
		case "refresh":driver.navigate().refresh();
		break;
		case "back":driver.navigate().back();
	    break;
		case "forward":driver.navigate().forward();
		break;
		default:System.out.println("Invalid inputs!...");
		break;
		}
	}
}
