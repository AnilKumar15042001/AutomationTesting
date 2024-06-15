package stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import pageObjects.DesktopsObj;
import pageObjects.DigitalDownloadsObj;
import pageObjects.LoginAndLogoutObj;
import pageObjects.RegisterObj;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebElement element;
	public static Alert alt;
	public RegisterObj ro;
	public LoginAndLogoutObj lo;
	public DesktopsObj dsko;
	public DigitalDownloadsObj ddo;
	public static Actions act;
	public static Select s;
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
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void browser(String bname) throws Exception
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
			throw new Exception("Browser not support");
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
	public static String randomEmail()
	{
		String randomEmail=RandomStringUtils.random(10);
		return randomEmail;
	}
	
	  public static boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }
	  public static String registerModuleErrorMsg()
	  {
		  List<WebElement> errorMsgs=driver.findElements(By.xpath("//span[2]/span"));
		  String errorTextMsg="";
		  for(WebElement errorMsg:errorMsgs)
		  {
			   errorTextMsg=errorMsg.getText();
		  }
		  return errorTextMsg;
	  }
}
