package com.cts.automation.PageObjects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.automation.utilities.BaseClass;
public class Name extends BaseClass  {
	public Name() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")
	public  List<WebElement> phone;
	@FindBy(xpath="//span[@class='a-price-whole']")
	public List<WebElement> price;
	public  void details() {
		for(int i=0;i<phone.size();i++) {

			System.out.println(phone.get(i).getText()+ "   Price   "+price.get(i).getText());}
	}
}
