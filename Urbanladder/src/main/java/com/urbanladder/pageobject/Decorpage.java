package com.urbanladder.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.uistore.DecorUI;

public class Decorpage extends DecorUI {
	WebDriver driver;
	public Decorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public List<WebElement> DecorName()
	{
		return  driver.findElements(DecorName);
	}
	

}