package com.urbanladder.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.uistore.GiftUI;

public class giftpage extends GiftUI {
	public WebDriver driver;
	public giftpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
    public WebElement getWedding() {
		return driver.findElement(wedding);
	}
    public WebElement getHouseWarming() {
		return driver.findElement(housewarming);
	}
    public WebElement getBirthday() {
		return driver.findElement(birthday);
	}
    public WebElement getSpecialOccasion() {
		return driver.findElement(specialOccasion);
	}
    public WebElement getCorporateGifts() {
		return driver.findElement(corporategift);
	}
    public WebElement getOtherGifts() {
		return driver.findElement(othergifts);
	}
    public WebElement getEnterAmount() {
		return driver.findElement(EnterAmount);
	}
    public WebElement getMonth() {
		return driver.findElement(Month);
	}
    public WebElement getDate() {
		return driver.findElement(Date);
	}
    public WebElement getNext() {
		return driver.findElement(Next);
	}
    public WebElement getRecipientName() {
		return driver.findElement(RecipientName);
	}
    public WebElement getRecipientEmail() {
		return driver.findElement(RecipientEmail);
	}
    public WebElement getYourName() {
		return driver.findElement(yourName);
	}
    public WebElement getYourEmail() {
		return driver.findElement(yourEmail);
	}
    public WebElement getYourMobile() {
		return driver.findElement(yourMobile);
	}
    public WebElement getMessage() {
		return driver.findElement(message);
	}
    public WebElement getConfirm() {
		return driver.findElement(confirm);
	}
    public WebElement getProceedToPay() {
		return driver.findElement(proceedToPay);
	}
}
