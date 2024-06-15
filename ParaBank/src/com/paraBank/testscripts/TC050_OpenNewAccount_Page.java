package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.testdata_obj_methods.Logout_Page;
import com.paraBank.testdata_obj_methods.OpenNewAccount_Page;
import com.paraBank.utility.WholeApp;

public class TC050_OpenNewAccount_Page {

@Test
	public static void tc050() throws Exception
	{
	//verify information text
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.login("Anil1504", "Anil1504");
		Login_Page.loginBtn();
		WholeApp.implicityWait();
		OpenNewAccount_Page.openNewAcc();
		WholeApp.implicityWait();
		OpenNewAccount_Page.infoText();
		Logout_Page.logout();
		WholeApp.closeApplication();
	}
}
