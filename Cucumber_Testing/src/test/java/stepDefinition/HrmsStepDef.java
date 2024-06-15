package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class HrmsStepDef extends Base{

	public WebDriver driver;
	@Before
	@Given("^launch browser$")
	public void launch_browser() throws Throwable {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("enter url")
	public void enter_url() {
	
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	}

	@When("enter username and password")
	public void enter_username_and_password() {
	
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	}

	@When("click on login button")
	public void click_on_login_button() {
	  
		driver.findElement(By.name("Submit")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	
		System.out.println(driver.getTitle());
	}

	@When("click on logout link")
	public void click_on_logout_link() {
	
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@When("click on add button")
	public void click_on_add_button() {
	   
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@value='Add']")).click();
	}

	@Then("page heading should be displayed as {string}")
	public void page_heading_should_be_displayed_as(String string) {
	   
		Assert.assertEquals(true, driver.getPageSource().contains(string));
	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
		
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys(string2);
	}
	
	@When("click on save button")
	public void click_on_save_button() {
	    
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	}

	@After
	@When("close browser")
	public void close_browser() {
		
	  driver.close();
	}
}
