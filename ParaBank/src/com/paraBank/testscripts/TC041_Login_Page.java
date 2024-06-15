package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.utility.WholeApp;

public class TC041_Login_Page {

@Test
	public static void tc041()
	{
	//verify heading of the page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.heading();
		WholeApp.closeApplication();
	}
}
