package com.IATF.steps;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Explore_page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_Explore_Steps {

	
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_Explore_page ex;
	
	@When("To click explore button")
	public void to_click_explore_button() {
		
		ex.to_click_explore_button();
	    
	}

	@When("To click explore link in popup")
	public void to_click_explore_link_in_popup() {
		
		ex.to_click_explore_link_in_popup();
	    
	}

	@Then("To validate the explore Title")
	public void to_validate_the_explore_title() {
		
		ex.to_validate_the_explore_title();
	    
	}

	@When("To click the registor to visit button in explore page")
	public void to_click_the_registor_to_visit_button_in_explore_page() {
		
		ex.to_click_the_registor_to_visit_button_in_explore_page();
	    
	}

	@Then("To validate the navigate to registor to visit page from explore page")
	public void to_validate_the_navigate_to_registor_to_visit_page_from_explore_page() {
		
		ex.to_validate_the_navigate_to_registor_to_visit_page_from_explore_page();
	    
	}

	@When("To click the registor to exhibit button in explore page")
	public void to_click_the_registor_to_exhibit_button_in_explore_page() {
		
		ex.to_click_the_registor_to_exhibit_button_in_explore_page();
	    
	}

	@Then("To validate the navigate to registor to exhibit page from explore page")
	public void to_validate_the_navigate_to_registor_to_exhibit_page_from_explore_page() {
		
		ex.to_validate_the_navigate_to_registor_to_exhibit_page_from_explore_page();
	    
	}

	@Then("To validate clear your calender in explore page")
	public void to_validate_clear_your_calender_in_explore_page() {
		
		ex.to_validate_clear_your_calender_in_explore_page();
	    
	}

	@When("To click discover how exhibition work at IATF2023 link under the african trade market in explore page")
	public void to_click_discover_how_exhibition_work_at_iatf2023_link_under_the_african_trade_market_in_explore_page() {
	    
		ex.to_click_discover_how_exhibition_work_at_iatf2023_link_under_the_african_trade_market_in_explore_page();
		
	}

	@Then("To validate navigate to connecting african markets page from explore page")
	public void to_validate_navigate_to_connecting_african_markets_page_from_explore_page() {
		
		ex.to_validate_navigate_to_connecting_african_markets_page_from_explore_page();
	    
	}

	@When("To click get inspired by IATF2023 conference link under inspiring inspect the in explore page")
	public void to_click_get_inspired_by_iatf2023_conference_link_under_inspiring_inspect_the_in_explore_page() {
		
		ex.to_click_get_inspired_by_iatf2023_conference_link_under_inspiring_inspect_the_in_explore_page();
	    
	}

	@Then("To validate navigate to trade and investment page from explore page")
	public void to_validate_navigate_to_trade_and_investment_page_from_explore_page() {
		
		ex.to_validate_navigate_to_trade_and_investment_page_from_explore_page();
		
	    
	}

	@When("To click see yourself link under the inspiring creators in explore page")
	public void to_click_see_yourself_link_under_the_inspiring_creators_in_explore_page() {
		
		ex.to_click_see_yourself_link_under_the_inspiring_creators_in_explore_page();
	    
	}

	@Then("To validate navigate to creative african nexus page from explore page")
	public void to_validate_navigate_to_creative_african_nexus_page_from_explore_page() {
		
		ex.to_validate_navigate_to_creative_african_nexus_page_from_explore_page();
	    
	}

	@When("To click discover countries will be featured link under the spotlights in explore page")
	public void to_click_discover_countries_will_be_featured_link_under_the_spotlights_in_explore_page() {
		
		ex.to_click_discover_countries_will_be_featured_link_under_the_spotlights_in_explore_page();
	   
	}

	@Then("To validate navigate to country day page from explore page")
	public void to_validate_navigate_to_country_day_page_from_explore_page() {
		
		ex.to_validate_navigate_to_country_day_page_from_explore_page();
	    
	}

	@When("To click how will you make deals link under the make deals face to face in explore page")
	public void to_click_how_will_you_make_deals_link_under_the_make_deals_face_to_face_in_explore_page() throws InterruptedException {
		
		ex.to_click_how_will_you_make_deals_link_under_the_make_deals_face_to_face_in_explore_page();
	    
	}
	
	@Then("To validate navigate to trade and investment page from explore page two")
	public void to_validate_navigate_to_trade_and_investment_page_from_explore_page_two() {
		
		
		
	}

	@When("To click the registor to exhibit button bottom of explore page")
	public void to_click_the_registor_to_exhibit_button_bottom_of_explore_page() throws InterruptedException {
		
		ex.to_click_the_registor_to_exhibit_button_bottom_of_explore_page();
	    
	}

	@Then("To validate the book your exhibitor page from explore page")
	public void to_validate_the_book_your_exhibitor_page_from_explore_page() {
		
		ex.to_validate_the_book_your_exhibitor_page_from_explore_page();
	    
	}
}
