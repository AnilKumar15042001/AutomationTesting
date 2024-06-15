package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class BillPay_Page extends WholeApp{

//objects/elements	
	static By billPay_link=By.linkText("Bill Pay");
	static By txt_pname=By.name("payee.name");
	static By txt_address=By.name("payee.address.street");
	static By txt_city=By.name("payee.address.city");
	static By txt_state=By.name("payee.address.state");
	static By txt_zipcode=By.name("payee.address.zipCode");
	static By txt_phone=By.name("payee.phoneNumber");
	static By txt_accno=By.name("payee.accountNumber");
	static By txt_verifyAccno=By.name("verifyAccount");
	static By txt_amt=By.name("amount");
	static By fromAcc_dd=By.name("fromAccountId");
	static By sendpaymt_btn=By.xpath("//input[@type='submit'][@value='Send Payment']");
	static By heading=By.xpath("//h1[text()='Bill Payment Service']");
	
//methods
	public static void billPayPage()
	{
		driver.findElement(billPay_link).click();
	}
	public static void nameAndAddress(String pn,String add,String city,String state,String zipcode)
	{
		driver.findElement(txt_pname).sendKeys(pn);
		driver.findElement(txt_address).sendKeys(add);
		driver.findElement(txt_city).sendKeys(city);
		driver.findElement(txt_state).sendKeys(state);
		driver.findElement(txt_zipcode).sendKeys(zipcode);
	}
	public static void accDetails(String phn,String acc,String vAcc,String amt)
	{
		driver.findElement(txt_phone).sendKeys(phn);
		driver.findElement(txt_accno).sendKeys(acc);
		driver.findElement(txt_verifyAccno).sendKeys(vAcc);
		driver.findElement(txt_amt).sendKeys(amt);
	}
	public static void sendPaymentBtn() 
	{
		driver.findElement(sendpaymt_btn).click();
	}
	public static void dropdown(String value)
	{
		s=new Select(driver.findElement(fromAcc_dd));
		s.selectByVisibleText(value);
	}
	public static void labels()
	{
		List<WebElement> label=driver.findElements(By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr/td/b"));
		for(WebElement labels:label)
		{
			Reporter.log(labels.getText());
		}
	}
	public static void heading()
	{
		Reporter.log(driver.findElement(heading).getText());
	}
}
