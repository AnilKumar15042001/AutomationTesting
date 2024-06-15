package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterObj {

	public Select s;
	public WebDriver driver;
	public RegisterObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement maleRadioButton;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txtLastName;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement selectDay;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement selectMonth;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement selectYear;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement txtCompanyName;
	
	@FindBy(xpath="//input[@id='Newsletter']")
	WebElement newsletterCheckbox;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement registerButton;
	
	@FindBy(xpath="//h1[normalize-space()='Register']")
	WebElement heading;
	
	@FindBy(xpath="//div[text()='Your registration completed']")
	WebElement confirmMessage;
	
	@FindBy(xpath="//*[@id='main']/div/div/div/div[2]/div[2]/a")
	WebElement continueButton;
	
	public void setContinueButton() {
		continueButton.click();
	}

	public WebElement getConfirmMessage() {
		return confirmMessage;
	}

	public WebElement getHeading() {
		return heading;
	}

	public void setRegisterLink() {
		
		registerLink.click();
	}

	public void setMaleRadioButton() {
		if(maleRadioButton.isSelected()==false)
		{
			maleRadioButton.click();
		}
	}

	public void setFemaleRadioBButton() {
		if(femaleRadioButton.isSelected()==false)
		{
			femaleRadioButton.click();
		}
	}

	public void setTxtFirstName(String FirstName) {
		txtFirstName.clear();
		txtFirstName.sendKeys(FirstName);
	}

	public void setTxtLastName(String LastName) {
		txtLastName.clear();
		txtLastName.sendKeys(LastName);
	}

	public void setSelectDay(String Day) {
		s=new Select(selectDay);
		s.selectByVisibleText(Day);
	}

	public void setSelectMonth(String Month) {
		s=new Select(selectMonth);
		s.selectByVisibleText(Month);
	}

	public void setSelectYear(String Year) {
		s=new Select(selectYear);
		s.selectByVisibleText(Year);
	}

	public void setTxtEmail(String Email) {
		txtEmail.clear();
		txtEmail.sendKeys(Email);
	}

	public void setTxtCompanyName(String CompanyName) {
		txtCompanyName.clear();
		txtCompanyName.sendKeys(CompanyName);
		
	}

	public void setNewsletterCheckbox() {
		if(newsletterCheckbox.isSelected()==false)
		{
			newsletterCheckbox.click();
		}
	}

	public void setTxtPassword(String Password) {
		txtPassword.clear();
		txtPassword.sendKeys(Password);
	}

	public void setTxtConfirmPassword(String ConfirmPassword) {
		txtConfirmPassword.clear();
		txtConfirmPassword.sendKeys(ConfirmPassword);
	}

	public void setRegisterButton() {
		registerButton.click();
	}
}
