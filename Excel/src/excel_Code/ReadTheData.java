package excel_Code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("C:\\Users\\ASUS\\Downloads\\selenium_excel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount+" "+colcount);
		for(int i=0;i<=rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String cellvalue=currentrow.getCell(j).toString();
				System.out.print("   "+cellvalue);
			}
			System.out.println();
		}
	}

}
