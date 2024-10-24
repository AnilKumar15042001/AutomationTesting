package testSuites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Locatable;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
		try {
			String pageNo = "";
			List<WebElement> pages = driver.findElements(By.xpath("//td[@class='NKTSme']/child::a"));
			for (WebElement page : pages) {
				Thread.sleep(2000);
				((Locatable) driver.findElement(By.xpath("//*[@id='pnnext']/child::span[.='Next']"))).getCoordinates().inViewPort();
				pageNo = page.getText();
				System.out.println(pageNo);
				if (page.getText().isEmpty()) {
					break;
				}
				driver.findElement(By.xpath("// td[@class='NKTSme']/child::a[.='"+pageNo+"']")).click();
			}
		} catch (Exception e) {
			Thread.sleep(1000);
			System.out.println(e.getMessage());
		}
	}
}