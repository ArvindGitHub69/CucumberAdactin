package org.adactin.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AdactinSearchHotelPage extends BaseClass {

	@Given("User will wait for the page to load from the login page")
	public void user_will_wait_for_the_page_to_load_from_the_login_page() {
		time();
	}

	@When("user will select hotel location")
	public void user_will_select_hotel_location() {
		selectOption("location", "Brisbane");
	}

	@Then("user will select which hotel to stay")
	public void user_will_select_which_hotel_to_stay() {
		selectOption("hotels", "Hotel Hervey");
	}

	@Then("user will select the type of room")
	public void user_will_select_the_type_of_room() {
		selectOption("room_type", "Deluxe");
	}

	@Then("user will select the number of rooms")
	public void user_will_select_the_number_of_rooms() {
		selectOption("room_nos", "1 - One");
	}

	@Then("user will select the check in date")
	public void user_will_select_the_check_in_date() throws AWTException {
		WebElement l = locators("id", "datepick_in");
		Click(l);
		Selectall();
		l.sendKeys("01/01/2022");
	}

	@Then("user will select the check out date")
	public void user_will_select_the_check_out_date() {
		 WebElement l1 = locators("id", "datepick_out");
		 Click(l1);
		 try {
			Selectall();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		 l1.sendKeys("05/01/2022");
		 
		 }

	
	@Then("user will select the Adult per room")
	public void user_will_select_the_adult_per_room() {
		selectOption("adult_room", "2 - Two");
	}

	@Then("user will select if Child present per room")
	public void user_will_select_if_child_present_per_room() {
		selectOption("child_room", "0 - None");
	}

	@Then("user will select Search to  see the list of hotels in the next page")
	public void user_will_select_search_to_see_the_list_of_hotels_in_the_next_page() {
		locators("id", "Submit").click();
	}

}
