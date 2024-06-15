package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PeginationTable {
static WebDriver driver;
public static void peginationTable(int rows)
{
	int row=driver.findElements(By.xpath("//div[@id='HTML8']/div[1]/div[1]/table/tbody/tr")).size();
	int col=driver.findElements(By.xpath("//div[@id='HTML8']/div[1]/div[1]/table/tbody/tr[1]/td")).size();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<col;j++)
		{
			String data=driver.findElement(By.xpath("//div[@id='HTML8']/div[1]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("  "+data);
		}
		System.out.println();
		System.out.println();
		
		if(rows<=row)
		{
			driver.findElement(By.xpath("//div[@id='HTML8']/div[1]/div[1]/table/tbody/tr["+rows+"]/td[4]/input[1]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//div[@id='HTML8']/div[1]/div[1]/table/tbody/tr["+i+"]/td[4]/input[1]")).click();
		}
	}
	
}
public static void pageNo(int pageno)
{
	int no=driver.findElements(By.xpath("//div[@id='HTML8']/div[1]/div[1]/ul/li")).size();
	for(int i=1;i<=no;i++)
	{
		if(i==pageno)
		{
		driver.findElement(By.xpath("//div[@id='HTML8']/div[1]/div[1]/ul/li["+i+"]")).click();
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		PeginationTable.pageNo(3);
		PeginationTable.peginationTable(5);
		driver.close();
	}

}
