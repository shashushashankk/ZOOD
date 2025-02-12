package com.zoodel.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class WaitUntill extends GlobalVariable {
	WebDriverWait wait = null;

	public WaitUntill(AndroidDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
	}

	public void elementToBeCLickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void elementToBeCLickable(String locatorType, String locator) {
		By ele = null;
		switch (locatorType) {
		case "id": {
			ele = By.id(locator);
		}
		case "name": {
			ele = By.id(locator);
		}
		case "tagname": {
			ele = By.id(locator);
		}
		case "linktext": {
			ele = By.id(locator);
		}
		case "partiallinktext": {
			ele = By.id(locator);
		}
		case "xpath": {
			ele = By.id(locator);

		}
		}
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void elementToBeVisible(String locatorType, String locator) {
		By ele = null;
		switch (locatorType) {
		case "id": {
			ele = By.id(locator);
		}
		case "name": {
			ele = By.id(locator);
		}
		case "tagname": {
			ele = By.id(locator);
		}
		case "linktext": {
			ele = By.id(locator);
		}
		case "partiallinktext": {
			ele = By.id(locator);
		}
		case "xpath": {
			ele = By.id(locator);
		}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	}

	public void elementToBeVisible(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}
