package pages;

import static components.AppCommon.*;
import locators.AddEmployeeObj;
import utils.ElementUtils;

public class AddEmployeePage extends AddEmployeeObj{

	public AddEmployeePage() throws Exception {
		super("AddEmployeePageLocators");
	}
	
	public void setFirstName(String fName) throws Exception {
		ElementUtils.textField(txt_firstname, fName);
	}
	
	public void setMiddleName(String mName) throws Exception {
		ElementUtils.textField(txt_middlename, mName);
	}
	
	public void setLastName(String lName) throws Exception {
		ElementUtils.textField(txt_lastname, lName);
	}
	
	public void setEmpID(String empID) throws Exception {
		ElementUtils.textField(txt_empid, empID);
	}
	
	public void uploadPhoto(String photoPath) throws Exception {
		System.out.println(ElementUtils.findFileSize(photoPath));
		ElementUtils.uploadField(select_photo, photoPath);
	}
	
	public void setSave() throws Exception {
		ElementUtils.performButtonClick(save_btn);
	}
	
	public void setCancel() throws Exception {
		ElementUtils.performButtonClick(cancel_btn);
	}
	
	public void clickPIM() throws Exception {
		ElementUtils.performButtonClick(pim_module);
	}
	
	public void clickAddEmp() throws Exception {
		ElementUtils.performButtonClick(addEmp_Submodule);
	}
	
	public void performSave() throws Exception {
		clickPIM();
		clickAddEmp();
		setFirstName(dataDrivenMap.get("FirstName"));
		setMiddleName(dataDrivenMap.get("MiddleName"));
		setLastName(dataDrivenMap.get("LastName"));
		setEmpID(dataDrivenMap.get("EmployeeID"));
		uploadPhoto(dataDrivenMap.get("Photo"));
		setSave();
	}
	
	
}
