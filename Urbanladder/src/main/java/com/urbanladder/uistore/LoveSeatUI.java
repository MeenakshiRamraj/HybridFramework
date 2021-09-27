package com.urbanladder.uistore;

import org.openqa.selenium.By;

public class LoveSeatUI {

	public By paragraph=By.xpath("//div[@id='listing-seo']");
	public By filter=By.className("item");
	public By radio=By.id("price_limit_22893-28827");
	public By seat=By.xpath("//*[@id='content']/div[4]/ul/li[2]/div");
	public By viewProduct=By.xpath("//*[@id='content']/div[4]/div/ul/li[2]/div/div[3]/div[2]/a[2]");
	public By cost=By.xpath("//div[@class='price discounted-price']");
	public By filterproduct=By.xpath("//span[@class='name']");
}
