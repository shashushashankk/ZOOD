package com.zoodel.pom_android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class AccountScreen extends GlobalVariable {
	public AccountScreen(AndroidDriver androidDriver) {
		PageFactory.initElements(androidDriver, this);
	}

	@FindAll({
			@FindBy(xpath = "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView") })
	WebElement accountStatusMessagetext;

	@FindBy(id = "com.zoodel.kz.uat:id/textview_customer_name")
	WebElement customernameText;

	@FindAll({
			@FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'id/imgSetting')]"),
			@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'textview_customer_name')]/following-sibling::android.widget.ImageView") })
	WebElement settingIcon;
	@FindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.zoodel.kz.uat:id/imgLoyaltyType\"]/..")
	WebElement loyaltyIcon;

	public WebElement getAccountStatusMessagetext() {
		return accountStatusMessagetext;
	}

	public WebElement getCustomernameText() {
		return customernameText;
	}

	public WebElement getSettingIcon() {
		return settingIcon;
	}

	/*
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 * 
	 * @FindBys({
	 * 
	 * @FindBy(xpath =
	 * "//androidx.cardview.widget.CardView[@resource-id=\"com.zoodel.kz.uat:id/llAlert\"]//android.widget.TextView")
	 * }) WebElement accountStatusMessagetext;
	 */

}
