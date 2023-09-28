 package com.IATF.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_2023Media_Pages extends PageObject{
	
	Robot as;
	
	
	//To click register as a media option
	@Step
	public void to_click_register_as_a_media_option() throws InterruptedException {
		
		Thread.sleep(2000);
		getDriver().switchTo().frame(0);
		
		$(By.xpath("//h4[text()='Media']")).click();
		Thread.sleep(2000);
		
		String parentwindow = getDriver().getWindowHandle();
		getDriver().switchTo().window(parentwindow);
		Thread.sleep(2000);
		Set<String> childwindow = getDriver().getWindowHandles();
		List<String> list=new ArrayList<String>(childwindow);
		getDriver().switchTo().window(list.get(1));
		Thread.sleep(5000);		
	    
	}
	//Validate the new window for register as a media
	@Step
	public void validate_the_new_window_for_register_as_a_media() throws InterruptedException {
		
		Thread.sleep(5000);
	    
	}
	//Upload profile image for media {string}
	@Step
	public void upload_profile_image_for_media(String string) throws InterruptedException, AWTException {
		
		$(By.xpath("//span[text()='Upload image']")).click();
		
		String file=(string);
		
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		as=new Robot();
		as.keyPress(KeyEvent.VK_CONTROL);
		as.keyPress(KeyEvent.VK_V);
		as.keyRelease(KeyEvent.VK_CONTROL);
		as.keyRelease(KeyEvent.VK_V);
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	    
	}
	//Select title for media
	@Step
	public void select_title_for_media() throws InterruptedException {
		
		$(By.xpath("(//input[@role='combobox'])[1]/preceding-sibling::div")).click();
		
		
		for (int i = 0; i <4 ; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			as.keyRelease(KeyEvent.VK_DOWN);
		}
		
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	   
	}
	//Enter first name for media {string}
	@Step
	public void enter_first_name_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys(string);
	    
	}
	//Enter Last Name for media {string}
	@Step
	public void enter_last_name_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys(string);
	    
	}
	//Enter passport number for media {string}
	@Step
	public void enter_passport_number_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[3]")).sendKeys(string);
	    
	}
	//Select passport issued date for media
	@Step
	public void select_passport_issued_date_for_media() throws InterruptedException {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[4]")).click();
		Thread.sleep(2000);
		$(By.xpath("(//select[@data-cvent-id='input'])[2]")).selectByIndex(6);
		Thread.sleep(2000);
		$(By.xpath("(//select[@data-cvent-id='input'])[3]")).selectByIndex(120);
		Thread.sleep(2000);
		$(By.xpath("//div[text()='16']")).click();
	    
	}
	//Select passport issues by country
	@Step
	public void select_passport_issues_by_country() {
		
		$(By.xpath("//select[@data-cvent-id='input']")).selectByIndex(2);
	    
	}
	//Upload passport document for media {string}
	@Step
	public void upload_passport_document_for_media(String string) throws AWTException, InterruptedException {
		
		$(By.xpath("//span[text()='Upload file']")).click();
String file=(string);
		
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		as=new Robot();
		as.keyPress(KeyEvent.VK_CONTROL);
		as.keyPress(KeyEvent.VK_V);
		as.keyRelease(KeyEvent.VK_CONTROL);
		as.keyRelease(KeyEvent.VK_V);
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	   
	}
	//Enter Email Address for media {string}
	@Step
	public void enter_email_address_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[5]")).sendKeys(string);
	   
	}
	//Enter mobile number for media {string}
	@Step
	public void enter_mobile_number_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[6]")).sendKeys("7788990098");
	    
	}
	//("Click the radio button for media
	@Step
	public void click_the_radio_button_for_media() {
		
		$(By.xpath("//label[text()='Billboards']")).click();
	   
	}
	//Click the privacy statement for media
	@Step
	public void click_the_privacy_statement_for_media() {
		
		$(By.xpath("//label[text()='I agree']")).click();
	    
	}
	//Click terms and condition button for media
	@Step
	public void click_terms_and_condition_button_for_media() {
		
		$(By.xpath("//label[contains(text(),'Yes')]")).click();
	    
	}
	//Click next button for media page one
	@Step
	public void click_next_button_for_media_page_one() {
		
		$(By.xpath("//button[@id='forward']")).click();
	    
	}
	//Validate media registration page two
	@Step
	public void validate_media_registration_page_two() throws InterruptedException {
		
		Thread.sleep(9000);
	    
	}
	//Enter the Company name required text box for media {string}
	@Step
	public void enter_the_company_name_required_text_box_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys(string);
	    
	}
	//Enter the media designation {string}
	@Step
	public void enter_the_media_designation(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys(string);
	    
	}
	//Enter the publication name {string}
	@Step
	public void enter_the_publication_name(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[3]")).sendKeys(string);
	    
	}
	//Enter the Company Address in required text box for media {string}
	@Step
	public void enter_the_company_address_in_required_text_box_for_media(String line1,String line2) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[4]")).sendKeys(line1);
		$(By.xpath("(//input[@data-cvent-id='input'])[5]")).sendKeys(line2);
	    
	}
	//Enter the City for media {string}
	@Step
	public void enter_the_city_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[6]")).sendKeys(string);
	   
	}
	//Enter the ZIP\\/Postal code for media
	@Step
	public void enter_the_zip_postal_code_for_media() {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[7]")).sendKeys("8899098");
	    
	}
	//Select the Country\\/Region from Dropdown for media
	@Step
	public void select_the_country_region_from_dropdown_for_media() throws InterruptedException {
		
		$(By.xpath("(//input[@role='combobox'])[1]/../preceding-sibling::div")).click();
		
		
		for (int i = 0; i <4 ; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			as.keyRelease(KeyEvent.VK_DOWN);
		}
		
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	   
	}
	//Select the State\\/Province from Dropdown for media
	@Step
	public void select_the_state_province_from_dropdown_for_media() {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[8]")).sendKeys("maharastra");
	    
	}
	//Enter the Telephone number for media {string}
	@Step
	public void enter_the_telephone_number_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[9]")).sendKeys(string);
	   
	}
	//Enter the Email Address for media mail {string}
	@Step
	public void enter_the_email_address_for_media_mail(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[10]")).sendKeys(string);
	    
	}
	//Enter the Company website in required text box for media {string}
	@Step
	public void enter_the_company_website_in_required_text_box_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[11]")).sendKeys(string);
	    
	}
	//Enter about media house
	@Step
	public void enter_about_media_house() {
		
		$(By.xpath("(//textarea[@data-cvent-id='input'])[1]")).sendKeys("test media registration "
				+ "test media registration test media registration "
				+ "test media registration test media registration ");
	    
	}
	//Click Publication Language of media
	@Step
	public void click_publication_language_of_media() {
		
		$(By.xpath("(//label[text()='English'])[1]")).click();
	    
	}
	//Click audience Target of media
	@Step
	public void click_audience_target_of_media() {
		
		$(By.xpath("(//label[text()='Trade'])[1]")).click();
	    
	}
	//Click audience reach of media
	@Step
	public void click_audience_reach_of_media() {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[13]")).sendKeys("audioreach");
	    
	}
	//Click audience segment of media
	@Step
	public void click_audience_segment_of_media() {
		
		$(By.xpath("(//label[text()='Business'])[1]")).click();
	   
	}
	//Enter the facebook url for media {string}
	@Step
	public void enter_the_facebook_url_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[15]")).sendKeys(string);
	    
	}
	//Enter the twitter for media {string}
	@Step
	public void enter_the_twitter_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[16]")).sendKeys(string);
	    
	}
	//Enter the instagram for media {string}
	@Step
	public void enter_the_instagram_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[17]")).sendKeys(string);
	    
	}
	//Enter the personal instragram for media {string}
	@Step
	public void enter_the_personal_instragram_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[18]")).sendKeys(string);
	    
	}
	//Enter the other detail for media {string}
	@Step
	public void enter_the_other_detail_for_media(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[19]")).sendKeys(string);
	    
	}
	//Click next button for media page two
	@Step
	public void click_next_button_for_media_page_two() throws InterruptedException {
		
		$(By.xpath("//button[@id='forward']")).click();
		
		Thread.sleep(9000);
	   
	}
	//------------------------------------------------------------------------------------
	
	//Validate the media information  page media
	@Step
	public void validate_the_media_information_page_media() throws InterruptedException {
		
		Thread.sleep(5000);
		
	    
	}

	//To Click the attending the IATF2023 media
	@Step
	public void to_click_the_attending_the_iatf2023_media() {
		
		$(By.xpath("(//label[contains(text(),'Monday')])[1]")).click();
	    
	}

	//To Click attending the Trade & Investment Conference media
	@Step
	public void to_click_attending_the_trade_investment_conference_media() {
		
		$(By.xpath("(//label[contains(text(),'Monday')])[2]")).click();
	    
	}

	//To Click Are you interested in attending CANEX media
	@Step
	public void to_click_are_you_interested_in_attending_canex_media() {
		
		$(By.xpath("(//label[contains(text(),'Yes')])[1]")).click();
	    
	}

	//To Click attending the Africa Automotive Show media
	@Step
	public void to_click_attending_the_africa_automotive_show_media() {
		
		$(By.xpath("(//label[contains(text(),'Monday')])[3]")).click();
	    
	}

	//To Click Are you interested in attending media
	@Step
	public void to_click_are_you_interested_in_attending_media() {
		
		$(By.xpath("(//label[contains(text(),'Yes')])[2]")).click();
	    
	}

	//To Click Do you require a TV crew
	@Step
	public void to_click_do_you_require_a_tv_crew() {
		
		$(By.xpath("(//label[contains(text(),'Yes')])[3]")).click();
	    
	}
	//Click next button for media page three
	@Step
	public void click_next_button_for_media_page_three() throws InterruptedException {
		
		$(By.xpath("//button[@id='forward']")).click();
		
	    Thread.sleep(7000);
	}

	//Click Submit button in media page four
	@Step
	public void click_submit_button_in_media_page_four() {
		
		$(By.xpath("//button[text()='Submit']")).click();
	    
	}

	//Validate the Registration Proceed media
	@Step
	public void validate_the_registration_proceed_media() throws InterruptedException {
		
		Thread.sleep(15000);
	    
	}


}
