package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObj {

	public WebDriver driver;
	
	public LoginObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']/p")
	WebElement downArwBtn;
	
	@FindBy(linkText="Logout")
	WebElement logoutLink;

	public void setTxtUserName(String un) {
		txtUserName.clear();
		txtUserName.sendKeys(un);
	}

	public void setTxtPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void setLoginBtn( ) {
		loginBtn.click();
	}

	public void setDownArwBtn( ) {
		downArwBtn.click();
	}

	public void setLogoutLink( ) {
		logoutLink.click();
	}
}
