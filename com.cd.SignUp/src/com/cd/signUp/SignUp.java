package com.cd.signUp;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

import com.dn.common.Common;

public class SignUp extends SignUpConstant {
	WebDriver driver;
	Common common;
	public SignUp(WebDriver driver) {
		this.driver = driver;
		common = new Common(driver);
	}
	
	
	public void signup(String username ,String password) {
		common.click(LOCATOR_FOR_SIGNUP, driver);
		common.write(LOCATOR_FOR_EMAIL_FIELD, username, driver);
		common.write(LOCATOR_FOR_PASSWD_FIELD, password, driver);
		common.click(LOCATOR_FOR_SIGN_IN_BUTTON, driver);
	}
	
	public void clickverifylink() {
		common.click(LOCATOR_FOR_VERIFY_BUTTON, driver);
	}
	
	/**
	 * Close the parent window as it is of no use 
	 */
	public void switchwindow() {
		 Set<String> newwindows = driver.getWindowHandles();
	        Iterator<String> iteratorObj = newwindows.iterator();
	        String parantid = iteratorObj.next();
	        String childid = iteratorObj.next();
	        driver.close();
	        driver.switchTo().window(childid);
	       
	}
	public void verifygmailLogin(String username , String password) {
		common.write(LOCATOR_FOR_GOOGLE_EMAIL_ID_FIELD, username, driver);
        common.click(LOCATOR_FOR_NEXT_BUTTON, driver);
        common.implicitWait(50,driver);
        common.write(LOCATOR_FOR_GOOGLE_PASSWORD_FIELD, password, driver);
        common.click(LOCATOR_FOR_GOOGLE_SIGN_IN_BUTTON, driver);
        common.implicitWait(50,driver);
        common.click(LOCATOR_FOR_FIRST_EMAIL, driver);
        common.implicitWait(50,driver);
        common.click(LOCATOR_FOR_VERIFY_LINK, driver);
    }
	public void extraDetail(String userName) {
		driver.findElement(LOCATOR_FOR_NAME_FIELD).sendKeys(userName);
        driver.findElement(LOCATOR_FOR_GENDER_RADIO_BUTTON).click();
        driver.findElement(LOCATOR_FOR_DATE_FIELD).click();
        driver.findElement(LOCATOR_FOR_DATE_FIELD_IN_CALENDER).click();
        driver.findElement(LOCATOR_FOR_SUBMIT_BUTTON).click();
	}
}
