package com.IATF.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class IATF_Whyattend_pages extends PageObject {
	
	public Robot as;
		//To click the Why attend option
		@Step
		public void toclick_thewhyattendoption() throws InterruptedException {
			Thread.sleep(9000);
		   
			$(By.xpath("//button[text()=' Why Attend ']")).click();
		}
		//Validate the Why attend page
		@Step
		public void validate_whyattendpage() {
			
			boolean Whyattend = $(By.xpath("//button[text()=' Why Attend ']")).isDisplayed();
			Assert.assertTrue(Whyattend);
			
		    
		}

		//Validate the Why attend five reason banner
		@Step
		public void validate_five_reason_banner() {
			
			boolean fivereason = $(By.xpath("//div[@class='banner-hero--triangle fw ng-star-inserted']")).isDisplayed();
		    Assert.assertTrue(fivereason);
		    
		   
		}

		//validate five banners
		@Step
		public void validate_five_banners()  {
		    
			boolean one = $(By.xpath("//div[@class='wp-block-columns']")).isDisplayed();
		    Assert.assertTrue(one);
		    
		    boolean two = $(By.xpath("//section[@class='fw s--triangle-center ng-star-inserted']")).isDisplayed();
			Assert.assertTrue(two);
			
			boolean three = $(By.xpath("//h2[text()='A concrete opportunity for trade']")).isDisplayed();
			Assert.assertTrue(three);
			
			boolean four = $(By.xpath("//section[@class='fw s--triangle-single none ng-star-inserted']")).isDisplayed();
			Assert.assertTrue(four);
			
			boolean five = $(By.xpath("//h2[contains(text(),\"Showcasing the best of African business\")]")).isDisplayed();
			Assert.assertTrue(five);
			
		}
		
		//validate don't miss your moment banner
		@Step
		public void validate_dontmissyour_momentbanner() throws AWTException, InterruptedException {
		  
			boolean last = $(By.xpath("//h2[contains(text(),\"Don't miss your\")]/../../..")).isDisplayed();
			Assert.assertTrue(last);
			
		
			for (int i = 0; i <=9; i++) {
				
			
			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
			
			Thread.sleep(2000);
		}
		}
		
		
//---------------------------------------------------------------------------------------------------------------------------
		
		//To click register to visit button
		@Step
		public void to_clickregister_tovisitbutton() {
			
			$(By.xpath("(//span[text()='Register to visit'])[1]")).click();
		    
		}

		//Validate register to visit page
		@Step
		public void validate_registertovisitpage() {
			
			boolean RtoVP = $(By.xpath("//p[text()='registration for iatf 2023']")).isDisplayed();
		    Assert.assertTrue(RtoVP);
		}

		//To click register as a visitor option
		@Step
		public void to_clickregister_as_a_visitoroption() throws InterruptedException {
			
			Thread.sleep(2000);
			getDriver().switchTo().frame(0);
			
			$(By.xpath("//h4[text()='Visitor']")).click();
			Thread.sleep(2000);
			
			getDriver().switchTo().defaultContent();
			
			
		}

		//Validate the new window for register as a visitor
		@Step
		public void validatethe_new_windowforregisteras_visitor() throws InterruptedException {
			Thread.sleep(2000);
		
			String parentwindow = getDriver().getWindowHandle();
			getDriver().switchTo().window(parentwindow);
			Thread.sleep(2000);
			//$(By.xpath("//button[@title='Yes']")).click();
		
			Set<String> childwindow = getDriver().getWindowHandles();
			List<String> list=new ArrayList<String>(childwindow);
			getDriver().switchTo().window(list.get(1));
			Thread.sleep(5000);
			boolean PI = $(By.xpath("//p[text()='registration for iatf2023']")).isDisplayed();
		    Assert.assertTrue(PI);
		}

		//Upload profile image for visitor
		@Step
		public void upload_profile_image_forvisitor() throws AWTException, InterruptedException {
			
			
			$(By.xpath("//span[text()='Upload image']")).click();
			
			String file=("C:\\image\\testimage.png"); 
			
			StringSelection selection=new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Thread.sleep(2000);
			as=new Robot();
			as.keyPress(KeyEvent.VK_CONTROL);
			
			as.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);
			as.keyRelease(KeyEvent.VK_CONTROL);
			
			as.keyRelease(KeyEvent.VK_V);
			Thread.sleep(2000);
			as.keyPress(KeyEvent.VK_ENTER);
		
			as.keyRelease(KeyEvent.VK_ENTER);
			
		}
		//Select gender for visitor
		@Step
		public void selectgenderforvisitor() {
			
			$(By.xpath("//select[@data-cvent-id='input']")).selectByValue("1");
		   
		}

		//Select title for visitor
		@Step
		public void selecttitleforvisitor() throws AWTException, InterruptedException {
			
			$(By.xpath("(//input[@role='combobox'])[1]/preceding-sibling::div")).click();
			Thread.sleep(2000);
			
			for (int i = 0; i < 3; i++) {
				as.keyPress(KeyEvent.VK_DOWN);
				as.keyRelease(KeyEvent.VK_DOWN);
			}
			Thread.sleep(3000);
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
		    
		}

		//Enter first name for visitor
		@Step
		public void enterfirstnameforvisitor(String Testfirst) throws InterruptedException {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys(Testfirst);
			Thread.sleep(3000);
		}

		//Enter Last Name for visitor
		@Step
		public void enterlastnameforvisitor(String TestLast) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys(TestLast);
		    
		}

		//Select DOB for visitor
		@Step
		public void selectdobforvisitor() throws InterruptedException {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[3]")).click();
			Thread.sleep(3000);
			$(By.xpath("(//select[@data-cvent-id='input'])[2]")).selectByIndex(6);
			Thread.sleep(3000);
			$(By.xpath("(//select[@data-cvent-id='input'])[3]")).selectByIndex(98);
			Thread.sleep(3000);
			$(By.xpath("//div[text()='16']")).click();
			Thread.sleep(3000);
			
		    
		}

		//Select Language for visitor
		@Step
		public void selectlanguageforvisitor() throws AWTException, InterruptedException {
			
			$(By.xpath("(//input[@role='combobox'])[2]/preceding-sibling::div")).click();
			Thread.sleep(3000);
			for (int i = 0; i < 2; i++) {
				as.keyPress(KeyEvent.VK_DOWN);
			}
			Thread.sleep(3000);
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			
		}

		//Enter Email Address for visitor
		@Step
		public void enteremailaddressforvisitor(String email) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[4]")).sendKeys(email);
		    
		}

		//Select country code for visitor
		@Step
		public void selectcountrycodeforvisitor() throws AWTException, InterruptedException {
			
			$(By.xpath("(//input[@role='combobox'])[3]/../preceding-sibling::div")).click();
			Thread.sleep(3000);
			for (int i = 0; i < 4; i++) {
				as.keyPress(KeyEvent.VK_DOWN);
				}
				Thread.sleep(3000);
				as.keyPress(KeyEvent.VK_ENTER);
				as.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
		    
		}

		//Enter mobile number for visitor
		@Step
		public void entermobilenumberforvisitor(String mobilenum) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[5]")).sendKeys(mobilenum);
		   
		}

		//Enter passport number for visitor
		@Step
		public void enterpassportnumberfor_visitor(String Passport) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[6]")).sendKeys(Passport);
		    
		}

		//Select passport issued date for visit
		@Step
		public void selectpassportissueddateforvisitor() throws InterruptedException {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[7]")).click(); 
			Thread.sleep(5000);
		    $(By.xpath("(//select[@data-cvent-id='input'])[2]")).selectByIndex(7);
		    Thread.sleep(5000);
		    $(By.xpath("(//select[@data-cvent-id='input'])[3]")).selectByValue("120");
		    Thread.sleep(5000);
		    $(By.xpath("//div[text()='16']")).click();
		}

		//Select passport expiry date for visitor
		@Step
		public void selectpassportexpirydateforvisitor() throws InterruptedException {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[8]")).click();
			Thread.sleep(5000);
			$(By.xpath("(//select[@data-cvent-id='input'])[2]")).selectByIndex(7);
			Thread.sleep(5000);
			$(By.xpath("(//select[@data-cvent-id='input'])[3]")).selectByValue("132");
			Thread.sleep(5000);
			$(By.xpath("//div[text()='19']")).click();
			
			
		  
		   
		}

		//Upload passport document for visitor
		@Step
		public void uploadpassportdocumentforvisitor() throws InterruptedException, AWTException {
			
			$(By.xpath("//span[text()='Upload file']")).click();
			
			Thread.sleep(2000);
			
			 String file="C:\\image\\testimage.png";
			 StringSelection Selections=new StringSelection(file);
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selections, null);
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

		//Enter emergency contact name for visitor
		@Step
		public void enteremergencycontactnameforvisitor(String contactname) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[9]")).sendKeys(contactname);
		    
		}

		//Select emergency contact country code for visitor
		@Step
		public void selectemergencycontactcountrycodeforvisitor() throws AWTException, InterruptedException {
			
			$(By.xpath("(//input[@role='combobox'])[4]/../preceding-sibling::div")).click();
			Thread.sleep(2000);
			
			for (int i = 0; i < 6; i++) {
				as.keyPress(KeyEvent.VK_DOWN);
				}
				Thread.sleep(3000);
				as.keyPress(KeyEvent.VK_ENTER);
				as.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
		}

		//Enter emergency contact number for visitor
		@Step
		public void enteremergencycontactnumberforvisitor(String contactnumber) {
			
			
			$(By.xpath("(//input[@data-cvent-id='input'])[10]")).sendKeys(contactnumber);
		}

		//Enter emergency contact relationship for visitor
		@Step
		public void enteremergencycontactrelationshipforvisitor(String contactrelation) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[11]")).sendKeys(contactrelation);
		    
		}

		//Click next button for visitor page
		@Step
		public void clicknextbuttonforvisitorpage() throws InterruptedException {
			
			$(By.xpath("//button[@type='submit']")).click();
			/*
			 * Thread.sleep(3000);
			 * $(By.xpath("//button[@data-cvent-id='yes-submit-button']")).click();
			 * Thread.sleep(3000); $(By.xpath("//button[@type='submit']")).click();
			 */
		    
		}

		//Validate visitor registration page two
		@Step
		public void validatevisitorregistrationpagetwo() throws InterruptedException {
	Thread.sleep(2000);
			boolean CI=$(By.xpath("//p[text()='registration for iatf2023']")).isDisplayed();
			Assert.assertTrue(CI);
		    
		}
		
		//Enter the Company name required text box 
		@Step
		public void enter_companyname_requiredtext_box(String companyname) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys(companyname);
		    
		}

		//Enter the Job title 
		@Step
		public void enter_the_job_title(String JobTitle) {
		  
			$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys(JobTitle);
			
		}

		//Enter the Company Address in required text box 
		@Step
		public void enter_companyaddress_inrequiredtextbox(String Line1,String Line2) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[3]")).sendKeys(Line1);
			$(By.xpath("(//input[@data-cvent-id='input'])[4]")).sendKeys(Line2);
		}

		
		//Enter the City
		@Step
		public void enter_the_city(String City) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[5]")).sendKeys(City);
		    
		}

		//Enter the ZIPPostal code
		@Step
		public void enter_the_zip_postal_code(String pin) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[6]")).sendKeys(pin);
		    
		}

		//Select the Country\\/Region from Dropdown
		@Step
		public void select_countryregion_fromdropdown() {
			
			$(By.xpath("(//input[@role='combobox'])[1]/../preceding-sibling::div")).click();
			
		
			
			for (int i = 0; i < 4; i++) {
			as.keyPress(KeyEvent.VK_DOWN);
			}
			
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
			
			}

		//Select the State\\/Province from Dropdown
		@Step
		public void select_the_stateprovince_fromdropdown() {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[7]")).sendKeys("chicago");
		    
		}

		
		//Enter the Company website in required text box
		@Step
		public void enter_the_companywebsite_in_requiredtextbox(String Web) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[8]")).sendKeys(Web);
		    
		}

		//Enter the Telephone number
		@Step
		public void enter_the_telephone_number(String phone) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[9]")).sendKeys(phone);
		    
		}

		
		//Select the Country of principle office from the Dropdown")
		@Step
		public void select_the_country_of_principle_office_from_the_dropdown() {
			
			$(By.xpath("(//select[@data-cvent-id='input'])[1]")).selectByIndex(6);
		    
		}

		
		//Select the Country of Head office from the Dropdown
		@Step
		public void select_the_country_of_head_office_from_the_dropdown() {
			
			$(By.xpath("(//input[@role='combobox'])[2]/../preceding-sibling::div")).click();
			
			for (int i = 0; i < 3; i++) {
				as.keyPress(KeyEvent.VK_DOWN);
				}
				as.keyPress(KeyEvent.VK_ENTER);
				as.keyRelease(KeyEvent.VK_ENTER);
				
		    
		}

		
		//Enter the Alternate Email Address
		@Step
		public void enter_the_alternate_email_address(String AlterEmail) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[10]")).sendKeys(AlterEmail);
		    
		}

		//Enter the Alternate Contact Name
		@Step
		public void enter_the_alternate_contact_name(String Altername) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[11]")).sendKeys(Altername);
			
			
		    
		}

		
		//Enter the Alternate Contact Number 
		@Step
		public void enter_the_alternate_contact_number(String AlterNumer) {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[12]")).sendKeys(AlterNumer);
		    
		}

		//Click the Required Radio button for What is your purchasing power Queation
		@Step
		public void click_the_required_radio_button_purchasing_power_queation() {
			
			$(By.xpath("//label[text()='Make Purchasing Decisions']")).click();
		    
		}

		
		//Click the Required Radio button for What are your motivations for visiting
		@Step
		public void click_the_required_radio_button_motivations_for_visiting() {
			
			$(By.xpath("//label[contains(text(),'Gather industry')]")).click();
		    
		}

		
		//Click the Required Radio button for What are the main geographical regions that you are interested in
		@Step
		public void click_the_required_radio_button_main_geographical_regions() throws InterruptedException {
			
			$(By.xpath("//label[text()='Eastern Africa']")).click();
			
		}
		
		
		//Click nextbutton for visitor page2
		@Step
		public void clicknextbuttonforvisitorpage2() {
			$(By.xpath("//button[text()='Next']")).click();
			
		}
		
		
		

		
		//Validate the User Navigate to the BUSINESS INFORMATION page
		@Step
		public void validate_the_user_navigate_business_information_page() throws InterruptedException {
			
			boolean displayed = $(By.xpath("//p[text()='BUSINESS INFORMATION']")).isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(displayed);
			
		    
		}

		
		//Select the Size of your Company from Dropdown
		@Step
		public void select_the_size_of_your_company_from_dropdown() {
			
			$(By.xpath("(//input[@role='combobox'])[1]/preceding-sibling::div")).click();
			for (int i = 0; i < 2; i++) {
				
				as.keyPress(KeyEvent.VK_DOWN);
				
			}
			as.keyRelease(KeyEvent.VK_DOWN);
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
		    
		}

		
		//Click the Required Radio button for What is the main activity of your company
		@Step
		public void click_the_required_radio_button_mainactivitycompany() {
			
			$(By.xpath("(//label[text()='Agriculture & Agro-processing'])[1]")).click();
		    
		}

		
		//Select your position in company from the Dropdown
		@Step
		public void select_your_position_in_company_from_the_dropdown() {
			
			$(By.xpath("(//input[@role='combobox'])[2]/preceding-sibling::div")).click();
			for (int i = 0; i < 2; i++) {
				
				as.keyPress(KeyEvent.VK_DOWN);
				
			}
			as.keyRelease(KeyEvent.VK_DOWN);
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
		    
		}

		
		//Select Parchasing amount of your Company from Dropdown
		@Step
		public void select_parchasing_amount_of_your_company_from_dropdown() {
			
			$(By.xpath("(//input[@role='combobox'])[3]/preceding-sibling::div")).click();
			for (int i = 0; i < 2; i++) {
				
				as.keyPress(KeyEvent.VK_DOWN);
				
				
			}
			as.keyRelease(KeyEvent.VK_DOWN);
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
		    
		    
		}

		//Select Annual turnover of your Company
		@Step
		public void select_annual_turnover_of_your_company() {
			
			$(By.xpath("(//input[@role='combobox'])[4]/preceding-sibling::div")).click();
			for (int i = 0; i < 2; i++) {
				
				as.keyPress(KeyEvent.VK_DOWN);
				
			}
			
			as.keyPress(KeyEvent.VK_ENTER);
			as.keyRelease(KeyEvent.VK_ENTER);
		    
		}

		
		//Click Required Business Objectives
		@Step
		public void click_required_business_objectives() throws InterruptedException {
			List<WebElement> findElements = getDriver().findElements(By.xpath("(//ul[@data-cvent-id='checkbox'])[2]/li"));
			
			Thread.sleep(3000);
			findElements.get(0).click();
			Thread.sleep(3000);
			findElements.get(2).click();
			Thread.sleep(3000);
			findElements.get(4).click();
		    
			
		}
		
		//Click nextbutton for visitor page3
		@Step
		public void clicknextbuttonforvisitorpage3() {
			$(By.xpath("//button[@id='forward']")).click();
					
		}

		
		//User Navigate to registration for iatf2023
		@Step
		public void user_navigate_to_registration_for_iatf2023() {
			
			boolean displayed = $(By.xpath("//p[text()='registration for iatf2023']")).isDisplayed();
			Assert.assertTrue(displayed);
		    
		}

		
		//Select the Required sessions you'd like to attend
		@Step
		public void select_the_required_sessions_like_to_attend() {
			
			$(By.xpath("(//button[@type='button'])[1]")).click();
			$(By.xpath("(//button[@type='button'])[2]")).click();
			$(By.xpath("(//button[@type='button'])[3]")).click();
		    
		}

		//Click the required Answare for Online Diary and Virtual Trade Fair Admissions Policy
		@Step
		public void click_the_requiredansware_for_onlinediaryandvirtualtradefairadmissionspolicy() {
			
			
			$(By.xpath("//label[text()='Yes']")).click();
		}

		//Click the Admission Policy Check box
		@Step
		public void click_the_admission_policy_check_box() {
		    
			$(By.xpath("//label[contains(text(),'I accept & agree to')]")).click();
			
		}

		//Click InviteOthers
		@Step
		public void click_invite_others() {
			
			$(By.xpath("//button[text()='Invite Others']")).click();
		    
		}

		//Validate the Invite Others popup
		@Step
		public void validate_the_invite_others_popup() throws InterruptedException {
			
			boolean displayed = $(By.id("dialogHeader")).isDisplayed();
		Thread.sleep(2000);
			Assert.assertTrue(displayed);
		    
		}

		//Enter the Required Details for Invite Others
		@Step
		public void enter_the_required_details_for_invite_others() {
			
			$(By.xpath("(//input[@data-cvent-id='input'])[1]")).sendKeys("mahesh");
			$(By.xpath("(//input[@data-cvent-id='input'])[2]")).sendKeys("choudry");
			$(By.xpath("(//input[@data-cvent-id='input'])[3]")).sendKeys("maheshchoudry@gmail.com");
		    
		}

		//Click the AddInvitee Button
		@Step
		public void click_the_add_invitee_button() {
			
			$(By.xpath("(//button[@data-cvent-id='add-another-button'])[1]")).click();
		    
		}

		//Click Confirm Invite Button
		@Step
		public void click_confirm_invite_button() throws InterruptedException {
			
			$(By.xpath("(//button[contains(text(),'Confirm')])[1]")).click();
			Thread.sleep(2000);
		}

		//Validate the Invitation Ready PopUp Shoulde be Displayed
		@Step
		public void validate_the_invitationready_popup_shouldebedisplayed() throws InterruptedException {
			
			boolean displayed = $(By.name("messageContainer")).isDisplayed();
			Assert.assertTrue(displayed);
			
			Thread.sleep(3000);
			
			$(By.xpath("//*[local-name()='svg'][@role='img']")).click();
		    
		}

		//Click next button
		@Step
		public void click_next_button() {
			
			$ (By.xpath("//button[@id='forward']")).click();
		    
		}

		//Click Submite button
		@Step
		public void click_submite_button() {
			
			$(By.xpath("//button[text()='Submit']")).click();
			
		    
		}

		//Validate the Registration Proced
		@Step
		public void validate_the_registration_proced() {
		boolean displayed = $(By.xpath("//div[text()='Congratulations, you are now registered!']")).isDisplayed();
			Assert.assertTrue(displayed);
			
			
		}
		


		
	}


