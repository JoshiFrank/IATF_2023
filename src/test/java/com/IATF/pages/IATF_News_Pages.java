package com.IATF.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_News_Pages extends PageObject{

	
	//To click News link
	@Step
	public void to_click_news_link() {
		
		$(By.xpath("//button[contains(text(),'News')]")).click();
	    
	}

	//To validate News page
	@Step
	public void to_validate_news_page() {
		
		boolean displayed = $(By.xpath("//h1[contains(text(),'All the News')]")).isDisplayed();
		Assert.assertTrue(displayed);
	    
	}

	//To click read option
	@Step
	public void to_click_read_option() {
		
		$(By.xpath("(//a[@class='card-news ng-star-inserted'])[1]")).click();
	    
	}

	//To validate the new news page
	@Step
	public void to_validate_the_new_news_page() throws InterruptedException {
		
		Thread.sleep(5000);
	    
	}
}
