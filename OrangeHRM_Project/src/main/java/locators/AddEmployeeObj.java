package locators;

import org.openqa.selenium.By;

import utils.LocatorUtils;

public class AddEmployeeObj {

	public By txt_lastname;
	public By txt_firstname;
	public By txt_middlename;
	public By txt_empid;
	public By save_btn;
	public By cancel_btn;
	public By pim_module;
	public By addEmp_Submodule;
	public By select_photo;
	public By addEmp_heading;
	
	public AddEmployeeObj(String fileName) throws Exception {
		txt_lastname=LocatorUtils.getLocator(fileName,"name", "txt_lastname");
		txt_firstname=LocatorUtils.getLocator(fileName,"name", "txt_firstname");
		txt_middlename=LocatorUtils.getLocator(fileName,"name", "txt_middlename");
		txt_empid=LocatorUtils.getLocator(fileName,"xpath", "txt_empid");
		save_btn=LocatorUtils.getLocator(fileName,"xpath", "save_btn");
		cancel_btn=LocatorUtils.getLocator(fileName,"xpath", "cancel_btn");
		pim_module=LocatorUtils.getLocator(fileName,"xpath", "pim_module");
		addEmp_Submodule=LocatorUtils.getLocator(fileName,"xpath", "");
		select_photo=LocatorUtils.getLocator(fileName,"xpath", "addEmp_Submodule");
		addEmp_heading=LocatorUtils.getLocator(fileName,"xpath", "addEmp_heading");
	}
	
	public By txt_un=By.xpath("(//input[@autocomplete='off'])[1]");
	public By txt_pwd=By.xpath("(//input[@autocomplete='off'])[2]");
	public By txt_confpwd=By.xpath("(//input[@autocomplete='off'])[3]");
	public By enabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[1]");
	public By disabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[2]");
}
