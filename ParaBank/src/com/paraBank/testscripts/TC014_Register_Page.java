package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC014_Register_Page {

@Test	
	public static void tc014() throws Exception
	{
	//enter only special characters in "firstname & lastname" textbox
		WholeApp.openApplication();
		WholeApp.implicityWait();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("@#$$#@%$&", "@@@%$$&$#");//Bug-2
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "752019");
		Register_Page.contact("6370344052", "53435465");
		Register_Page.loginDetails("Anil1504", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
		Thread.sleep(3000);
    	WholeApp.closeApplication();
		
		
	}
}
