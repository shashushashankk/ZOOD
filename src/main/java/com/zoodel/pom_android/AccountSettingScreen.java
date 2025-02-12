package com.zoodel.pom_android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class AccountSettingScreen extends GlobalVariable{
	public AccountSettingScreen(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath = "//android.widget.TextView[@text='Account Settings']"),
		@FindBy(id = "com.zoodel.kz.uat:id/textview_actionbar_title")})
	WebElement accountSettingText;
	
	@FindAll({@FindBy(xpath = "//android.widget.TextView[@text='Sign Out']")})
	WebElement signOutbutton;

	public WebElement getAccountSettingText() {
		return accountSettingText;
	}

	public WebElement getSignOutbutton() {
		return signOutbutton;
	}
	
//	@FindBys({@FindBy(id = "com.zoodel.kz.uat:id/textview_actionbar_title"), 
//		@FindBy(xpath = "//android.widget.TextView[@text='Account Settings']")})
//	WebElement accountSettingText;
//	
//	@FindBys({@FindBy(id = "com.zoodel.kz.uat:id/textview_actionbar_title"), 
//		@FindBy(xpath = "//android.widget.TextView[@text='Account Settings']")})
//	WebElement accountSettingText;
//	
//	@FindBys({@FindBy(id = "com.zoodel.kz.uat:id/textview_actionbar_title"), 
//		@FindBy(xpath = "//android.widget.TextView[@text='Account Settings']")})
//	WebElement accountSettingText;
//	
//	@FindBys({@FindBy(id = "com.zoodel.kz.uat:id/textview_actionbar_title"), 
//		@FindBy(xpath = "//android.widget.TextView[@text='Account Settings']")})
//	WebElement accountSettingText;
//	
//	@FindBys({@FindBy(id = "com.zoodel.kz.uat:id/textview_actionbar_title"), 
//		@FindBy(xpath = "//android.widget.TextView[@text='Account Settings']")})
//	WebElement accountSettingText;
	

}
