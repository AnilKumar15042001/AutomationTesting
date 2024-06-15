package excel_Code;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.*;

public class Create_WorkBook_Sheet {
    public static void main(String[] args) throws Exception {
    	FileOutputStream file=new FileOutputStream("Test3.xlsx");
       XSSFWorkbook wb=new XSSFWorkbook();
       XSSFSheet sh=wb.createSheet("Anil");
//      for(int i=0;i<10;i++)
//      {
//    	  XSSFRow row=sh.createRow(i);
//    	  for(int j=0;j<5;j++)
//    	  {
//    		  row.createCell(j).setCellValue("nareshit");
//    	  }
//      }
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Excel value:");
       for(int j=0;j<=2;j++)
       {
       XSSFRow row=sh.createRow(j);
       for(int i=0;i<2;i++)
       {
    	   row.createCell(i).setCellValue(s.nextInt());
       }
       }
      // System.out.println("Excel value is:"+row);
       wb.write(file);
       wb.close();
    }
}