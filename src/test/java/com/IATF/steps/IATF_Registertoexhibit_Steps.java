package com.IATF.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Registertoexhibit_Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_Registertoexhibit_Steps {

	@Managed
	WebDriver driver;

	@Steps
	IATF_Registertoexhibit_Pages ip;

	@Given("Open the IATF application")
	public void open_the_iatf_application() {

		driver.get("https://www.intrafricantradefair.com/en");
		driver.manage().window().maximize();

	}

	@When("To click Register To exhibit option")
	public void to_click_register_to_exhibit_option() {

		ip.Click_RegistertoExhibit();

	}

	@When("To select the title")
	public void to_select_the_title() throws InterruptedException {

		ip.Select_Title("Dr");

	}

	@When("To enter the firstname {string}")
	public void to_enter_the_firstname(String string) {

		ip.Enter_Firstname(string);

	}

	@When("To enter the last name {string}")
	public void to_enter_the_last_name(String string) {

		ip.Enter_lastname(string);

	}

	@When("To enter the company {string}")
	public void to_enter_the_company(String string) throws AWTException, InterruptedException {

		ip.Enter_company(string);

	}

	@When("To select the country")
	public void to_select_the_country() throws AWTException {

		ip.Select_country(99);

	}

	@When("To enter phone number {string}")
	public void to_enter_phone_number(String string) throws AWTException {

		ip.Enter_phonenumber(string);

	}

	@When("To enter Mobilenumber {string}")
	public void to_enter_mobilenumber(String string) {

		ip.Enter_Mobilenumber(string);

	}

	@When("To enter email {string}")
	public void to_enter_email(String string) {

		ip.Enter_email(string);

	}

	@When("To enter Website {string}")
	public void to_enter_website(String string) {

		ip.Enter_Website(string);

	}

	@When("To select the industry")
	public void to_select_the_industry() {

		ip.Select_Industry(2);

	}

	@When("To select the intrests area")
	public void to_select_the_intrests_area() {

		ip.Select_Interests_area(2);

	}

	@When("To click the checkbox")
	public void to_click_the_checkbox() {

		ip.Click_checkbox();

	}

	@When("To click SubmitButton")
	public void to_click_submit_button() {

		ip.Click_Submit();

	}

	@Then("To verify thankyou page")
	public void to_verify_thankyou_page() throws AWTException, InterruptedException {

		ip.Verify_thankyou_page();

	}

}
