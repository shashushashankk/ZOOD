package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsScreen {
    AndroidDriver driver;

    public ContactDetailsScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Contact Details\"]")
    WebElement contactDetailsText;
    @FindBy(xpath = "//android.view.View[@text=\"Your Full Name\"]/following-sibling::android.view.View[1]//android.widget.EditText")
    WebElement fullNameTextfield;
    @FindBy(xpath = "//android.view.View[@text=\"Mobile Phone\"]/following-sibling::android.view.View[1]//android.widget.EditText")
    WebElement mobileNumberTextfield;
    @FindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    WebElement continueButton;
    @FindBy(xpath = "//android.widget.Image[@text=\"preloader\"]")
    WebElement loaderIcon;

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getContactDetailsText() {
        return contactDetailsText;
    }

    public WebElement getFullNameTextfield() {
        return fullNameTextfield;
    }

    public WebElement getMobileNumberTextfield() {
        return mobileNumberTextfield;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
