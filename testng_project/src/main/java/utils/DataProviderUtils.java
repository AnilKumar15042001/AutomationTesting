package utils;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static utils.ExcelUtils.*;

import java.io.FileInputStream;

public class DataProviderUtils {
  @DataProvider(name="excelData")
  public Object[][] excelDataProvider() throws Exception {
	  String filepath=PropertiesUtils.getPropertyValue().getProperty("excelFilePath");
	  String sheetName="sheet2";
	  return ExcelUtils.getExcelData(filepath, sheetName, 0);
  }
 
  @Test(dataProvider = "excelData")
  public void printData(String username,String password,String result)
  {
	  System.out.println(username+"-->"+password+"-->"+result);
  }
}
