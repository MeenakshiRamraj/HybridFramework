package com.urbanladder.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.urbanladder.utility.PropertyFileReader;
import com.urbanladder.pageobject.Decorpage;
import com.urbanladder.pageobject.Loginpage;
import com.urbanladder.pageobject.LoveseatsPage;
import com.urbanladder.pageobject.Tablespage;
import com.urbanladder.pageobject.giftpage;
import com.urbanladder.pageobject.helppage;
import com.urbanladder.pageobject.landingpage;
import com.urbanladder.reusablecomponent.ReusableComponents;
import com.urbanladder.utility.dataDriven;

public class TestRunner extends ReusableComponents {
	private dataDriven dd;
	public static Logger log = LogManager.getLogger(ReusableComponents.class.getName());
	 WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		landingpage l = new landingpage(driver);
		if (l.getPopupsize() > 0) {
			l.getPopup().click();
		}
	}

	@Test(priority = 1)
	public void Login() throws InterruptedException, IOException {
		landingpage l = new landingpage(driver);
		Loginpage login = new Loginpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.Hover()).perform();
		l.Login().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login.Email().sendKeys(prop.getProperty("LoginEmail"));
		login.Password().sendKeys(prop.getProperty("pass"));
		login.Submit().click();
		log.info("Login Page TestCase Executed");

	}

	@Test(priority = 2)
	public void LoveSeats() throws InterruptedException {
		LoveseatsPage lp = new LoveseatsPage(driver);
		landingpage l = new landingpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getLiving()).build().perform();
		Thread.sleep(4000);
		action.moveToElement(l.getLoveSeat()).click().build().perform();
		System.out.println(lp.getParagraph().getText());
		driver.navigate().to(prop.getProperty("url"));
		log.info("Loveseats Page TestCase Executed");
	}

	@Test(priority = 3)
	public void GiftCoupon() {
		landingpage l = new landingpage(driver);
		giftpage g = new giftpage(driver);
		l.getGiftcard().click();
		g.getWedding().click();
		g.getEnterAmount().sendKeys(prop.getProperty("GiftAmount"));
		g.getMonth().sendKeys(Keys.DOWN.ENTER);
		g.getDate().sendKeys(prop.getProperty("Date"));
		g.getDate().sendKeys(Keys.ENTER);
		g.getNext().click();
		g.getRecipientName().sendKeys(prop.getProperty("RecipientName"));
		g.getRecipientEmail().sendKeys(prop.getProperty("RecipientEmail"));
		g.getYourName().sendKeys(prop.getProperty("YourName"));
		g.getYourEmail().sendKeys(prop.getProperty("YourEmail"));
		g.getYourMobile().sendKeys(prop.getProperty("YourMobile"));
		g.getConfirm().click();
		driver.navigate().to(prop.getProperty("url"));
		log.info("Giftcards Page TestCase Executed");
	}

	@Test(priority = 4,dataProvider="getProduct")
	public void SearchProduct(String product) throws InterruptedException {
		landingpage l = new landingpage(driver);
		l.getSearch().sendKeys(product);
		l.getSearchButton().click();
		driver.navigate().to(prop.getProperty("url"));
		log.info("SearchProduct TestCase Executed");
	}

	@Test(priority = 5)
	public void Help() throws InterruptedException {
		landingpage l = new landingpage(driver);
		helppage h = new helppage(driver);
		l.getHelp().click();
		h.getAskQuestion().sendKeys(prop.getProperty("AskQuestion"));
		Thread.sleep(1000);
		h.getAskQuestion().sendKeys(Keys.ARROW_DOWN);
		h.getAskQuestion().sendKeys(Keys.ENTER);
		log.info("Help Page TestCase Executed");
	}

	@Test(priority = 6)
	public void FilterSearch() {
		landingpage l = new landingpage(driver);
		LoveseatsPage lp = new LoveseatsPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getLiving()).perform();
		l.getLoveSeats().click();
		action.moveToElement(lp.Filter()).perform();
		lp.Radio().click();
		action.moveToElement(lp.Seat()).perform();
		List<WebElement> list = lp.FilterProduct();
		for (WebElement i : list) {
			System.out.println(i.getText());
		}
		driver.navigate().to(prop.getProperty("url"));
		log.info("FilterSearch TestCase Executed");
	}

	@Test(priority = 7)
	public void TableSale() {
		Tablespage t = new Tablespage(driver);
		landingpage l = new landingpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getSale()).perform();
		l.table().click();
		int count = t.List().size();
		System.out.println("Count:" + count);
		driver.navigate().to(prop.getProperty("url"));
		log.info("TableSale TestCase Executed");
	}

	@Test(priority = 8)
	public void DecorList() {
		landingpage l = new landingpage(driver);
		Decorpage d = new Decorpage(driver);
		l.GetDecorIcon().click();
		Assert.assertEquals(13, d.DecorName().size());
		log.info("DecorList TestCase Executed");
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		log.info("Driver is closed");
	}
	@DataProvider
	public Object[][] getProduct() throws IOException {
		dd=new dataDriven();
		ArrayList<String> h = dd.getData("parameter");
		int ct = h.size();
		Object[][] data = new Object[1][1];
		for(int i = 1; i < ct ; i++) {
			
			data[i-1][0] = h.get(i);
		}
		return data;
		
	}
	
}
