package utils;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static utils.ExcelUtils.*;

import java.io.FileInputStream;

public class DataProviderUtils {

	public static Object[][] excelDataProvider() throws Exception {
		String filepath = PropertiesUtils.getKeyValue("excelFilePath");
		String sheetName = PropertiesUtils.getKeyValue("sheet");
		return ExcelUtils.getExcelData(filepath, sheetName, 0);
	}

	public static void printData(String username, String password, String result) throws Exception {
		System.out.println(excelData());
	}

	public static String excelData() throws Exception {
		return excelDataProvider().toString();
	}
}
