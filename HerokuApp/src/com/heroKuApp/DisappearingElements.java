package com.heroKuApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DisappearingElements extends WholeApp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WholeApp.openApplication("firefox");
		WholeApp.linkClick("disappearing_elements");
		try
		{
	   Assert.assertTrue(driver.getPageSource().contains("Disappearing Elements"));
		    	  
	  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
  	  Assert.assertTrue(driver.getPageSource().contains("Welcome to the-internet"));
  	  driver.navigate().back();
  	  
  	  driver.findElement(By.xpath("//a[normalize-space()='About']")).click();
  	  Assert.assertTrue(driver.getPageSource().contains("Not Found"));
  	  driver.navigate().back();
  	  
  	  driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
  	  Assert.assertTrue(driver.getPageSource().contains("Not Found"));
  	  driver.navigate().back();
  	  
  	  driver.findElement(By.xpath("//a[normalize-space()='Portfolio']")).click();
  	  Assert.assertTrue(driver.getPageSource().contains("Not Found"));
  	  driver.navigate().back();
  	  
  	  WholeApp.closeApplication();
		}
		catch(StaleElementReferenceException e)
		{
			e.printStackTrace();
		}
	}

}
