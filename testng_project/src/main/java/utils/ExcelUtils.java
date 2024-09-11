package utils;

import static utils.ExcelUtils.fileInputStream;
import static utils.ExcelUtils.sheet;
import static utils.ExcelUtils.workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fileInputStream;
	public static FileOutputStream fileOutputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String xlsxFile,String xlsxSheet) throws IOException {
		fileInputStream=new FileInputStream(xlsxFile);
		workbook=new XSSFWorkbook(fileInputStream);
		sheet=workbook.getSheet(xlsxSheet);
		int rowCount=sheet.getLastRowNum();
		workbook.close();
		fileInputStream.close();
		return rowCount;
	}
	
	public static int getCellCount(String xlsxFile,String xlsxSheet,int rowNumber) throws IOException {
		fileInputStream=new FileInputStream(xlsxFile);
		workbook=new XSSFWorkbook(fileInputStream);
		sheet=workbook.getSheet(xlsxSheet);
		int cellCount=sheet.getRow(rowNumber).getLastCellNum();
		workbook.close();
		fileInputStream.close();
		return cellCount;
	}
	
	public static String getCellData(String xlsxFile,String xlsxSheet,int rowNumber,int colNumber) throws IOException {
		fileInputStream=new FileInputStream(xlsxFile);
		workbook=new XSSFWorkbook(fileInputStream);
		sheet=workbook.getSheet(xlsxSheet);
		row=sheet.getRow(rowNumber);
		cell=row.getCell(colNumber);
		String data;
		try
		{
//			data=cell.toString();
			DataFormatter formatter=new DataFormatter();
			data=formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fileInputStream.close();
		return data;
	}
	public static void setCellData(String xlsxFile,String xlsxSheet,int rowNumber,int colNumber,String cellData) throws IOException {
		fileInputStream=new FileInputStream(xlsxFile);
		workbook=new XSSFWorkbook(fileInputStream);
		sheet=workbook.getSheet(xlsxSheet);
		row=sheet.getRow(rowNumber);
		cell=row.createCell(colNumber);
		cell.setCellValue(cellData);
		fileOutputStream=new FileOutputStream(xlsxFile);
		workbook.write(fileOutputStream);
		workbook.close();
		fileInputStream.close();
		fileOutputStream.close();
	}
	
	public static Object[][] getExcelData(String filePath,String sheetName,int rowNumber) throws IOException {
		  fileInputStream=new FileInputStream(filePath);
		  workbook=new XSSFWorkbook(fileInputStream);
		  sheet=workbook.getSheet(sheetName);
		  int rowCount=getRowCount(filePath, sheetName);
		  int colCount=getCellCount(filePath, sheetName, rowNumber);
		  Object[][] data=new Object[rowCount][colCount];
		  Iterator<Row> rowIterator=sheet.iterator();
		  rowIterator.next();
		  int i=0;
		  while(rowIterator.hasNext())
		  {
			 Row row=rowIterator.next();
			  for(int j=0;j<colCount;j++)
			  {
				  data[i][j]=getExcelCellType(row.getCell(j));
			  }
			  i++;
		  }
		  workbook.close();
		  fileInputStream.close();
		  return data;
	  }
	
		public static Object getExcelCellType(Cell cell) {

			switch (cell.getCellType()) {
			case STRING:
				return cell.getStringCellValue();
			case NUMERIC:
				return cell.getNumericCellValue();
			case BOOLEAN:
				return cell.getBooleanCellValue();

			default:
				return null;
			}
		}
}
