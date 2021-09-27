package com.urbanladder.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.uistore.LoveSeatUI;

public class LoveseatsPage extends LoveSeatUI {
	public WebDriver driver;
	public LoveseatsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getParagraph() 
	{
		return driver.findElement(paragraph);
	}
	public WebElement Cost()
	{
		return driver.findElement(cost);
	}
	public WebElement ViewProduct()
	{
		return driver.findElement(viewProduct);
	}
	public WebElement Seat()
	{
		return driver.findElement(seat);
	}
	public WebElement Radio()
	{
		return driver.findElement(radio);
	}
	public WebElement Filter()
	{
		return driver.findElement(filter);
	}
	public List<WebElement> FilterProduct()
	{
		return driver.findElements(filterproduct);
	}
}
