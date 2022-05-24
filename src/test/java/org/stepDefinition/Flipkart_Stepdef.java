package org.stepDefinition;

import org.pages.Flipkart_Page;
import org.properties.PropertiesUtil;
import org.thread_local.Thread_Local;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart_Stepdef {
	private Flipkart_Page fp = new Flipkart_Page(Thread_Local.getDriver());
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		Thread_Local.getDriver().get(PropertiesUtil.pl.getTestdata("url"));
	    }

	@When("user enters the  username")
	public void user_enters_the_username() {
		String Uname =PropertiesUtil.pl.getTestdata("uName");
		fp.sendUname(Uname);
	}

	@When("user enters the password")
	public void user_enters_the_password() {
		String password =PropertiesUtil.pl.getTestdata("pwd");
		fp.sendPwd(password);
	  }

	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		fp.clickonLoginbtn();
	    }

	@Then("user redirected to dashboard")
	public void user_redirected_to_dashboard() {
	  	}



}
