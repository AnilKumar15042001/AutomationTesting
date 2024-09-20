package utils;

import org.testng.ITestResult;

public class ITestResultUtils {
	public static ITestResult result;
	
	public static String getCurrentMethodName(ITestResult result) {
		return result.getMethod().getMethodName();
	}
	
	public static String getCurrentClassName(ITestResult result) {
		return result.getMethod().getTestClass().getRealClass().getSimpleName();
	}
}
