package com.cts.automation.stepdef;

import com.cts.automation.PageObjects.Name;
import com.cts.automation.PageObjects.Search;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDef extends BaseClass{
	@Given("user launche the chrome and navigate to url")
	public void user_launche_the_chrome_and_navigate_to_url() {
		launchChrome();
		driver.get("https://www.amazon.in");
}

	@When("user search the product  as {string}")
	public void user_search_the_product_as(String  SearchTxt) {
		Search obj=new Search();
		obj.products( SearchTxt );

	}
	@Then("print all names & price")
	public void search_successful() {
		Name obj1=new Name();
		obj1.details();
	}

}
