package testSuite;

import static components.AppCommon.testName;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.FrameworkUtils;

public class AddEmployeePageTests extends BaseClass{
	
	@BeforeMethod
	public void loadData() throws Exception {
		FrameworkUtils.loadTestData("LoginPageTestData", "testCase01");
		FrameworkUtils.loadTestData("AddEmployeePageTestData", testName);
		FrameworkUtils.getKeywords("AddEmployeePageKeywords", testName);
	}

	@Test
	public void testCase01() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase02() throws Exception {
		FrameworkUtils.performMethod();
	}
}
