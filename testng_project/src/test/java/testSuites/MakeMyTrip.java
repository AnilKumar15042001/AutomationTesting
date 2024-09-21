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

public class MakeMyTrip {
	
	static WebDriver driver;
	static WebDriverWait wait;

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.makemytrip.com/");
		WebElement closePopup=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(closePopup));
		closePopup.click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		Thread.sleep(2000);
		//ul[@role='listbox']/child::li[@role='option']/descendant::div[contains(@class,'makeFlex column flexOne')]
		By xpath=By.xpath("//div[@id='react-autowhatever-1']/descendant::ul[@role='listbox']/child::li");
		ClearTrip.dropdown(driver,xpath,"ISK");
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("hyde");
		Thread.sleep(2000);
		ClearTrip.dropdown(driver,xpath,"Bidar");
		By currentDateXpath=By.xpath("(//div[@role='heading'])[1]");
		By rightArrowButton=By.xpath("//span[contains(@aria-label,'Next Month')]");
		String listXpath="//div[contains(text(),'%s')]/ancestor::div[@role='grid']/descendant::div[@class='dateInnerCell']/p[1]";
		ClearTrip.datePickers(driver,currentDateXpath,rightArrowButton,listXpath,"2024","September","1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		ClearTrip.datePickers(driver,currentDateXpath,rightArrowButton,listXpath,"2024","September","2");
		driver.findElement(By.xpath("//span[contains(.,'Travellers & Class')]")).click();
		By adults=By.xpath("//p[contains(.,'ADULTS')]/following-sibling::ul[contains(@class,'guestCounter font12 darkText gbCounter')]/li");
		ClearTrip.dropdown(driver,adults,"1");
		By children=By.xpath("//p[contains(.,'CHILDREN')]/following-sibling::ul[contains(@class,'guestCounter font12 darkText gbCounter')]/li");
		ClearTrip.dropdown(driver,children,"3");
		By infants=By.xpath("//p[contains(.,'INFANTS')]/following-sibling::ul[contains(@class,'guestCounter font12 darkText gbCounter')]/li");
		ClearTrip.dropdown(driver,infants,"0");
		By chooseTravelClass=By.xpath("//p[contains(.,'CHOOSE TRAVEL CLASS')]/following-sibling::ul/li");
		ClearTrip.dropdown(driver,chooseTravelClass,"Business");
		driver.findElement(By.xpath("//button[contains(.,'APPLY')]")).click();
		driver.quit();
	}

}
