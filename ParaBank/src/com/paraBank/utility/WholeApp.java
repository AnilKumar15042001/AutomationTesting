package com.paraBank.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class WholeApp {
//driver	
public static WebDriver driver;
//select
public static Select s;
//WebElement
public static WebElement element;
	public static void openApplication()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Reporter.log("Application Opened");
	}
	public static void closeApplication()
	{
		driver.close();
		Reporter.log("Application Closed");
	}
	public static void implicityWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	public static void minimizeWindow()
	{
		driver.manage().window().minimize();
	}
	public static void fullScreen()
	{
		driver.manage().window().fullscreen();
	}
}
