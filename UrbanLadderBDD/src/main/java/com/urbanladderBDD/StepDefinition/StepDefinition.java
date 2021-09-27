package com.urbanladderBDD.StepDefinition;

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

import com.urbanladderBDD.pageobject.LoveseatsPage;
import com.urbanladderBDD.pageobject.Tablespage;
import com.urbanladderBDD.pageobject.giftpage;
import com.urbanladderBDD.utility.dataDriven;
import com.urbanladderBDD.pageobject.helppage;
import com.urbanladderBDD.pageobject.Decorpage;
import com.urbanladderBDD.pageobject.Loginpage;
import com.urbanladderBDD.pageobject.landingpage;
import com.urbanladderBDD.reusablecomponent.ReusableComponents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends ReusableComponents {
	
	private dataDriven dd;
	public static Logger log = LogManager.getLogger(StepDefinition.class.getName());
	@Given("^user is on the landing page$")
	public void user_is_on_the_landing_page() {
		driver.get(prop.getProperty("url"));
	}
	@Given("^user is on the landing page of the UrbanLadder website$")
	public void user_is_on_the_landing_page_of_the_urban_ladder_website() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		landingpage l = new landingpage(driver);
		if (l.getPopupsize() > 0) {
			l.getPopup().click();
		}
	    
	}
	@When("^user logs in with valid emailID and password$")
	public void user_logs_in_with_valid_email_id_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		Loginpage login = new Loginpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.Hover()).perform();
		l.Login().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login.Email().sendKeys(prop.getProperty("LoginEmail"));
		login.Password().sendKeys(prop.getProperty("pass"));
		
	}
	@Then("^user is loggged in to their account$")
	public void user_is_loggged_in_to_their_account() {
	    // Write code here that turns the phrase above into concrete actions
		Loginpage login = new Loginpage(driver);
		login.Submit().click();
		log.info("Login Page TestCase Executed");
	  
	}

	@When("^user hovers on the living icon and clicks on the loveseats$")
	public void user_hovers_on_the_living_icon_and_clicks_on_the_loveseats() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getLiving()).build().perform();
		Thread.sleep(4000);
	   
	}
	@Then("^browser redirects to the loveseats page$")
	public void browser_redirects_to_the_loveseats_page() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getLoveSeat()).click().build().perform();
	   
	}
	@Then("^prints the description paragraph$")
	public void prints_the_description_paragraph() {
	    // Write code here that turns the phrase above into concrete actions
		LoveseatsPage lp = new LoveseatsPage(driver);
		System.out.println(lp.getParagraph().getText());
		log.info("Loveseats Page TestCase Executed");
	   
	}
	

	@When("^user clicks on the giftcards icon and redirected$")
	public void user_clicks_on_the_giftcards_icon() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		l.getGiftcard().click();
	   
	}

	@Then("^user selects an Occassion enters amount and selects month and delivery$")
	public void user_selects_an_occassion_and_enters_amount() {
	    // Write code here that turns the phrase above into concrete actions
		giftpage g = new giftpage(driver);
		g.getWedding().click();
		g.getEnterAmount().sendKeys(prop.getProperty("GiftAmount"));
		g.getMonth().sendKeys(Keys.DOWN.ENTER);
		g.getDate().sendKeys(prop.getProperty("Date"));
		g.getDate().sendKeys(Keys.ENTER);
		g.getNext().click();
	    
	}
	@Then("^enters email and name$")
	public void enters_email_and_name() {
	    // Write code here that turns the phrase above into concrete actions
		giftpage g = new giftpage(driver);
		g.getRecipientName().sendKeys(prop.getProperty("RecipientName"));
		g.getRecipientEmail().sendKeys(prop.getProperty("RecipientEmail"));
		g.getYourName().sendKeys(prop.getProperty("YourName"));
		g.getYourEmail().sendKeys(prop.getProperty("YourEmail"));
		g.getYourMobile().sendKeys(prop.getProperty("YourMobile"));
	    
	}
	@Then("^confirms the details$")
	public void confirms_the_details() {
	    // Write code here that turns the phrase above into concrete actions
		giftpage g = new giftpage(driver);
		g.getConfirm().click();
		log.info("Giftcards Page TestCase Executed");
	  
	}
	@When("^clicked on the help icon and redirected$")
	public void clicked_on_the_help_icon() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		l.getHelp().click();
	    
	}
	@Then("^user types the question in search area$")
	public void user_types_the_question_in_search_area() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		helppage h = new helppage(driver);
		h.getAskQuestion().sendKeys(prop.getProperty("AskQuestion"));
		Thread.sleep(1000);
		h.getAskQuestion().sendKeys(Keys.ARROW_DOWN);
		h.getAskQuestion().sendKeys(Keys.ENTER);
		log.info("Help Page TestCase Executed");
	    
	}

	@When("^hover on living and clicks loveseats$")
	public void hover_on_living_and_clicks_loveseats() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getLiving()).perform();
		l.getLoveSeats().click();
	    
	}
	@When("^hovers on filter and filter is chosen products displayed$")
	public void hovers_on_filter_and_filter_is_chosen() {
	    // Write code here that turns the phrase above into concrete actions
		LoveseatsPage lp = new LoveseatsPage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lp.Filter()).perform();
		lp.Radio().click();
	   
	}
	@Then("^Prints the name of the products$")
	public void prints_the_name_of_the_products() {
	    // Write code here that turns the phrase above into concrete actions
		//action.moveToElement(lp.Seat()).perform();
		LoveseatsPage lp = new LoveseatsPage(driver);
		List<WebElement> list = lp.FilterProduct();
		for (WebElement i : list) {
			System.out.println(i.getText());
		}
		log.info("FilterSearch TestCase Executed");
	   
	}
	

	@When("^hover on sale and clicks on study table$")
	public void hover_on_sale_and_clicks_on_study_table() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(l.getSale()).perform();
		l.table().click();
	    
	}
	@Then("^list will be displayed and count is printed$")
	public void list_will_be_displayed_and_count_is_printed() {
	    // Write code here that turns the phrase above into concrete actions
		Tablespage t = new Tablespage(driver);
		int count = t.List().size();
		System.out.println("Count:" + count);
		log.info("TableSale TestCase Executed");
	    
	}
	@When("^clicked on the decor icon redirected to decor page and list is displayed$")
	public void clicked_on_the_decor_icon() {
	    // Write code here that turns the phrase above into concrete actions
		landingpage l = new landingpage(driver);
		l.GetDecorIcon().click();
	  
	}
	
	@Then("^Count of items displayed is checked$")
	public void count_of_items_displayed_is_checked() {
	    // Write code here that turns the phrase above into concrete actions
		Decorpage d = new Decorpage(driver);
		Assert.assertEquals(13, d.DecorName().size());
	    
	}

@Then("^Browser is closed$")
public void CloseBrowser() {
	driver.close();
	log.info("Driver is closed");
}












}
