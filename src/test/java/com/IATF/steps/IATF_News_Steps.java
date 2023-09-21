package com.IATF.steps;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_News_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_News_Steps {

	@Managed
	WebDriver driver;
	
	@Steps
	IATF_News_Pages np;
	
	@When("To click News link")
	public void to_click_news_link() {
		
		np.to_click_news_link();
	    
	}

	@Then("To validate News page")
	public void to_validate_news_page() {
		
		np.to_validate_news_page();
	    
	}

	@When("To click read option")
	public void to_click_read_option() {
		
		np.to_click_read_option();
	    
	}

	@Then("To validate the new news page")
	public void to_validate_the_new_news_page() throws InterruptedException {
		
		np.to_validate_the_new_news_page();
	    
	}
}
