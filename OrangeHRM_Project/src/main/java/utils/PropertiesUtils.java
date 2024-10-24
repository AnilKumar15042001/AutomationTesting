package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.testng.annotations.Test;

import static components.AppCommon.filesMap;
import static components.AppCommon.properties;
public class PropertiesUtils {
	
	public static Properties getPropertyValue() throws Exception {
		try
		{
			properties=new Properties();
			properties.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\configuration\\global.properties"));
			properties.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\configuration\\config.properties"));
			return properties;
		}
		catch (Exception e) {
			e.printStackTrace();
			return properties;
		}
	}
	
	public static String getKeyValue(String key) throws Exception {
		return getPropertyValue().getProperty(key);
	}
	
	public static Set<Object> getKeys() throws Exception {
		return getPropertyValue().keySet();
	}
	
	@Test
	public static void setKeyAndValue() throws Exception
	{
		Set<Object> setFile=getKeys();
		filesMap=new HashMap<String, String>();
		for(Object obj:setFile)
		{
			filesMap.put(obj.toString(), getKeyValue(obj.toString()));
		}
	}
}
