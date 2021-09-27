package com.urbanladder.uistore;

import org.openqa.selenium.By;

public class LandingUI {

	public By sale = By.xpath("//li[@class='topnav_item saleunit']");
	public By living = By.xpath("//li[@class='topnav_item livingunit']");
	public By bedroom = By.xpath("//li[@class='topnav_item bedroomunit']");
	public By dining = By.xpath("//li[@class='topnav_item diningunit']");
	public By storage = By.xpath("//li[@class='topnav_item storageunit']");
	public By study = By.xpath("//li[@class='topnav_item studyunit']");
	public By kidsroom = By.xpath("//li[@class='topnav_item kidsroomunit']");
	public By mattresses = By.xpath("//li[@class='topnav_item mattressesunit']");
	public By decor = By.xpath("//li[@class='topnav_item decorunit']");
	public By collections = By.xpath("//li[@class='topnav_item collectionsunit']");
	public By search = By.id("search");
	public By help = By.xpath("//*[@id='header']/section/div/ul[1]/li[1]/a");
	public By giftcard = By.xpath("//a[@href='../../gift-cards?src=header']");
	public By stores = By.xpath("//a[@href='../../furniture-stores?src=header']");
	public By searchbutton = By.id("search_button");
	public By loveseat = By.xpath("//*[@id='topnav_wrapper']/ul/li[2]/div/div/ul/li[1]/ul/li[6]/a/span");
	public By popup = By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	public By loveSeats = By.linkText("Loveseats");
	public By table = By.xpath("//*[@id='topnav_wrapper']/ul/li[1]/div/div/ul/li[1]/ul/li[4]/a/span");
	public By Decoricon = By.xpath("//*[@id='content']/div[3]/div/div[3]/a[6]");
	public By chaticon = By.xpath("//div[@class='chat-content']");
	public By hover = By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span");
	public By login = By.linkText("Log In");
}
