package locators;

import org.openqa.selenium.By;

import utils.LocatorUtils;

public class DashboardObj {

	public By mod_admin;
	public By mod_pim;
	public By heading;
	
	public DashboardObj(String fileName) throws Exception {
//		mod_admin=LocatorUtils.getLocator(fileName, "", "mod_admin");
		mod_pim=LocatorUtils.getLocator(fileName, "linktext", "mod_pim");
		heading=LocatorUtils.getLocator(fileName, "xpath", "heading");
	}
}
