package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.DesktopsObj;
import pageObjects.DigitalDownloadsObj;
import pageObjects.LoginAndLogoutObj;
import pageObjects.RegisterObj;

public class NopcommerceStepDef extends Base{
	
//	<<<<<<<<<<<<<<<<<<<<<<<<<<--- Register Module --->>>>>>>>>>>>>>>>>>>>>>>>>>
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() throws Exception {
	   
		Base.log4j_xml();
		Base.browser("chrome");
		ro=new RegisterObj(driver);
		Base.maximize();
		Base.implicityWait();
	}

	@When("User enter url as {string}")
	public void user_enter_url_as(String string) {
	   driver.navigate().to(string);
	   Base.implicityWait();
	   log.info("URL:"+string);
	}

	@When("User click on REGISTER module")
	public void user_click_on_register_module() {
	  
		ro.setRegisterLink();
		Base.implicityWait();
	}

	@Then("Register page should be displayed with as heading {string}")
	public void register_page_should_be_displayed_with_as_heading(String string) {
	    
		WebElement heading=ro.getHeading();
		Assert.assertEquals("Both are not equals", string, heading.getText());
		log.info("Home page heading is:"+string);
	}

	@When("User select the gender as per requirement {string}")
	public void user_select_the_gender_as_per_requirement(String string) {
	 
		if(string.equalsIgnoreCase("male"))
		{
			ro.setMaleRadioButton();
		}
		else
		{
			ro.setFemaleRadioBButton();
		}
	}

	@When("User enter First Name as {string} and Last Name as {string}")
	public void user_enter_first_name_as_and_last_name_as(String string, String string2) {
			ro.setTxtFirstName(string);
			log.info("FirstName:"+string);
			ro.setTxtLastName(string2);
			log.info("LastName:"+string2);
	}

	@When("User Select the Correct DOB as {string} {string} {string}")
	public void user_select_the_correct_dob_as(String string, String string2, String string3) {
	    
		ro.setSelectDay(string);
		ro.setSelectMonth(string2);
		ro.setSelectYear(string3);
		log.info("DOB:"+string+"-"+string2+"-"+string3);
	}

	@When("User enter Email as {string} and Company Name as {string}")
	public void user_enter_email_as_and_company_name_as(String string, String string2) {
	   
//		string=Base.randomEmail();
//		if(string.matches("[a-z]"))
//		{
//		ro.setTxtEmail(string.concat("@gmail.com"));
//		}
		ro.setTxtEmail(string);
		ro.setTxtCompanyName(string2);
		log.info("Email:"+string);
		log.info("CompanyName:"+string2);
	}

	@When("User select the newsletter checkbox")
	public void user_select_the_newsletter_checkbox() {
	    
		ro.setNewsletterCheckbox();
	}

	@When("User enter Password as {string} and Confirm Password as {string}")
	public void user_enter_password_as_and_confirm_password_as(String string, String string2) {
	   
		ro.setTxtPassword(string);
		ro.setTxtConfirmPassword(string2);
		log.info("Password:"+string);
		log.info("ConfirmPassword:"+string2);
	}

	@When("User click on REGISTER button")
	public void user_click_on_register_button() {
	   
		ro.setRegisterButton();
		
	}

	@Then("User should be seen this message {string}")
	public void user_should_be_seen_this_message(String string) {
		
		if(driver.getPageSource().contains("The specified email already exists"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
		WebElement confirmMessage=ro.getConfirmMessage();
		Assert.assertEquals("Both are not equals", string, confirmMessage.getText());
		log.info("Expected result:"+string);
		}
	}
	
	@Then("Page title should be displayed as {string}")
	public void page_title_should_be_displayed_as(String string) {
		
		Assert.assertTrue(driver.getPageSource().contains(string));
		log.info("Page title:"+string);
	}
	
	@When("User click on continue button")
	public void user_click_on_continue_button() {
	    
		ro.setContinueButton();
	}
	
	@Then("User should be seen the Warning messages")
	public void user_should_be_seen_the_warning_messages() {
		
		if(Base.registerModuleErrorMsg() != null)
		{
			log.info(Base.registerModuleErrorMsg());
			driver.close();
		}
		else
		{
			WebElement confirmMessage=ro.getConfirmMessage();
			log.info("Expected result:"+confirmMessage.getText());
			Assert.assertTrue(driver.getPageSource().contains(confirmMessage.getText()));
			ro.setContinueButton();
			driver.close();
		}
	}

	@Then("User close the browser")
	public void user_close_the_browser() {

	    driver.close();
	}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<--- Login Module --->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@When("User click on login link")
	public void user_click_on_login_link() {
	
		lo=new LoginAndLogoutObj(driver);
		lo.setLoginLink();
		Base.implicityWait();
	}

	@Then("Retrieve the heading of the login page")
	public void retrieve_the_heading_of_the_login_page() {
	
		log.info("Login page heading is:"+lo.getHeading());
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_correct_email_as_and_correct_password_as(String string, String string2) {
	
		if(driver.getPageSource().contains(lo.getHeading()))
		{
			lo.setTxtEmail(string);
			log.info("Email is:"+string);
			lo.setTxtPassword(string2);
			log.info("Password is:"+string2);
		}
		else
		{
			driver.close();
			Assert.assertTrue(false);
		}
	}

	@When("User click on login button")
	public void user_click_on_login_button() {

		lo.setLoginBtn();
	}

	@Then("Login successfully done and user seen the home page")
	public void login_successfully_done_and_user_seen_the_home_page() {

		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else if(driver.getPageSource().contains("Please enter your email"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			log.info(lo.getHomePageHeading());
		}
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
		
		lo.setLogoutLink();
	}
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<---Desktops Page--->>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@When("Perform mouse over action on Computers module and click on Desktop sub-module")
	public void perform_mouse_over_action_on_computers_module_and_click_on_desktop_sub_module() {
	 
		dsko=new DesktopsObj(driver);
		dsko.setComputersModule();
		dsko.setDesktopsSubModule();
	}

	@Then("Retrieve the heading of the Desktop page")
	public void retrieve_the_heading_of_the_desktop_page() {
	    
		log.info(dsko.getHeading());
	}

	@When("User select the Sort by and Display drop down box")
	public void user_select_the_sort_by_and_display_drop_down_box() {
	   
		dsko.setSortByDropdown("Name: A to Z");
		dsko.setDisplayDropdown("9");
	}

	@When("Click on link of the particular item")
	public void click_on_link_of_the_particular_item() throws InterruptedException {
	    
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='page-body']/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")).click();
	}

	@Then("Verify name of the item")
	public void verify_name_of_the_item() {
	    
		if(driver.getPageSource().contains("Build your own computer"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			driver.close();
			Assert.assertTrue(false);
		}
	}

	@When("Select the required fields")
	public void select_the_required_fields(DataTable dataTable) throws InterruptedException {
	   
		List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
		for(Map<String,String> row:data)
		{
			String field=row.get("field");
			String value=row.get("value");
			Thread.sleep(3000);
			switch (field)
			{
			case "Processor":dsko.setProcessorDropdown(value);
			break;
			
			case "RAM":dsko.setRAMDropdown(value);
			break;
			
			case "HDD":dsko.setHDDRadioBtn(value);
			break;
			}
			
		}
	}

	@When("User enter the quantity of the item")
	public void user_enter_the_quantity_of_the_item() throws InterruptedException {
	    
		dsko.setTxtQuantity("2");
		Thread.sleep(3000);
	}

	@Then("Retrieve the price")
	public void retrieve_the_price() {
	  
		log.info(dsko.getPriceTag());
	}

	@When("User click on ADD TO CART button")
	public void user_click_on_add_to_cart_button() {
		
		dsko.setAddToCartBtn();
	}

	@Then("Expected result should be displayed as {string}")
	public void expected_result_should_be_displayed_as(String string) {
	    
		if(driver.getPageSource().contains(string))
		{
			driver.findElement(By.xpath("//span[@title='Close']")).click();
			log.info(driver.findElement(By.xpath("//p[@class='content']")).getText());
		}
		else if(driver.getPageSource().contains("Please select"))
		{
			driver.findElement(By.xpath("//span[@title='Close']")).click();
			log.info(driver.findElement(By.xpath("//p[@class='content']")).getText());
			driver.close();
			Assert.assertTrue(false);
		}
	}
	
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<---Digital Downloads--->>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	@When("User click on Digital downloads module")
	public void user_click_on_digital_downloads_module() {
	    
		ddo=new DigitalDownloadsObj(driver);
		dsko=new DesktopsObj(driver);
		Base.explicityWait(ddo.didgitalDownload);
		ddo.setDidgitalDownload();
		Base.implicityWait();
	}

	@Then("Page heading should be displayed as {string}")
	public void page_heading_should_be_displayed_as(String string) {
	    
		Assert.assertEquals("Both are not equals", string, ddo.getProductHeading());
		log.info("Page heading is:"+ddo.getProductHeading());
	}

	@When("User select the {string} and {string} dropdown box")
	public void user_select_the_and_dropdown_box(String string, String string2) {
	 
		dsko.setSortByDropdown(string);
		dsko.setDisplayDropdown(string2);
	}

	@When("User click on particular product")
	public void user_click_on_particular_product() throws InterruptedException {
	   try
	   {
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='page-body']/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")).click();
	   }
	   catch(StaleElementReferenceException e)
	   {
		   System.out.println(e.getMessage());
	   }
	}

	@Then("Heading of product page should be dispalyed")
	public void heading_of_product_page_should_be_dispalyed() {
	    
		Assert.assertTrue(driver.getPageSource().contains(ddo.getProductHeading()));
		log.info("Heading of the product:"+ddo.getProductHeading());
	}

	@When("User enter price as {string} and Quantity as {string}")
	public void user_enter_price_as_and_quantity_as(String string, String string2) {
	   
		ddo.setTxtQuantity(string2);
		double p=Double.parseDouble(string);
		if(p>0.50 && p<100.00)
		{
			ddo.setTxtPrice(string);
		}
		else if(p>0.50 && p<1000.00)
		{
			ddo.setTxtPrice(string);
		}
		else
		{
			
		}
		
	}
	@When("User click on AddToCart button")
	public void user_click_on_add_to_cart_button1() {
	    
		ddo.setAddtocartBtn();
	}
	@Then("Success message should be displayed as {string}")
	public void success_message_should_be_displayed_as(String string) throws InterruptedException {

		
		if(ddo.getSuccessMsg().equals(string))
		{
			log.info("Message:"+ddo.getSuccessMsg());
			ddo.setCloseMsgNavBar();
		}
		else
		{
			log.info("Message:"+ddo.getSuccessMsg());
			ddo.setCloseMsgNavBar();
		}
	}
}
