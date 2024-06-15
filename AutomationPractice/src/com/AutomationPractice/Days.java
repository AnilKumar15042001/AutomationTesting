package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Days {

	public static WebDriver driver;
	public static void days(int day)
	{
		int days=driver.findElements(By.xpath
		("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[4]/div/input")).size();
		if(day<=days)
		{
			driver.findElement(By.xpath
		    ("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[4]/div["+day+"]/input")).click();
		}
		else
		{
			for(int i=1;i<=days;i++)
			{
				driver.findElement(By.xpath
				("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[4]/div["+i+"]/input")).click();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Days.days(7);
		Days.days(2);
		Days.days(3);
		Days.days(5);
		driver.close();
		
	}

}
