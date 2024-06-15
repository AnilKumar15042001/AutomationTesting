package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class Register_Page extends WholeApp {

//Objects/Elements
	static By register_linktext=By.linkText("Register");
	static By txt_fn=By.id("customer.firstName");
	static By txt_ln=By.id("customer.lastName");
	static By txt_address=By.id("customer.address.street");
	static By txt_city=By.id("customer.address.city");
	static By txt_state=By.id("customer.address.state");
	static By txt_zipcode=By.id("customer.address.zipCode");
	static By txt_phone=By.id("customer.phoneNumber");
	static By txt_ssn=By.id("customer.ssn");
	static By heading=By.xpath("//h1[text()='Signing up is easy!']");
	
	static By txt_un=By.id("customer.username");
	static By txt_pwd=By.id("customer.password");
	static By txt_cnfpwd=By.id("repeatedPassword");
	
	static By register_btn=By.xpath("//input[@type='submit'][@value='Register']");
	
//methods
	public static void registerPage()
	{
		driver.findElement(register_linktext).click();
	}
	public static void name(String fn,String ln)
	{
		driver.findElement(txt_fn).sendKeys(fn);
		driver.findElement(txt_ln).sendKeys(ln);
	}
	public static void address(String address,String city,String state,String zipcode)
	{
		driver.findElement(txt_address).sendKeys(address);
		driver.findElement(txt_city).sendKeys(city);
		driver.findElement(txt_state).sendKeys(state);
		driver.findElement(txt_zipcode).sendKeys(zipcode);
	}
	public static void contact(String phn,String ssn)
	{
		driver.findElement(txt_phone).sendKeys(phn);
		driver.findElement(txt_ssn).sendKeys(ssn);
	}
	public static void loginDetails(String un,String pwd,String cnfpwd)
	{
		driver.findElement(txt_un).sendKeys(un);
		driver.findElement(txt_pwd).sendKeys(pwd);
		driver.findElement(txt_cnfpwd).sendKeys(cnfpwd);
	}
	public static void registerBtn()
	{
		driver.findElement(register_btn).click();
	}
	public static void labels()
	{
		List<WebElement> label=driver.findElements(By.tagName("tr"));
		for(WebElement labels:label)
		{
			Reporter.log(labels.getText());
		}
	}
	public static void retrieveData()
	{
		int textboxes=driver.findElements(By.xpath("//form[@id='customerForm']/table/tbody/tr/td[2]/input")).size();
		for(int i=1;i<=textboxes;i++)
		{
			if(i==9)
				continue;
			String textboxesData=driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr["+i+"]/td[2]/input")).getAttribute("value");
			Reporter.log(textboxesData);
		}
	}
	public static void heading()
	{
		Reporter.log("Heading:-"+driver.findElement(heading).getText());
	}
	public static void otherText()
	{
		Reporter.log(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/p")).getText());
	}
	public static void textboxes()
	{
		int textbox=driver.findElements(By.xpath("//form[@id='customerForm']/table/tbody/tr/td[2]/input")).size();
		System.out.println(textbox);
		for(int i=1;i<=textbox;i++)
		{
			if(i==9)
				continue;
			boolean textboxes=driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr["+i+"]/td[2]/input")).isEnabled();
			Reporter.log(""+textboxes);
		}
	}
}
