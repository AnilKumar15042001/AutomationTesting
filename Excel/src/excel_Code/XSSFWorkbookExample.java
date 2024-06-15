package excel_Code;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class XSSFWorkbookExample {
    public static void main(String[] args) {
        // Creating a new XSSFWorkbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Creating a new sheet
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        // Creating a new row
        XSSFRow row = sheet.createRow(10);

        // Creating a new cell and setting its value
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Hello, Apache POI!");
        System.out.println(row.getCell(0).toString());
        System.out.println(sheet.getLastRowNum());

        // Writing the workbook to a file
//        try {
//            workbook.write(new FileOutputStream("workbook.xlsx"));
//            workbook.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Retrieving a sheet by its index
//        XSSFSheet retrievedSheet = workbook.getSheetAt(0);
//
//        // Retrieving a sheet by its name
//        XSSFSheet retrievedSheetByName = workbook.getSheet("Sheet1");
//
//        // Getting the number of sheets in the workbook
//        int numberOfSheets = workbook.getNumberOfSheets();
//
//        // Removing a sheet by its index
//        workbook.removeSheetAt(0);
//
//        // Creating a new cell style
//        XSSFCellStyle cellStyle = workbook.createCellStyle();
//
//        // Creating a new font
//        XSSFFont font = workbook.createFont();
//
//        // Adding a picture to the workbook (this is a simplified example)
//        int pictureIndex = workbook.addPicture(new byte[]{/* picture data */}, XSSFWorkbook.PICTURE_TYPE_PNG);
//
//        // Cloning a sheet
//        XSSFSheet clonedSheet = workbook.cloneSheet(0);
//
//        // Setting the active sheet
//        workbook.setActiveSheet(0);
//
//        // Setting the order of sheets
//        workbook.setSheetOrder("Sheet2", 0);
//
//        // Setting the name of a sheet
//        workbook.setSheetName(0, "NewSheetName");
//
//        // Checking if a sheet is hidden
//        boolean isHidden = workbook.isSheetHidden(0);
//
//        // Checking if a sheet is very hidden
//        boolean isVeryHidden = workbook.isSheetVeryHidden(0);
//
//        // Checking if a sheet is hidden in the GUI
//        boolean isHiddenByGui = workbook.isSheetHidden(0);
//
//        // Getting the index of a sheet by name
//        int sheetIndex = workbook.getSheetIndex("NewSheetName");
//
//        // Getting the name of a sheet by index
//        String sheetName = workbook.getSheetName(0);
    }
}
