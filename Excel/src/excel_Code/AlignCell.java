package excel_Code;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder.BorderSide;

public class AlignCell {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub

		try(FileOutputStream file=new FileOutputStream("Test2.xlsx"))
		{	
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.createSheet("Sheet1");
		XSSFRow row=sh.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("Anil");
		XSSFCellStyle cellstyle=wb.createCellStyle();
		sh.setColumnWidth(0, 10000);
		row.setHeight((short) 5000);
		row.setRowStyle(cellstyle);
		cellstyle.setBorderTop(BorderStyle.DASH_DOT);
		cellstyle.setBorderRight(BorderStyle.THICK);
		cellstyle.setRightBorderColor( IndexedColors.BLUE.getIndex());
		cellstyle.getFillBackgroundXSSFColor();
		cellstyle.setVerticalAlignment(VerticalAlignment.CENTER);
		cellstyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		cellstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(cellstyle);
		wb.write(file);
		wb.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
