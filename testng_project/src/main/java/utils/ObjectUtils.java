package utils;

public class ObjectUtils {

	public static Object getClassObject(String className) throws Exception {
		return Class.forName(className).getDeclaredConstructor().newInstance();
	}
}
