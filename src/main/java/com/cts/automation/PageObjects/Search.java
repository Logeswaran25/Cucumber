package com.cts.automation.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class Search extends BaseClass {
	public Search() {
		PageFactory.initElements(driver, this);}
	@FindBy(xpath="//input[@type='text']")
	public  WebElement find;
	@FindBy(xpath="//input[@type='submit']")
	public  WebElement submit;

	public  void products(String SearchTxt){
		find.sendKeys(SearchTxt);		
		submit.click();
	}
}
