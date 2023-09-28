package com.IATF.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class IATF_2023Conference_Deligate_Pages extends PageObject {

	Robot as;
	//To click register as a conference delegate option
	@Step
	public void to_click_register_as_a_conference_delegate_option() throws InterruptedException {
		
		Thread.sleep(2000);
		getDriver().switchTo().frame(0);
		
		$(By.xpath("//h4[text()='Conference delegate']")).click();
		Thread.sleep(2000);
		
		String parentwindow = getDriver().getWindowHandle();
		getDriver().switchTo().window(parentwindow);
		Thread.sleep(2000);
		Set<String> childwindow = getDriver().getWindowHandles();
		List<String> list=new ArrayList<String>(childwindow);
		getDriver().switchTo().window(list.get(1));
		Thread.sleep(5000);
	}

	//Upload profile image for conference delegate {string}
	@Step
	public void upload_profile_image_for_conference_delegate(String string) throws InterruptedException, AWTException {
		
		$(By.xpath("//span[text()='Upload image']")).click();
		
		String file=(string);
		
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		as=new Robot();
		as.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		as.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		as.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	   
	}

	//Select gender for conference delegate
	@Step
	public void select_gender_for_conference_delegate() {
		
		$(By.xpath("//select[@data-cvent-id='input']")).selectByIndex(2);
	    
	}

	//Select title for conference delegate
	@Step
	public void select_title_for_conference_delegate() throws InterruptedException {
		
		$(By.xpath("(//input[@role='combobox'])[1]/preceding-sibling::div")).click();
		for (int i = 0; i <6 ; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			as.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	//Enter first name for conference delegate {string}
	@Step
	public void enter_first_name_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys(string);
		
		
	}

	//Enter Last Name for conference delegate {string}
	@Step
	public void enter_last_name_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys(string);
	    
	}

	//Enter Email Address for conference delegate {string}
	@Step
	public void enter_email_address_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[3]")).sendKeys(string);
	    
	}

	//Select country code for conference delegate
	@Step
	public void select_country_code_for_conference_delegate() {
		
		$(By.xpath("(//input[@role='combobox'])[2]/../preceding-sibling::div")).click();
		
		for (int i = 0; i < 2; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			as.keyRelease(KeyEvent.VK_DOWN);
		}
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		
	   
	}

	//Enter mobile number for conference delegate {string}
	@Step
	public void enter_mobile_number_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[4]")).sendKeys(string);
	    
	}

	//Enter passport number for conference delegate {string}
	@Step
	public void enter_passport_number_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[5]")).sendKeys(string);
	    
	}

	//Select passport issued date for conference delegate
	@Step
	public void select_passport_issued_date_for_conference_delegate() throws InterruptedException {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[6]")).click();
		Thread.sleep(3000);
		//select table month
		$(By.xpath("(//select[@data-cvent-id='input'])[2]")).selectByIndex(6);
		
		
		
		//select table year
		$(By.xpath("(//select[@data-cvent-id='input'])[3]")).selectByIndex(120);
		
		
		
		//click date
		$(By.xpath("//div[text()='16']")).click();
		
		
	    
	}

	//Select passport expiry date for conference delegate
	@Step
	public void select_passport_expiry_date_for_conference_delegate() throws InterruptedException {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[7]")).click();
		Thread.sleep(3000);
		//select table month
		$(By.xpath("(//select[@data-cvent-id='input'])[2]")).selectByIndex(7);
		
		$(By.xpath("(//select[@data-cvent-id='input'])[3]")).selectByIndex(132);
		
		//click date
		$(By.xpath("//div[text()='19']")).click();
		
		
	   
	}

	//Upload passport document for conference delegate {string}
	@Step
	public void upload_passport_document_for_conference_delegate(String string) throws InterruptedException {
		
$(By.xpath("//span[text()='Upload file']")).click();
		
		String file=(string);
		
		StringSelection selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		as.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		as.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}


    //Enter emergency contact name for conference delegate {string}
	@Step
	public void enter_emergency_contact_name_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[8]")).sendKeys(string);
	    
	}

	//Select emergency contact country code for conference delegate
	@Step
	public void select_emergency_contact_country_code_for_conference_delegate() throws InterruptedException {
		
		$(By.xpath("(//input[@role='combobox'])[3]/../preceding-sibling::div")).click();
		
	
		
		for (int i = 0; i < 6; i++) {
		as.keyPress(KeyEvent.VK_DOWN);
		as.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	    
	}

	//Enter emergency contact number for conference delegate {string}
	@Step
	public void enter_emergency_contact_number_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[9]")).sendKeys(string);
	    
	}

	//Enter emergency contact relationship for conference delegate {string}
	@Step
	public void enter_emergency_contact_relationship_for_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[10]")).sendKeys(string);
	    
	}

	//Click next button for conference delegate page
	@Step
	public void click_next_button_for_conference_delegate_page() {
		
		$(By.xpath("//button[@type='submit']")).click();
	    
	}
	//-------------------------------------------------------------------------------------------------------------

	//Enter the Company name required text box conference delegate {string}
	@Step
	public void enter_the_company_name_required_text_box_conference_delegate(String string) throws InterruptedException {
		Thread.sleep(5000);
		$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys(string);
	    
	}

	
	//Enter the Job title  conference delegate {string}
	@Step
	public void enter_the_job_title_conference_delegate(String string) {
		$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys(string);
	}
	

	//Enter the Company Address in required text box conference delegate {string}
	@Step
	public void enter_the_company_address_in_required_text_box_conference_delegate(String line1,String line2) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[3]")).sendKeys(line1);
		$(By.xpath("(//input[@data-cvent-id='input'])[4]")).sendKeys(line2);
	    
	}

	//Enter the City conference delegate {string}
	@Step
	public void enter_the_city_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[5]")).sendKeys(string);
	    
	}

	//Enter the ZIP\\/Postal code conference delegate
	@Step
	public void enter_the_zip_postal_code_conference_delegate() {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[6]")).sendKeys("600098765");
	    
	}

	//Select the Country\\/Region from Dropdown conference delegate
	@Step
	public void select_the_country_region_from_dropdown_conference_delegate() throws InterruptedException {
		
		$(By.xpath("(//input[@role='combobox'])[1]/../preceding-sibling::div")).click();
		for (int i = 0; i < 4; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			}
			Thread.sleep(3000);
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
	}

	//Select the State\\/Province from Dropdown conference delegate
	@Step
	public void select_the_state_province_from_dropdown_conference_delegate() {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[7]")).sendKeys("testingtesting");
	   
	}

	//Enter the Company website in required text box conference delegate {string}
	@Step
	public void enter_the_company_website_in_required_text_box_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[8]")).sendKeys(string);
	    
	}

	//Enter the Telephone number\\(office\\/landline) conference delegate {string}
	@Step
	public void enter_the_telephone_number_office_landline_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[9]")).sendKeys("23456765432");
	    
	}

	//Select the Country of principle office from the Dropdown conference delegate
	@Step
	public void select_the_country_of_principle_office_from_the_dropdown_conference_delegate() {
		
		$(By.xpath("(//select[@data-cvent-id='input'])[1]")).selectByIndex(6);
	   
	}

	//Select the Country of Head office from the Dropdown conference delegate
	@Step
	public void select_the_country_of_head_office_from_the_dropdown_conference_delegate() throws InterruptedException {
		
		$(By.xpath("(//input[@role='combobox'])[2]/../preceding-sibling::div")).click();
		Thread.sleep(3000);
		
		
		for (int i = 0; i < 3; i++) {
		as.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		as.keyPress(KeyEvent.VK_ENTER);
		as.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		}
	   
	}

	//Enter the Alternate Contact Name conference delegate {string}
	@Step
	public void enter_the_alternate_contact_name_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[10]")).sendKeys(string);
	    
	}

	//Enter the Alternate Contact Number conference delegate {string}
	@Step
	public void enter_the_alternate_contact_number_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[11]")).sendKeys(string);
	    
	}

	//Enter the Alternate Email Address conference delegate {string}
	@Step
	public void enter_the_alternate_email_address_conference_delegate(String string) {
		
		$(By.xpath("(//input[@data-cvent-id='input'])[12]")).sendKeys(string);
	    
	}

	//Click the Required Radio button for Eastern Africa
	@Step
	public void click_the_required_radio_button_for_eastern_africa() {
		
		$(By.xpath("//label[text()='Eastern Africa']")).click();
	   
	}

	//Click next button for conference delegate two
	@Step
	public void click_next_button_for_conference_delegate_two() throws InterruptedException {
		
		$(By.xpath("//button[text()='Next']")).click();
	    
	}

	//---------------------------------------------------------------------------------------------------------
	
		//Select the Size of your Company from Dropdown conference delegate
		@Step
		public void select_the_size_of_your_company_from_dropdown_conference_delegate() throws InterruptedException {
			
			Thread.sleep(9000);
		    
		}

		//Select Parchasing amount of your Company from Dropdown conference delegate
		@Step
		public void select_parchasing_amount_of_your_company_from_dropdown_conference_delegate() throws InterruptedException {
			$(By.xpath("(//input[@role='combobox'])[1]/preceding-sibling::div")).click();
			for (int i = 0; i < 2; i++) {
				
				as.keyPress(KeyEvent.VK_DOWN);
				
			}
			Thread.sleep(3000);
			as.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			as.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			as.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
		    
		}

		//Select Annual turnover of your Company conference delegate
		@Step
		public void select_annual_turnover_of_your_company_conference_delegate() throws InterruptedException {
			
			$(By.xpath("(//input[@role='combobox'])[2]/preceding-sibling::div")).click();
			for (int i = 0; i < 2; i++) {
				
				as.keyPress(KeyEvent.VK_DOWN);
				
			}
			Thread.sleep(3000);
			as.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			as.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			as.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
		    
		}

		//Click Required Business Objectives conference delegate
		@Step
		public void click_required_business_objectives_conference_delegate() {
			
			$(By.xpath("(//label[text()='Agriculture & Agro-processing'])[1]")).click();	
			$(By.xpath("(//label[text()='Basic Metal Production'])[1]")).click();	
			$(By.xpath("(//label[text()='Construction & Infrastructure'])[1]")).click();
		    
		}
		//Click next button for conference delegate Three
		@Step
		public void click_next_button_for_conference_delegate_Three() throws InterruptedException {
		   
		
			$(By.xpath("//button[@id='forward']")).click();
			
			Thread.sleep(9000);
		    
		}
		//---------------------------------------------------------------------------------------------------------
		
		//Select the Required sessions you'd like to attend conference delegate
		@Step
		public void select_the_required_sessions_you_d_liketoattendconference_delegate() {
			
			$(By.xpath("//label[contains(text(),'I accept & agree to')]")).click();
		    
		}

		//Click next button for conference delegate four
		@Step
		public void click_next_button_for_conference_delegate_four() throws InterruptedException {
			
			$(By.xpath("//button[@id='forward']")).click();
			Thread.sleep(9000);
		    
		}

		//---------------------------------------------------------------------------------------------------------
		
		//Click Submite button conference delegate five
		@Step
		public void click_submite_button_conference_delegate_five() {
			
			$(By.xpath("//button[text()='Submit']")).click();
		    
		}
		
		//---------------------------------------------------------------------------------------------------------
		
		//Validate the Registration successfull conference delegate
		@Step
		public void validate_the_registration_successfull_conference_delegate() throws InterruptedException {
			
			Thread.sleep(9000);
		    
		}





}
