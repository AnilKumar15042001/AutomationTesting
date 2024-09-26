package testSuite;

import static components.AppCommon.className;
import static components.AppCommon.testName;

import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	@BeforeMethod
	public void getCurrentMethodAndClass(ITestResult result) {
		testName=result.getMethod().getMethodName();
		className=result.getMethod().getTestClass().getRealClass().getSimpleName();
	}
}
