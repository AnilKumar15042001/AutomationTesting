package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpObj {

	public WebDriver driver;
	
	public AddEmpObj(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="PIM")
	public WebElement pim_module;
	
	@FindBy(xpath="//a[normalize-space()='Add Employee']")
	public WebElement addEmployee;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	public WebElement middleName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	public WebElement lastName;
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	public WebElement employeeId;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement saveBtn;
	
	@FindBy(xpath="//h6[normalize-space()='PIM']")
	public WebElement PIM_heading;
	
	@FindBy(xpath="//h6[normalize-space()='Add Employee']")
	public WebElement AddEmployee_heading;
	
	public void setPim_module() {
		 
		pim_module.click();
	}

	public void setAddEmployee() {
		
		addEmployee.click();
	}

	public void setFirstName(String first_Name) {
		
		firstName.clear();
		firstName.sendKeys(first_Name);
	}

	public void setMiddleName(String middle_Name) {
		
		middleName.clear();
		middleName.sendKeys(middle_Name);
	}

	public void setLastName(String last_Name) {
		
		lastName.clear();
		lastName.sendKeys(last_Name);
	}

	public void setEmployeeId(String employee_Id) {
		
		employeeId.clear();
		employeeId.sendKeys(employee_Id);
	}

	public void setSaveBtn() {
		
		saveBtn.click();
	}
}
