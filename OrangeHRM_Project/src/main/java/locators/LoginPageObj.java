package locators;

import org.openqa.selenium.By;

import utils.LocatorUtils;

public class LoginPageObj {
	
	public By username_TextField;
	public By password_TextField;
	public By login_btn;
	public By heading;
	public By txt_InvalidCredentials;
	public By txt_Required;

	public LoginPageObj() throws Exception {
		username_TextField = LocatorUtils.getLocator("name", "un");
		password_TextField = LocatorUtils.getLocator("name", "pwd");
		login_btn = LocatorUtils.getLocator("xpath", "login");
		heading = LocatorUtils.getLocator("xpath", "heading");
		txt_InvalidCredentials = LocatorUtils.getLocator("xpath", "invalid");
		txt_Required = LocatorUtils.getLocator("xpath", "required");
	}
}
