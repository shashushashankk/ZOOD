package com.zoodel.pom_android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class SelectLanguageBottomScreen extends GlobalVariable {

	public SelectLanguageBottomScreen(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//android.widget.TextView[@text='Select Language']"),
			@FindBy(xpath = "//android.widget.TextView[normalize-space(@text)='Select Language']") })
	WebElement selectLanguageText;

	public WebElement languageOption(String languageNameinEnglish) {
		String languageXpath = null;
		switch (languageNameinEnglish.toLowerCase()) {
		case "english": {
			languageXpath = "//android.widget.TextView[@text='English']/..";
			break;
		}
		case "russian": {
			languageXpath = "//android.widget.TextView[@text='Русский']/..";
			break;
		}
		case "usbeck": {
			languageXpath = "//android.widget.TextView[@text='O'zbek']/..";
			break;
		}
		case "arabic": {
			languageXpath = "//android.widget.TextView[@text='Русский']/..";
			break;
		}

		default: {
			languageXpath = "//android.widget.TextView[@text='English']/..";
			break;
		}
		}
		return androidDriver.findElement(By.xpath(languageXpath));
	}

	public WebElement getselectLanguageText() {
		return selectLanguageText;
	}
}
