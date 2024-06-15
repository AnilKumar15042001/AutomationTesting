package com.AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateOrCalenderControl {

	static WebDriver driver;
	
	public static void selectFutureDate(String day,String month,String year)
	{
		while(true)
		{
			String currentYear=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
			String currentMonth=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
			if(currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[contains(@class,'circle-triangle-e')]")).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
		for(WebElement date:dates)
		{
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
	}
	
	public static void selectPastDate(String day,String month,String year)
	{
		while(true)
		{
			String currentYear=driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();
			String currentMonth=driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
			if(currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[contains(@class,'circle-triangle-w')]")).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
		for(WebElement date:dates)
		{
			if(date.getText().equals(day))
			{
				date.click();
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("datepicker")).click();
		selectPastDate("15","April","2023");
//		selectFutureDate("15","April","2030");
		driver.close();
	}

}
