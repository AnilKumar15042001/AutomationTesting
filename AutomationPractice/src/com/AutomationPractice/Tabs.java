package com.AutomationPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tabs {

	static WebDriver driver;
	public static void tabs() throws AWTException, InterruptedException
	{
		 boolean b=driver.findElement(By.xpath("//div[@class='column-right-outer']/div/aside/div/div[1]/div/form/div/span[2]/span[1]/input[1]")).isDisplayed();
		 System.out.println(b);
		Robot r=new Robot();
		Actions act=new Actions(driver);
		
		if(driver.findElement(By.xpath("//div[@class='column-right-outer']/div/aside/div/div[1]/div/form/div/span[2]/span[1]/input[1]")).isDisplayed()==b)
		{
         	driver.findElement(By.xpath("//div[@class='column-right-outer']/div/aside/div/div[1]/div/form/div/span[2]/span[1]/input[1]")).sendKeys("anil"+Keys.TAB+Keys.ENTER);
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyRelease(KeyEvent.VK_TAB);
//			r.keyPress(KeyEvent.VK_ENTER);
         	Thread.sleep(3000);
         	int links=driver.findElements(By.xpath("//div[@id='Wikipedia1']/div[1]/div[2]/div/a")).size();
         	
         	System.out.println(links);
         	
         	for(int i=1;i<=links;i++)
         	{
         		String data=driver.findElement(By.xpath("//div[@id='Wikipedia1']/div[1]/div[2]/div["+i+"]/a")).getText();
         		System.out.println(data);
         	}
		}
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		tabs();
		//driver.close();
	}
}
