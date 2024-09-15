package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import static utils.BrowserUtils.driver;

public class EmployeeListObj{
//Employee information page objects/elements
	
	static String rowXpath="//div[@role='rowgroup'][2]/div";
	static String colXpath="//div[@role='rowgroup'][2]/div[1]/div/div";
	static String elementXpath="//div[@role='rowgroup'][2]/div[%d]//div[%d]";
	static String nextButtonXpath="//ul[@class='oxd-pagination__ul']/descendant::button[last()]";
	
	static By txt_empname=By.xpath("//div[contains(@class,'orangehrm-full')]//div[1]//div[1]//div[2]//input[1]");
	static By txt_empid=By.xpath("//div[contains(@class,'grid-item--gutter')]//input[contains(@class,'oxd-input--active')]");
	static By txt_superVisorname=By.xpath("(//div[contains(@class,'item--gutters')])[1]//input");
	static By search_btn=By.xpath("button[type='submit']");
	static By reset_btn=By.xpath("button[type='reset']");
	static By addbtn=By.xpath("//div[@class='orangehrm-header-container']//button");
	public static By empstatus_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[1]//i");
	static By include_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[2]//i");
	static By jobtitle_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[3]//i");
	static By subunit_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[4]//i");
	static By deleteSelectedBtn=By.xpath("//button[text()=' Delete Selected ']");
	
	
	public static void setDeleteSelectedBtn() {
		driver.findElement(deleteSelectedBtn).click();
	}
	public static void setTxt_empname(String empName) throws Exception {
		
	}
	public static void setTxt_empid(String empid) throws Exception {
		
	}
	public static void setTxt_superVisorname(String superVisorname) throws Exception {
		
	}
	public static void setSearch_btn() throws Exception {
		
	}
	public static void setReset_btn() throws Exception {
		
	}
	public static void setAddbtn() throws Exception {
		
	}
	public static void setEmpstatus_dd(String empstatus) throws Exception {
		
	}
	public static void setInclude_dd(String include) {
		
	}
	public static void setJobtitle_dd(String jobtitle) {
		
	}
	public static void setSubunit_dd(String subunit) {
		
	}
	public static void setEditButton(String nameOrId) {
		
	}

	public static void setDeleteButton(String nameOrId) throws Exception
	{
		
	}

	public static void clickCancelAndDeleteButton(String buttonName) throws InterruptedException
	{
		
	}
	
	public static void sortTheTableDataInAscendingOrder(String colName) throws Exception
	{
		
	}
	public static void sortTheTableDataInDescendingOrder(String colName) throws Exception
	{
		
	}
	
}