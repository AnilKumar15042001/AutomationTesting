package testSuite;

import static components.AppCommon.testName;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.FrameworkUtils;
public class LoginPageTests extends BaseClass {

	@BeforeMethod
	public void loadData() throws Exception {
		FrameworkUtils.loadTestData("LoginPageTestData", testName);
		FrameworkUtils.getKeywords("LoginPageKeywords", testName);
	}
	
	@Test
	public void testCase01() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase02() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase03() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase04() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase05() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase06() throws Exception {
		FrameworkUtils.performMethod();
	}
	
	@Test
	public void testCase07() throws Exception {
		FrameworkUtils.performMethod();
	}
	
}
