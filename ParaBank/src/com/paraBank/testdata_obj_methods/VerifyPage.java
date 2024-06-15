package com.paraBank.testdata_obj_methods;

import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class VerifyPage extends WholeApp{

	public static void pageTitle(String title)
	{
		if(driver.getTitle().equals(title))
		{
			Reporter.log("Title matched");
			Reporter.log("Title is:"+title);
		}
		else
		{
			Reporter.log("Title not matched");
			Reporter.log(driver.getTitle());
		}
	}
}
