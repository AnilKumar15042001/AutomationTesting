package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndLogoutObj {

	public WebDriver driver;
	public LoginAndLogoutObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[normalize-space()='Log in']")
	WebElement loginLink;
	
	@FindBy(xpath="//h1[text()='Welcome, Please Sign In!']")
	WebElement heading;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='RememberMe']")
	WebElement rememberMeCheckBox;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[normalize-space()='Forgot password?']")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement registerBtn;
	
	@FindBy(xpath="//h2[text()='Welcome to our store']")
	WebElement homePageHeading;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement logoutLink;
	
	
	public String getHomePageHeading() {
		return homePageHeading.getText();
	}

	public void setLogoutLink() {
		logoutLink.click();
	}

	public String getHeading() {
		return heading.getText();
	}

	public void setLoginLink() {
		loginLink.click();
	}

	public void setTxtEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void setTxtPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void setRememberMeCheckBox() {
		rememberMeCheckBox.click();
	}

	public void setLoginBtn() {
		loginBtn.click();
	}

	public void setForgotPasswordLink() {
		forgotPasswordLink.click();
	}

	public void setRegisterBtn() {
		registerBtn.click();
	}
	
}
