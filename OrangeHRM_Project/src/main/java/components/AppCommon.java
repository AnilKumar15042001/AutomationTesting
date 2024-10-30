package components;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AppCommon {

	public static SoftAssert softAssert;
	public static WebDriver driver;
	public static DesiredCapabilities desiredCapabilities;
	public static WebElement element;
	public static Select select;
	public static Actions actions;
	
	//Excel 
	public static FileInputStream fileInputStream;
	public static FileOutputStream fileOutputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	//JavascriptExecutor
	public static JavascriptExecutor executor;
	
	//PropertiesFile
	public static Properties properties;
	
	//WebDriverWait
	public static WebDriverWait wait;
	
	//Current class testName, className and packageName 
	public static String testName;
	public static String className;
	public static String packageName;
	
	//Map
	public static HashMap<String, String> dataDrivenMap = new HashMap<String, String>();
	public static HashMap<String, String> keywordDrivenMap;
	public static HashMap<String, String> locatorsMap;
	public static HashMap<String, String> filesMap;
	public static HashMap<String,Object> instanceMap;
	
	//List
	public static List<String> list;
	public static List<String> object;
	
	//FilePath
	public static String filePath;
	public static String sheetName;
}
