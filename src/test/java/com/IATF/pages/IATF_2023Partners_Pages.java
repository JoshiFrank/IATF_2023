package com.IATF.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_2023Partners_Pages extends PageObject {
	
	
	//To click IATF partners button
	@Step
	public void to_click_iatf_partners_button() {
		
		$(By.xpath("//button[contains(text(),'IATF2023 Partners')]")).click();
	    
	}

	//To click IATF partners link
	@Step
	public void to_click_iatf_partners_link() {
		
		$(By.xpath("//span[contains(text(),'View our IATF2023 Partners')]")).click();
	    
	}

	//To validate the IATF partners page
	@Step
	public void to_validate_the_iatf_partners_page() {
		
		boolean displayed = $(By.xpath("//h5[contains(text(),'IATF2023')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click enquire today link
	@Step
	public void to_click_enquire_today_link() {
		
		$(By.xpath("//span[contains(text(),'ENQUIRE TODAY')]")).click();
	    
	}

	//To validate enquire today page
	@Step
	public void to_validate_enquire_today_page() throws InterruptedException {
		
		Thread.sleep(5000);
		getDriver().close();
	    
	}

	//To click media partner link
	@Step
	public void to_click_media_partner_link() {
		
		$(By.xpath("//span[contains(text(),'Click here to discover more about OFFICIAL Media partners')]")).click();
	    
	}

	//To validate the media partner page
	@Step
	public void to_validate_the_media_partner_page() {
		
		
	  
	}

	//To click official partner link
	@Step
	public void to_click_official_partner_link() {
	    
	}

	//To validate official partner page
	@Step
	public void to_validate_official_partner_page() {
	    
	}

	//To click official partners link
	@Step
	public void to_click_official_partners_link() {
		
		$(By.xpath("//span[contains(text(),'Official Partners')]")).click();
	    
	}

	//To validate official partners page
	@Step
	public void to_validate_official_partners_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'Official Partners')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click visit partner button from official partners page
	@Step
	public void to_click_visit_partner_button_from_official_partners_page() {
		
		$(By.xpath("//span[contains(text(),'VISIT PARTNER')]")).click();
	    
	}

	//To validate visit partner page from official partners page
	@Step
	public void to_validate_visit_partner_page_from_official_partners_page() throws InterruptedException {
		
		Thread.sleep(5000);
	    
	}

	//To click event partners link
	@Step
	public void to_click_event_partners_link() {
		
		$(By.xpath("//span[contains(text(),'Event Partners')]")).click();
	    
	}

	//To validate event partners page
	@Step
	public void to_validate_event_partners_page() {
		
		boolean displayed = $(By.xpath("//h2[contains(text(),'Event Partners')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click visit partner button from event partners page
	@Step
	public void to_click_visit_partner_button_from_event_partners_page() {
		
		$(By.xpath("(//span[contains(text(),'Visit Partner')])[1]")).click(); 
	    
	}

	//To validate visit partner page from event partners page
	@Step
	public void to_validate_visit_partner_page_from_event_partners_page() throws InterruptedException {
		
		Thread.sleep(5000);
		getDriver().close();
		
	    
	}

	//To click association partners link
	@Step
	public void to_click_association_partners_link() {
		
		$(By.xpath("//span[contains(text(),'Association Partners')]")).click();
	    
	}

	//To validate association partners page
	@Step
	public void to_validate_association_partners_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'Association Partners')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click visit partner button from association partners page
	@Step
	public void to_click_visit_partner_button_from_association_partners_page() {
		
		$(By.xpath("(//span[contains(text(),'VISIT PARTNER')])[1]")).click();
	    
	}

	//To validate visit partner page from association partners page
	@Step
	public void to_validate_visit_partner_page_from_association_partners_page() throws InterruptedException {
		
		Thread.sleep(5000);
		getDriver().close();
	    
	}

	//To click media partners link
	@Step
	public void to_click_media_partners_link() {
		
		$(By.xpath("//span[contains(text(),'Media Partners')]")).click();
	    
	}

	//To validate media partners page
	@Step
	public void to_validate_media_partners_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'Media Partners')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click visit partner button from media partners page
	@Step
	public void to_click_visit_partner_button_from_media_partners_page() {
		
		$(By.xpath("(//span[contains(text(),'VISIT PARTNER')])[1]")).click();
	    
	}

	//To validate visit partner page from media partners page
	@Step
	public void to_validate_visit_partner_page_from_media_partners_page() throws InterruptedException {
		
		Thread.sleep(5000);
	    
	}
}
