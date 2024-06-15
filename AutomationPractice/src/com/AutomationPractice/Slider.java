package com.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
static WebDriver driver;
static Actions act;
public static void slider()
{
	WebElement source=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	act=new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", source);
	act.dragAndDropBy(source, 50, 0).build().perform();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Slider.slider();
		driver.close();
	}

}
