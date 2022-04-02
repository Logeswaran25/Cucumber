package com.cts.automation.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class SeatSelection extends BaseClass {
	public SeatSelection() {
		PageFactory.initElements(driver, this); }
	@FindBy(xpath="(//input[@placeholder='*First Name (required)'])[1]")
	public  WebElement name;
	@FindBy(xpath="//input[@tabindex='3']")
	public  WebElement last;
	@FindBy(xpath="(//input[@placeholder='*First Name (required)'])[2]")
	public  WebElement next;
	@FindBy(xpath="//input[@tabindex='16']")
	public  WebElement names;
	@FindBy(xpath="//input[@uib-tooltip='Billing Address 1']")
	public  WebElement  bill;
	@FindBy(xpath="//input[@id='paxes-ADULT-0-dob']")
	public  WebElement dob ;
	@FindBy(xpath="//a[@ng-click='move(-1)']")
	public  WebElement move;
	@FindBy(xpath="(//a[@tabindex='-1'])[4]")
	public  WebElement year;
	@FindBy(xpath="(//a[@tabindex='-1'])[4]")
	public  WebElement month;
	@FindBy(xpath="	(//a[@tabindex='-1'])[28]")
	public  WebElement date;
	@FindBy(xpath="//select[@data-ng-model='pax.gender']") public  WebElement gender;
	@FindBy(xpath="//option[@value='M']") public  WebElement male;
	@FindBy(xpath="(//span[@class='block clearfix h1 m-t-none font-bold flys-avg-total ng-binding'])[2]")
	public  WebElement price;
	public  void booking(String first,String initial, String firsts ,String require, String address) throws InterruptedException {
		name.sendKeys(first);
		last.sendKeys( initial);
		next.sendKeys(firsts);
		names.sendKeys(require);
		bill.sendKeys(address);
		dob.click(); move.click();
		year.click(); month.click(); date.click();
		gender.click();male.click();
		System.out.println(price.getText()); }
}
