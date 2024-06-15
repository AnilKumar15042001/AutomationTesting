package com.AutomationPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class NewBrowserWindow {

	static WebDriver driver;
	public static void newWindow() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Thread.sleep(3000);
		for(String str:s)
		{
			System.out.println(str);
			String str2=driver.switchTo().window(str).getTitle();
			System.out.println(str2);
			
			if(str2.equalsIgnoreCase("Your Store"))
			{
				driver.close();
			}
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		newWindow();
		driver.quit();
	}
}
