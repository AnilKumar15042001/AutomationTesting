package excel_Code;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("Test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("Anil");
		int row=sh.getLastRowNum();
		for(int i=0;i<2;i++)
		{
			XSSFRow currentrow=sh.getRow(i);
			for(int j=0;j<2;j++)
			{
			String str=currentrow.getCell(j).getStringCellValue();
			System.out.println(str);
			if(str.equals("nareshit"))
			{
				driver=new FirefoxDriver();
				driver.navigate().to("http://183.82.103.245/nareshit/login.php");
				driver.findElement(By.name("txtUserName")).sendKeys(str);
				driver.findElement(By.name("txtPassword")).sendKeys(str);
				driver.findElement(By.name("Submit")).click();
				driver.findElement(By.linkText("Logout")).click();
				driver.close();
			}
			}
		} 
		wb.close();
	}

}
