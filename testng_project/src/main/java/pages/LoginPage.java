package pages;

import static components.AppCommon.map;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import locators.DashboardPageObj;
import locators.LoginPageObj;
import utils.AssertUtils;
import utils.DataProviderUtils;
import utils.ElementUtils;
import utils.FrameworkUtils;

public class LoginPage extends LoginPageObj {

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

	@Test(dataProvider = "excelData", dataProviderClass = DataProviderUtils.class)
	public void performLogin() throws Exception {
		SoftAssert softAssert;
		Object[][] data = DataProviderUtils.excelDataProvider();
		for (int i = 0; i < data.length; i++) {
			String username = data[i][0].toString();
			String password = data[i][1].toString();
			setUsername_TextField(username);
			setPassword_TextField(password);
			setLogin_btn();
			try {
				if (ElementUtils.elementVisibility(By.xpath("//h6[text()='Dashboard']"))) {
					Logout.logout();
					Assert.assertTrue(true);
				}
			} catch (Exception e) {
				softAssert = new SoftAssert();
				softAssert.fail();
			}

		}
	}

	public void login() throws Exception {

		setUsername_TextField(map.get("Username"));
		setPassword_TextField(map.get("Password"));
		setLogin_btn();
		try {
			if (map.get("Expected").equals(ElementUtils.elementText(txt_InvalidCredentials))) {
				FrameworkUtils.updateTestData("Actual", ElementUtils.elementText(txt_InvalidCredentials));
				FrameworkUtils.updateTestData("Status", "Pass");
			}
		} catch (Exception e) {
			if (map.get("Expected").equals(ElementUtils.elementText(new DashboardPageObj().heading))) {
				FrameworkUtils.updateTestData("Actual", ElementUtils.elementText(new DashboardPageObj().heading));
				FrameworkUtils.updateTestData("Status", "Pass");
				Logout.logout();
			} else {
				FrameworkUtils.updateTestData("Actual", ElementUtils.elementText(new DashboardPageObj().heading));
				FrameworkUtils.updateTestData("Status", "Fail");
				Logout.logout();
				AssertUtils.softAssertFail("Fail");
			}
		}
	}

}
