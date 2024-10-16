package testSuite;

import static components.AppCommon.className;
import static components.AppCommon.testName;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;
import utils.AssertUtils;
import utils.BrowserUtils;
import utils.FrameworkUtils;
import utils.PropertiesUtils;

public class BaseClass {

	LoginPage loginPage;
	@BeforeMethod
	public void getCurrentMethodAndClass(ITestResult result) throws Exception {
		testName=result.getMethod().getMethodName();
		className=result.getMethod().getTestClass().getRealClass().getSimpleName();
	}
	
	@BeforeMethod
	public void getTestData() throws Exception {
		FrameworkUtils.loadTestData();
	}
	
//	@BeforeMethod
//	public void verifyLogin() throws Exception {
//		loginPage = new LoginPage();
//		BrowserUtils.openBrowser();
//		BrowserUtils.launchUrl();
//		loginPage.verifyLoginPage();
//	}
//	
//	@AfterMethod
//	public void close() {
//		BrowserUtils.closeBrowser();
//		AssertUtils.softAssertAll("Fail");
//	}
}
