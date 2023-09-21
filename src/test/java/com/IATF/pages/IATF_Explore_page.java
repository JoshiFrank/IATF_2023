package com.IATF.pages;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_Explore_page extends PageObject {
	
	//To click explore button
	@Step
	public void to_click_explore_button() {
		
		$(By.xpath("//button[contains(text(),' Explore ')]")).click();

	    
	}

	//To click explore link in popup
	@Step
	public void to_click_explore_link_in_popup() {
		
		
		$(By.xpath("//span[contains(text(),'Explore')]")).click();

		
	    
	}

	//To validate the explore Title
	@Step
	public void to_validate_the_explore_title() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'Explore')]")).isDisplayed();
	    Assert.assertTrue(displayed);
	}

	//To click the registor to visit button in explore page
	@Step
	public void to_click_the_registor_to_visit_button_in_explore_page() {
		
		$(By.xpath("//span[contains(text(),'Register to visit')]")).click();
	    
	}

	//To validate the navigate to registor to visit page from explore page
	@Step
	public void to_validate_the_navigate_to_registor_to_visit_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//p[contains(text(),'registration for iatf 2023')]")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

	//To click the registor to exhibit button in explore page
	@Step
	public void to_click_the_registor_to_exhibit_button_in_explore_page() {
		
		$(By.xpath("//span[contains(text(),'register to exhibit')]")).click();
	    
	}

	//To validate the navigate to registor to exhibit page from explore page
	@Step
	public void to_validate_the_navigate_to_registor_to_exhibit_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'Tell us a bit about yourself')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To validate clear your calender in explore page
	@Step
	public void to_validate_clear_your_calender_in_explore_page() {
		
		boolean displayed = $(By.xpath("//strong[contains(text(),'Clear your calendar')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click discover how exhibition work at IATF2023 link under the african trade market in explore page
	@Step
	public void to_click_discover_how_exhibition_work_at_iatf2023_link_under_the_african_trade_market_in_explore_page() {
		
		$(By.xpath("//span[contains(text(),'Discover how exhibitions work at IATF2023')]")).click();
	    
	}

	//To validate navigate to connecting african markets page from explore page
	@Step
	public void to_validate_navigate_to_connecting_african_markets_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//h5[contains(text(),'EXPLORE EXHIBITIONS')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click get inspired by IATF2023 conference link under inspiring inspect the in explore page
	@Step
	public void to_click_get_inspired_by_iatf2023_conference_link_under_inspiring_inspect_the_in_explore_page() {
		
		$(By.xpath("//span[contains(text(),'Get inspired by IATF2023')]")).click();
	    
	}

	//To validate navigate to trade and investment page from explore page
	@Step
	public void to_validate_navigate_to_trade_and_investment_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'IATF2023 Trade and Investment Forum')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click see yourself link under the inspiring creators in explore page
	@Step
	public void to_click_see_yourself_link_under_the_inspiring_creators_in_explore_page() {
		
		$(By.xpath("//span[contains(text(),'See for yourself')]")).click();
	    
	}

	//To validate navigate to creative african nexus page from explore page
	@Step
	public void to_validate_navigate_to_creative_african_nexus_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//h2[contains(text(),'Creative Africa Nexus')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click discover countries will be featured link under the spotlights in explore page
	@Step
	public void to_click_discover_countries_will_be_featured_link_under_the_spotlights_in_explore_page() {
		
		$(By.xpath("//span[contains(text(),'Discover which countries will be featured')]")).click();
	   
	}

	//To validate navigate to country day page from explore page
	@Step
	public void to_validate_navigate_to_country_day_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//h2[contains(text(),'Country Day')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	//To click how will you make deals link under the make deals face to face in explore page
	@Step
	public void to_click_how_will_you_make_deals_link_under_the_make_deals_face_to_face_in_explore_page() throws InterruptedException {
		
		$(By.xpath("//span[contains(text(),'How you will make deals')]")).click();
		
		Thread.sleep(4000);
		
	}
		
		//To validate navigate to trade and investment page from explore page two
		@Step
		public void to_validate_navigate_to_trade_and_investment_page_from_explore_page_two() {
			Set<String> windowHandles = getDriver().getWindowHandles();
			for (String allwindow : windowHandles) {
				getDriver().switchTo().window(allwindow);
			}
			
			boolean displayed = $(By.xpath("//h5[contains(text(),'Explore conferences')]")).isDisplayed();
			Assert.assertTrue(displayed);
			
			String mainwindow = getDriver().getWindowHandle();
		    getDriver().switchTo().window(mainwindow);
			
			
		}
	    
	

	//To click the registor to exhibit button bottom of explore page
	@Step
	public void to_click_the_registor_to_exhibit_button_bottom_of_explore_page() throws InterruptedException {
		
		
	    
	    $(By.xpath("//a[@class='btn--border-secondary']")).click();
	    
	}

	//To validate the book your exhibitor page from explore page
	@Step
	public void to_validate_the_book_your_exhibitor_page_from_explore_page() {
		
		boolean displayed = $(By.xpath("//h2[contains(text(),'Book your exhibitor space')]")).isDisplayed();
		Assert.assertTrue(displayed);
		
	    
	}

}
