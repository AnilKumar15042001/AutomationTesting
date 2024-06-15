package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TextBox_TextAreaBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Anil");
		driver.findElement(By.id("email")).sendKeys("aniluttarakabat@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("6370344025");
		driver.findElement(By.id("textarea")).sendKeys("Badapokharia");
		driver.close();
	}

}
