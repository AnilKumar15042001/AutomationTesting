package com.AutomationPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.RemoteWebDriver;
public class Country {

	public static RemoteWebDriver driver;
	public static Select s;
	public static void country(String country)
	{
		s=new Select(driver.findElement(By.id("country")));
		s.selectByVisibleText(country);
	}
	public static void c()
	{
		s=new Select(driver.findElement(By.id("country")));
		List<WebElement> ele=s.getOptions();
		for(WebElement eles:ele)
		{
			if(eles.getText().equals("India"))
			{
				eles.click();
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		//Country.country("India");
		Country.c();
		//driver.close();
	}

}
