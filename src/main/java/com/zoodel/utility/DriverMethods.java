package com.zoodel.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class DriverMethods extends GlobalVariable {
	private AndroidDriver driver;

	public DriverMethods(AndroidDriver driver) {
		this.driver = driver;
	}

	public void getBrowserScreenshot(String name) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File temp = screenshot.getScreenshotAs(OutputType.FILE);
		Reporter.log("Screenshot temp path is " + temp);
		File destination = new File(
				screenShotPath + name + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM-yyyy hh-mm-ss") + ".jpg");
		Reporter.log("Screenshot permanent path is " + destination, true);
		try {
			FileUtils.copyFile(temp, destination);
		} catch (Exception e) {
			Reporter.log(e.getLocalizedMessage(), true);
		}
	}

	public boolean hideSoftKeyBoard() {
		if (driver.isKeyboardShown()) {
			driver.hideKeyboard();
			return true;
		}
		return false;
	}
}