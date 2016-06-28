package com.dn.common;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Common {
	
	public Common(WebDriver driver){
		
	}
	public void implicitWait(int waitForTime ,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(waitForTime, TimeUnit.SECONDS);
	}
	
	
	public void click(By locator ,WebDriver driver) {
		driver.findElement(locator).click();
	}
	
	public void write(By locator,String input , WebDriver driver) {
		driver.findElement(locator).sendKeys(input);
	}
	
	// This method is used to take the screen shot
		public void takeScreenShot(WebDriver driver) {
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy
			// somewhere
			try {
				FileUtils.copyFile(scrFile, new File("Config\\ScreenShot"+getDate()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public String getDate() {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			   Date date = new Date();
			String id = "Test" + dateFormat.format(date);
			   return id;
		}

}
