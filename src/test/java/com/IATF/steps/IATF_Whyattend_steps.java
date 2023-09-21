package com.IATF.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Whyattend_pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_Whyattend_steps {
	
	
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_Whyattend_pages wa;
	
	
	@When("To click the Why attend option")
	public void to_click_the_why_attend_option() throws InterruptedException {
		
		wa.toclick_thewhyattendoption();
	    
	}

	@Then("Validate the Why attend page")
	public void validate_the_why_attend_page() {
		
		wa.validate_whyattendpage();
	    
	}

	@Then("Validate the Why attend five reason banner")
	public void validate_the_why_attend_five_reason_banner() {
		
		wa.validate_five_reason_banner();
	   
	}

	@Then("validate five banners")
	public void validate_five_banners() {
		
		wa.validate_five_banners();
	    
	}

	@Then("validate dont miss your moment banner")
	public void validate_dont_miss_your_moment_banner() throws AWTException, InterruptedException {
		
	
		wa.validate_dontmissyour_momentbanner();
	    
	}
	
	//-------------------------------------------------------------------------------------------------------------------

	//registration of visitor
	
	@Then("To click register to visit button")
	public void to_click_register_to_visit_button() {
		
		wa.to_clickregister_tovisitbutton();
	    
	}

	@Then("Validate register to visit page")
	public void validate_register_to_visit_page() {
		
		wa.validate_registertovisitpage();
	    
	}

	@Then("To click register as a visitor option")
	public void to_click_register_as_a_visitor_option() throws InterruptedException {
		
		wa.to_clickregister_as_a_visitoroption();
	    
	}

	@Then("Validate the new window for register as a visitor")
	public void validate_the_new_window_for_register_as_a_visitor() throws InterruptedException {
		
		wa.validatethe_new_windowforregisteras_visitor();
	    
	}

	@Then("Upload profile image for visitor {string}")
	public void upload_profile_image_for_visitor(String string) throws AWTException, InterruptedException {
		
		wa.upload_profile_image_forvisitor();
	   
	}

	@Then("Select gender for visitor")
	public void select_gender_for_visitor() {
		
		wa.selectgenderforvisitor();
	   
	}

	@Then("Select title for visitor")
	public void select_title_for_visitor() throws AWTException, InterruptedException {
		
		wa.selecttitleforvisitor();
	    
	}

	@Then("Enter first name for visitor {string}")
	public void enter_first_name_for_visitor(String string) throws InterruptedException {
		
		wa.enterfirstnameforvisitor(string);
	    
	}

	@Then("Enter Last Name for visitor {string}")
	public void enter_last_name_for_visitor(String string) {
		
		wa.enterlastnameforvisitor(string);
	    
	}

	@Then("Select DOB for visitor")
	public void select_dob_for_visitor() throws InterruptedException {
		
		wa.selectdobforvisitor();
	    
	}

	@Then("Select Language for visitor")
	public void select_language_for_visitor() throws AWTException, InterruptedException {
		
		wa.selectlanguageforvisitor();
	    
	}

	@Then("Enter Email Address for visitor {string}")
	public void enter_email_address_for_visitor(String string) {
		
		wa.enteremailaddressforvisitor(string);
	    
	}

	@Then("Select country code for visitor")
	public void select_country_code_for_visitor() throws AWTException, InterruptedException {
		
		wa.selectcountrycodeforvisitor();
	    
	}

	@Then("Enter mobile number for visitor {string}")
	public void enter_mobile_number_for_visitor(String string) {
		
		wa.entermobilenumberforvisitor(string);
	   
	}

	@Then("Enter passport number for visitor {string}")
	public void enter_passport_number_for_visitor(String string) {
		
		wa.enterpassportnumberfor_visitor(string);
	    
	}

	@Then("Select passport issued date for visitor")
	public void select_passport_issued_date_for_visitor() throws InterruptedException {
		
		wa.selectpassportissueddateforvisitor();
	    
	}

	@Then("Select passport expiry date for visitor")
	public void select_passport_expiry_date_for_visitor() throws InterruptedException {
		
		wa.selectpassportexpirydateforvisitor();
	   
	}


	@Then("Upload passport document for visitor {string}")
	public void upload_passport_document_for_visitor(String string) throws InterruptedException, AWTException {
		
		wa.uploadpassportdocumentforvisitor();
	    
	}

	@Then("Enter emergency contact name for visitor {string}")
	public void enter_emergency_contact_name_for_visitor(String string) {
		
		wa.enteremergencycontactnameforvisitor(string);
	    
	}

	@Then("Select emergency contact country code for visitor")
	public void select_emergency_contact_country_code_for_visitor() throws AWTException, InterruptedException {
		
		wa.selectemergencycontactcountrycodeforvisitor();
	    
	}

	@Then("Enter emergency contact number for visitor {string}")
	public void enter_emergency_contact_number_for_visitor(String string) {
		
		wa.enteremergencycontactnumberforvisitor(string);
	    
	}

	@Then("Enter emergency contact relationship for visitor {string}")
	public void enter_emergency_contact_relationship_for_visitor(String string) {
		
		wa.enteremergencycontactrelationshipforvisitor(string);
	    
	}

	@Then("Click next button for visitor page")
	public void click_next_button_for_visitor_page() throws InterruptedException {
		
		wa.clicknextbuttonforvisitorpage();
	    
	}

	@Then("Validate visitor registration page two")
	public void validate_visitor_registration_page_two() throws InterruptedException {
		
		wa.validatevisitorregistrationpagetwo();
	    
	}

	

	@When("Enter the Company name required text box {string}")
	public void enter_the_company_name_required_text_box(String string) {
	    wa.enter_companyname_requiredtext_box(string);
	}

	@When("Enter the Job title {string}")
	public void enter_the_job_title(String string) {
	    
		wa.enter_the_job_title(string);
	}

	@When("Enter the Company Address in required text box {string}")
	public void enter_the_company_address_in_required_text_box(String string) {
		
	    wa.enter_companyaddress_inrequiredtextbox(string, string);
	}

	@When("Enter the City {string}")
	public void enter_the_city(String string) {
	    wa.enter_the_city(string);
	}

	@When("Enter the ZIP\\/Postal code")
	public void enter_the_zip_postal_code() {
	    
		wa.enter_the_zip_postal_code("543216");
	}

	@When("Select the Country\\/Region from Dropdown")
	public void select_the_country_region_from_dropdown() {
	    
		wa.select_countryregion_fromdropdown();
	}

	@When("Select the State\\/Province from Dropdown")
	public void select_the_state_province_from_dropdown() {
		wa.select_the_stateprovince_fromdropdown();
	    
	}

	@When("Enter the Company website in required text box {string}")
	public void enter_the_company_website_in_required_text_box(String string) {

		wa.enter_the_companywebsite_in_requiredtextbox(string);
	}

	@When("Enter the Telephone number\\(office\\/landline) {string}")
	public void enter_the_telephone_number_office_landline(String string) {
		
		wa.enter_the_telephone_number(string);
	    
	}

	@When("Select the Country of principle office from the Dropdown")
	public void select_the_country_of_principle_office_from_the_dropdown() {
		
		wa.select_the_country_of_principle_office_from_the_dropdown();
	    
	}

	@When("Select the Country of Head office from the Dropdown")
	public void select_the_country_of_head_office_from_the_dropdown() {
		
		wa.select_the_country_of_head_office_from_the_dropdown();
	    
	}

	@When("Enter the Alternate Email Address {string}")
	public void enter_the_alternate_email_address(String string) {
		
		wa.enter_the_alternate_email_address(string);
	    
	}

	@When("Enter the Alternate Contact Name {string}")
	public void enter_the_alternate_contact_name(String string) {
		
		wa.enter_the_alternate_contact_name(string);
	    
	}

	@When("Enter the Alternate Contact Number {string}")
	public void enter_the_alternate_contact_number(String string) {
		
		wa.enter_the_alternate_contact_number(string);
	    
	}

	@When("Click the Required Radio button for What is your purchasing power Queation")
	public void click_the_required_radio_button_for_what_is_your_purchasing_power_queation() {
		
		wa.click_the_required_radio_button_purchasing_power_queation();
	    
	}

	@When("Click the Required Radio button for What are your motivations for visiting")
	public void click_the_required_radio_button_for_what_are_your_motivations_for_visiting() {
		
		wa.click_the_required_radio_button_motivations_for_visiting();
	    
	}

	@When("Click the Required Radio button for What are the main geographical regions that you are interested in")
	public void click_the_required_radio_button_for_what_are_the_main_geographical_regions_that_you_are_interested_in() throws InterruptedException {
		
		wa.click_the_required_radio_button_main_geographical_regions();
		
	
		    }
	@When("Click next button for visitor page2")
	public void click_next_button_for_visitor_page2() {
			
			wa.clicknextbuttonforvisitorpage2();

	    
	}

	@Then("Validate the User Navigate to the BUSINESS INFORMATION page")
	public void validate_the_user_navigate_to_the_business_information_page() throws InterruptedException {
		
		wa.validate_the_user_navigate_business_information_page();
	    
	}

	@When("Select the Size of your Company from Dropdown")
	public void select_the_size_of_your_company_from_dropdown() {
		
		wa.select_the_size_of_your_company_from_dropdown();
	    
	}

	@When("Click the Required Radio button for What is the main activity of your company")
	public void click_the_required_radio_button_for_what_is_the_main_activity_of_your_company() {
		
		wa.click_the_required_radio_button_mainactivitycompany();
	    
	}

	@When("Select your position in company from the Dropdown")
	public void select_your_position_in_company_from_the_dropdown() {
		
		wa.select_your_position_in_company_from_the_dropdown();
	    
	}

	@When("Select Parchasing amount of your Company from Dropdown")
	public void select_parchasing_amount_of_your_company_from_dropdown() {
		
		wa.select_parchasing_amount_of_your_company_from_dropdown();
	    
	}

	@When("Select Annual turnover of your Company")
	public void select_annual_turnover_of_your_company() {
		
		wa.select_annual_turnover_of_your_company();
	    
	}

	@When("Click Required Business Objectives")
	public void click_required_business_objectives() throws InterruptedException {
		
		wa.click_required_business_objectives();
	    
	}
	
	@When("Click next button for visitor page3")
	public void click_next_button_for_visitor_page3() {
			
			wa.clicknextbuttonforvisitorpage3();
			
	}

	@Then("User Navigate to registration for iatf2023")
	public void user_navigate_to_registration_for_iatf2023() {
		
		wa.user_navigate_to_registration_for_iatf2023();
	    
	}

	@When("Select the Required sessions you'd like to attend")
	public void select_the_required_sessions_you_d_like_to_attend() {
		
		wa.select_the_required_sessions_like_to_attend();
	    
	}

	@When("Click the required Answare for Online Diary and Virtual Trade Fair Admissions Policy")
	public void click_the_required_answare_for_online_diary_and_virtual_trade_fair_admissions_policy() {
		
		wa.click_the_requiredansware_for_onlinediaryandvirtualtradefairadmissionspolicy();
	    
	}

	@When("Click the Admission Policy Check box")
	public void click_the_admission_policy_check_box() {
		
		wa.click_the_admission_policy_check_box();
	    
	}

	@When("Click InviteOthers")
	public void click_invite_others() {
		
		wa.click_invite_others();
	    
	}

	@Then("Validate the Invite Others popup")
	public void validate_the_invite_others_popup() throws InterruptedException {
		
		wa.validate_the_invite_others_popup();
	    
	}

	@When("Enter the Required Details for Invite Others")
	public void enter_the_required_details_for_invite_others() {
		
		wa.enter_the_required_details_for_invite_others();
	    
	}

	@When("Click the AddInvitee Button")
	public void click_the_add_invitee_button() {
		
		wa.click_the_add_invitee_button();
	    
	}

	@When("Click Confirm Invite Button")
	public void click_confirm_invite_button() throws InterruptedException {
		
		wa.click_confirm_invite_button();
	    
	}

	@Then("Validate the Invitation Ready PopUp Shoulde be Displayed")
	public void validate_the_invitation_ready_pop_up_shoulde_be_displayed() throws InterruptedException {
		
		wa.validate_the_invitationready_popup_shouldebedisplayed();
	    
	}

	@When("Click next button")
	public void click_next_button() {
		
		wa.click_next_button();
	    
	}

	@When("Click Submite button")
	public void click_submite_button() {
		
		wa.click_submite_button();
	    
	}

	@Then("Validate the Registration Proced")
	public void validate_the_registration_proced() {
		
		wa.validate_the_registration_proced();
	    
	}

}
