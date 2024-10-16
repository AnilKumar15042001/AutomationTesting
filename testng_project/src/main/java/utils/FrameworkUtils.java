package utils;

import static components.AppCommon.instanceMap;
import static components.AppCommon.list;
import static components.AppCommon.map;
import static components.AppCommon.object;
import static components.AppCommon.testName;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class FrameworkUtils{

	public static void loadTestData() throws Exception {
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
	
	public static void updateTestData(String cellHeader,String cellvalue) throws Exception {
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
	
	public static void getKeywords() throws Exception {
		String filePath=PropertiesUtils.getKeyValue("keywordDrivenPath");
		String sheet=PropertiesUtils.getKeyValue("sheetName");
		int rows=ExcelUtils.getRowCount(filePath, sheet);
		for(int row=1;row<=rows;row++)
		{
			list=new ArrayList<String>();
			object=new ArrayList<String>();
			int cells=ExcelUtils.getCellCount(filePath, sheet, row);
			for(int cell=1;cell<cells;cell++)
			{
				list.add(ExcelUtils.getCellData(filePath, sheet, row, cell));
				object.add(ExcelUtils.getCellData(filePath, sheet, 0, cell));
			}
			System.out.println(list);
			System.out.println(object);
		}
		instanceMap=new HashMap<String, Object>();
		for(int i=0;i<list.size();i++)
		{
			instanceMap.put(list.get(i), ObjectUtils.getClassObject(object.get(i)));
		}
	}
	
	public static void performMethod() throws Exception{
		getKeywords();
		for(String method:list)
		{
			if(!method.isEmpty())
			{
				Object instance=instanceMap.get(method);
				if(instance!=null)
				{
					Method[] classMethod=instance.getClass().getMethods();
					for(Method cMethod:classMethod)
					{
						if(method.equals(cMethod.getName()))
						{
							System.out.println(cMethod.getName());
							cMethod.invoke(instance);
							break;
						}
					}
				}
			}
		}
	}
}
