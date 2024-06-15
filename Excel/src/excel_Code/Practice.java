package excel_Code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.xssf.usermodel.*;

public class Practice {

	public static void main(String[] args) throws Exception {
		
		FileInputStream filepath=new FileInputStream("test4.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(filepath);
		XSSFSheet sh=wb.getSheet("sheet1");
		
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		for(int i=0;i<=rows;i++)
		{
			XSSFRow row=sh.getRow(i);
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell=row.getCell(j);
				switch(cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
//		XSSFSheet sh=wb.createSheet("sheet1");
//		
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter number of rows:");
//		int rows=s.nextInt();
//		System.out.println("Enter number of cols:");
//		int cols=s.nextInt();
//		
//		for(int i=0;i<rows;i++)
//		{
//			XSSFRow row=sh.createRow(i);
//			for(int j=0;j<cols;j++)
//			{
//				XSSFCell cell=row.createCell(j);
//				cell.setCellValue(s.nextLine());
//			}
//		}
//		wb.write(filepath);
//		wb.close();
	}
}
