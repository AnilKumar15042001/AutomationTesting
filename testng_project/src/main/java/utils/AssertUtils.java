package utils;

import org.testng.asserts.SoftAssert;

public class AssertUtils {
	public static SoftAssert softAssert;
	
	public static SoftAssert getSoftAssertObject() {
		if(softAssert==null)
		{
			softAssert=new SoftAssert();
		}
		return softAssert;
	}
	public static void softAssertFail(String msg) {
		getSoftAssertObject().fail(msg);
	}
	
	public static void softAssertAll(String msg) {
		getSoftAssertObject().assertAll(msg);
	}
	
}
