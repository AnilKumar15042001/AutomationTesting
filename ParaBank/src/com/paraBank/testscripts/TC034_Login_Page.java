package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.testdata_obj_methods.Logout_Page;
import com.paraBank.utility.WholeApp;

public class TC034_Login_Page {

@Test
	public static void tc034()
	{
	//enter invalid username & valid password
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.login("Anil15042001", "Anil1504");
		Login_Page.loginBtn();
		//Logout_Page.logout();
		WholeApp.closeApplication();
	}
}
