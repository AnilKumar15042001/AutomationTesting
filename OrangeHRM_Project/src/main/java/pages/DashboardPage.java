package pages;

import locators.DashboardObj;
import utils.ElementUtils;

public class DashboardPage extends DashboardObj{

	public DashboardPage() throws Exception {
		super("DashboardPageLocators");
	}
	
	public void performPIM() throws Exception {
		ElementUtils.performButtonClick(mod_pim);
	}
}
