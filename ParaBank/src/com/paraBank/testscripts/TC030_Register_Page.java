package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC030_Register_Page {

@Test	
	public static void tc030() throws Exception
	{
   //verify textboxes of the page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.textboxes();
    	WholeApp.closeApplication();
		
		
	}
}
