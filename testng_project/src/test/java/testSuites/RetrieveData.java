package testSuites;

import static testSuites.Amazon.driver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import testSuite.BaseClass;
import utils.ExcelUtils;
import static components.AppCommon.testName;

public class RetrieveData extends BaseClass {
	Map<String, String> map;

	@Test
	public void testcase09() throws IOException {
		String method = testName;
		String filePath = "C:\\AutomationTesting\\testng_project\\src\\test\\resources\\TestData\\Amazon.xlsx";
		map = new HashMap<String, String>();
		int rows = ExcelUtils.getRowCount(filePath, "sheet2");
		for (int r = 1; r <= rows; r++) {
			String celldata = ExcelUtils.getCellData(filePath, "sheet2", r, 0);
			int cols = ExcelUtils.getCellCount(filePath, "sheet2", r);
			if (testName.equals(celldata)) {
				for (int c = 1; c < cols; c++) {
					String key = ExcelUtils.getCellData(filePath, "sheet2", 0, c);
					String value = ExcelUtils.getCellData(filePath, "sheet2", r, c);
					map.put(key, value);
				}
			}
		}
		System.out.println(map);
	}

	@AfterMethod
	public void name() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(map.get("searchtext"), Keys.ENTER);
		driver.findElement(By.xpath("(//*[@class='rush-component']/descendant::img)[position()=1]")).click();
		Amazon.windowClose(driver.getTitle());
		try {
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='quantity']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",dropdown);
			Thread.sleep(3000);
			if (dropdown.isDisplayed()) {
				Select select = new Select(dropdown);
				select.selectByVisibleText(map.get("count"));
				driver.findElement(By.id("add-to-cart-button")).click();
				driver.navigate().refresh();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
				try {
					String text = driver.findElement(By.xpath("//div[contains(@class,'a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature')]")).getText();
					System.out.println(text);
				} catch (NoSuchElementException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {
			try {
				WebElement addTocart=driver.findElement(By.xpath("//div[@id='a-accordion-auto-9']/descendant::input[@id='add-to-cart-button']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",addTocart);
				addTocart.click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
				String text = driver.findElement(By.xpath("//div[contains(@class,'a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature')]")).getText();
				System.out.println(text);
			} catch (NoSuchElementException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
