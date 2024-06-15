package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DoubleClick {
static WebDriver driver;
static Actions act;
public static void doubleClick()
{
	WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	act=new Actions(driver);
	act.doubleClick(element).build().perform();
	
	String field1=driver.findElement(By.xpath("//input[@id='field1']")).getAttribute("value");
	String field2=driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
	
	Assert.assertEquals(field1, field2,"Both are not equal");
	
	System.out.println(field1.concat(" "+field2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		DoubleClick.doubleClick();
		driver.close();
	}

}
