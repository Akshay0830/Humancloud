package org.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.pages.Amazon_pages;
import org.spareHooks.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_Amazon {
	Amazon_pages sp = new Amazon_pages(Hooks.driver);
	@Given("user is on the dashboard of Amazon")
	public void user_is_on_the_dashboard_of_amazon() {
		sp.isSearchBoxDisplayed();
	    }

	@Given("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		sp.searchfor_Iphone13();
	}

	@When("user enters iphone {int} in search tab")
	public void user_enters_iphone_in_search_tab(Integer int1) {
		
	}

	@When("clicks on the search button")
	public void clicks_on_the_search_button() {
		sp.clickOnbuton();
}

	@Then("user gets the list of iphone {int} mobiles")
	public void user_gets_the_list_of_iphone_mobiles(Integer int1) {
}
	
	
	

}
