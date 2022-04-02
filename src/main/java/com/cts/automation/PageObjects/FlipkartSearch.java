package com.cts.automation.PageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class FlipkartSearch  extends BaseClass {
	public FlipkartSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	public  WebElement search;
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	public  WebElement find;
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	public  WebElement arrange;
	@FindBy(xpath="//div[@class='col col-5-12 nlI3QM']")

	public List<WebElement> price;
	@FindBy(xpath="(//div[@class='_30jeq3 _1_WHN1'])[24]")
	public WebElement lastPrice;
	@FindBy(xpath="(//div[@class='col col-7-12'])[24]")
	public  WebElement last;
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	public  WebElement priceCheck;
	public void product(String SearchTxt) throws InterruptedException {
		Thread.sleep(2000);
		search.click();
		search.sendKeys(SearchTxt);
		find.click();
		arrange.click();
		List<String> price = new ArrayList<String>();
		List<String> sortPrice= new ArrayList<String>(price);
		Collections.sort(sortPrice);
		if(sortPrice.equals(price))
			System.out.println("sorting working");
		else
			System.out.println("sorting not working");
		
		List<String> priceCheck = new ArrayList<String>();
		List<String> lastPrice = new ArrayList<String>();
		last.click();
		if(priceCheck.equals(lastPrice))
			System.out.println("price matching");
		else
			System.out.println("price not match");


	}


}

//List<String> prices = new ArrayList<String>();
//for (WebElement e:price) {
//	prices.add(e.getText());}
//List<String> sortPrice= new ArrayList<String>(prices);
//Collections.sort(sortPrice);
