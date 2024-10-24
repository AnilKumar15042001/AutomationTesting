package testSuites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetIDValue {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		List<WebElement> elements=driver.findElements(By.cssSelector("div,span,a,button,input,label"));
		System.out.println(elements.size());
		int c=0;
		for(WebElement element:elements)
		{
			Thread.sleep(1000);
			switch (element.getTagName()) {
			case "div":System.out.println(element.getTagName()+"-->"+element.getAttribute("class"));
				break;
			case "span":System.out.println(element.getTagName()+"-->"+element.getAttribute("id"));
				break;
			case "a":System.out.println(element.getTagName()+"-->"+element.getAttribute("id"));
				break;
			case "button":System.out.println(element.getTagName()+"-->"+element.getAttribute("id"));
				break;
			case "input":System.out.println(element.getTagName()+"-->"+element.getAttribute("id"));
				break;
			case "label":System.out.println(element.getTagName()+"-->"+element.getAttribute("id"));
				break;
			default:System.out.println("invalid tagname!...");
				break;
			}
			c++;
			System.out.println(element.getTagName()+"->"+c);
		}
	}
}
