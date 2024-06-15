package com.heroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_RemoveElements extends WholeApp{
	public static void add(int n)
	{
		for(int i=1;i<=n;i++)
		{
			
		driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
		}
	}
	public static void remove(int buttonNo)
	{
		int button=driver.findElements(By.xpath("//div[@class='example']/div/button")).size();
		for(int i=buttonNo;i>=0;i--)
		{
			driver.findElement(By.xpath("//div[@class='example']/div/button["+i+"]")).click();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		WholeApp.clickOnLink(2);
		Add_RemoveElements.add(50);
		Add_RemoveElements.remove(5);
		driver.close();
	}

}
