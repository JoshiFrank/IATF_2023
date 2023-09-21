package com.IATF.steps;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_2023Partners_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_2023Partners_Steps {

	
	@Managed
	WebDriver driver;
	
	
	@Steps
	IATF_2023Partners_Pages ps;
	
	@When("To click IATF partners button")
	public void to_click_iatf_partners_button() {
		
		ps.to_click_iatf_partners_button();
	    
	}

	@When("To click IATF partners link")
	public void to_click_iatf_partners_link() {
		
		ps.to_click_iatf_partners_link();
	    
	}

	@Then("To validate the IATF partners page")
	public void to_validate_the_iatf_partners_page() {
		
		ps.to_validate_the_iatf_partners_page();
	    
	}

	@When("To click enquire today link")
	public void to_click_enquire_today_link() {
	    
	}

	@Then("To validate enquire today page")
	public void to_validate_enquire_today_page() throws InterruptedException {
		
		ps.to_validate_enquire_today_page();
	    
	}

	@When("To click media partner link")
	public void to_click_media_partner_link() {
		
		ps.to_click_media_partner_link();
	    
	}

	@Then("To validate the media partner page")
	public void to_validate_the_media_partner_page() {
		
		ps.to_validate_the_media_partner_page();
	    
	}

	@When("To click official partner link")
	public void to_click_official_partner_link() {
		
		ps.to_click_official_partner_link();
		
	    
	}

	@Then("To validate official partner page")
	public void to_validate_official_partner_page() {
		
		ps.to_validate_official_partner_page();
	    
	}

	@When("To click official partners link")
	public void to_click_official_partners_link() {
		
		ps.to_click_official_partners_link();
	    
	}

	@Then("To validate official partners page")
	public void to_validate_official_partners_page() {
		
		ps.to_validate_official_partners_page();
	    
	}

	@When("To click visit partner button from official partners page")
	public void to_click_visit_partner_button_from_official_partners_page() {
		
		ps.to_click_visit_partner_button_from_official_partners_page();
	    
	}

	@Then("To validate visit partner page from official partners page")
	public void to_validate_visit_partner_page_from_official_partners_page() throws InterruptedException {
		
		ps.to_validate_visit_partner_page_from_official_partners_page();
	    
	}

	@When("To click event partners link")
	public void to_click_event_partners_link() {
		
		ps.to_click_event_partners_link();
	    
	}

	@Then("To validate event partners page")
	public void to_validate_event_partners_page() {
		
		ps.to_validate_event_partners_page();
	    
	}

	@When("To click visit partner button from event partners page")
	public void to_click_visit_partner_button_from_event_partners_page() {
		
		ps.to_click_visit_partner_button_from_event_partners_page();
	    
	}

	@Then("To validate visit partner page from event partners page")
	public void to_validate_visit_partner_page_from_event_partners_page() throws InterruptedException {
		
		ps.to_validate_visit_partner_page_from_event_partners_page();
	    
	}

	@When("To click association partners link")
	public void to_click_association_partners_link() {
		
		ps.to_click_association_partners_link();
	    
	}

	@Then("To validate association partners page")
	public void to_validate_association_partners_page() {
		
		ps.to_validate_association_partners_page();
	    
	}

	@When("To click visit partner button from association partners page")
	public void to_click_visit_partner_button_from_association_partners_page() {
		
		ps.to_click_visit_partner_button_from_association_partners_page();
	    
	}

	@Then("To validate visit partner page from association partners page")
	public void to_validate_visit_partner_page_from_association_partners_page() throws InterruptedException {
		
		ps.to_validate_visit_partner_page_from_association_partners_page();
	    
	}

	@When("To click media partners link")
	public void to_click_media_partners_link() {
		
		ps.to_click_media_partners_link();
	    
	}

	@Then("To validate media partners page")
	public void to_validate_media_partners_page() {
		
		ps.to_validate_media_partners_page();
	    
	}

	@When("To click visit partner button from media partners page")
	public void to_click_visit_partner_button_from_media_partners_page() {
		
		ps.to_click_visit_partner_button_from_media_partners_page();
	    
	}

	@Then("To validate visit partner page from media partners page")
	public void to_validate_visit_partner_page_from_media_partners_page() throws InterruptedException {
		
		ps.to_validate_visit_partner_page_from_media_partners_page();
	    
	}
}
