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
import utils.ElementUtils;

public class Practice {
  @Test
  public void f() throws Exception {
	  TestNG testNG=new TestNG();
	  List<String> suites = new ArrayList<>();
//      suites.add("C:\\AutomationTesting\\testng_project\\test-output\\testng-failed.xml");
      suites.add("C:\\AutomationTesting\\testng_project\\testng.xml");
      testNG.setTestSuites(suites);
      testNG.run();
  }
}
