package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC031_Register_Page {

@Test	
	public static void tc031() throws Exception
	{
   //verify text on the page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.otherText();
    	WholeApp.closeApplication();
		
		
	}
}
