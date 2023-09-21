package com.IATF.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class IATF_Virtual_Pages extends PageObject {
	
	
	//To click IATF virtual button
	@Step
	public void to_click_iatf_virtual_button() {
		
	$(By.xpath("//button[contains(text(),'IATF Virtual')]")).click();
		
		
	    
	}
	
	//To click IATF virtual link
	@Step
	public void to_click_iatf_virtual_link() {
		
		$(By.xpath("(//span[contains(text(),'IATF Virtual')])[3]")).click();
	    
	}

	//To Validate the IATF virtual page
	@Step
	public void validate_the_iatf_virtual_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'IATF Virtual')]")).isDisplayed();
		Assert.assertTrue(displayed);
		
	    
	}

	//To click book your virtual booth here link
	@Step
	public void to_click_book_your_virtual_booth_here_link() {
		
		$(By.xpath("//span[contains(text(),'Book your virtual booth here')]")).click();
	   
	}

	//To validate book your virtual booth here
	@Step
	public void to_validate_book_your_virtual_booth_here() throws InterruptedException {
		
		Thread.sleep(5000);
		getDriver().quit();
	    
	}

	//To click already registered login link
	@Step
	public void to_click_already_registered_login_link() {
		
		$(By.xpath("//span[contains(text(),'Already registered? Login')]")).click();
	    
	}

	//To validate already registered login page
	@Step
	public void to_validate_already_registered_login_page() throws InterruptedException {
		
		Thread.sleep(5000);
	    
	}

	//To click get your virtual booth link
	@Step
	public void to_click_get_your_virtual_booth_link() {
		
		$(By.xpath("//span[contains(text(),'GET YOUR VIRTUAL BOOTH')]")).click();
	    
	}

	//To validate get your virtual booth
	@Step
	public void to_validate_get_your_virtual_booth() throws InterruptedException {
		
		Thread.sleep(5000);
		getDriver().close();
	   
	}

	//To click create your IATF account for free link
	@Step
	public void to_click_create_your_iatf_account_for_free_link() {
		
		$(By.xpath("//span[contains(text(),'CREATE YOUR IATF virtual ACCOUNT FOR FREE')]")).click();
	   
	}

	//To validate create your IATF account for free page
	@Step
	public void to_validate_create_your_iatf_account_for_free_page() throws InterruptedException {
		
		Thread.sleep(5000);
		
		
	    
	}
//-------------------------------------------------------------------------------------------------------------------
	//To click success stories link
	@Step
	public void to_click_success_stories_link() {
		
		$(By.xpath("//span[contains(text(),'Success stories')]")).click(); 
	    
	}

	//Validate the success stories page
	@Step
	public void validate_the_success_stories_page() {
		
		boolean displayed = $(By.xpath("//h5[contains(text(),'Success stories')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//Validate all the success stories
	@Step
	public void validate_all_the_success_stories() throws InterruptedException, AWTException {
		
		Thread.sleep(5000);
		for (int i = 0; i < 40; i++) {
			
			Robot rbt=new Robot();
			rbt.keyPress(KeyEvent.VK_DOWN);
			rbt.keyRelease(KeyEvent.VK_DOWN);
			
		}
		Thread.sleep(5000);
	}
}
