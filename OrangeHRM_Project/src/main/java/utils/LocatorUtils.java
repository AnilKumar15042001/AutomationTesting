package utils;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static components.AppCommon.*;

import java.util.HashMap;

public class LocatorUtils {

	
	public static By getLocator(String fileName,String locatorType,String locatorName) throws Exception {
		loadLocators(fileName,locatorName);
		switch (locatorType.toLowerCase()) {
		case "id":
			return By.id(locatorsMap.get(locatorType));
		case "name":
			return By.name(locatorsMap.get(locatorType));
		case "cssselector":
			return By.cssSelector(locatorsMap.get(locatorType));
		case "xpath":
			return By.xpath(locatorsMap.get(locatorType));
		case "classname":
			return By.className(locatorsMap.get(locatorType));
		case "tagname":
			return By.tagName(locatorsMap.get(locatorType));
		case "linktext":
			return By.linkText(locatorsMap.get(locatorType));
		case "partiallinktext":
			return By.partialLinkText(locatorsMap.get(locatorType));

		default:
			throw new IllegalArgumentException("Invalid locator type: " + locatorType);
		}
	}

	public static void loadLocators(String fileName,String locatorName) throws Exception {
		FrameworkUtils.getFiles(fileName);
		String filePath=filesMap.get("FilePath");
		String sheetName=filesMap.get("SheetName");
		int rowNum = FrameworkUtils.getRowNumber(filePath, sheetName, locatorName);
		locatorsMap = new HashMap<String, String>();
		int cells = ExcelUtils.getCellCount(filePath, sheetName, 0);
		for (int cell = 1; cell < cells; cell++) {
			String key = ExcelUtils.getCellData(filePath, sheetName, 0, cell);
			String value = ExcelUtils.getCellData(filePath, sheetName, rowNum, cell);
			locatorsMap.put(key, value);
		}
	}
}
