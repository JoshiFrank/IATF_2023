package com.IATF.steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.IATF.pages.IATF_Exhibitors_Pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IATF_Exhibitors_Steps {

	
	
	@Managed
	WebDriver driver;
	
	@Steps
	IATF_Exhibitors_Pages ep;
	
	@When("To click the Exhibitors button")
	public void to_click_the_exhibitors_button() {
		
		ep.to_click_the_exhibitors_button();
	    
	}

	@When("To click the exibitors Right arrow")
	public void to_click_the_exibitors_right_arrow() {
		
		ep.to_click_the_exibitors_right_arrow();
	    
	}

	@Then("Validate exibitors Page")
	public void validate_exibitors_page() {
		
		ep.validate_exibitors_page();
	    
	}

	@When("Click Registor to exhibit link")
	public void click_registor_to_exhibit_link() throws InterruptedException {
		
		ep.click_registor_to_exhibit_link();
	    
	}

	@Then("To validate registor to exhibit page")
	public void to_validate_registor_to_exhibit_page() throws InterruptedException {
		
		ep.to_validate_registortoexhibit_page();
	   
	}

	@When("To navigate back")
	public void to_navigate_back() throws InterruptedException {
		
		ep.to_navigate_back();
		
		//driver.navigate().back();
	    
	}

	@When("Click registor to visit in exibitors link")
	public void click_registor_to_visit_in_exibitors_link() throws InterruptedException {
		
		ep.click_registor_to_visit_in_exibitors_link();
	    
	}

	@Then("Validate registor to visit page in exibitors")
	public void validate_registor_to_visit_page_in_exibitors() throws InterruptedException {
		
		ep.validate_registor_to_visit_page_in_exibitors();
	   
	}

	@When("To click VIEW EXHIBITOR STAND PACKAGES link")
	public void to_click_view_exhibitor_stand_packages_link() throws InterruptedException {
		
		ep.to_click_view_exhibitor_stand_packages_link();
	   
	}

	@Then("Validate the PDF of VIEW EXHIBITOR STAND PACKAGES")
	public void validate_the_pdf_of_view_exhibitor_stand_packages() throws InterruptedException {
		
		ep.validate_the_pdf_of_view_exhibitor_stand_packages();
	   
	}

	@When("To click book to exhibit in exhibitors page")
	public void to_click_book_to_exhibit_in_exhibitors_page() throws InterruptedException {
		
		ep.to_click_book_to_exhibit_in_exhibitors_page();
	    
	}

	@Then("Validate book to exhibit register page in exhibitors")
	public void validate_book_to_exhibit_register_page_in_exhibitors() throws InterruptedException {
		
		ep.validate_book_to_exhibit_register_page_in_exhibitors();
	    
	}

	@When("To click Download the exhibitor manual here link in exhibitors")
	public void to_click_download_the_exhibitor_manual_here_link_in_exhibitors() throws InterruptedException, AWTException {
		
		ep.to_click_download_the_exhibitor_manual_here_link_in_exhibitors();
	   
	}

	@Then("Validate exhibitor manual document in exhibitors")
	public void validate_exhibitor_manual_document_in_exhibitors() throws InterruptedException {
		
		ep.validate_exhibitor_manual_document_in_exhibitors();
	   
	}

	@When("To click Download the list of restricted imports for egypt link in exhibitors")
	public void to_click_download_the_list_of_restricted_imports_for_egypt_link_in_exhibitors() {
		
		ep.to_click_download_the_list_of_restricted_imports_for_egypt_link_in_exhibitors();
	 
	}

	@Then("Validate list of restricted imports for egypt document in exhibitors")
	public void validate_list_of_restricted_imports_for_egypt_document_in_exhibitors() throws InterruptedException {
		
		ep.validate_list_of_restricted_imports_for_egypt_document_in_exhibitors();
	    
	}

	@When("To click Download the list HERE link in exhibitors")
	public void to_click_download_the_list_here_link_in_exhibitors() {
		
		ep.to_click_download_the_list_here_link_in_exhibitors();
	    
	}

	@Then("Validate the list of exhibiting countries document in exhibitors")
	public void validate_the_list_of_exhibiting_countries_document_in_exhibitors() throws InterruptedException {
		
		ep.validate_the_list_of_exhibiting_countries_document_in_exhibitors();
	    
	}

	@When("To click FIND OUT MORE link in exhibitor stand award")
	public void to_click_find_out_more_link_in_exhibitor_stand_award() {
		
		ep.to_click_find_out_more_link_in_exhibitor_stand_award();
	   
	}

	@Then("Validate Exhibitor Stand Award PDF")
	public void validate_exhibitor_stand_award_pdf() throws InterruptedException {
		
		ep.validate_exhibitor_stand_award_pdf();
	   
	}

	@When("To click download the brochure in exhibitors")
	public void to_click_download_the_brochure_in_exhibitors() {
		
		ep.to_click_download_the_brochure_in_exhibitors();
	    
	}

	@Then("Validate the brochure document in exhibitors")
	public void validate_the_brochure_document_in_exhibitors() throws InterruptedException {
		
		ep.validate_the_brochure_document_in_exhibitors();
	  
	}

	@Then("Validate the Team call Number")
	public void validate_the_team_call_number() {
		
		ep.validate_the_team_call_number();
	 
	}

	@When("To click Explore IATF virtual link in exhibitors")
	public void to_click_explore_iatf_virtual_link_in_exhibitors() {
		
		ep.to_click_explore_iatf_virtual_link_in_exhibitors();
	   
	}

	@Then("Validate Explore IATF virtual page in exhibitors")
	public void validate_explore_iatf_virtual_page_in_exhibitors() throws InterruptedException {
		
		ep.validate_explore_iatf_virtual_page_in_exhibitors();
	   
	}

	@Then("To click VIEW EXHIBITOR STAND PACKAGES two link in exhibitors")
	public void to_click_view_exhibitor_stand_packages_two_link_in_exhibitors() {
		
		ep.to_click_view_exhibitor_stand_packages_two_link_in_exhibitors();
	
	}

	@Then("Validate VIEW EXHIBITOR STAND PACKAGES two page in exhibitors")
	public void validate_view_exhibitor_stand_packages_two_page_in_exhibitors() throws InterruptedException {
		
		ep.validate_view_exhibitor_stand_packages_two_page_in_exhibitors();
		
	   
	}
	
	
//-----------------------------------------------------------------------------------------------------------------------
		//To validate the exibitorsList page


	@When("To click the exibitors Listing link")
	public void to_click_the_exibitors_listing_link() {
		
		ep.to_click_the_exibitors_listing_link();
	    
	}

	@Then("Validate exibitors Listing search page")
	public void validate_exibitors_listing_search_page() {
		
		ep.validate_exibitors_listing_search_page();
	    
	}

	@When("To Enter country name in search box")
	public void to_enter_country_name_in_search_box() {
		
		ep.to_enter_country_name_in_search_box();
	    
	}

	@When("To click search button")
	public void to_click_search_button() {
		
		ep.to_click_search_button();
	   
	}

	@When("To Click View this exhibitor button of required exhibitor")
	public void to_click_view_this_exhibitor_button_of_required_exhibitor() {
		
		ep.to_click_view_this_exhibitor_button_of_required_exhibitor();
	}

	@Then("Validate the exhibitor details")
	public void validate_the_exhibitor_details() {
		
		ep.validate_the_exhibitor_details();
	   
	}

	@When("To click Reset button")
	public void to_click_reset_button() {
		
		ep.to_click_reset_button();
	   
	}

	@When("To click advance search check box")
	public void to_click_advance_search_check_box() {
		
		ep.to_click_advance_search_check_box();
	   
	}

	@Then("Validate the countries dropdown")
	public void validate_the_countries_dropdown() throws InterruptedException {
		
		ep.validate_the_countries_dropdown();
	    
	}

	@When("To select exhibitors countries from dropdown")
	public void to_select_exhibitors_countries_from_dropdown() {
		
		ep.to_select_exhibitors_countries_from_dropdown(5);
	    
	}

	@Then("Validate the business dropdown")
	public void validate_the_business_dropdown() throws InterruptedException {
		
		ep.validate_the_business_dropdown();
	    
	}

	@When("To select exhibitors business from dropdown")
	public void to_select_exhibitors_business_from_dropdown() {
		
		ep.to_select_exhibitors_business_from_dropdown(5);
	   
	}

	@Then("Validate the sector dropdown")
	public void validate_the_sector_dropdown() throws InterruptedException {
		
		ep.validate_the_sector_dropdown();
	   
	}

	@When("To select exhibitors sector from dropdown")
	public void to_select_exhibitors_sector_from_dropdown() {
		
		ep.to_select_exhibitors_sector_from_dropdown(6);
	    
	}

	
}
