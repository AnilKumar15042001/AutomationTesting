package testSuites;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTrip {

	static WebDriver driver;
	static WebDriverWait wait;
	
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='p-relative']//div[@class='flex flex-middle']")).click();
//		By way=By.xpath("//div[contains(@class,'bg-white br-4 elevation-5 p-1 p-absolute mt-2 z-50 l-0')]/child::ul/li//span");
//		dropdown(driver,way,"Round");
		By fare=By.xpath("//div[@class='flex flex-row flex-middle mt-8']//div");
		dropdown(driver,fare,"Student fare");
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		from.click();
		from.sendKeys("hyde");
		Thread.sleep(2000);
		By xpath=By.xpath("//div[contains(@class,'dropdown p-absolute t-13 ln-1 w-100p')]/child::ul/li//p");
		dropdown(driver,xpath,"HYD");
		WebElement to=driver.findElement(By.xpath("//input[contains(@placeholder,'Where to?')]"));
		to.click();
		to.sendKeys("bang");
		Thread.sleep(2000);
		dropdown(driver,xpath,"BLR");
		Thread.sleep(3000);
		By currentDateXpath=By.xpath("(//div[@role='heading'])[1]");
		By rightArrowButton=By.xpath("//div[contains(@class,'flex-1 ta-right')]//*[@data-testid='rightArrow']");
		String listXpath="//div[contains(text(),'%s')]/ancestor::div[@role='grid']/descendant::div[@role='gridcell']/div/div";
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
		datePickers(driver,currentDateXpath,rightArrowButton,listXpath,"2024","September","20");
		driver.findElement(By.xpath("//button[contains(@style,'min-width: 185px; height: 52px;')]")).click();
		datePickers(driver,currentDateXpath,rightArrowButton,listXpath,"2024","September","22");
		driver.findElement(By.xpath("//span[contains(.,'Search flights')]")).click();
		driver.close();
	}
	@Test
	public static void dropdown(WebDriver driver,By xpath,String value) {
		List<WebElement> elements=driver.findElements(xpath);
		for(WebElement element:elements)
		{
			System.out.println(element.getText());
			if (element.getText().contains(value))
			{
				element.click();
				break;
			}
		}
	}
	@Test
	public static void datePickers(WebDriver driver,By currentDateXpath,By rightArrowButton,String listXpath,String... futureDate) throws InterruptedException {
		wait=new WebDriverWait(driver,10);
		while(true)
		{
			String currentDate=driver.findElement(currentDateXpath).getText();
			if (currentDate.trim().contains(futureDate[0]))
			{
				if (currentDate.trim().contains(futureDate[1]))
				{
					System.out.println(futureDate[1]);
					break;
				}
			}
			try {
				WebElement rightArrow = driver.findElement(rightArrowButton);
				((Locatable) rightArrow).getCoordinates().inViewPort();
				wait.until(ExpectedConditions.visibilityOf(rightArrow)).click();
			}catch (StaleElementReferenceException e)
			{
			}
		}
		List<WebElement> dates=driver.findElements(By.xpath(String.format(listXpath,futureDate[1])));
		for (WebElement date:dates)
		{
			if (date.getText().contains(futureDate[2]))
			{
				System.out.println(date.getText());
				((Locatable)date).getCoordinates().inViewPort();
				date.click();
				break;
			}
		}
	}

}
