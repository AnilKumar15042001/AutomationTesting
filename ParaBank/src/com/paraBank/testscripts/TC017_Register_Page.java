package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC017_Register_Page {

@Test	
	public static void tc001() throws Exception
	{
	// enter only alphabets in "zipcode, phone & SSNno" textboxes
		WholeApp.openApplication();
		WholeApp.implicityWait();
		Register_Page.registerPage();
		WholeApp.implicityWait();
		Register_Page.name("Anil", "Uttarkabat");
		Register_Page.address("Badapokharia", "Khordha", "Odisha", "shagcdhgac");
		Register_Page.contact("asdschdgcsa", "sdcgcsdhgcds");//Bug-5
		Register_Page.loginDetails("Anil150426", "Anil1504", "Anil1504");
		Register_Page.registerBtn();
    	WholeApp.closeApplication();
		
		
	}
}
