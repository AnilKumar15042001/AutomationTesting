package locators;

import org.openqa.selenium.By;

import utils.LocatorUtils;

public class EmployeeListObj{
	
//	public String rowXpath="//div[@role='rowgroup'][2]/div";
//	public String colXpath="//div[@role='rowgroup'][2]/div[1]/div/div";
//	public String elementXpath="//div[@role='rowgroup'][2]/div[%d]//div[%d]";
//	public String nextButtonXpath="//ul[@class='oxd-pagination__ul']/descendant::button[last()]";
	
	public By txt_EmployeeName;
	public By txt_EmployeeID;
	public By txt_SupervisorName;
	public By btn_Search;
	public By btn_Reset;
	public By btn_Add;
	public By sltBox_EmployeeStatus;
	public By sltBox_Include;
	public By sltBox_Jobtitle;
	public By sltBox_SubUnit;
//	public By deleteSelectedBtn=By.xpath("//button[text()=' Delete Selected ']");
	
	public EmployeeListObj(String fileName) throws Exception {
		txt_EmployeeName=LocatorUtils.getLocator(fileName, "xpath", "txt_EmployeeName");
		txt_EmployeeID=LocatorUtils.getLocator(fileName, "xpath", "txt_EmployeeName");
		txt_SupervisorName=LocatorUtils.getLocator(fileName, "xpath", "txt_SupervisorName");
		btn_Search=LocatorUtils.getLocator(fileName, "xpath", "btn_Search");
		btn_Reset=LocatorUtils.getLocator(fileName, "xpath", "btn_Reset");
		btn_Add=LocatorUtils.getLocator(fileName, "xpath", "btn_Add");
		sltBox_EmployeeStatus=LocatorUtils.getLocator(fileName, "xpath", "sltBox_EmployeeStatus");
		sltBox_Include=LocatorUtils.getLocator(fileName, "xpath", "sltBox_Include");
		sltBox_Jobtitle=LocatorUtils.getLocator(fileName, "xpath", "sltBox_Jobtitle");
		sltBox_SubUnit=LocatorUtils.getLocator(fileName, "xpath", "sltBox_SubUnit");
	}
}