package com.IATF.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class IATF_7day_Programme_Page extends PageObject {

	@Step
	public void to_Click_the_seven_day_programme_link() throws InterruptedException {

		Thread.sleep(2000);
		$(By.xpath("//button[text()=' 7 Day Programme ']")).click();
	}
	@Step
	public void validate_the_seven_day_programme_page() throws InterruptedException {

		Thread.sleep(2000);
		boolean displayed = $(By.xpath("(//figure[@class='wp-block-image size-full'])[1]")).isDisplayed();

		Assert.assertTrue(displayed);
	}
	@Step
	public void validate_the_day_one_programme_details() {

		boolean displayed = $(By.className("wp-block-media-text__content")).isDisplayed();

		Assert.assertTrue(displayed);

	}
	@Step
	public void validate_the_day_two_programme_details() {

		boolean displayed = $(By.xpath("(//div[@class='wp-block-media-text__content'])[2]")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	@Step
	public void validate_the_day_three_programme_details() {

		boolean displayed = $(By.xpath("(//div[@class='wp-block-media-text__content'])[3]")).isDisplayed();

		Assert.assertTrue(displayed);
	}
	@Step
	public void validate_the_day_four_programme_details() {
		boolean displayed = $(By.xpath("(//div[@class='wp-block-media-text__content'])[4]")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	@Step
	public void to_download_the_programme_pdf_of_african_automative_forum() {

		$(By.xpath("(//span[text()='download the programme now'])[1]")).click();
	}
	@Step
	public void validate_the_programme_pdf_of_african_automative_forum() throws InterruptedException {

		Thread.sleep(3000);
		String windowHandle = getDriver().getWindowHandle();
		
		getDriver().switchTo().window(windowHandle);
	}
	@Step
	public void validate_the_day_five_programme_details() {
		
		boolean displayed = $(By.xpath("(//div[@class='wp-block-media-text__content'])[6]")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	@Step
	public void validate_the_day_six_programme_details() {
		boolean displayed = $(By.xpath("(//div[@class='wp-block-media-text__content'])[7]")).isDisplayed();
		Assert.assertTrue(displayed);
	}
	@Step
	public void to_download_the_programme_pdf_of_trade_and_investment_conference() {
		$(By.xpath("(//span[text()='download the programme now'])[2]")).click();
	}
	@Step
	public void validate_the_programme_pdf_of_trade_and_investment_conference() throws InterruptedException {
		Thread.sleep(3000);
		String windowHandle = getDriver().getWindowHandle();
		
		getDriver().switchTo().window(windowHandle);
	}
	@Step
	public void validate_the_day_seven_programme_details() {
		
		boolean displayed = $(By.xpath("(//div[@class='wp-block-media-text__content'])[9]")).isDisplayed();
		
		Assert.assertTrue(displayed);
	}

}
