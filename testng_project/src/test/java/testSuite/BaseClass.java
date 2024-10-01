package testSuite;

import static components.AppCommon.className;
import static components.AppCommon.testName;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import utils.FrameworkUtils;

public class BaseClass {

	@BeforeMethod
	public void getCurrentMethodAndClass(ITestResult result) throws Exception {
		testName=result.getMethod().getMethodName();
		className=result.getMethod().getTestClass().getRealClass().getSimpleName();
	}
	
	@BeforeMethod
	public void getExcelData() throws Exception {
		FrameworkUtils.excelToMap();
	}
}
