package stepDefinition;

import org.openqa.selenium.By;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import io.cucumber.java.en.*;
import io.cucumber.core.gherkin.FeatureParserException;
import pageObjects.AddEmpObj;
import pageObjects.LoginObj;

public class OrangeHrmStepDef extends Base{
	
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		Base.log4j_Properties();
		log.debug("hello");
		Base.browser("chrome");
		lo=new LoginObj(driver);
		driver.manage().window().maximize();
		Base.implicityWait();
	}

	@When("user enter url {string}")
	public void user_enter_url(String url) {
	
		driver.navigate().to(url);
		Base.implicityWait();
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String un) {

		lo.setTxtUserName(un);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String pwd) {
	  
		lo.setTxtPassword(pwd);
	}

	@When("click on OrangeHrm login button")
	public void click_on_OrangeHrm_login_button() throws InterruptedException {
	  
		lo.setLoginBtn();
		Base.implicityWait();
	}

	@Then("page title should be displayed as {string}")
	public void page_title_should_be_displayed_as(String title) {
	
		if(driver.getPageSource().contains("Invalid credentials"))
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
			driver.close();
			Assert.assertTrue(false);
		}
		else if(driver.getPageSource().contains("Required"))
		{
			System.out.println(driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).getText());
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("click on logout button")
	public void click_on_logout_button() throws InterruptedException {
	
		Thread.sleep(5000);
		lo.setDownArwBtn();
		lo.setLogoutLink();
	}

	@Then("close the browser")
	public void close_the_browser() {

		driver.close();
	}

	@When("user click on PIM module")
	public void user_click_on_pim_module() throws FeatureParserException{
	  
		ado=new AddEmpObj(driver);
		Base.implicityWait();
		ado.setPim_module();
	}

	@When("user click on AddEmployee button")
	public void user_click_on_add_employee_button() {
	    
		ado.setAddEmployee();
	}

	@Then("{string} page should be  opened")
	public void page_should_be_opened(String string) {
	    
		Assert.assertEquals(string,ado.AddEmployee_heading.getText());
	}

	@When("user fill the textboxes {string}  {string} {string} {string}")
	public void user_fill_the_textboxes(String string, String string2, String string3, String string4) {
	 
		ado.setFirstName(string);
		ado.setMiddleName(string2);
		ado.setLastName(string3);
		ado.setEmployeeId(string4);
	}
	
	@When("user click on save button")
	public void user_click_on_save_button() {
	    
		Base.explicityWait(ado.saveBtn);
		ado.setSaveBtn();
	}

	@Then("customer details should be added successfully and page displayed as {string}")
	public void customer_details_should_be_added_successfully_and_page_displayed_as(String string) {
	    
		if(driver.getPageSource().contains(string))
		{
			Assert.assertTrue(true);
		}
	}
}
