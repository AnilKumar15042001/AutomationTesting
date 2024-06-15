package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC026_Register_Page {

@Test	
	public static void tc026() throws Exception
	{
   //without enter any data in all textboxes then click on Register button
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("", "");
		Register_Page.address("", "", "", "");
		Register_Page.contact("", "");
		Register_Page.loginDetails("", "", "");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}
