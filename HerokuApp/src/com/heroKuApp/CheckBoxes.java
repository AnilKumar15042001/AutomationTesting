package com.heroKuApp;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckBoxes extends WholeApp{

	public static void main(String[] args) {
		
		WholeApp.openApplication("edge");
		WholeApp.clickOnLink(6);
		
		int checkBoxes=driver.findElements(By.xpath("//input")).size();
		
		for(int i=1;i<=checkBoxes;i++)
		{
			boolean chkBox=driver.findElement(By.xpath("//input["+i+"]")).isSelected();
			
			if(chkBox==false)
			{
				driver.findElement(By.xpath("//input["+i+"]")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//input["+i+"]")).isSelected(), "it is not selected");
				System.out.println("CheckBox "+i+" is selected");
			}
		}
		WholeApp.closeApplication();
	 }

}
