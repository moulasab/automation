package com.cd.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriverClass {
	public CreateDriverClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver setupMethod() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

}
