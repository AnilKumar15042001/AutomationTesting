package testSuites;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\OrangeHRM.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		for(int r=0;r<=sheet.getLastRowNum();r++)
		{
			sheet.getRow(r).createCell(sheet.getRow(r).getLastCellNum()).setCellValue(new Scanner(System.in).nextLine());
		}
		FileOutputStream outputStream=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\OrangeHRM.xlsx");
		workbook.write(outputStream);
		workbook.close();
		file.close();
		System.out.println("file is created...");
	}
}
