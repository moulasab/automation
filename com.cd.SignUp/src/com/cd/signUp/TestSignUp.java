package com.cd.signUp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cd.driver.CreateDriverClass;
import com.dn.common.Common;

public class TestSignUp extends CreateDriverClass{
	WebDriver driver; 
	SignUp signup;
	Common common;
	@BeforeClass
	public void beforeClass() {
	 this.driver = setupMethod();
	 signup = new SignUp(driver);
	 common = new Common(driver);
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://cddev.in/");
		common.implicitWait(40, driver);
	}
	@Test
	public void test() {
		signup.signup("autocatest@gmail.com","test123");
		common.implicitWait(20,driver);
		signup.clickverifylink();
		signup.switchwindow();
		signup.verifygmailLogin("testmail.campus@gmail.com","campusdev");
		common.implicitWait(30,driver);
		signup.switchwindow();
		signup.extraDetail("Test Name");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		common.takeScreenShot(driver);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
