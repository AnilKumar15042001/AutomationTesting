package com.heroKuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop extends WholeApp{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WholeApp.openApplication("firefox");
		WholeApp.clickOnLink(10);
		Assert.assertTrue(driver.getPageSource().contains("Drag and Drop"));
		
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Thread.sleep(5000);
		act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		WholeApp.closeApplication();
		
	}

}
