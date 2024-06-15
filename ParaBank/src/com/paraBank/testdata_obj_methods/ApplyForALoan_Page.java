package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class ApplyForALoan_Page extends WholeApp{

//objects/elements
	static By requestloan_link=By.linkText("Request Loan");
	static By txt_loanAmt=By.id("amount");
	static By txt_downpaymt=By.id("downPayment");
	static By fromAcc_dd=By.id("fromAccountId");
	static By applyNow_btn=By.xpath("//input[@type='submit'][@value='Apply Now']");
	static By heading=By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
	
//methods
	public static void requestLoanPage()
	{
		driver.findElement(requestloan_link).click();
	}
	public static void loanAmtAndDownPaymt(String loanAmt,String downpaymt)
	{
		driver.findElement(txt_loanAmt).sendKeys(loanAmt);
		driver.findElement(txt_downpaymt).sendKeys(downpaymt);
	}
	public static void applyNowBtn()
	{
		driver.findElement(applyNow_btn).click();
	}
	public static void fromAcc(String value)
	{
		s=new Select(driver.findElement(fromAcc_dd));
		s.selectByVisibleText(value);
	}
	public static void heading()
	{
		Reporter.log(driver.findElement(heading).getText());
	}
	public static void labels()
	{
		List<WebElement> label=driver.findElements(By.xpath("//*[@id='rightPanel']/div/div/form/table/tbody/tr/td/b"));
		for(WebElement labels:label)
		{
			Reporter.log(labels.getText());
		}
	}
}
