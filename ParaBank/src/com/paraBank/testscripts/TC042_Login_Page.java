package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.utility.WholeApp;

public class TC042_Login_Page {

@Test
	public static void tc042()
	{
	//verify labels of the page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.labels();
		WholeApp.closeApplication();
	}
}
