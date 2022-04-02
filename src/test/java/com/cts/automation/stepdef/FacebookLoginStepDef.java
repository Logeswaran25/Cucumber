package com.cts.automation.stepdef;
import com.cts.automation.PageObjects.Login;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class FacebookLoginStepDef extends BaseClass {
	@Given("user launches chrome and navigate to url")
	public void user_launches_chrome_and_navigate_to_url() {
		launchChrome();
		driver.get("https://www.facebook.com");
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() {
		Login obj=new Login();
		obj. signin("1234567821","zalpn");
	}
	@Then("login  successful")
	public void login_successful() {

	}
}
