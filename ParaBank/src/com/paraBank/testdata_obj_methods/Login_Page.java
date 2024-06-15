package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class Login_Page extends WholeApp{

//objects/elements
	static By txt_un=By.name("username");
	static By txt_pwd=By.name("password");
	static By login_btn=By.xpath("//input[@type='submit'][@value='Log In']");
	static By heading=By.xpath("//h2[text()='Customer Login']");
	static int len;
	
	public static void login(String un,String pwd)
	{
		driver.findElement(txt_un).sendKeys(un);
		driver.findElement(txt_pwd).sendKeys(pwd);
		len=pwd.length();
	}
	public static void loginBtn()
	{
		driver.findElement(login_btn).click();
	}
	public static void heading()
	{
		Reporter.log("Heading:-"+driver.findElement(heading).getText());
	}
	public static void labels()
	{
		List<WebElement> label=driver.findElements(By.tagName("b"));
		for(WebElement labels:label)
		{
			Reporter.log(labels.getText());
		}
	}
	public static void allTheLinksInLoginPage()
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			Reporter.log(" "+link.isEnabled());
		}
	}
	public static void textboxes()
	{
		int textboxes=driver.findElements(By.xpath("//div[@id='loginPanel']/form/div")).size();
		for(int i=1;i<textboxes;i++)
		{
			boolean textbox=driver.findElement(By.xpath("//div[@id='loginPanel']/form/div["+i+"]")).isEnabled();
			Reporter.log(" "+textbox);
		}
	}
	public static void passwordEncodeFormat()
	{
		Reporter.log("Password format:");
		for(int i=1;i<=len;i++)
		{
			Reporter.log("*");
		}
	}
}
