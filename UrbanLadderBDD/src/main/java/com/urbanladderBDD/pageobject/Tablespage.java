package com.urbanladderBDD.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladderBDD.uistore.TableUI;

public class Tablespage extends TableUI{
	WebDriver driver;
	public Tablespage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public List<WebElement> List()
	{
		return driver.findElements(list);
	}

}