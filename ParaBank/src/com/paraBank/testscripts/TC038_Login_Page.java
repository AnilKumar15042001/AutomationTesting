package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.testdata_obj_methods.Logout_Page;
import com.paraBank.utility.WholeApp;

public class TC038_Login_Page {

@Test
	public static void tc038()
	{
	//without enter password
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.login("Anil1504", "");
		Login_Page.loginBtn();
		//Logout_Page.logout();
		WholeApp.closeApplication();
	}
}
