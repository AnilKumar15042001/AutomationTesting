package utils;

import org.testng.asserts.SoftAssert;
import static components.AppCommon.softAssert;
public class AssertUtils {
	
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
	public static void softAssertFail() {
		getSoftAssertObject().fail();
	}
	
	public static void softAssertAll(String msg) {
		getSoftAssertObject().assertAll(msg);
	}
	public static void softAssertAll() {
		getSoftAssertObject().assertAll();
	}
	
}
