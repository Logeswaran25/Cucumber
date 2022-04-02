package com.cts.automation.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class SearchResult extends BaseClass {
	public SearchResult() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='h4 inline pull-left m-t-xs m-b-none m-l-md'])[1]")
	public  WebElement select;
	public  void results() throws InterruptedException {
		Thread.sleep(10000);
		
		 select.click();
	}
}
