package com.cts.automation.stepdef;

import com.cts.automation.PageObjects.FlipkartLogin;
import com.cts.automation.PageObjects.FlipkartSearch;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartStepDef extends BaseClass {
	@Given("user launche chrome")
	public void user_launche_chrome() {
		launchChrome();
		driver.get("https://www.flipkart.com");
	}

	@When("user enter mail as {string} and password as {string}")
	public void user_enter_mail_as_and_password_as(String id, String Password) {
		FlipkartLogin obj= new FlipkartLogin();
		obj.signin( id, Password);
	    
	}

	@When("I search the product as {string}")
	public void i_search_the_product_as(String SearchTxt) throws InterruptedException {
		FlipkartSearch obj= new FlipkartSearch();
		obj.product(SearchTxt);
	    
	}
	@Then("Login and validate successful")
	public void login_and_validate_successful() {
	    
	}


}
