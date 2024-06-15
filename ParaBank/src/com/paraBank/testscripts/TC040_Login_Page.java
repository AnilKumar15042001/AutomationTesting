package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.utility.WholeApp;

public class TC040_Login_Page {

@Test
	public static void tc040()
	{
	//verify password format
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.login("", "Anil1504");
		Login_Page.passwordEncodeFormat();
		//Logout_Page.logout();
		WholeApp.closeApplication();
	}
}
