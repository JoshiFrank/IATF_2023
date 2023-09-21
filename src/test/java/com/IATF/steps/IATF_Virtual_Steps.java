package com.IATF.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Virtual_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_Virtual_Steps {
	
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_Virtual_Pages vps;
	
	
	@When("To click IATF virtual button")
	public void to_click_iatf_virtual_button() {
		
		vps.to_click_iatf_virtual_button();
	    
	}

	@When("To click IATF virtual link")
	public void to_click_iatf_virtual_link() {
		
		vps.to_click_iatf_virtual_link();
	    
	}

	@Then("Validate the IATF virtual page")
	public void validate_the_iatf_virtual_page() {
		
		vps.validate_the_iatf_virtual_page();
	    
	}

	@When("To click book your virtual booth here link")
	public void to_click_book_your_virtual_booth_here_link() {
		
		vps.to_click_book_your_virtual_booth_here_link();
	   
	}

	@Then("To validate book your virtual booth here")
	public void to_validate_book_your_virtual_booth_here() throws InterruptedException {
		
		vps.to_validate_book_your_virtual_booth_here();
	    
	}

	@When("To click already registered login link")
	public void to_click_already_registered_login_link() {
		
		vps.to_click_already_registered_login_link();
	    
	}

	@Then("To validate already registered login page")
	public void to_validate_already_registered_login_page() throws InterruptedException {
		
		vps.to_validate_already_registered_login_page();
	    
	}

	@When("to click get your virtual booth link")
	public void to_click_get_your_virtual_booth_link() {
		
		vps.to_click_get_your_virtual_booth_link();
	    
	}

	@Then("To validate get your virtual booth")
	public void to_validate_get_your_virtual_booth() throws InterruptedException {
		
		vps.to_validate_get_your_virtual_booth();
	   
	}

	@When("to click create your IATF account for free link")
	public void to_click_create_your_iatf_account_for_free_link() {
		
		vps.to_click_create_your_iatf_account_for_free_link();
	   
	}

	@Then("To validate create your IATF account for free page")
	public void to_validate_create_your_iatf_account_for_free_page() throws InterruptedException {
		
		vps.to_validate_create_your_iatf_account_for_free_page();
	}
//--------------------------------------------------------------------------------------------------------------	

	@When("To click success stories link")
	public void to_click_success_stories_link() {
		
		vps.to_click_success_stories_link();
	    
	}

	@Then("Validate the success stories page")
	public void validate_the_success_stories_page() {
		
		vps.validate_the_success_stories_page();
	    
	}

	@Then("Validate all the success stories")
	public void validate_all_the_success_stories() throws InterruptedException, AWTException {
		
		vps.validate_all_the_success_stories();
	    
	}

	
}
