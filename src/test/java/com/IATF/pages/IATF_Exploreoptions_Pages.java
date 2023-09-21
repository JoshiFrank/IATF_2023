package com.IATF.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_Exploreoptions_Pages extends PageObject {

	// To click BtoB AND BtoG link in popup
	@Step
	public void to_click_bto_b_and_bto_g_link_in_popup() {

		$(By.xpath("//span[text()='B2B and B2G']")).click();

	}

	// To validate BtoB AND BtoG page
	@Step
	public void to_validate_bto_b_and_bto_g_page() {

		$(By.xpath(" //h2[contains(text(),\"A B2B and B2G platform\")]")).isDisplayed();

	}

	// To click the prequalifier as a buyer link
	@Step
	public void to_click_the_prequalifier_as_a_buyer_link() throws InterruptedException {

		$(By.xpath(" //span[contains(text(),\"FIND OUT IF YOU PRE-QUALIFY AS A BUYER\")]")).click();

		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click hosted buyer programme link
	@Step
	public void to_click_hosted_buyer_programme_link() throws InterruptedException {

		$(By.xpath(" //span[contains(text(),\"FIND OUT MORE ABOUT THE HOSTED BUYER PROGRAMME \")]")).click();
		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click download the factsheet more information link
	@Step
	public void to_click_download_the_factsheet_more_information_link() throws InterruptedException {

		try {
			
			
			$(By.xpath(" //span[contains(text(),\"FOR MORE INFORMATION, DOWNLOAD THE FACTSHEET\")]")).click();
			Thread.sleep(5000);
			String windowHandle = getDriver().getWindowHandle();

			getDriver().switchTo().window(windowHandle);
			
		} catch (Exception e) {
			
			getDriver().navigate().back();
			
		}
		
		

	}

	// To click registor to attent as a hosted buyer link
	@Step
	public void to_click_registor_to_attent_as_a_hosted_buyer_link() {

		$(By.xpath(" //span[contains(text(),\"Register to attend as a hosted buyer\")]")).click();

	}

	// To validate registor to attent as a hosted buyer page
	@Step
	public void to_validate_registor_to_attent_as_a_hosted_buyer_page() throws InterruptedException {

		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click registor your interest here link in btob and b2g page
	@Step
	public void to_click_registor_your_interest_here_link_in_btob_and_b2g_page() throws InterruptedException {

		$(By.xpath(" //span[text()='ReGISTER YOUR INTEREST here']")).click();
		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click Buyers link in popup
	@Step
	public void to_click_buyers_link_in_popup() {

		$(By.xpath("//span[text()='Buyers']")).click();

	}

	// To validate Buyers page
	@Step
	public void to_validate_buyers_page() {

		$(By.xpath(" //strong[text()='AFREXIMBANK AFRICAN BUYERS PROGRAMME - AABP']")).isDisplayed();
	}

	// To click Register for IATF link
	@Step
	public void to_click_register_for_iatf_link() {

		$(By.xpath(" //span[text()='rEGISTER FOR iaTF2023']")).click();

	}

	// Validate Register for IATF link
	@Step
	public void validate_register_for_iatf_link() {

		$(By.xpath("//p[text()='registration for iatf2023']")).isDisplayed();

	}

	// Navigate to back
	@Step
	public void navigate_to_back1() {

		getDriver().navigate().back();

	}

	// Click Download option in pre qualifier forms
	@Step
	public void click_download_option_in_pre_qualifier_forms() throws InterruptedException {

		$(By.xpath("(//img[@data-image-style='original'])[8]")).click();
		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click Trade and investment link in popup
	@Step
	public void to_click_trade_and_investment_link_in_popup() {

		$(By.xpath("//span[text()='Trade and Investment Forum']")).click();

	}

	// To validate Trade and investment page
	@Step
	public void to_validate_trade_and_investment_page() {

		$(By.xpath("//h1[text()='IATF2023 Trade and Investment Forum']")).isDisplayed();

	}

	// To download the programme here link
	@Step
	public void to_download_the_programme_here_link() throws InterruptedException {

		$(By.xpath("//span[text()='DOWNLOAD THE PROGRAMME HERE']")).click();
		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click registor your interest here
	@Step
	public void to_click_registor_your_interest_here() {

		$(By.xpath("(//span[text()='Register YOUR INTEREST'])[1]")).click();

	}

	// Validate registor your interest page
	@Step
	public void validate_registor_your_interest_page() {

		$(By.xpath("//h1[text()='Access your account']")).isDisplayed();

	}

	// To click Exhibitions link in popup
	@Step
	public void to_click_exhibitions_link_in_popup() {

		$(By.xpath("//span[text()='Exhibitions']")).click();

	}

	// To validate Exhibitions page
	@Step
	public void to_validate_exhibitions_page() {

		$(By.xpath("//h5[text()='EXPLORE EXHIBITIONS']")).isDisplayed();

	}

	// To click View Stand packages
	@Step
	public void to_click_view_stand_packages() throws InterruptedException {

		$(By.xpath("//span[text()='VIEW STAND PACKAGES']")).click();
		Thread.sleep(5000);
		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click Register to exhibit option
	@Step
	public void to_click_register_to_exhibit_option() {

		$(By.linkText("Register to exhibit")).click();
	}

	// Validate Register to exhibit option page
	@Step
	public void validate_register_to_exhibit_option_page() {
		boolean displayed = $(By.xpath("//h1[text()='Tell us a bit about yourself']")).isDisplayed();
	}

	// To click discover our exhibiting options
	@Step
	public void to_click_discover_our_exhibiting_options() {

		$(By.linkText("Discover our exhibiting options")).click();
	}

	// To validate discover our exhibitinh options page
	@Step
	public void to_validate_discover_our_exhibitinh_options_page() {

		$(By.xpath("//h2[text()='Your direct route into a single African market']")).isDisplayed();
	}

	// To click Creative Africa nexus link in popup
	@Step
	public void to_click_creative_africa_nexus_link_in_popup() {

		$(By.xpath("//span[text()='Creative Africa Nexus']")).click();

	}

	// To validate Creative Africa nexus page
	@Step
	public void to_validate_creative_africa_nexus_page() {

		$(By.xpath("//h2[text()='Creative Africa Nexus (CANEX) ']")).isDisplayed();

	}

	// To click view canex stand packages link
	@Step
	public void to_click_view_canex_stand_packages_link() throws InterruptedException {

		$(By.xpath("//span[text()='VIEW THE CANEX STAND PACKAGES']")).click();

		Thread.sleep(5000);

		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);
	}

	// To click AU Youth Start ups in popup
	@Step
	public void to_click_au_youth_start_ups_in_popup() {

		$(By.xpath("//span[text()='AU Youth Start-Ups']")).click();

	}

	// To validate AU Youth Start ups page
	@Step
	public void to_validate_au_youth_start_ups_page() {

		$(By.xpath("//h2[text()='AU Youth Start-Up programme']")).isDisplayed();

	}

	// To click Get more information
	@Step
	public void to_click_get_more_information() throws InterruptedException {

		$(By.xpath("//span[text()='GET More Information']")).click();

		Thread.sleep(5000);

		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click African automotive show in popup
	@Step
	public void to_click_african_automotive_show_in_popup() {

		$(By.xpath("//span[text()='Africa Automotive Show']")).click();

	}

	// To validate African automotive show page
	@Step
	public void to_validate_african_automotive_show_page() {

		$(By.xpath("//h5[text()='The Africa Automotive Show']")).isDisplayed();

	}

	// To click Register to exhibit
	@Step
	public void to_click_register_to_exhibit() {

		$(By.xpath("//span[text()='Register to exhibit']")).click();

	}

	// To validate Register to exhibit
	@Step
	public void to_validate_register_to_exhibit() {

		$(By.xpath("//h1[text()='Tell us a bit about yourself']")).isDisplayed();

	}

	// To click Register to visit
	@Step
	public void to_click_register_to_visit() throws InterruptedException {

		$(By.xpath("//span[text()='Register to visit']")).click();

		Thread.sleep(5000);

		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click appy here to download form
	@Step
	public void to_click_appy_here_to_download_form() throws InterruptedException {

		$(By.linkText("Apply here by downloading the application form ")).click();
		Thread.sleep(5000);

		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

	// To click Country days in popup
	@Step
	public void to_click_country_days_in_popup() {

		$(By.xpath("//span[text()='Country Days']")).click();

	}

	// To validate Country days page
	@Step
	public void to_validate_country_days_page() {

		$(By.xpath("//h2[text()='Country Day']")).isDisplayed();

	}

	// To click Register here option
	@Step
	public void to_click_register_here_option() {

		$(By.xpath("//span[text()='REGISTER HERE']")).click();

	}

	// To validate register here page
	@Step
	public void to_validate_register_here_page() {

		$(By.xpath("//p[text()='registration for iatf2023']")).isDisplayed();

	}

	// To click Gallery in popup
	@Step
	public void to_click_gallery_in_popup() {

		$(By.xpath("//span[text()='Gallery']")).click();

	}

	// To validate Gallery page
	@Step
	public void to_validate_gallery_page() {

		$(By.xpath("//h2[text()='Gallery']")).isDisplayed();

	}

	// To click CLICK HERE to view gallery
	@Step
	public void to_click_click_here_to_view_gallery() throws InterruptedException {

		$(By.xpath("//span[text()='Click Here To View Our Gallery']")).click();

		Thread.sleep(5000);

		String windowHandle = getDriver().getWindowHandle();

		getDriver().switchTo().window(windowHandle);

	}

}
