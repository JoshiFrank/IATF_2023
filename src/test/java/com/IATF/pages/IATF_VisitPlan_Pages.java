package com.IATF.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_VisitPlan_Pages extends PageObject{

	
	//To click Visit and plan link
	@Step
	public void to_click_visit_and_plan_link() {
		
		$(By.xpath("//button[contains(text(),' Visit & Plan ')]")).click();
	    
	}

	//To validate Visit and plan page
	@Step
	public void to_validate_visit_and_plan_page() {
		
		boolean displayed = $(By.xpath("//strong[contains(text(),'Visit and Plan')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click book Your stay here link
	@Step
	public void to_click_book_your_stay_here_link() {
		
		$(By.xpath("(//span[contains(text(),' book your stay here ')])[1]")).click();
	    
	}

	//To validate the booking page
	@Step
	public void to_validate_the_booking_page() throws InterruptedException {
		
		Thread.sleep(5000);
	   
	}

	//To click find out more discount link
	@Step
	public void to_click_find_out_more_discount_link() {
		
		$(By.xpath("//span[contains(text(),'Find out more on how to recieve your discount')]")).click();
	    
	}

	//To validate airfrance page
	@Step
	public void to_validate_airfrance_page() throws InterruptedException {
		
		Thread.sleep(5000);
	   
	}

	//To click the download document for egypt
	@Step
	public void to_click_the_download_document_for_egypt() {
		
		$(By.xpath("(//span[contains(text(),'Download the list of restricted imports for egypt')])[1]")).click();
	    
	}

	//To validate the download document for egypt
	@Step
	public void to_validate_the_download_document_for_egypt() throws InterruptedException {
		
		Thread.sleep(5000);
	    
	}
}
