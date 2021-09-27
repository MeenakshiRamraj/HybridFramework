package com.urbanladder.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.uistore.LoginUI;

public class Loginpage extends LoginUI {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}

	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	public WebElement getErrorMessage()
	{
		return driver.findElement(ErrorMessage);
	}
	
}