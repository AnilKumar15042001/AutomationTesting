package stepdefinitions;

import static components.AppCommon.driver;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.BrowserUtils;
import utils.ElementUtils;
import utils.JavaScriptExecutorUtils;
import utils.WindowsUtils;

public class Amazon {

	@Given("User launch the browser")
	public void user_launch_the_browser() throws Exception {
		BrowserUtils.openBrowser();
//		String url="http://192.168.29.39:4444";
//		DesiredCapabilities capabilities=new DesiredCapabilities();
//		capabilities.setPlatform(Platform.WINDOWS);
//		capabilities.setBrowserName("chrome");
//		driver=new RemoteWebDriver(new URL(url), capabilities);
//		driver.manage().window().maximize();
	}

	@Given("User enter url to the browser as {string}")
	public void user_enter_url_to_the_browser_as(String string) throws Exception {
		driver.navigate().to(string);
	}

	@When("User entered product name as {string} in search text field and click on search button")
	public void user_entered_product_name_as_in_search_text_field_and_click_on_search_button(String string)throws IOException {
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string, Keys.ENTER);
	}

	@Then("User should be displayed Resluts in {string} page")
	public void user_should_be_displayed_resluts_in_page(String string) {
		String results = driver.findElement(By.xpath("//*[text()='Results']")).getText();
		Assert.assertEquals(results, string, "Results page is not displayed!...");
	}

	@When("User click on first item of results page and select quantity as {string}")
	public void user_click_on_first_item_of_results_page_and_select_quantity_as(String string)throws InterruptedException {
		driver.findElement(By.xpath("(//*[@class='rush-component']/descendant::img)[position()=1]")).click();
		WindowsUtils.handleWindows(driver.getTitle());
		try {
			Thread.sleep(3000);
			WebElement quantityDropdown = driver.findElement(By.xpath("//select[@id='quantity']/following-sibling::span"));
			JavaScriptExecutorUtils.scrollToElement(quantityDropdown);
			quantityDropdown.click();
			Thread.sleep(3000);
			WebElement firstElement = null;
			if (quantityDropdown.isDisplayed()) {
				List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']/child::li[@role='option']/child::a"));
				for (WebElement element : elements) {
					firstElement=element;
					if (element.getText().equals(string)) {
						System.out.println(element.getText());
						element.click();
						break;
					}
				}
				if(!(firstElement==null))
				{
					firstElement.click();
				}
			}
		} catch (Exception e) {
			Thread.sleep(2000);
		}

	}

	@When("User click on AddToCart button")
	public void user_click_on_add_to_cart_button() throws InterruptedException {
		try {
			WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			JavaScriptExecutorUtils.scrollToElement(addToCart);
			addToCart.click();
			Thread.sleep(1000);
			if (ElementUtils.locateElement(By.xpath("//span[@id='attachSiNoCoverage']")).isDisplayed()) {
				ElementUtils.locateElement(By.xpath("//span[@id='attachSiNoCoverage']")).click();
			}
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (Exception e) {
			Thread.sleep(1000);
			try {
				WebElement addToCart = driver.findElement(By.xpath("//div[@id='a-accordion-auto-9']/descendant::input[@id='add-to-cart-button']"));
				JavaScriptExecutorUtils.scrollToElement(addToCart);
				addToCart.click();
			} catch (Exception e2) {
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
			driver.navigate().refresh();
		}
	}

	@When("User click on cart button")
	public void user_click_on_cart_button() {
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();

	}

	@Then("User should be displayed page heading as {string}")
	public void user_should_be_displayed_page_heading_as(String string) throws InterruptedException {
		try {
			String shopping_cart = driver.findElement(By.xpath("//*[@class='a-row']/h2[contains(.,'Shopping Cart')]")).getText();
			Assert.assertEquals(shopping_cart, string, "Shopping cart page is not displayed!...");
		} catch (Exception e) {
			Thread.sleep(1000);
		}

	}

	@Then("User validate item price and quantity")
	public void user_validate_item_price_and_quantity() throws InterruptedException {
		try {
			WebElement priceAndItems = driver.findElement(By.xpath("//div[contains(@class,'a-row a-spacing-mini sc-subtotal sc-subtotal-activecart sc-java-remote-feature')]"));
			Assert.assertTrue(priceAndItems.isDisplayed(), "Not displayed!...");
			System.out.println(priceAndItems.getText());
		} catch (Exception e) {
			Thread.sleep(1000);
		}
	}

	@Then("User close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}
}
