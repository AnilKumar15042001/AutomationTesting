package pages;

import locators.EmployeeListObj;
import utils.ElementUtils;

public class EmployeeListPage extends EmployeeListObj{
	
	public EmployeeListPage() throws Exception {
		super("EmployeeListPageLocators");
	}
	
	public void setEmployeeName(String empName) throws Exception
	{
		ElementUtils.textField(txt_EmployeeName, empName);
	}
	
	public void setEmployeeID(String empID) throws Exception
	{
		ElementUtils.textField(txt_EmployeeID, empID);
	}
	
	public void setSupervisorName(String supName) throws Exception
	{
		ElementUtils.textField(txt_SupervisorName, supName);
	}
	
	public void setSearch() throws Exception {
		ElementUtils.performButtonClick(btn_Search);
	}
	
	public void setReset() throws Exception {
		ElementUtils.performButtonClick(btn_Reset);
	}
	
	public void setAdd() throws Exception {
		ElementUtils.performButtonClick(btn_Add);
	}
	
	public void search() {
		
	}
}