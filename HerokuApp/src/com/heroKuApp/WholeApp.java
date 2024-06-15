package com.heroKuApp;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WholeApp {

	public static WebDriver driver;
	public static Actions act;
	public static Alert alt;
	public static Select s;
	
	public static String linkPath="https://the-internet.herokuapp.com/";
	
	public static void openApplication(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/");
		}
		else
		{
			driver=new FirefoxDriver();
			driver.navigate().to("https://the-internet.herokuapp.com/");
		}
	}
	public static void closeApplication()
	{
		driver.close();
	}
	public static void clickOnLink(int linkno)
	{
		driver.findElement(By.xpath("//div[@id='content']/ul/li["+linkno+"]/a")).click();
	}
	public static void linkClick(String url)
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int l=0;
		for(WebElement link:links)
		{
		     String linkurl=link.getAttribute("href");
		    if(linkurl.contains(linkPath))
		    {
		    	l++;
		    	System.out.println(linkurl);
		    	if(linkurl.equals(linkPath+url))
		    	{
		    		WholeApp.clickOnLink(l);
		    	}
		    }
		} 
	}
}
