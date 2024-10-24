package locators;

import org.openqa.selenium.By;

public class AddEmployeeObj {

	public By txt_lastname=By.name("lastName");
	public By txt_firstname=By.name("firstName");
	public By txt_middlename=By.name("middleName");
	public By txt_empid=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	public By save_btn=By.xpath("//button[@type='submit']");
	public By cancel_btn=By.xpath("//button[text()=' Cancel ']");
	public By PIM_module=By.xpath("//a[contains(@href,'PimModule')]");
	public By addEmp_Submodule=By.linkText("Add Employee");
	public By slt_photo=By.xpath("//input[@type='file'][@class='oxd-file-input']");
	public By addEmp_heading=By.xpath("//h6[text()='Add Employee']");
	
	public By txt_un=By.xpath("(//input[@autocomplete='off'])[1]");
	public By txt_pwd=By.xpath("(//input[@autocomplete='off'])[2]");
	public By txt_confpwd=By.xpath("(//input[@autocomplete='off'])[3]");
	public By enabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[1]");
	public By disabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[2]");
}
