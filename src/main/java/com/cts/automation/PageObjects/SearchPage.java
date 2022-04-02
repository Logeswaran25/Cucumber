package com.cts.automation.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='From']")
	public WebElement start;
	@FindBy(xpath="//input[@placeholder='To']")
	public  WebElement stop;
	@FindBy(xpath="//a[@id='flys-paxes']")
	public  WebElement number;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public  WebElement search ;
	public  void details(String from,String to , String travelers  ){
		start.sendKeys(from);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		stop.sendKeys(to);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		number.sendKeys(travelers);
		driver.findElement(By.xpath("//a[@id='flys-paxes']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//a[@id='flys-paxes']")).sendKeys(Keys.ENTER);
		search.click();
		}
}
