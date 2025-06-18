package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardScreen {
    AndroidDriver driver;
    CardScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text=\"Your Card Information\"]")
    WebElement yourCarddInformationText;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"cardNumber\"]")
    WebElement cardNumberTextfield;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"expire\"]")
    WebElement expiredateTextfield;
    @FindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    WebElement continueButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Verify Card\"]")
    WebElement verifyCardText;
    @FindBy(xpath = "//android.view.View[@resource-id=\"cardOtpForm\"]/android.widget.EditText")
    WebElement PINTextfield;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Didnt receive pin?\"]")
    WebElement didntReceivePINLink;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Send Again\"]")
    WebElement sendAgainLink;


}
