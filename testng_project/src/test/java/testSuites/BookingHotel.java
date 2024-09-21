package testSuites;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingHotel {

	static WebDriver driver;

	@Test
	public void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.booking.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement clickDropdown = driver.findElement(By.xpath("//input[@id=':rh:']"));
		clickDropdown.click();
		clickDropdown.sendKeys("hyde");
		Thread.sleep(2000);
		By dropdownXpath = By.xpath("//div[@role='listbox']/descendant::li[@role='option']//div/div[contains(@class,'ad3c4dc079 e2f45f66c9')]");
		ClearTrip.dropdown(driver, dropdownXpath, "Gandhi");
		try {
			By currentMonthYear = By.xpath("//*[@id='calendar-searchboxdatepicker']/descendant::h3[1]");
			By rightArrowButton = By.xpath("//button[@aria-label='Next month']//span[@class='dbf48415a7 ae5bff9e1e']//*[name()='svg']");
			String listXpath = "//h3[contains(.,'%s')]/ancestor::div[@class='d1ef310813']/descendant::td[@role='gridcell']/child::span";
			ClearTrip.datePickers(driver, currentMonthYear, rightArrowButton, listXpath, "2024", "December", "31");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement day = driver.findElement(By.xpath("//span[contains(text(),'1 day')]"));
		wait.until(ExpectedConditions.visibilityOf(day));
		day.click();
		Thread.sleep(3000);
		WebElement clickAdultsdd = driver.findElement(By.xpath("//span[contains(.,'2 adults · 0 children · 1 room')]"));
		clickAdultsdd.click();
		String xpath = "//label[contains(.,'%s')]/ancestor::div[contains(@class,'f340be2edd')]/descendant::button[1]/following-sibling::span";
		String plusButton = "//label[contains(.,'%s')]/ancestor::div[contains(@class,'f340be2edd')]/descendant::button[2]/span";
		adultsChildrenRooms(driver, xpath, plusButton, "Adults", "10");
		adultsChildrenRooms(driver, xpath, plusButton, "Rooms", "10");
		driver.findElement(By.xpath("//button[@type='submit']/child::span[contains(.,'Search')]")).click();
		driver.quit();
	}

	public static void adultsChildrenRooms(WebDriver driver, String xpath, String plusButton, String... value) {
		while (true) {
			String count = driver.findElement(By.xpath(String.format(xpath, value[0]))).getText();
			if (count.equals(value[value.length - 1])) {
				break;
			}
			driver.findElement(By.xpath(String.format(plusButton, value[0]))).click();
		}
	}
}
