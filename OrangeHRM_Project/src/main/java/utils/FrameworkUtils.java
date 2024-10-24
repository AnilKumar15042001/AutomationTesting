package utils;

import static components.AppCommon.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FrameworkUtils {
	
	public static void loadFile() throws Exception {
		filePath=PropertiesUtils.getKeyValue("filePath");
		sheetName=PropertiesUtils.getKeyValue("sheetName");
	}

	public static int getRowNumber(String filePath,String sheetName,String methodName) throws Exception {
		int rowNum = 0;
		int rows = ExcelUtils.getRowCount(filePath, sheetName);
		for (int row = 0; row <= rows; row++) {
			if (methodName.equals(ExcelUtils.getCellData(filePath, sheetName, row, 0))) {
				rowNum = row;
				break;
			}
		}
		return rowNum;
	}

	public static void loadTestData() throws Exception {
		String filePath=filesMap.get("testDataFile");
		String sheetName=filesMap.get("testData");
		int rowNum = getRowNumber(filePath, sheetName, testName);
		dataDrivenMap = new HashMap<String, String>();
		int cells = ExcelUtils.getCellCount(filePath, sheetName, 0);
		for (int cell = 0; cell < cells; cell++) {
			String key = ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value = ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			dataDrivenMap.put(key, value);
		}
//		System.out.println(dataDrivenMap);
	}

	public static void updateTestData(String cellHeader, String cellvalue) throws Exception {
		String filePath=filesMap.get("testDataFile");
		String sheetName=filesMap.get("testData");
		int rowNum = getRowNumber(filePath, sheetName, testName);
		int cellNum = 0;
		dataDrivenMap = new HashMap<String, String>();
		int cells = ExcelUtils.getCellCount(filePath, sheetName, 0);
		for (int cell = 0; cell < cells; cell++) {
			String key = ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value = ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			dataDrivenMap.put(key, value);

			if (key.equals(cellHeader)) {
				cellNum = cell;
			}
		}
		for (int cell = 0; cell < cells; cell++) {
			if (cell == cellNum) {
				ExcelUtils.setCellData(filePath, sheetName, rowNum, cellNum, cellvalue);
				dataDrivenMap.put(cellHeader, cellvalue);
				break;
			}
		}
//		System.out.println(dataDrivenMap);
	}

	public static Set<String> getKeys() {
		return dataDrivenMap.keySet();
	}

	public static void getKeywords() throws Exception {
		String filePath=filesMap.get("keywordsFile");
		String sheetName=filesMap.get("keywords");
		int rowNum = getRowNumber(filePath, sheetName, testName);
		list = new ArrayList<String>();
		object = new ArrayList<String>();
		int cells = ExcelUtils.getCellCount(filePath, sheetName, 0);
		for (int cell = 1; cell < cells; cell++) {
			list.add(ExcelUtils.getCellData(filePath, sheetName, rowNum, cell));
			object.add(ExcelUtils.getCellData(filePath, sheetName, 0, cell));
		}
//		System.out.println(list);
//		System.out.println(object);
		instanceMap = new HashMap<String, Object>();
		for (int i = 0; i < list.size(); i++) {
			instanceMap.put(list.get(i), ObjectUtils.getClassObject(object.get(i)));
		}
	}

	public static void performMethod() throws Exception {
		getKeywords();
		for (String method : list) {
			if (!method.isEmpty()) {
				Object instance = instanceMap.get(method);
				if (instance != null) {
					Method[] classMethod = instance.getClass().getMethods();
					for (Method cMethod : classMethod) {
						if (method.equals(cMethod.getName())) {
							System.out.println(cMethod.getDeclaringClass().getName());
							System.out.println("Method name is:"+cMethod.getName()+" ==> "+"Object name is:"+instanceMap.get(method));
							cMethod.invoke(instance);
							break;
						}
					}
				}
			}
		}
	}

	public static void getFiles(String fileName) throws Exception {
		String filePath=filesMap.get("filePath");
		String sheetName=filesMap.get("sheetName");
		int rowNum = getRowNumber(filePath, sheetName, testName);
		filesMap=new HashMap<String, String>();
		int cells=ExcelUtils.getCellCount(filePath, sheetName, 0);
		for(int cell=0;cell<cells;cell++)
		{
			String key=ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value=ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			filesMap.put(key, value);
		}
		System.out.println(filesMap);
	}

}
