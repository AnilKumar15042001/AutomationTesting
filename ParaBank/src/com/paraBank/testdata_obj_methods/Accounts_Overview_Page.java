package com.paraBank.testdata_obj_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class Accounts_Overview_Page extends WholeApp{

//objects/elements
	static By accoverview_link=By.linkText("Accounts Overview");
	static By heading=By.xpath("//h1[text()='Accounts Overview']");
	static By heading2=By.xpath("//h1[text()='Account Details']");
	static By heading3=By.xpath("//h1[text()='Account Activity']");
	static By go_btn=By.xpath("//input[@type='submit'][@value='Go']");
	
//methods
	public static void accOverViewPage()
	{
		driver.findElement(accoverview_link).click();
	}
	public static void goBtn()
	{
		driver.findElement(go_btn).click();
	}
	public static void clickOnAccNo(int rowno)
	{
		driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr["+rowno+"]/td[1]/a")).click();
	}
	public static void heading()
	{
		Reporter.log(driver.findElement(heading).getText());
	}
	public static void headingOfAccDetailsAndActivity()
	{
		WebElement heading1=driver.findElement(heading2);
		Reporter.log(heading1.getText());
		Reporter.log(""+heading1.isDisplayed());
		WebElement heading2=driver.findElement(heading3);
		Reporter.log(heading2.getText());
		Reporter.log(""+heading2.isDisplayed());
	}
	public static void dropdown(String apvalue,String typevalue)
	{
		WebElement ap=driver.findElement(By.id("month"));
		ap.click();
		s=new Select(ap);
		s.selectByVisibleText(apvalue);
		WebElement type=driver.findElement(By.id("transactionType"));
		type.click();
		s=new Select(type);
		s.selectByVisibleText(typevalue);
	}
	public static void clickOnTransaction(int rowno)
	{
		driver.findElement(By.xpath("//*[@id=\"transactionTable\"]/tbody/tr["+rowno+"]/td[2]/a")).click();
	}
}
