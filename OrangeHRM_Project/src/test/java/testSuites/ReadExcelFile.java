package testSuites;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.PropertiesUtils;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream(PropertiesUtils.getKeyValue("filePath"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		int cells=sheet.getRow(0).getLastCellNum();
		System.out.println(cells);
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell cell=row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
