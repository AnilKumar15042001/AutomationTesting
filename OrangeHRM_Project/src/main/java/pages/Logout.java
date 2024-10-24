package pages;

import org.openqa.selenium.By;

import utils.ElementUtils;

public class Logout {

	public static By empPf_dd=By.xpath("//img[@class='oxd-userdropdown-img']/following-sibling::i");
	public static By link_logout=By.linkText("Logout");
	 public static void logout() throws Exception {
		ElementUtils.performClick(empPf_dd);
		ElementUtils.performClick(link_logout);
	}
}
