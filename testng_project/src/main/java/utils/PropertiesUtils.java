package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtils {

	public static Properties properties;
	public static Properties getPropertyValue() throws Exception {
		properties=new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configuration\\global.properties"));
		return properties;
	}
}
