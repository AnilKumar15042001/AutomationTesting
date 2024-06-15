package com.AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Colors {

	static WebDriver driver;
	static Select s;
	static Actions act;
	
	public static void color(String colorname) throws InterruptedException
	{
		WebElement ele=driver.findElement(By.xpath("//select[@id='colors']"));
		
		Assert.assertEquals(ele.isEnabled(), true,"Both are not equal");
		
		List<WebElement> list=driver.findElements(By.tagName("option"));
		for(WebElement list1:list)
		{
			String value=list1.getText();
			
			if(value.equals(colorname))
			{
				for(int i=1;i<=5;i++)
				{
					driver.findElement(By.xpath("//select[@id='colors']")).sendKeys(Keys.ARROW_DOWN);
				}
				System.out.println(value);
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		driver=new FirefoxDriver();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		color("Yellow");
		
		driver.close();
	}
}
