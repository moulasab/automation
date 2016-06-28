package com.cd.signUp;

import org.openqa.selenium.By;

public class SignUpConstant {
	public static final By LOCATOR_FOR_SIGNUP =By.xpath(".//*[@id='cdin-landing-intro']/a");
	public static final By LOCATOR_FOR_EMAIL_FIELD = By.id("edit-name");
	public static final By LOCATOR_FOR_PASSWD_FIELD = By.id("edit-pass");
	public static final By LOCATOR_FOR_SIGN_IN_BUTTON = By.id("edit-register");
	public static final By LOCATOR_FOR_VERIFY_BUTTON = By.xpath("//a[text()='Verify Email']");
	public static final By LOCATOR_FOR_GOOGLE_EMAIL_ID_FIELD = By.cssSelector("#Email");
	public static final By LOCATOR_FOR_NEXT_BUTTON = By.id("next");
	public static final By LOCATOR_FOR_GOOGLE_PASSWORD_FIELD = By.id("Passwd");
	public static final By LOCATOR_FOR_GOOGLE_SIGN_IN_BUTTON = By.id("signIn");
	public static final By LOCATOR_FOR_FIRST_EMAIL = By.xpath("//*[@class='Cp']//tr[1]/td[5]");
	public static final By LOCATOR_FOR_VERIFY_LINK = By.xpath("//p[contains(text(),'Hi ')]/following-sibling::p[4]/a");
	public static final By LOCATOR_FOR_NAME_FIELD = By.xpath("//*[@id='edit-userfullname']");
	public static final By LOCATOR_FOR_GENDER_RADIO_BUTTON = By.xpath("//label[text()='Male ']");
	public static final By LOCATOR_FOR_DATE_FIELD = By.id("edit-dob-datepicker-popup-0");
	public static final By LOCATOR_FOR_DATE_FIELD_IN_CALENDER = By.xpath("//a[text()='27']");
	public static final By LOCATOR_FOR_SUBMIT_BUTTON = By.id("edit-submit--3");
}
