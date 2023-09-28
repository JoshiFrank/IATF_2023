package com.IATF.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_2023Conference_Deligate_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_2023Conference_Deligate_Steps {

	
	
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_2023Conference_Deligate_Pages cdp;
	
	@When("To click register as a conference delegate option")
	public void to_click_register_as_a_conference_delegate_option() throws InterruptedException {
		cdp.to_click_register_as_a_conference_delegate_option();
	   
	}

	@When("Upload profile image for conference delegate {string}")
	public void upload_profile_image_for_conference_delegate(String string) throws InterruptedException, AWTException {
		
		cdp.upload_profile_image_for_conference_delegate(string);
	   
	}

	@When("Select gender for conference delegate")
	public void select_gender_for_conference_delegate() {
		
		cdp.select_gender_for_conference_delegate();
	    
	}

	@When("Select title for conference delegate")
	public void select_title_for_conference_delegate() throws InterruptedException {
		
		cdp.select_title_for_conference_delegate();
	    
	}

	@When("Enter first name for conference delegate {string}")
	public void enter_first_name_for_conference_delegate(String string) {
		
		
			cdp.enter_first_name_for_conference_delegate(string);	
		
		
	}

	@When("Enter Last Name for conference delegate {string}")
	public void enter_last_name_for_conference_delegate(String string) {
		
		cdp.enter_last_name_for_conference_delegate(string);
	    
	}

	@When("Enter Email Address for conference delegate {string}")
	public void enter_email_address_for_conference_delegate(String string) {
		
		cdp.enter_email_address_for_conference_delegate(string);
	    
	}

	@When("Select country code for conference delegate")
	public void select_country_code_for_conference_delegate() {
		
		cdp.select_country_code_for_conference_delegate();
	   
	}

	@When("Enter mobile number for conference delegate {string}")
	public void enter_mobile_number_for_conference_delegate(String string) {
		
		cdp.enter_mobile_number_for_conference_delegate(string);
	    
	}

	@When("Enter passport number for conference delegate {string}")
	public void enter_passport_number_for_conference_delegate(String string) {
		
		cdp.enter_passport_number_for_conference_delegate(string);
	    
	}

	@When("Select passport issued date for conference delegate")
	public void select_passport_issued_date_for_conference_delegate() throws InterruptedException {
		
		cdp.select_passport_issued_date_for_conference_delegate();
	    
	}

	@When("Select passport expiry date for conference delegate")
	public void select_passport_expiry_date_for_conference_delegate() throws InterruptedException {
		
		cdp.select_passport_expiry_date_for_conference_delegate();
	   
	}

	@When("Upload passport document for conference delegate {string}")
	public void upload_passport_document_for_conference_delegate(String string) throws InterruptedException {
		
	    cdp.upload_passport_document_for_conference_delegate(string);
		
	}

	@When("Enter emergency contact name for conference delegate {string}")
	public void enter_emergency_contact_name_for_conference_delegate(String string) {
		
		cdp.enter_emergency_contact_name_for_conference_delegate(string);
	    
	}

	@When("Select emergency contact country code for conference delegate")
	public void select_emergency_contact_country_code_for_conference_delegate() throws InterruptedException {
		
		cdp.select_emergency_contact_country_code_for_conference_delegate();
	    
	}

	@When("Enter emergency contact number for conference delegate {string}")
	public void enter_emergency_contact_number_for_conference_delegate(String string) {
		
		cdp.enter_emergency_contact_number_for_conference_delegate(string);
	    
	}

	@When("Enter emergency contact relationship for conference delegate {string}")
	public void enter_emergency_contact_relationship_for_conference_delegate(String string) {
		
	    cdp.enter_emergency_contact_relationship_for_conference_delegate(string);
		
	}

	@When("Click next button for conference delegate page")
	public void click_next_button_for_conference_delegate_page() {
		
		cdp.click_next_button_for_conference_delegate_page();
	    
	}
	//-------------------------------------------------------------------------------------------------------------


	@When("Enter the Company name required text box conference delegate {string}")
	public void enter_the_company_name_required_text_box_conference_delegate(String string) throws InterruptedException {
		
		cdp.enter_the_company_name_required_text_box_conference_delegate(string);
	    
	}

	@When("Enter the Job title  conference delegate {string}")
	public void enter_the_job_title_conference_delegate(String string) {
		
		cdp.enter_the_job_title_conference_delegate(string);
	   
	}

	@When("Enter the Company Address in required text box conference delegate {string}")
	public void enter_the_company_address_in_required_text_box_conference_delegate(String string) {
		
		cdp.enter_the_company_address_in_required_text_box_conference_delegate(string, string);
	    
	}

	@When("Enter the City conference delegate {string}")
	public void enter_the_city_conference_delegate(String string) {
		
		cdp.enter_the_city_conference_delegate(string);
		
		
	    
	}

	@When("Enter the ZIP\\/Postal code conference delegate")
	public void enter_the_zip_postal_code_conference_delegate() {
		
		cdp.enter_the_zip_postal_code_conference_delegate();
		
		
	    
	}

	@When("Select the Country\\/Region from Dropdown conference delegate")
	public void select_the_country_region_from_dropdown_conference_delegate() throws InterruptedException {
		
		cdp.select_the_country_region_from_dropdown_conference_delegate();
	   
	}

	@When("Select the State\\/Province from Dropdown conference delegate")
	public void select_the_state_province_from_dropdown_conference_delegate() {
		
		cdp.select_the_state_province_from_dropdown_conference_delegate();
	   
	}

	@When("Enter the Company website in required text box conference delegate {string}")
	public void enter_the_company_website_in_required_text_box_conference_delegate(String string) {
		
		cdp.enter_the_company_website_in_required_text_box_conference_delegate(string);
		
		
	    
	}

	@When("Enter the Telephone number\\(office\\/landline) conference delegate {string}")
	public void enter_the_telephone_number_office_landline_conference_delegate(String string) {
		
		cdp.enter_the_telephone_number_office_landline_conference_delegate(string);
	    
	}

	@When("Select the Country of principle office from the Dropdown conference delegate")
	public void select_the_country_of_principle_office_from_the_dropdown_conference_delegate() {
		
		cdp.select_the_country_of_principle_office_from_the_dropdown_conference_delegate();
	   
	}

	@When("Select the Country of Head office from the Dropdown conference delegate")
	public void select_the_country_of_head_office_from_the_dropdown_conference_delegate() throws InterruptedException {
		
		cdp.select_the_country_of_head_office_from_the_dropdown_conference_delegate();
	   
	}

	@When("Enter the Alternate Contact Name conference delegate {string}")
	public void enter_the_alternate_contact_name_conference_delegate(String string) {
		
		cdp.enter_the_alternate_contact_name_conference_delegate(string);
	    
	}

	@When("Enter the Alternate Contact Number conference delegate {string}")
	public void enter_the_alternate_contact_number_conference_delegate(String string) {
		
		cdp.enter_the_alternate_contact_number_conference_delegate(string);
	    
	}

	@When("Enter the Alternate Email Address conference delegate {string}")
	public void enter_the_alternate_email_address_conference_delegate(String string) {
		
		cdp.enter_the_alternate_email_address_conference_delegate(string);
	    
	}

	@When("Click the Required Radio button for Eastern Africa")
	public void click_the_required_radio_button_for_eastern_africa() {
		
		cdp.click_the_required_radio_button_for_eastern_africa();
	   
	}

	@When("Click next button for conference delegate two")
	public void click_next_button_for_conference_delegate_two() throws InterruptedException {
		
		cdp.click_next_button_for_conference_delegate_two();
	    
	}

	
	//---------------------------------------------------------------------------------------------------------
	
	@When("Select the Size of your Company from Dropdown conference delegate")
	public void select_the_size_of_your_company_from_dropdown_conference_delegate() throws InterruptedException {
		
		cdp.select_the_size_of_your_company_from_dropdown_conference_delegate();
	    
	}

	@When("Select Parchasing amount of your Company from Dropdown conference delegate")
	public void select_parchasing_amount_of_your_company_from_dropdown_conference_delegate() throws InterruptedException {
		
		cdp.select_parchasing_amount_of_your_company_from_dropdown_conference_delegate();
	    
	}

	@When("Select Annual turnover of your Company conference delegate")
	public void select_annual_turnover_of_your_company_conference_delegate() throws InterruptedException {
		
		cdp.select_annual_turnover_of_your_company_conference_delegate();
	    
	}

	@When("Click Required Business Objectives conference delegate")
	public void click_required_business_objectives_conference_delegate() {
		
		cdp.click_required_business_objectives_conference_delegate();
	    
	}

	@When("Click next button for conference delegate Three")
	public void click_next_button_for_conference_delegate_Three() throws InterruptedException {
		
		cdp.click_next_button_for_conference_delegate_Three();
	    
	}
	//---------------------------------------------------------------------------------------------------------
	
	@When("Select the Required sessions you'd like to attend conference delegate")
	public void select_the_required_sessions_you_d_like_to_attend_conference_delegate() {
		
		cdp.select_the_required_sessions_you_d_liketoattendconference_delegate();
	    
	}

	@When("Click next button for conference delegate four")
	public void click_next_button_for_conference_delegate_four() throws InterruptedException {
		
		cdp.click_next_button_for_conference_delegate_four();
	    
	}

	//---------------------------------------------------------------------------------------------------------
	
	@When("Click Submite button conference delegate five")
	public void click_submite_button_conference_delegate_five() {
		
		cdp.click_submite_button_conference_delegate_five();
	    
	}
	
	//---------------------------------------------------------------------------------------------------------
	
	@Then("Validate the Registration successfull conference delegate")
	public void validate_the_registration_successfull_conference_delegate() throws InterruptedException {
		
		cdp.validate_the_registration_successfull_conference_delegate();
	    
	}



}
