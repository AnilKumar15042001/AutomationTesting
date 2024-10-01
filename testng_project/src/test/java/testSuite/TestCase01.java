package testSuite;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.AssertUtils;
import utils.BrowserUtils;

public class TestCase01 extends BaseClass {
	LoginPage loginPage;

	@Test
	public void testCase02() throws Exception {

		loginPage = new LoginPage();
		BrowserUtils.openBrowser();
		BrowserUtils.enterUrl();
		loginPage.verifyLoginPage();
		loginPage.login();
		Thread.sleep(3000);
		BrowserUtils.closeBrowser();
		AssertUtils.softAssertAll("Fail");
	}
}
