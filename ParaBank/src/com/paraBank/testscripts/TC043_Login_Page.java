package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.ForgotLoginInfo_Page;
import com.paraBank.testdata_obj_methods.Register_Page;
import com.paraBank.utility.WholeApp;

public class TC043_Login_Page {

@Test
	public static void tc043()
	{
	//verify links of the page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Register_Page.registerPage();
		ForgotLoginInfo_Page.forgotLoginInfoPage();
		WholeApp.closeApplication();
	}
}
