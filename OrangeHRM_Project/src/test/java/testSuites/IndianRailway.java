package testSuites;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndianRailway {
	
	static WebDriver driver;
	static WebDriverWait wait;
  @Test
  public void test() throws InterruptedException {
	  
	  	WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ixigo.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		try
		{
		driver.findElement(By.xpath("//span[contains(@class,'h6 text-xl font-medium text-charcoal-600 font-medium text-charcoal-800')]")).click();
		System.out.println(driver.findElement(By.xpath("//a[contains(@href,'hotels')]")).getText());
		}
		catch(Exception e)
		{
//			driver.findElement(By.xpath("//a[contains(@href,'hotels')]")).click();
//			System.out.println(driver.findElement(By.xpath("//a[contains(@href,'hotels')]")).getText());
		}
  }
}
