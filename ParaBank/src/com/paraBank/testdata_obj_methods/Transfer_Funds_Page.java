package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class Transfer_Funds_Page extends WholeApp{

//objects/elements
	static By transferfunds_link=By.linkText("Transfer Funds");
	static By txt_amt=By.id("amount");
	static By fromacc_dd=By.id("fromAccountId");
	static By toacc_dd=By.id("toAccountId");
	static By transfer_btn=By.xpath("//input[@type='submit'][@value='Transfer']");
	static By heading=By.xpath("//h1[text()='Transfer Funds']");
	
//methods
	public static void transferFundsPage()
	{
		driver.findElement(transferfunds_link).click();
	}
	public static void transferBtn()
	{
		driver.findElement(transfer_btn).click();
	}
	public static void amount(String amt)
	{
		driver.findElement(txt_amt).sendKeys(amt);
	}
	public static void dropdown(WebElement ele,String value)
	{
		WebElement fromacc=driver.findElement(fromacc_dd);
		WebElement toacc=driver.findElement(toacc_dd);
		s=new Select(ele);
		List<WebElement> element=s.getOptions();
		for(WebElement elements:element)
		{
			if(elements.getText().equals(value))
			{
				elements.click();
			}
		}
	}
	public static void heading()
	{
		WebElement pageheading=driver.findElement(heading);
		Reporter.log(pageheading.getText());
		Reporter.log(""+pageheading.isDisplayed());
	}
	public static void labels()
	{
		Reporter.log(driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/p/b")).getText());
		int label=driver.findElements(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[1]/text()")).size();
		for(int i=1;i<=label;i++)
		{
			String labels=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[1]/text()["+i+"]")).getText();
			Reporter.log(labels);
		}
	}
}


