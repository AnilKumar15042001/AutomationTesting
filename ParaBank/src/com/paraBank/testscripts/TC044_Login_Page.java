package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.utility.WholeApp;

public class TC044_Login_Page {

@Test
	public static void tc044()
	{
	//verify all links are available in login page
		WholeApp.openApplication();
		WholeApp.implicityWait();
		WholeApp.maximizeWindow();
		Login_Page.allTheLinksInLoginPage();
		WholeApp.closeApplication();
	}
}
