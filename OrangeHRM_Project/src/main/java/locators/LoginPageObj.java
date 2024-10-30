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

	public LoginPageObj(String fileName) throws Exception {
		username_TextField = LocatorUtils.getLocator(fileName,"name", "un");
		password_TextField = LocatorUtils.getLocator(fileName,"name", "pwd");
		login_btn = LocatorUtils.getLocator(fileName,"xpath", "login");
		heading = LocatorUtils.getLocator(fileName,"xpath", "heading");
		txt_InvalidCredentials = LocatorUtils.getLocator(fileName,"xpath", "invalid");
		txt_Required = LocatorUtils.getLocator(fileName,"xpath", "required");
	}
}
