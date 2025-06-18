package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoScreen {
    AndroidDriver driver;
    PersonalInfoScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Personal Information']")
    WebElement personalInformationText;
    @FindBy(xpath = "//android.widget.EditText[@text=\"E-mail\"]")
    WebElement emailTextfield;
    @FindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    WebElement continueButton;
    @FindBy(xpath = "//android.widget.EditText[@text=\"E-mail\"]/../../following-sibling::android.widget.TextView")
    WebElement emailErrorMessage;

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getPersonalInformationText() {
        return personalInformationText;
    }

    public WebElement getEmailTextfield() {
        return emailTextfield;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getEmailErrorMessage() {
        return emailErrorMessage;
    }
}
