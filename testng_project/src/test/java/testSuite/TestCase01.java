package testSuite;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.AssertUtils;
import utils.BrowserUtils;


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
