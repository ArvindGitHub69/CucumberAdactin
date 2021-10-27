package org.adactin.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AdactinLoginPage extends BaseClass {

	@Given("Launch the Browser")
	public void launch_the_browser() {
		LaunchBrowser("Chrome", "https://adactinhotelapp.com/");
		// sugu@3005
		// SuguAravind
	}

	@When("User gives the valid User name and Password")
	public void user_gives_the_valid_user_name_and_password() {
		locators("id", "username").sendKeys("SuguAravind");
		locators("id", "password").sendKeys("sugu@3005");
	}

	@Then("User should get logged in and navigate to another page.")
	public void user_should_get_logged_in_and_navigate_to_another_page() {
		locators("name", "login").click();
	}

	

}
