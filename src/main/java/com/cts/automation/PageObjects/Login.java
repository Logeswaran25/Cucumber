package com.cts.automation.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Email address or phone number']")
	public  WebElement phone;
	@FindBy(xpath="//input[@type='password']")
	public  WebElement passwordTxt;
	@FindBy(xpath="//button[@name='login']")
	public  WebElement loginBtn;
	public  void signin(String username, String password){
		phone.sendKeys(username);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}
}
