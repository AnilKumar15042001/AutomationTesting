package locators;

import org.openqa.selenium.By;

public class EmployeeListObj {

	public String rowXpath="//div[@role='rowgroup'][2]/div";
	public String colXpath="//div[@role='rowgroup'][2]/div[1]/div/div";
	public String elementXpath="//div[@role='rowgroup'][2]/div[%d]//div[%d]";
	public String nextButtonXpath="//ul[@class='oxd-pagination__ul']/descendant::button[last()]";
	
	public By txt_empname=By.xpath("//div[contains(@class,'orangehrm-full')]//div[1]//div[1]//div[2]//input[1]");
	public By txt_empid=By.xpath("//div[contains(@class,'grid-item--gutter')]//input[contains(@class,'oxd-input--active')]");
	public By txt_superVisorname=By.xpath("(//div[contains(@class,'item--gutters')])[1]//input");
	public By search_btn=By.xpath("button[type='submit']");
	public By reset_btn=By.xpath("button[type='reset']");
	public By addbtn=By.xpath("//div[@class='orangehrm-header-container']//button");
	public By empstatus_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[1]//i");
	public By include_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[2]//i");
	public By jobtitle_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[3]//i");
	public By subunit_dd=By.xpath("(//div[@class='oxd-select-wrapper'])[4]//i");
	public By deleteSelectedBtn=By.xpath("//button[text()=' Delete Selected ']");
}
