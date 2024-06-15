package com.heroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends WholeApp{

	public static void main(String[] args) throws InterruptedException {
		
		WholeApp.openApplication("chrome");
		WholeApp.clickOnLink(11);
		Thread.sleep(3000);
		s=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		s.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		WholeApp.closeApplication();
	}
}
