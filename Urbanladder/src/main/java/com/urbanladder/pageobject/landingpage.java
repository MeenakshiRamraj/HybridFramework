package com.urbanladder.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladder.uistore.LandingUI;

public class landingpage extends LandingUI {

	public WebDriver driver;

	public landingpage(WebDriver driver) {
		this.driver = driver;
	}

	

	public int getPopupsize() {
		return driver.findElements(popup).size();
	}

	public WebElement getPopup() {
		return driver.findElement(popup);
	}

	public WebElement getSale() {
		return driver.findElement(sale);
	}

	public WebElement getLiving() {
		return driver.findElement(living);
	}

	public WebElement getBedroom() {
		return driver.findElement(bedroom);
	}

	public WebElement getDining() {
		return driver.findElement(dining);
	}

	public WebElement getStorage() {
		return driver.findElement(storage);
	}

	public WebElement getStudy() {
		return driver.findElement(study);
	}

	public WebElement getKidsroom() {
		return driver.findElement(kidsroom);
	}

	public WebElement getMattresses() {
		return driver.findElement(mattresses);
	}

	public WebElement getDecor() {
		return driver.findElement(decor);
	}

	public WebElement getCollections() {
		return driver.findElement(collections);
	}

	public WebElement getSearch() {
		return driver.findElement(search);
	}

	public WebElement getHelp() {
		return driver.findElement(help);
	}

	public WebElement getGiftcard() {
		return driver.findElement(giftcard);
	}

	public WebElement getStores() {
		return driver.findElement(stores);
	}

	public WebElement getSearchButton() {
		return driver.findElement(searchbutton);
	}

	public WebElement getLoveSeat() {
		return driver.findElement(loveseat);
	}

	public WebElement getLoveSeats() {
		return driver.findElement(loveSeats);
	}

	public WebElement table() {
		return driver.findElement(table);
	}

	public WebElement GetDecorIcon() {
		return driver.findElement(Decoricon);
	}

	public WebElement GetChat() {
		return driver.findElement(chaticon);
	}

	public WebElement Hover() {
		return driver.findElement(hover);
	}

	public WebElement Login() {
		return driver.findElement(login);
	}
}
