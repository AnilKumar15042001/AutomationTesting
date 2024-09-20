package testSuites;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelUtils;
import utils.ITestResultUtils;

import static testSuites.Amazon.driver;

public class RetrieveData {
	String methodName;
	String className;
	Map<String, String> map;
	List<String> list;

	@Test
	public void testcase09() throws IOException {
		String method = methodName;
		String filePath = "C:\\AutomationTesting\\testng_project\\src\\test\\resources\\TestData\\Amazon.xlsx";
		map = new HashMap<String, String>();
		list = new ArrayList<String>();
		int rows = ExcelUtils.getRowCount(filePath, "sheet2");
		for (int r = 1; r <= rows; r++) {
			String celldata = ExcelUtils.getCellData(filePath, "sheet2", r, 0);
			int cols = ExcelUtils.getCellCount(filePath, "sheet2", r);
			if (methodName.equals(celldata)) {
				for (int c = 1; c < cols; c++) {
					String header = ExcelUtils.getCellData(filePath, "sheet2", 0, c);
					String oneRowData = ExcelUtils.getCellData(filePath, "sheet2", r, c);
					list.add(header);
					map.put(header, oneRowData);
				}
			}
		}
	}

	@BeforeMethod
	public void getCurrentMethodName(ITestResult result) {
		methodName = result.getMethod().getMethodName();
		className = result.getMethod().getTestClass().getRealClass().getSimpleName();
		ITestResultUtils.getCurrentClassName(result);
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
