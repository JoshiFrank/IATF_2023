package com.IATF.steps;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_7day_Programme_Page;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_7day_Programme_Steps {

	@Managed
	WebDriver driver;
	
	@Steps
	IATF_7day_Programme_Page dp;
	
	@When("To click the seven day programme Link")
	public void to_click_the_seven_day_programme_link() throws InterruptedException {
	    
		dp.to_Click_the_seven_day_programme_link();
	}

	@Then("Validate the seven day programme page")
	public void validate_the_seven_day_programme_page() throws InterruptedException {
	    
		dp.validate_the_seven_day_programme_page();
	}

	@Then("Validate the day one programme details")
	public void validate_the_day_one_programme_details() {
	   
		dp.validate_the_day_one_programme_details();
	}

	@Then("Validate the day two programme details")
	public void validate_the_day_two_programme_details() {
	   
		dp.validate_the_day_two_programme_details();
	}

	@Then("Validate the day three programme details")
	public void validate_the_day_three_programme_details() {
	   
		dp.validate_the_day_three_programme_details();
	}

	@Then("Validate the day four programme details")
	public void validate_the_day_four_programme_details() {
		
	    dp.validate_the_day_four_programme_details();
	}

	@When("To download the programme PDF of African Automative Forum")
	public void to_download_the_programme_pdf_of_african_automative_forum() {
	  
		dp.to_download_the_programme_pdf_of_african_automative_forum();
	}

	@Then("Validate the programme PDF of African Automative Forum")
	public void validate_the_programme_pdf_of_african_automative_forum() throws InterruptedException {
	    
		dp.validate_the_programme_pdf_of_african_automative_forum();
	}

	@Then("Validate the day five programme details")
	public void validate_the_day_five_programme_details() {
	   
		dp.validate_the_day_five_programme_details();
	}

	@Then("Validate the day six programme details")
	public void validate_the_day_six_programme_details() {
	   
		dp.validate_the_day_six_programme_details();
	}

	@Then("To download the programme PDF of Trade and Investment Conference")
	public void to_download_the_programme_pdf_of_trade_and_investment_conference() {
	  
	}

	@When("Validate the programme PDF of Trade and Investment Conference")
	public void validate_the_programme_pdf_of_trade_and_investment_conference() {
	   
		dp.to_download_the_programme_pdf_of_trade_and_investment_conference();
	}

	@Then("Validate the day seven programme details")
	public void validate_the_day_seven_programme_details() throws InterruptedException {
	  
		dp.validate_the_day_seven_programme_details();
	}	
	
}
