package testSuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.AssertUtils;
import utils.BrowserUtils;
import utils.DataProviderUtils;
import utils.ElementUtils;
import utils.PropertiesUtils;

import static utils.PropertiesUtils.properties;

import static utils.BrowserUtils.driver;

public class TestCase01 {
	LoginPage loginPage;

	@Test
	public void tc01() throws Exception {

		loginPage = new LoginPage();
		BrowserUtils.openBrowser();
		BrowserUtils.enterUrl();
		loginPage.verifyLoginPage();
//		Thread.sleep(3000);
		loginPage.login();
		BrowserUtils.closeBrowser();
		AssertUtils.softAssertAll("Failed message is displayed!...");
	}
}
