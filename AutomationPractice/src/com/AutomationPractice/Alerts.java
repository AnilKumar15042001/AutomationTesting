package com.AutomationPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Alerts {

	static Alert alt;
	static WebDriver driver;
	public static void alert() throws InterruptedException
	{
		WebElement alertBtn=driver.findElement(By.xpath("//button[normalize-space()='Alert']"));
		
		Assert.assertEquals(alertBtn.isEnabled(), true,"Both are not equal");
		
		Thread.sleep(3000);
		
		alertBtn.click();
		
		alt=driver.switchTo().alert();
		
		String value=alt.getText();
		
		Assert.assertEquals(alt.getText(), value,"Both are not equal");
		
		System.out.println(value);
		
		Thread.sleep(3000);
		
		alt.accept();
		
	}
	public static void confirmBox(String msg) throws InterruptedException
	{
		WebElement confirmbox=driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']"));
		
		Assert.assertEquals(confirmbox.isEnabled(), true,"Booth are not equal");
		
		Thread.sleep(3000);
		
		confirmbox.click();
		
		alt=driver.switchTo().alert();
		
		String value=alt.getText();
		
		System.out.println(value);
		
		Thread.sleep(3000);
		
		if(msg=="ok")
		{
			alt.accept();
			System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		}
		else if(msg=="cancel")
		{
			alt.dismiss();
			System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		}
			
	}
	public static void main(String[] args) throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		alert();
		confirmBox("cancel");
		driver.close();
	}
}
