package com.IATF.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class IATF_Registertoexhibit_Pages extends PageObject {

	// Click Register to Exhibit
	@Step
	public void Click_RegistertoExhibit() {

		$(By.xpath("//a[text()='Register to exhibit']")).click();

	}

	// Select title
	@Step
	public void Select_Title(String Title) throws InterruptedException {

		Thread.sleep(3000);

		$(By.xpath("//*[@id=\"mat-select-2\"]/div/div[1]/span")).click();

		$(By.xpath("//span[text()=' " + Title + " ']")).click();

	}

	// Enter_Firstname
	@Step
	public void Enter_Firstname(String firstname) {

		$(By.xpath("//input[@formcontrolname='firstname']")).type(firstname);

	}

	// Enter last name
	@Step
	public void Enter_lastname(String lastname) {

		$(By.xpath("//input[@placeholder='Your last name']")).typeAndTab(lastname);

	}

	// Enter company
	@Step
	public void Enter_company(String companyname) throws AWTException, InterruptedException {

		$(By.xpath("//input[@placeholder='Company']")).typeAndTab(companyname);

		Robot r = new Robot();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

	}

	// Select_country
	@Step
	public void Select_country(int number) throws AWTException {

		$(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]/span")).click();

		$(By.xpath("(//span[@class='mat-option-text'])[" + number + "]")).click();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	// Select country and enter phone number
	@Step
	public void Enter_phonenumber(String phonenumber) throws AWTException {

		//$(By.className("iti__arrow")).click();

		//$(By.xpath("(//span[@class='iti__country-name'])[98]")).click();

		$(By.xpath("(//input[@autocomplete='off'])[1]")).typeAndTab(phonenumber);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	// Select country and enter Mobile number
	@Step
	public void Enter_Mobilenumber(String mobilenumber) {

		$(By.xpath("(//div[@class='iti__arrow'])[2]")).click();

		$(By.xpath("//span[text()='India']")).click();

		$(By.xpath("(//input[@autocomplete='off'])[2]")).typeAndTab(mobilenumber);

	}

	// Enter Email
	@Step
	public void Enter_email(String email) {

		$(By.xpath("//input[@placeholder='Your email address']")).typeAndTab(email);

	}

	// Enter Website
	@Step
	public void Enter_Website(String website) {

		$(By.xpath("//input[@placeholder='Website']")).typeAndTab(website);

	}

	// Select industry
	@Step
	public void Select_Industry(int indexnumber) {

		$(By.xpath("//*[@id=\"mat-select-3\"]/div/div[2]/div")).click();
		$(By.xpath("(//span[@class='mat-option-text'])[" + indexnumber + "]")).click();

	}

	// Select interests area
	@Step
	public void Select_Interests_area(int Indexnum) {

		$(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]/div")).click();
		$(By.xpath("(//span[@class='mat-option-text'])[" + Indexnum + "]")).click();

	}

	// Click check box
	@Step
	public void Click_checkbox() {

		WebElementFacade check = $(By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div"));

		check.click();

	}

	// Click Submit
	@Step
	public void Click_Submit() {

		$(By.xpath("//button[text()='Submit your interest']")).click();

	}

	// Verify thank you page
	@Step
	public void Verify_thankyou_page() throws AWTException, InterruptedException {

		boolean Thankyoupage = $(By.xpath("//h1[text()='Thank you']")).isDisplayed();
		Assert.assertTrue("true", Thankyoupage);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);

	}

}
