package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import static utils.BrowserUtils.driver;

public class AddEmployeeObj{
//objects/elements
	static By txt_lastname=By.name("lastName");
	static By txt_firstname=By.name("firstName");
	static By txt_middlename=By.name("middleName");
	static By txt_empid=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static By save_btn=By.xpath("//button[@type='submit']");
	static By cancel_btn=By.xpath("//button[text()=' Cancel ']");
	static By PIM_module=By.xpath("//a[contains(@href,'PimModule')]");
	static By addEmp_Submodule=By.linkText("Add Employee");
	static By slt_photo=By.xpath("//input[@type='file'][@class='oxd-file-input']");
	static By addEmp_heading=By.xpath("//h6[text()='Add Employee']");
	
	static By txt_un=By.xpath("(//input[@autocomplete='off'])[1]");
	static By txt_pwd=By.xpath("(//input[@autocomplete='off'])[2]");
	static By txt_confpwd=By.xpath("(//input[@autocomplete='off'])[3]");
	static By enabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[1]");
	static By disabled_btn=By.xpath("(//div[@class='oxd-input-group']//span)[2]");
	
	
	public static void setTxt_lastname(String lastname) throws Exception {
		
	}
	public static void setTxt_firstname(String firstname) throws Exception {
		
	}
	public static void setTxt_middlename(String middlename) throws Exception {
		
	}
	public static void setTxt_empid(String employeeId) throws Exception {
		
	}
	public static void setSave_btn() throws Exception {
		
	}
	public static void setCancel_btn() throws Exception {
		
	}
	public static void setPIM_module() throws Exception {
		
	}
	public static void setAddEmp_Submodule() {
		driver.findElement(addEmp_Submodule).click();
	}
	public static void setSlt_photo() {
		AddEmployeeObj.slt_photo = slt_photo;
	}
	public static void setTxt_un(String userName) throws Exception {
		
	}
	public static void setTxt_pwd(String password) throws Exception {
		
	}
	public static void setTxt_confpwd(String confirmPassword) throws Exception {
		
	}
	public static void setEnabled_btn() throws Exception {
		
	}
	public static void setDisabled_btn() throws Exception {
		
	}
	public static By getAddEmp_heading() {
		return addEmp_heading;
	}
	
}
