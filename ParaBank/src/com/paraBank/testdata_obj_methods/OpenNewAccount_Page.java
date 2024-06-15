package com.paraBank.testdata_obj_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.paraBank.utility.WholeApp;

public class OpenNewAccount_Page extends WholeApp{

//objects/elements	
	static By onewAcc_link=By.linkText("Open New Account");
	static By acctype_dropdown=By.xpath("//div[@id='rightPanel']/div/div/form/select[1]");
	static By accid_dropdown=By.xpath("//div[@id='rightPanel']/div/div/form/select[2]");
	static By opennewacc_btn=By.xpath("//input[@type='submit'][@value='Open New Account']");
	static By heading=By.xpath("//h1[text()='Open New Account']");
	
//methods	
	public static void openNewAcc()
	{
		driver.findElement(onewAcc_link).click();
	}
	public static void accTypeAndId(int type,String id)
	{
		s=new Select(driver.findElement(acctype_dropdown));
		s.selectByIndex(type);
		s=new Select(driver.findElement(accid_dropdown));
		s.selectByVisibleText(id);
	}
	public static void openNewAccBtn()
	{
		driver.findElement(opennewacc_btn).click();
	}
	public static void heading()
	{
		Reporter.log("Heading:-"+driver.findElement(heading).getText());
	}
	public static void infoText()
	{
		List<WebElement> text=driver.findElements(By.xpath("//div[@id='rightPanel']/div/div/form/p/b"));
		for(WebElement texts:text)
		{
			Reporter.log(texts.getText());
		}
	}
	//Account Opened page
	public static void accOpenedPage()
	{
		List<WebElement> data=driver.findElements(By.xpath("//div[@ng-if='showResult']/p"));
		for(WebElement datas:data)
		{
			Reporter.log(datas.getText());
		}
		String heading=driver.findElement(By.xpath("//h1[text()='Account Opened!']")).getText();
		Reporter.log("Heading:"+heading);
	}
}
