package utils;

import static components.AppCommon.packageName;

import java.lang.reflect.Method;

public class ObjectUtils {

	public static Object getClassObject(String className) throws Exception {
		return Class.forName(className).getDeclaredConstructor().newInstance();
	}

	public Object getClassObject() throws Exception {
		return Class.forName(packageName).getDeclaredConstructor().newInstance();
	}
	
  public void testGetPackageName() throws Exception {
	  Class<?> clazz=BrowserUtils.class;
      String methodName = "openBrowser";
      Method method = clazz.getDeclaredMethod(methodName);
      String packageName = method.getDeclaringClass().getName();
      System.out.println("Package Name: " + packageName);
  }
}
