package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC023_Register_Page {

@Test	
	public static void tc023() throws Exception
	{
   //enter one character or number in all the textboxes
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("A", "U");
		Register_Page.address("B", "K", "O", "7");
		Register_Page.contact("6", "5");//Bug-8
		Register_Page.loginDetails("A", "A", "A");
		Register_Page.registerBtn();
		Thread.sleep(3000);
    	WholeApp.closeApplication();
		
		
	}
}
