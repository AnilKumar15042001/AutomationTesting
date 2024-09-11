package testSuites;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void main() throws MalformedURLException, InterruptedException {
		
		String url="http://172.16.0.75:4444";
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		
		WebDriver driver=new RemoteWebDriver(new URL(url), capabilities);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
