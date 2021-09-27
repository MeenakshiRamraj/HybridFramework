package com.urbanladder.uistore;

import org.openqa.selenium.By;

public class LoginUI {

	public By email = By.cssSelector("#password-credentials > input:nth-child(1)");
	public By password = By.cssSelector(".password-wrap > div:nth-child(1) > input:nth-child(1)");
	public By submit = By.xpath("//*[@id=\"ul_site_login\"]");
	public By ErrorMessage=By.xpath("//div[@class='flash ulmessage error  ']");
}
