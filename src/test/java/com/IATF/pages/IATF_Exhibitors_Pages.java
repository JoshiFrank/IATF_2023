package com.IATF.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class IATF_Exhibitors_Pages extends PageObject {

	// To click the Exhibitors button
	@Step
	public void to_click_the_exhibitors_button() {

		$(By.xpath("//button[contains(text(),' Exhibitors ')]")).click();

	}

	// To click the exibitors Right arrow
	@Step
	public void to_click_the_exibitors_right_arrow() {

		$(By.xpath("//span[contains(text(),'Exhibitors')]")).click();

	}

	// Validate exibitors Page
	@Step
	public void validate_exibitors_page() {

		boolean displayed = $(By.xpath("//h1[contains(text(),'Exhibitors')]")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// Click Registor to exhibit link
	@Step
	public void click_registor_to_exhibit_link() throws InterruptedException {

		$(By.xpath("//span[contains(text(),'REGISTER TO EXHIBIT')]")).click();
		Thread.sleep(5000);
	}

	// To validate registor to exhibit page
	@Step
	public void to_validate_registortoexhibit_page() throws InterruptedException {
		Thread.sleep(9000);

		boolean displayed = $(By.xpath("//h2[contains(text(),'Book your exhibitor space')]")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To navigate back
	@Step
	public void to_navigate_back() throws InterruptedException {

		getDriver().navigate().back();

	}

	// Click registor to visit in exibitors link
	@Step
	public void click_registor_to_visit_in_exibitors_link() throws InterruptedException {
		Thread.sleep(4000);
		$(By.xpath("//span[contains(text(),'REGISTER TO VISIT')]")).click();

	}

	// Validate registor to visit page in exibitors
	@Step
	public void validate_registor_to_visit_page_in_exibitors() throws InterruptedException {
		Thread.sleep(4000);
		boolean displayed = $(By.xpath("//p[contains(text(),'registration for iatf 2023')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click VIEW EXHIBITOR STAND PACKAGES link
	@Step
	public void to_click_view_exhibitor_stand_packages_link() throws InterruptedException {

		$(By.xpath("(//span[contains(text(),'VIEW EXHIBITOR STAND PACKAGES')])[1]")).click();
		Thread.sleep(4000);
		String windowHandle = getDriver().getWindowHandle();
		getDriver().switchTo().window(windowHandle);
	}

	// Validate the PDF of VIEW EXHIBITOR STAND PACKAGES
	@Step
	public void validate_the_pdf_of_view_exhibitor_stand_packages() throws InterruptedException {

		Thread.sleep(5000);
	}

	// To click book to exhibit in exhibitors page
	@Step
	public void to_click_book_to_exhibit_in_exhibitors_page() throws InterruptedException {
		Thread.sleep(4000);
		$(By.xpath("//span[contains(text(),'Book to exhibit')]")).click();

	}

	// Validate book to exhibit register page in exhibitors
	@Step
	public void validate_book_to_exhibit_register_page_in_exhibitors() throws InterruptedException {
		Thread.sleep(4000);
		boolean displayed = $(By.xpath("//h2[contains(text(),'Book your exhibitor space')]")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To click Download the exhibitor manual here link in exhibitors
	@Step
	public void to_click_download_the_exhibitor_manual_here_link_in_exhibitors()
			throws InterruptedException, AWTException {
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) getDriver();

		WebElementFacade manual = $(By.xpath("(//div[@class='wp-block-iatf-iatf-button is-style-primary'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(false)", manual);
		$(By.xpath("(//div[@class='wp-block-iatf-iatf-button is-style-primary'])[2]")).click();
	}

	// Validate exhibitor manual document in exhibitors
	@Step
	public void validate_exhibitor_manual_document_in_exhibitors() throws InterruptedException {

		Thread.sleep(5000);
	}

	// To click Download the list of restricted imports for egypt link in exhibitors
	@Step
	public void to_click_download_the_list_of_restricted_imports_for_egypt_link_in_exhibitors() {

		$(By.xpath("//span[contains(text(),'Download the list of restricted imports for egypt')]")).click();

	}

	// Validate list of restricted imports for egypt document in exhibitors
	@Step
	public void validate_list_of_restricted_imports_for_egypt_document_in_exhibitors() throws InterruptedException {

		Thread.sleep(5000);

	}

	// To click Download the list HERE link in exhibitors
	@Step
	public void to_click_download_the_list_here_link_in_exhibitors() {

		$(By.xpath("//span[contains(text(),'Download the list HERE ')]")).click();

	}

	// Validate the list of exhibiting countries document in exhibitors
	@Step
	public void validate_the_list_of_exhibiting_countries_document_in_exhibitors() throws InterruptedException {

		Thread.sleep(5000);

	}

	// To click FIND OUT MORE link in exhibitor stand award
	@Step
	public void to_click_find_out_more_link_in_exhibitor_stand_award() {

		$(By.xpath("//span[contains(text(),'FIND OUT MORE')]")).click();

	}

	// Validate Exhibitor Stand Award PDF
	@Step
	public void validate_exhibitor_stand_award_pdf() throws InterruptedException {

		Thread.sleep(5000);

	}

	// To click download the brochure in exhibitors
	@Step
	public void to_click_download_the_brochure_in_exhibitors() {

		$(By.xpath("//a[contains(text(),'Download the brochure')]")).click();

	}

	// Validate the brochure document in exhibitors
	@Step
	public void validate_the_brochure_document_in_exhibitors() throws InterruptedException {

		Thread.sleep(5000);

	}

	// Validate the Team call Number
	@Step
	public void validate_the_team_call_number() {

		boolean displayed = $(By.xpath("//h4[contains(text(),'Organise a call to complete')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	// To click Explore IATF virtual link in exhibitors
	@Step
	public void to_click_explore_iatf_virtual_link_in_exhibitors() {

		$(By.xpath("//span[contains(text(),'Explore IATF virtual')]")).click();

	}

	// Validate Explore IATF virtual page in exhibitors
	@Step
	public void validate_explore_iatf_virtual_page_in_exhibitors() throws InterruptedException {

		Thread.sleep(5000);

	}

	// To click VIEW EXHIBITOR STAND PACKAGES two link in exhibitors
	@Step
	public void to_click_view_exhibitor_stand_packages_two_link_in_exhibitors() {

		$(By.xpath("(//span[contains(text(),'VIEW EXHIBITOR STAND PACKAGES')])[2]")).click();

	}

	// Validate VIEW EXHIBITOR STAND PACKAGES two page in exhibitors
	@Step
	public void validate_view_exhibitor_stand_packages_two_page_in_exhibitors() throws InterruptedException {

		Thread.sleep(5000);

	}

	// -----------------------------------------------------------------------------------------------------------------------
	// To validate the exibitorsList page

	// To click the exibitors Listing link
	@Step
	public void to_click_the_exibitors_listing_link() {

		$(By.xpath("//span[contains(text(),'Exhibitor Listing')]")).click();

	}

	// Validate exibitors Listing search page
	@Step
	public void validate_exibitors_listing_search_page() {

		boolean displayed = $(By.xpath("//h2[contains(text(),'Exhibitors')]")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To Enter country name in search box
	@Step
	public void to_enter_country_name_in_search_box() {

		WebElementFacade $ = $(By.xpath("//input[contains(@id,'mat-input-0')]"));
		$.click();
		$.sendKeys("nigeria");
	}

	// To click search button
	@Step
	public void to_click_search_button() {

		$(By.xpath("//span[contains(text(),'Search')]")).click();

	}

	// To Click View this exhibitor button of required exhibitor
	@Step
	public void to_click_view_this_exhibitor_button_of_required_exhibitor() {

		$(By.xpath("(//button[contains(text(),'View this exhibitor')])[1]")).click();

	}

	// Validate the exhibitor details
	@Step
	public void validate_the_exhibitor_details() {

		boolean displayed = $(By.xpath("//div[@class='col-md-12']")).isDisplayed();
		Assert.assertTrue(displayed);

	}

	// To click Reset button
	@Step
	public void to_click_reset_button() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		WebElementFacade reset = $(By.xpath("//span[contains(text(),'Reset')]"));
		js.executeScript("arguments[0].scrollIntoView(false)", reset);

		$(By.xpath("//span[contains(text(),'Reset')]")).click();

	}

	// To click advance search check box
	@Step
	public void to_click_advance_search_check_box() {

		$(By.xpath("//span[contains(text(),'Advanced search ')]")).click();

	}

	// Validate the countries dropdown
	@Step
	public void validate_the_countries_dropdown() throws InterruptedException {

		$(By.xpath("//input[@role='combobox']")).click();
		// List<WebElement> countrys =
		// getDriver().findElements(By.xpath(("//div[@class='ng-dropdown-panel-items
		// scroll-host']/div)[2]/div")));
		for (int i = 1; i <= 56; i++) {

			WebElement country = getDriver()
					.findElement(By.xpath(("(//div[@class='ng-option ng-star-inserted'])[" + i + "]")));

			String countries = country.getText();
			System.out.println(countries);

		}

	}

	// To select exhibitors countries from dropdown
	@Step
	public void to_select_exhibitors_countries_from_dropdown(int num) {

		$(By.xpath(("(//div[@class='ng-option ng-star-inserted'])[" + num + "]"))).click();

	}

	// Validate the business dropdown
	@Step
	public void validate_the_business_dropdown() throws InterruptedException {

		$(By.xpath("(//div[contains(@class,'mat-select-value ng-tns-c118')])[1]")).click();
		for (int i = 1; i <= 13; i++) {
			WebElementFacade list = $(By.xpath("(//mat-option)[" + i + "]"));

			String countries = list.getText();

			System.out.println(countries);

		}
	}

	// To select exhibitors business from dropdown
	@Step
	public void to_select_exhibitors_business_from_dropdown(int num) {

		$(By.xpath("(//mat-option)[" + num + "]")).click();

	}

	// Validate the sector dropdown
	@Step
	public void validate_the_sector_dropdown() throws InterruptedException {

		$(By.xpath("(//div[contains(@class,'mat-select-value ng-tns-c118')])[2]")).click();
		for (int i = 1; i <= 43; i++) {
			WebElementFacade list = $(By.xpath("(//mat-option)[" + i + "]"));

			String countries = list.getText();

			System.out.println(countries);

		}

	}

	// To select exhibitors sector from dropdown
	@Step
	public void to_select_exhibitors_sector_from_dropdown(int num) {

		$(By.xpath("(//mat-option)[" + num + "]")).click();

	}

}
