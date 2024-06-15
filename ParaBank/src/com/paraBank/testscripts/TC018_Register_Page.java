package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC018_Register_Page {

@Test	
	public static void tc018() throws Exception
	{
	//enter only special characters in "zipcode, phone & SSNno" textboxes
		WholeApp.openApplication();
		WholeApp.implicityWait();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "#@@%$%");
		Register_Page.contact("$#%$%$#", "$#$%#$%#");//Bug-6
		Register_Page.loginDetails("Anil150401", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}
