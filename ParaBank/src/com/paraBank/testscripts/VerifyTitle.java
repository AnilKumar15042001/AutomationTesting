package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.VerifyPage;
import com.paraBank.utility.WholeApp;

public class VerifyTitle{

@Test
	public static void verifyTitle()
	{
		WholeApp.openApplication();
		VerifyPage.pageTitle("ParaBank | Welcome | Online Banking");
		WholeApp.closeApplication();
	}
}
