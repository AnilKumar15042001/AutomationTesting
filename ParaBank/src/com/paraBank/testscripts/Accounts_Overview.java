package com.paraBank.testscripts;

import org.testng.annotations.Test;

import com.paraBank.testdata_obj_methods.Accounts_Overview_Page;
import com.paraBank.testdata_obj_methods.Login_Page;
import com.paraBank.utility.WholeApp;

public class Accounts_Overview {

@Test
	public static void tc()
	{
		WholeApp.openApplication();
		WholeApp.implicityWait();
		Login_Page.login("Anil1504", "Anil1504");
		Login_Page.loginBtn();
		Accounts_Overview_Page.accOverViewPage();
		Accounts_Overview_Page.clickOnAccNo(1);
		Accounts_Overview_Page.dropdown("January", "Debit");
		Accounts_Overview_Page.goBtn();
	}
}
