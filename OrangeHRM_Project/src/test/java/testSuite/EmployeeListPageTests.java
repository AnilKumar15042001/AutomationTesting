package testSuite;

import static components.AppCommon.testName;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.FrameworkUtils;

public class EmployeeListPageTests extends BaseClass{

	@BeforeMethod
	public void loadData() throws Exception {
		FrameworkUtils.loadTestData("LoginPageTestData", "testCase01");
		FrameworkUtils.loadTestData("EmployeeListPageTestData", testName);
		FrameworkUtils.getKeywords("EmployeeListPageKeywords", testName);
	}
	
	@Test
	public void testCase01() throws Exception {
		FrameworkUtils.performMethod();
	}
}
