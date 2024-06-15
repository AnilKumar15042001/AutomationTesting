package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC022_Register_Page {

@Test	
	public static void tc022() throws Exception
	{
	//enter "confirm passowd" different as "password"
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "752019");
		Register_Page.contact("6370344052", "53435465");
		Register_Page.loginDetails("Anil150402", "Anil1504", "Anil150422");
		Register_Page.registerBtn();
		Thread.sleep(3000);
    	WholeApp.closeApplication();
		
		
	}
}
