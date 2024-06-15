package com.paraBank.testdata_obj_methods;

import org.openqa.selenium.By;

import com.paraBank.utility.WholeApp;

public class ForgotLoginInfo_Page extends WholeApp{

	
	static By forgotlogininfo_link=By.linkText("Forgot login info?");
	
	
	public static void forgotLoginInfoPage()
	{
		driver.findElement(forgotlogininfo_link).click();
	}
}
