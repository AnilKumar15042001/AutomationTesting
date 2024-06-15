package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddEmpObj;
import pageObjects.LoginObj;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
    public LoginObj lo;
	public AddEmpObj ado;
	public static Logger log=Logger.getLogger(Base.class.getName());
	
	public static void implicityWait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void explicityWait(WebElement element)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void browser(String bname)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
	}
	public static void log4j_Properties()
	{
		PropertyConfigurator.configure("log4j.properties");
	}
	public static void log4j_xml()
	{
		DOMConfigurator.configure("log4j.xml");
	}
}







