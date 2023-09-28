package com.IATF.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;


import com.IATF.pages.IATF_2023Media_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_2023Media_Steps {

	
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_2023Media_Pages mp;
	
	
	
	@When("To click register as a media option")
	public void to_click_register_as_a_media_option() throws InterruptedException {
		
		mp.to_click_register_as_a_media_option();
		
	    
	}
	@Then("Validate the new window for register as a media")
	public void validate_the_new_window_for_register_as_a_media() throws InterruptedException {
		
		mp.validate_the_new_window_for_register_as_a_media();
	    
	}
	@When("Upload profile image for media {string}")
	public void upload_profile_image_for_media(String string) throws InterruptedException, AWTException {
		
		mp.upload_profile_image_for_media(string);
	    
	}
	@When("Select title for media")
	public void select_title_for_media() throws InterruptedException {
		
		mp.select_title_for_media();
	   
	}
	@When("Enter first name for media {string}")
	public void enter_first_name_for_media(String string) {
		
		mp.enter_first_name_for_media(string);
	    
	}
	@When("Enter Last Name for media {string}")
	public void enter_last_name_for_media(String string) {
		
		mp.enter_last_name_for_media(string);
	    
	}
	@When("Enter passport number for media {string}")
	public void enter_passport_number_for_media(String string) {
		
		mp.enter_passport_number_for_media(string);
	    
	}
	@When("Select passport issued date for media")
	public void select_passport_issued_date_for_media() throws InterruptedException {
		
		mp.select_passport_issued_date_for_media();
	    
	}
	@When("Select passport issues by country")
	public void select_passport_issues_by_country() {
		
		mp.select_passport_issues_by_country();
	    
	}
	@When("Upload passport document for media {string}")
	public void upload_passport_document_for_media(String string) throws AWTException, InterruptedException {
		
		mp.upload_passport_document_for_media(string);
	   
	}
	@When("Enter Email Address for media {string}")
	public void enter_email_address_for_media(String string) {
		
		mp.enter_email_address_for_media(string);
	   
	}
	@When("Enter mobile number for media {string}")
	public void enter_mobile_number_for_media(String string) {
		
		mp.enter_mobile_number_for_media(string);
	    
	}
	@When("Click the radio button for media")
	public void click_the_radio_button_for_media() {
		
		mp.click_the_radio_button_for_media();
	   
	}
	@When("Click the privacy statement for media")
	public void click_the_privacy_statement_for_media() {
		
		mp.click_the_privacy_statement_for_media();
	    
	}
	@When("Click terms and condition button for media")
	public void click_terms_and_condition_button_for_media() {
		
		mp.click_terms_and_condition_button_for_media();
	    
	}
	@When("Click next button for media page one")
	public void click_next_button_for_media_page_one() {
		
		mp.click_next_button_for_media_page_one();
	    
	}
	@Then("Validate media registration page two")
	public void validate_media_registration_page_two() throws InterruptedException {
		
		mp.validate_media_registration_page_two();
	    
	}
	@When("Enter the Company name required text box for media {string}")
	public void enter_the_company_name_required_text_box_for_media(String string) {
		
		mp.enter_the_company_name_required_text_box_for_media(string);
	    
	}
	@When("Enter the media designation {string}")
	public void enter_the_media_designation(String string) {
		
		mp.enter_the_media_designation(string);
	    
	}
	@When("Enter the publication name {string}")
	public void enter_the_publication_name(String string) {
		
		mp.enter_the_publication_name(string);
	    
	}
	@When("Enter the Company Address in required text box for media {string}")
	public void enter_the_company_address_in_required_text_box_for_media(String string) {
		
		mp.enter_the_company_address_in_required_text_box_for_media(string, string);
	    
	}
	@When("Enter the City for media {string}")
	public void enter_the_city_for_media(String string) {
		
		mp.enter_the_city_for_media(string);
	   
	}
	@When("Enter the ZIP\\/Postal code for media")
	public void enter_the_zip_postal_code_for_media() {
		
		mp.enter_the_zip_postal_code_for_media();
	    
	}
	@When("Select the Country\\/Region from Dropdown for media")
	public void select_the_country_region_from_dropdown_for_media() throws InterruptedException {
		
		mp.select_the_country_region_from_dropdown_for_media();
	   
	}
	@When("Select the State\\/Province from Dropdown for media")
	public void select_the_state_province_from_dropdown_for_media() {
		
		mp.select_the_state_province_from_dropdown_for_media();
		
	    
	}
	@When("Enter the Telephone number for media {string}")
	public void enter_the_telephone_number_for_media(String string) {
		
		mp.enter_the_telephone_number_for_media(string);
	   
	}
	@When("Enter the Email Address for media mail {string}")
	public void enter_the_email_address_for_media_mail(String string) {
		
		mp.enter_the_email_address_for_media_mail(string);
	    
	}
	@When("Enter the Company website in required text box for media {string}")
	public void enter_the_company_website_in_required_text_box_for_media(String string) {
		
		mp.enter_the_company_website_in_required_text_box_for_media(string);
	    
	}
	@When("Enter about media house")
	public void enter_about_media_house() {
		
		mp.enter_about_media_house();
	    
	}
	@When("Click Publication Language of media")
	public void click_publication_language_of_media() {
		
		mp.click_publication_language_of_media();
	    
	}
	@When("Click audience Target of media")
	public void click_audience_target_of_media() {
		
		mp.click_audience_target_of_media();
	    
	}
	@When("Click audience reach of media")
	public void click_audience_reach_of_media() {
		
		mp.click_audience_reach_of_media();
	    
	}
	@When("Click audience segment of media")
	public void click_audience_segment_of_media() {
		
		mp.click_audience_segment_of_media();
	   
	}
	@When("Enter the facebook url for media {string}")
	public void enter_the_facebook_url_for_media(String string) {
		
		mp.enter_the_facebook_url_for_media(string);
	    
	}
	@When("Enter the twitter for media {string}")
	public void enter_the_twitter_for_media(String string) {
		
		mp.enter_the_twitter_for_media(string);
	    
	}
	@When("Enter the instagram for media {string}")
	public void enter_the_instagram_for_media(String string) {
		
		mp.enter_the_instagram_for_media(string);
	    
	}
	@When("Enter the personal instragram for media {string}")
	public void enter_the_personal_instragram_for_media(String string) {
		
		mp.enter_the_personal_instragram_for_media(string);
	    
	}
	@When("Enter the other detail for media {string}")
	public void enter_the_other_detail_for_media(String string) {
		
		mp.enter_the_other_detail_for_media(string);
	    
	}
	@When("Click next button for media page two")
	public void click_next_button_for_media_page_two() throws InterruptedException {
		
		mp.click_next_button_for_media_page_two();
		
	   
	}
	//----------------------------------------------------------------------------------
	
	

@Then("Validate the media information  page media")
public void validate_the_media_information_page_media() throws InterruptedException {
	
	mp.validate_the_media_information_page_media();
    
}

@When("To Click the attending the IATF2023 media")
public void to_click_the_attending_the_iatf2023_media() {
	
	mp.to_click_the_attending_the_iatf2023_media();
    
}

@When("To Click attending the Trade & Investment Conference media")
public void to_click_attending_the_trade_investment_conference_media() {
	
	mp.to_click_attending_the_trade_investment_conference_media();
    
}

@When("To Click Are you interested in attending CANEX media")
public void to_click_are_you_interested_in_attending_canex_media() {
	
	mp.to_click_are_you_interested_in_attending_canex_media();
    
}

@When("To Click attending the Africa Automotive Show media")
public void to_click_attending_the_africa_automotive_show_media() {
	
	mp.to_click_attending_the_africa_automotive_show_media();
    
}

@When("To Click Are you interested in attending media")
public void to_click_are_you_interested_in_attending_media() {
	
	mp.to_click_are_you_interested_in_attending_media();
    
}

@When("To Click Do you require a TV crew")
public void to_click_do_you_require_a_tv_crew() {
	
	mp.to_click_do_you_require_a_tv_crew();
    
}
@When("Click next button for media page three")
public void click_next_button_for_media_page_three() throws InterruptedException {
	
	mp.click_next_button_for_media_page_three();
	
    
}

@When("Click Submit button in media page four")
public void click_submit_button_in_media_page_four() {
	
	mp.click_submit_button_in_media_page_four();
    
}

@Then("Validate the Registration Proceed media")
public void validate_the_registration_proceed_media() throws InterruptedException {
	
	mp.validate_the_registration_proceed_media();
    
}
	
	
	
	
	
	
	
	
	
	
}
