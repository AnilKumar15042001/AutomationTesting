package locators;

import org.openqa.selenium.By;

public class LoginPageObj {

	public By username_TextField = By.name("username");
	public By password_TextField = By.name("password");
	public By login_btn = By.xpath("//button[@type='submit']");
	public By heading = By.xpath("//h5[text()='Login']");
	public By txt_InvalidCredentials = By.xpath("//*[text()='Invalid credentials']");
	public By txt_Required = By.xpath("//*[text()='Required']");
}
