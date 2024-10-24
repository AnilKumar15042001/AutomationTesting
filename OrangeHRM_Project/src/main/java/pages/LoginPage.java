package pages;

import static components.AppCommon.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import locators.DashboardPageObj;
import locators.LoginPageObj;
import utils.BrowserUtils;
import utils.DataProviderUtils;
import utils.ElementUtils;
import utils.FrameworkUtils;
import utils.LocatorUtils;

public class LoginPage extends LoginPageObj {

	public LoginPage() throws Exception {
		super();
	}
	
	public void setUsername_TextField(String username) throws Exception {
		ElementUtils.textField(username_TextField, username);
	}

	public void setPassword_TextField(String password) throws Exception {
		ElementUtils.textField(password_TextField, password);
	}

	public void setLogin_btn() throws Exception {
		ElementUtils.performClick(login_btn);
	}

	public void verifyLoginPage() {
		Assert.assertTrue(ElementUtils.elementVisibility(heading), "Fail:User not in login page!...");
	}

	public void verifyErrorMessage() {
		Assert.assertTrue(ElementUtils.elementVisibility(txt_InvalidCredentials),"Fail:User not see an error message!...");
	}

	public void login() throws Exception {
		setUsername_TextField(dataDrivenMap.get("Username"));
		setPassword_TextField(dataDrivenMap.get("Password"));
		setLogin_btn();
		try {
			if (dataDrivenMap.get("Expected").equals(ElementUtils.elementText(txt_InvalidCredentials))) {
				FrameworkUtils.updateTestData("Actual", ElementUtils.elementText(txt_InvalidCredentials));
				FrameworkUtils.updateTestData("Status", "Pass");
			}
		} catch (Exception e) {
			if (dataDrivenMap.get("Expected").equals(ElementUtils.elementText(new DashboardPageObj().heading))) {
				FrameworkUtils.updateTestData("Actual", ElementUtils.elementText(new DashboardPageObj().heading));
				FrameworkUtils.updateTestData("Status", "Pass");
			}
			else
			{
				try {
					FrameworkUtils.updateTestData("Actual", ElementUtils.elementText(new DashboardPageObj().heading));
					FrameworkUtils.updateTestData("Status", "Fail");
					Logout.logout();
					Assert.fail();
				} finally {
					BrowserUtils.closeBrowser();
				}
			}
		}
	}
}
