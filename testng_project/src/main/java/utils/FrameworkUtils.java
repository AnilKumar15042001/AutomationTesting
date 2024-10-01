package utils;

import static components.AppCommon.map;
import static components.AppCommon.testName;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class FrameworkUtils{

	public static void excelToMap() throws Exception {
		String filePath=PropertiesUtils.getKeyValue("excelFilePath");
		String sheetName=PropertiesUtils.getKeyValue("sheet");
		int rowNum = 0;
		int rows=ExcelUtils.getRowCount(filePath, sheetName);
		for(int row=0;row<=rows;row++)
		{
			if(testName.equals(ExcelUtils.getCellData(filePath, sheetName, row, 0)))
			{
				rowNum = row;
				break;
			}
		}
		map=new HashMap<String, String>();
		int cells=ExcelUtils.getCellCount(filePath, sheetName, 0);
		for(int cell=0;cell<cells;cell++)
		{
			String key=ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value=ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			map.put(key, value);
		}
		System.out.println(map);
	}
	
	public static void setDataToExcel(String cellHeader,String cellvalue) throws Exception {
		String filePath=PropertiesUtils.getKeyValue("excelFilePath");
		String sheetName=PropertiesUtils.getKeyValue("sheet");
		int rowNum = 0;
		int cellNum = 0;
		int rows=ExcelUtils.getRowCount(filePath, sheetName);
		for(int row=0;row<=rows;row++)
		{
			if(testName.equals(ExcelUtils.getCellData(filePath, sheetName, row, 0)))
			{
				rowNum = row;
				break;
			}
		}
		map=new HashMap<String, String>();
		int cells=ExcelUtils.getCellCount(filePath, sheetName, 0);
		for(int cell=0;cell<cells;cell++)
		{
			String key=ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value=ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			map.put(key, value);
			
			if(key.equals(cellHeader))
			{
				cellNum=cell;
			}
		}
		for(int cell=0;cell<cells;cell++)
		{
			if(cell==cellNum)
			{
				ExcelUtils.setCellData(filePath, sheetName, rowNum, cellNum, cellvalue);
				map.put(cellHeader, cellvalue);
				break;
			}
		}
		System.out.println(map);
	}
	
	public static Set<String> getKeys() {
		return map.keySet();
	}
	
	
}
