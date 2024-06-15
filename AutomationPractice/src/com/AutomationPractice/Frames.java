package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	static WebDriver driver;
	public static void frame()
	{
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Anil kumar");
		
		if(driver.findElement(By.name("RESULT_RadioButton-1")).isSelected()==false)
		{
			driver.findElement(By.id("RESULT_RadioButton-1_0")).click();
		}
		else
		{
			driver.findElement(By.id("RESULT_RadioButton-1_1")).click();
		}
	}
	
	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		frame();
	}
}
