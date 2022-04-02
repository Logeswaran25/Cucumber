package com.cts.automation.stepdef;
import java.util.List;
import java.util.Map;

import com.cts.automation.PageObjects.SearchPage;
import com.cts.automation.PageObjects.SearchResult;
import com.cts.automation.PageObjects.SeatSelection;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class FlyusStepDef extends BaseClass {
	@Given("user launches chrome and navigate to  flyus url")
	public void user_launches_chrome_and_navigate_to_flyus_url() {
		launchChrome();
		driver.get("https://www.flyus.com");
}

	@When("user enters source and destination& Traverler and search for flights")
	public void user_enters_source_and_destination_Traverler_and_search_for_flights(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
		SearchPage obj=new SearchPage();
		String from=data.get(0).get("from");
		String to=data.get(0).get("to");
		String travelers=data.get(0).get("travelers"); 
		obj.details(from,to,travelers);}

	@When("user select the flight")
	public void user_select_the_flight() throws InterruptedException {
		Thread.sleep(10000);
		SearchResult obj =new SearchResult();
		obj.results();}

	@When("enter the below passenger information")
	public void enter_the_below_passenger_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String,String>> a=dataTable.asMaps(String.class,String.class);
		SeatSelection obj=new SeatSelection();
		String first =a.get(0).get("first");
		String initial=a.get(0).get("initial");
		String firsts =a.get(0).get("firsts"); 
		String require =a.get(0).get("require"); 
		String address =a.get(0).get("address"); 
		
		obj.booking(first,initial,firsts,require,address);}

	
@When("user select the seat")
	public void user_select_the_seat() {
}
@Then("I print the price")
	public void i_print_the_price() {

	}



	 }
