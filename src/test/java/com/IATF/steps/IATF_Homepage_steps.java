package com.IATF.steps;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Homepage_pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_Homepage_steps {

	@Managed
	WebDriver driver;

	@Steps

	IATF_Homepage_pages HP;

	@Given("To open the IATF application")
	public void to_open_the_iatf_application() {

		WebDriverManager.chromedriver().setup();

		driver.get("https://www.intrafricantradefair.com/");

		driver.manage().window().maximize();

	}

	@Then("LOGO should be displayed")
	public void logo_should_be_displayed() {
		HP.validatde_IATF_Logo();

	}

	@Then("validate the required language in home page")
	public void validate_the_required_language_in_home_page() {

		HP.validate_the_required_language();

	}

	@Then("validate the required options in home page")
	public void validate_the_required_options_in_home_page() {
		HP.validate_the_required_options();

	}

	@Then("validate the required links in home page")
	public void validate_the_required_links_in_home_page() {
		HP.validate_the_required_links();

	}

}
