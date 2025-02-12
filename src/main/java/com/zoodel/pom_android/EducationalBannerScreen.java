package com.zoodel.pom_android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class EducationalBannerScreen extends GlobalVariable {
	public EducationalBannerScreen(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//android.widget.TextView[@text='skip']"),
		@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/txt_skip')]") })
	WebElement skipButton;

	@FindAll({ @FindBy(xpath = "//android.widget.Button[@text='Create Account']") })
	WebElement createAccountButton;

	@FindAll({ @FindBy(xpath = "//android.widget.Button[@text='Log in']") })
	WebElement logInButton;
	
	

	public WebElement getSkipButton() {
		return skipButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

}
