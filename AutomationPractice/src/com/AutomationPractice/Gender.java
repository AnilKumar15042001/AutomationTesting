package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gender {
public static WebDriver driver;
	public static void gender(String gender)
	{
		if(gender=="m")
		{
			driver.findElement(By.id("male")).click();
		}
		else if(gender=="f")
		{
			driver.findElement(By.id("female")).click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Gender.gender("f");
		driver.close();
	}

}
