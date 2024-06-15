package com.paraBank.testdata_obj_methods;

import org.openqa.selenium.By;

import com.paraBank.utility.WholeApp;

public class Logout_Page extends WholeApp{

//objects/elements
	static By logout_link=By.linkText("Log Out");
	
//methods
	public static void logout()
	{
		driver.findElement(logout_link).click();
	}
}
