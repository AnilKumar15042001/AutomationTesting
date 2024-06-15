package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC016_Register_Page {

@Test	
	public static void tc016() throws Exception
	{
	//enter only special characters in "address, city & state" textboxes
		WholeApp.openApplication();
		WholeApp.implicityWait();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("#$@$#@$#", "#@@$$%%", "$%@%@%$", "752019");//Bug-4
		Register_Page.contact("6370344052", "53435465");
		Register_Page.loginDetails("Anil150423", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}
