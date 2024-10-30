package utils;

import static components.AppCommon.*;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static void openBrowserRemote() throws Exception {
		try {
			desiredCapabilities=new DesiredCapabilities();
			switch (PropertiesUtils.getKeyValue("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				desiredCapabilities.setPlatform(Platform.LINUX);
				desiredCapabilities.setBrowserName("chrome");
				driver = new RemoteWebDriver(new URL(PropertiesUtils.getKeyValue("remoteUrl")),desiredCapabilities);
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				desiredCapabilities.setPlatform(Platform.LINUX);
				desiredCapabilities.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URL(PropertiesUtils.getKeyValue("remoteUrl")),desiredCapabilities);
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				desiredCapabilities.setPlatform(Platform.LINUX);
				desiredCapabilities.setBrowserName("edge");
				driver = new RemoteWebDriver(new URL(PropertiesUtils.getKeyValue("remoteUrl")),desiredCapabilities);
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
	 
	public static void openBrowser() throws Exception {
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
	}

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
