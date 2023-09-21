package com.IATF.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_Homepage_pages extends PageObject{
	
	
	//To validate the IATF Application LOGO
	
	@Step
	public void validatde_IATF_Logo() {
		boolean logo = $(By.xpath("//a[@class='logo']")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	
	
	
	//To validate the home page TOP options
	
	
	//validate the languages
	@Step
	public void validate_the_required_language() {
		
		boolean English = $(By.xpath("//a[text()='English']")).isDisplayed();
	Assert.assertTrue(English);	
	
		boolean Francias = $(By.xpath("//a[text()='Français']")).isDisplayed();
	Assert.assertTrue(Francias);
	
		boolean Other = $(By.xpath("//a[text()='العربية']")).isDisplayed();
	Assert.assertTrue(Other);
	}
	
	//validate the homepage options
	@Step
	public void validate_the_required_options() {
		boolean Whyattend = $(By.xpath("//button[text()=' Why Attend ']")).isDisplayed();
		Assert.assertTrue(Whyattend);
		
		boolean sevenday = $(By.xpath("//button[text()=' 7 Day Programme ']")).isDisplayed();
		Assert.assertTrue(sevenday);
		
		boolean exhibitor = $(By.xpath("//button[text()=' Exhibitors ']")).isDisplayed();
		Assert.assertTrue(exhibitor);
		
		boolean Explore = $(By.xpath("//button[text()=' Explore ']")).isDisplayed();
		Assert.assertTrue(Explore);	
		
		boolean IATFVirtual = $(By.xpath("//button[text()=' IATF Virtual ']")).isDisplayed();
		Assert.assertTrue(IATFVirtual);
		
		boolean Partners = $(By.xpath("//button[text()=' IATF2023 Partners ']")).isDisplayed();
		Assert.assertTrue(Partners);
		
		boolean visitplan = $(By.xpath("//button[text()=' Visit & Plan ']")).isDisplayed();
		Assert.assertTrue(visitplan);
		
		boolean news = $(By.xpath("//button[text()=' News ']")).isDisplayed();
		Assert.assertTrue(news);
		
		boolean rtov = $(By.xpath("//a[text()='Register to visit']")).isDisplayed();
		Assert.assertTrue(rtov);
		
		boolean rtoe = $(By.xpath("//a[text()='Register to exhibit']")).isDisplayed();
		Assert.assertTrue(rtoe);
		
		
	}
	
	
	//validate the homepage links
	@Step
	public void validate_the_required_links() {
		
		boolean login = $(By.xpath("//a[text()=' Log in ']")).isDisplayed();
		Assert.assertTrue(login);
		
		boolean BROCHURE = $(By.xpath("//span[text()='DOWNLOAD THE BROCHURE']")).isDisplayed();
		Assert.assertTrue(BROCHURE);
		
		boolean RtoV = $(By.xpath("//span[text()='REGISTER TO VISIT']")).isDisplayed();
		Assert.assertTrue(RtoV);
		
		boolean RtoE = $(By.xpath("//span[text()='REGISTER TO EXHIBIT']")).isDisplayed();
		Assert.assertTrue(RtoE); 
	}
	}
