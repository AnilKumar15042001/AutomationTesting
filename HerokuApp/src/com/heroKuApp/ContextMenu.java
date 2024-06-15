package com.heroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu extends WholeApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WholeApp.openApplication("chrome");
		WholeApp.clickOnLink(7);
		
		act=new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']"))).build().perform();
		
		alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		
		WholeApp.closeApplication();
	}

}
