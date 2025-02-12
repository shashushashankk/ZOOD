package com.zoodel.pom_android;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class BaseScreen extends GlobalVariable {
	public AccountScreen accountScreen;
	public AccountSettingScreen accountSettingScreen;
	public CountryScreen countryScreen;
	public EducationalBannerScreen educationalBannerScreen;
	public LoginScreen loginScreen;
	public OTPScreen otpScreen;
	public SelectLanguageBottomScreen selectLanguageBottomScreen;
	public ZMHomeScreen zmHomeScreen;

	public BaseScreen(AndroidDriver driver) {
		accountScreen = new AccountScreen(driver);
		accountSettingScreen = new AccountSettingScreen(driver);
		countryScreen = new CountryScreen(driver);
		educationalBannerScreen = new EducationalBannerScreen(driver);
		loginScreen = new LoginScreen(driver);
		otpScreen = new OTPScreen(driver);
		selectLanguageBottomScreen = new SelectLanguageBottomScreen(driver);
		zmHomeScreen = new ZMHomeScreen(driver);
	}

}
