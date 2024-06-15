package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
static WebDriver driver;
    public static void webTable()
    {
    	int row=driver.findElements(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr")).size();
    	int col=driver.findElements(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr[2]/td")).size();
    	System.out.println(" "+driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr[1]")).getText());
    	for(int i=2;i<=row;i++)
    	{
    		for(int j=1;j<=col;j++)
    		{
    				String data=driver.findElement(By.xpath("//div[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
        			System.out.print("  "+data);
    		}
    		System.out.println();
    		System.out.println();	
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebTable.webTable();
		driver.close();
	}

}
