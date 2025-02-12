package com.zoodel.pom_android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class LoginScreen extends GlobalVariable {
	public LoginScreen(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	uat
//	staging_main

	@FindAll({ @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_title')]"),
			@FindBy(xpath = "//android.widget.TextView[contains(@text,'Input your phone number')]") })
	WebElement inputYourPhoneNumberText;

	@FindAll({ @FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/edittext_mobil')]"),
			@FindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'id/ln_phone_number')]//android.widget.EditText") })

	WebElement phoneNumberTextfield;

	@FindAll({ @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'id/btn_get_otp')]"),
			@FindBy(xpath = "//android.widget.Button[normalize-space(@text)='Get OTP']") })
	WebElement getOTPButton;

	@FindAll({ @FindBy(id = "com.zoodel.kz.staging_main:id/btn_email_login"),
			@FindBy(xpath = "//android.widget.Button[normalize-space(@text)='Login with E-mail']") })
	WebElement loginWithEmailButton;

	@FindAll({ @FindBy(id = "com.zoodel.kz.staging_main:id/btn_google_login") })
	WebElement googleIcon;

	@FindAll({ @FindBy(id = "com.zoodel.kz.staging_main:id/btn_fb_login") })
	WebElement faceBookIcon;

	@FindAll({ @FindBy(id = "com.zoodel.kz.staging_main:id/tv_terms_conditions_agree"),
			@FindBy(xpath = "//android.widget.TextView[normalize-space(@text)='By continuing I agree to the ZOOD User Agreement']") })
	WebElement zoodUserAgreementLink;

	public WebElement getInputYourPhoneNumberText() {
		return inputYourPhoneNumberText;
	}

	public WebElement getPhoneNumberTextfield() {
		return phoneNumberTextfield;
	}

	public WebElement getGetOTPButton() {
		return getOTPButton;
	}

	public WebElement getLoginWithEmailButton() {
		return loginWithEmailButton;
	}

	public WebElement getGoogleIcon() {
		return googleIcon;
	}

	public WebElement getFaceBookIcon() {
		return faceBookIcon;
	}

	public WebElement getZoodUserAgreementLink() {
		return zoodUserAgreementLink;
	}

}
