package com.IATF.steps;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Virtual_Pages;
import com.IATF.pages.IATF_VisitPlan_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_VisitPlan_Steps {
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_VisitPlan_Pages vpp;
	
	
	@When("To click Visit and plan link")
	public void to_click_visit_and_plan_link() {
		
		vpp.to_click_visit_and_plan_link();
	    
	}

	@Then("To validate Visit and plan page")
	public void to_validate_visit_and_plan_page() {
		
		vpp.to_validate_visit_and_plan_page();
	    
	}

	@When("To click book Your stay here link")
	public void to_click_book_your_stay_here_link() {
		
		vpp.to_click_book_your_stay_here_link();
		    
	    
	}

	@Then("To validate the booking page")
	public void to_validate_the_booking_page() throws InterruptedException {
		
		vpp.to_validate_the_booking_page();
	   
	}

	@When("To click find out more discount link")
	public void to_click_find_out_more_discount_link() {
		
		vpp.to_click_find_out_more_discount_link();
	    
	}

	@Then("To validate airfrance page")
	public void to_validate_airfrance_page() throws InterruptedException {
		
		vpp.to_validate_airfrance_page();
	   
	}

	@When("To click the download document for egypt")
	public void to_click_the_download_document_for_egypt() {
		
		vpp.to_click_the_download_document_for_egypt();
	    
	}

	@Then("To validate the download document for egypt")
	public void to_validate_the_download_document_for_egypt() throws InterruptedException {
		
		vpp.to_validate_the_download_document_for_egypt();
	    
	}

	
	
}
