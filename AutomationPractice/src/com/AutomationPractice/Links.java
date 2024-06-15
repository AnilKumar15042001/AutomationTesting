package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Links {
static WebDriver driver;
	public static void links(String links)
	{
		if("o".equals(links))
		{
			driver.findElement(By.xpath("//a[normalize-space()='open cart']")).click();
		}
		else if("h".equals(links))
		{
			driver.findElement(By.xpath("//a[normalize-space()='orange HRM']")).click();
		}
		else
		{
			driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Links.links("");
		driver.close();
	}

}
