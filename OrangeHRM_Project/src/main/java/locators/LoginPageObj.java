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
		username_TextField = LocatorUtils.getLocator(fileName,"name", "txt_username");
		password_TextField = LocatorUtils.getLocator(fileName,"name", "txt_password");
		login_btn = LocatorUtils.getLocator(fileName,"xpath", "login_btn");
		heading = LocatorUtils.getLocator(fileName,"xpath", "page_heading");
		txt_InvalidCredentials = LocatorUtils.getLocator(fileName,"xpath", "invalid_txt");
		txt_Required = LocatorUtils.getLocator(fileName,"xpath", "required_msg");
	}
}
