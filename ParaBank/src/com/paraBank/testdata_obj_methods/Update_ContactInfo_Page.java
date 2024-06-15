package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class Update_ContactInfo_Page extends WholeApp{

//objects/elements
	static By updateContactInfo_link=By.linkText("Update Contact Info");
	static By txt_fn=By.id("customer.firstName");
	static By txt_ln=By.id("customer.lastName");
	static By txt_address=By.id("customer.address.street");
	static By txt_city=By.id("customer.address.city");
	static By txt_state=By.id("customer.address.state");
	static By txt_zipcode=By.id("customer.address.zipCode");
	static By txt_phone=By.id("customer.phoneNumber");
	static By updprofile_btn=By.xpath("//input[@type='submit'][@value='Update Profile']");
	static By heading=By.xpath("//h1[text()='Update Profile']");
	
//methods
	public static void updateContactInfoPage()
	{
		driver.findElement(updateContactInfo_link).click();
	}
	public static void name(String fn,String ln)
	{
		driver.findElement(txt_fn).sendKeys(fn);
		driver.findElement(txt_ln).sendKeys(ln);
	}
	public static void address(String add,String city,String state,String zipcode,String phn)
	{
		driver.findElement(txt_address).sendKeys(add);
		driver.findElement(txt_city).sendKeys(city);
		driver.findElement(txt_state).sendKeys(state);
		driver.findElement(txt_zipcode).sendKeys(zipcode);
		driver.findElement(txt_phone).sendKeys(phn);
	}
	public static void updateProfileBtn()
	{
		driver.findElement(updprofile_btn).click();
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
