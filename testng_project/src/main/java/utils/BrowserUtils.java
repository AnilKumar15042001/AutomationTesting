package utils;

import java.time.Duration;

//import static utils.PropertiesUtils.properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static WebDriver driver;
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
		WindowsUtils.maximizeWindow();
//		String url="http://192.168.28.30:4444";
//		DesiredCapabilities capabilities=new DesiredCapabilities();
//		capabilities.setPlatform(Platform.WINDOWS);
//		capabilities.setBrowserName("chrome");
//		WebDriver driver=new RemoteWebDriver(new URL(url), capabilities);
	}

	public static void enterUrl() throws Exception {
		driver.get(PropertiesUtils.getPropertyValue().getProperty("url"));
	}

	public static void closeBrowser() {
		driver.quit();
	}

	
}
