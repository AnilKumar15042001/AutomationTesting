package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC027_Register_Page {

@Test	
	public static void tc027() throws Exception
	{
   //enter phone number more than on validate phone number
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "752019");
		Register_Page.contact("63703440526370344025", "53435465");//Bug-10
		Register_Page.loginDetails("Anil1504", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}
