package com.cts.automation.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;

public class FlipkartLogin  extends BaseClass {
	public FlipkartLogin() {
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="//a[@class='_1_3w1N']")
	//public  WebElement sign;
	@FindBy(xpath="(//input[@type='text'])[2]")
	public  WebElement mailId;
	@FindBy(xpath="//input[@type='password']")
	public  WebElement passwordTxt;
	@FindBy(xpath="(//span[text()='Login'])[2]")
	public  WebElement loginBtn;
	public  void signin(String id, String Password){
		//sign.click();
		mailId.sendKeys(id);
		passwordTxt.sendKeys(Password);
		loginBtn.click();
	}
}
