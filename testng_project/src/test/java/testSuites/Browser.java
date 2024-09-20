package testSuites;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.BrowserUtils;
import utils.DataProviderUtils;
import utils.ElementUtils;
import utils.ExcelUtils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import static utils.BrowserUtils.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Browser {
	@Test(dataProvider = "excelData",dataProviderClass = DataProviderUtils.class)
	public void f(String username, String password) throws Exception {
		BrowserUtils.enterUrl();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']/following-sibling::i")).click();
			driver.findElement(By.linkText("Logout")).click();
			AssertJUnit.assertTrue(true);
		} else {
			AssertJUnit.fail();
		}
	}

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeClass(String br) {
		switch (br) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("invalid browser");
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		BrowserUtils.closeBrowser();
	}

}
