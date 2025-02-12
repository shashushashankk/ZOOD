package com.zoodel.pom_android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class OTPScreen extends GlobalVariable {
	public OTPScreen(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
			@FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.zoodel.kz.staging_main:id/cons_otp_verify\"]/android.widget.TextView[1]") })
	WebElement OTPText;

	@FindAll({ @FindBy(xpath = "//android.widget.TextView[normalize-space(@text)='Enter OTP Code']") })
	WebElement enterOTPCodeText;
	
	@FindAll({ @FindBy(xpath = "//android.widget.TextView[starts-with(@text,'+9')]") })
	WebElement mobileNumberText;
	
	@FindAll({ @FindBy(id = "com.zoodel.kz.staging_main:id/edittext_otp"),
			@FindBy(xpath = "//android.widget.EditText[@resource-id='com.zoodel.kz.staging_main:id/edittext_otp']") })
	WebElement OTPTextfield;
	
	@FindAll({@FindBy(id = "com.zoodel.kz.staging_main:id/tv_pin_not_receive"),
			@FindBy(xpath = "//android.widget.TextView[ends-with(@text,'receive pin?')]") })
	WebElement didntReceivPintext;
	
	@FindAll({@FindBy(id = "com.zoodel.kz.staging_main:id/tv_send_sms_again"),
		@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Send again')]") })
	WebElement sendAgainLink;
	
	@FindAll({@FindBy(id = "com.zoodel.kz.staging_main:id/textview_timer"),
		@FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Send again')]/following-sibling::android.widget.TextView") })
	WebElement timerText;
	
	@FindAll({@FindBy(id = "com.zoodel.kz.staging_main:id/btn_get_otp"),
		@FindBy(xpath = "//android.widget.Button[contains(@text,'Confirm')]") })
	WebElement confirmButton;

	public WebElement getOTPText() {
		return OTPText;
	}

	public WebElement getEnterOTPCodeText() {
		return enterOTPCodeText;
	}

	public WebElement getMobileNumberText() {
		return mobileNumberText;
	}

	public WebElement getOTPTextfield() {
		return OTPTextfield;
	}

	public WebElement getDidntReceivPintext() {
		return didntReceivPintext;
	}

	public WebElement getSendAgainLink() {
		return sendAgainLink;
	}

	public WebElement getTimerText() {
		return timerText;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}
}