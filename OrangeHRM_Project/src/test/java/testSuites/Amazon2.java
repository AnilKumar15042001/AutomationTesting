package testSuites;

import static testSuites.Amazon.driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon2 {
	public static WebDriver driver;

	@Test
	@Parameters({"cellValue"})
	public void main(String cellValue) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\TestData\\Amazon.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheet("sheet3");
		int rows = sheet.getLastRowNum();
		for (int r = 1; r <= rows; r++) {
			int cols = sheet.getRow(r).getLastCellNum();
			String searchvalue = "";
			String dropdown = "";
			String result = "";
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = sheet.getRow(r).getCell(c);
				searchvalue = sheet.getRow(r).getCell(1).toString();
				dropdown = sheet.getRow(r).getCell(2).toString();
				dropdown = dropdown.replace(dropdown.substring(dropdown.indexOf('.')), "");
				result = sheet.getRow(r).getCell(3).toString();
				if (result.equals(cellValue)) {
					try {
						driver.findElement(By.id("twotabsearchtextbox")).clear();
						driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchvalue, Keys.ENTER);
						driver.findElement(By.xpath("(//*[@class='rush-component']/descendant::img)[position()=1]")).click();
						windowClose(driver.getTitle());
						Thread.sleep(2000);
						WebElement quantityDropdown = driver.findElement(By.xpath("//*[@id='quantity']"));
						js.executeScript("arguments[0].scrollIntoView(true);", quantityDropdown);
						Thread.sleep(2000);
						if (quantityDropdown.isDisplayed()) {
							Select select = new Select(quantityDropdown);
							select.selectByVisibleText(dropdown);
							driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
							driver.navigate().refresh();
						} else {
							driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
							driver.navigate().refresh();
						}
					} catch (Exception e) {
						Thread.sleep(4000);
						WebElement addToCart = driver.findElement(By.xpath("//div[@id='a-accordion-auto-9']/descendant::input[@id='add-to-cart-button']"));
						js.executeScript("arguments[0].scrollIntoView(true);", addToCart);
						addToCart.click();
						driver.navigate().refresh();
					}
					break;
				}
			}
		}
		System.out.println();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature')]")).getText();
		System.out.println(text);
		workbook.close();
		stream.close();
	}

	public static void windowClose(String title) {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			String data = driver.switchTo().window(window).getTitle();
			System.out.println(data);
			if (data.equals(title)) {
				driver.close();
			}
		}
	}

	@AfterClass
	public void name() {
		driver.quit();
	}
}
