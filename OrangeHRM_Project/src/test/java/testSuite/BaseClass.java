package testSuite;

import static components.AppCommon.*;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;
import utils.AssertUtils;
import utils.ExcelUtils;
import utils.FrameworkUtils;
import utils.PropertiesUtils;

public class BaseClass {

//	LoginPage loginPage;
	@BeforeMethod
	public void getCurrentMethodAndClass(ITestResult result) throws Exception {
		testName=result.getMethod().getMethodName();
		System.out.println(testName);
		className=result.getMethod().getTestClass().getRealClass().getSimpleName();
//		System.out.println(className);
		packageName=result.getTestClass().getName();
//		System.out.println(packageName);
	}
	
	@BeforeMethod
	public void getTestData() throws Exception {
//		PropertiesUtils.setKeyAndValue();
	}
	
}
