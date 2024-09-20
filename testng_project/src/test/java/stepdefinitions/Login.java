package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("User launch the browser and enter url")
	public void user_launch_the_browser_and_enter_url() {
	    System.out.println("browser launched");
	}

	@When("User enter username and password then click on login button")
	public void user_enter_username_and_password_then_click_on_login_button() {
	    System.out.println("login success");
	}

	@Then("User should see the Dashboard page")
	public void user_should_see_the_dashboard_page() {
	    System.out.println("dashboard page is displayed");
	}
}
