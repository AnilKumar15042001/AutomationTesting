package com.heroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BasicAuth extends WholeApp{

	public static void main(String[] args)  {
		
		driver=new FirefoxDriver();
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Assert.assertEquals(driver.getPageSource().contains("Congratulations! You must have the proper credenti"), true);
		WholeApp.closeApplication();
	}
}
