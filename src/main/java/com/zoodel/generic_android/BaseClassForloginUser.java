package com.zoodel.generic_android;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import com.zoodel.StepGroup.StepGroup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.zoodel.pom_android.BaseScreen;
import com.zoodel.utility.BaseUtility;

import io.appium.java_client.android.AndroidDriver;

@Listeners(com.zoodel.generic_android.Listners.class)
public class
BaseClassForloginUser extends GlobalVariable {
	@BeforeClass
	public void openZoodAndroidApp() throws MalformedURLException, URISyntaxException {
		StepGroup.openZoodApp(noReset);
	}

	@BeforeMethod
	public void loginToTheApplication() {
		StepGroup.loginToZoodApp();
	}

	@AfterMethod
	public void logoutFromTheApplication() {
		// TODO Auto-generated method stub

	}

	@AfterClass(alwaysRun = true)
	public void closeZoodApp() {
//		androidDriver.quit();

	}
}
