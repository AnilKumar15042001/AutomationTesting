package testSuite;

import static components.AppCommon.driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BrowserUtils;
import utils.PropertiesUtils;

public class TestCase02 {
  @Test
  public void tc02() throws Exception {
	  BrowserUtils.openBrowser();
	  BrowserUtils.enterUrl();
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(PropertiesUtils.getPropertyValue().getProperty("username"));
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PropertiesUtils.getPropertyValue().getProperty("password"));
	  Thread.sleep(3000);
	  BrowserUtils.closeBrowser();
  }
}
