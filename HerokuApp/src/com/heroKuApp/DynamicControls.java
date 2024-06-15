package com.heroKuApp;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DynamicControls extends WholeApp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WholeApp.openApplication("chrome");
		WholeApp.clickOnLink(13);
		if(driver.getPageSource().contains("Dynamic Controls"))
		{
			if(driver.getPageSource().contains("Remove/add"))
			{
				driver.findElement(By.xpath("//div[normalize-space()='A checkbox']")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
				Assert.assertEquals(driver.getPageSource().contains("It's gone!"),true);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			}
		}
	}

}
