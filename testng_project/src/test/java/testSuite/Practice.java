package testSuite;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.AssertUtils;
import utils.BrowserUtils;

import static utils.BrowserUtils.driver;
import utils.ElementUtils;
import utils.TakeScreenshotUtils;

public class Practice {
  @Test
  public void f() throws Exception {
//	  TestNG testNG=new TestNG();
//	  List<String> suites = new ArrayList<>();
////      suites.add("C:\\AutomationTesting\\testng_project\\test-output\\testng-failed.xml");
//      suites.add("C:\\AutomationTesting\\testng_project\\testng.xml");
//      testNG.setTestSuites(suites);
//      testNG.run();
	  
	  BrowserUtils.openBrowser();
	  BrowserUtils.enterUrl();
	  Thread.sleep(3000);
	  TakeScreenshotUtils.getScreenShot("A.png");
	  By username_TextField = By.name("username");
	  driver.findElement(username_TextField).sendKeys("Admin");
	  TakeScreenshotUtils.getElementScreenShot(username_TextField, "B.png");
	  BrowserUtils.closeBrowser();
  }
}
