package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
static WebDriver driver;
static Actions act;
public static void dragAndDrop()
{
	
	WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
	WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
	act=new Actions(driver);
	//logic-1
	//act.clickAndHold(source).moveToElement(target).release().build().perform();
	//logic-2
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",source);
	act.dragAndDrop(source, target).build().perform();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		DragAndDrop.dragAndDrop();
		driver.close();	
	}

}
