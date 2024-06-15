package com.heroKuApp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DynamicContent extends WholeApp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WholeApp.openApplication("chrome");
		WholeApp.clickOnLink(12);
		
		WebElement element=driver.findElement(By.linkText("click here"));
		List<WebElement> texts=driver.findElements(By.xpath("//div/div/div/div/div/div/div[2]"));
		int size=driver.findElements(By.xpath("//div/div/div/div/div/div/div[2]")).size();
		int c=0;
		try {
		while(c<10)
		{	
		    element.click();
		   // driver.navigate().back();
		   //element.click();
		    for(int i=3;i<=size;i++)
		    {
		    	String data=driver.findElement(By.xpath("//div/div/div/div/div/div["+i+"]/div[2]")).getText();
		    	System.out.println(data);
		    	System.out.println();
		    }
		    driver.navigate().back();
		    c++;
		}
	  }
		catch(StaleElementReferenceException e)
		{
			   // element.click();
		}
		WholeApp.closeApplication();
	}

}
