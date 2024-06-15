package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.testdata_obj_methods.Logout_Page;
import com.paraBank.testdata_obj_methods.OpenNewAccount_Page;
import com.paraBank.utility.WholeApp;

public class TC035_Login_Page {

@Test
	public static void tc035()
	{
	//enter valid username & invalid password
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.login("Anil1504", "Anil15042001");
		Login_Page.loginBtn();
		//Logout_Page.logout();
		WholeApp.closeApplication();
	}
}
