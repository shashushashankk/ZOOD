package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodScreen {
    AndroidDriver driver;
    PaymentMethodScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this.getClass());
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Discounts & Bonuses']")
    WebElement discountsAndBonusestext;
    @FindBy(xpath = "//android.widget.Button[@text='Full Amount']")
    WebElement fullAmountButton;
    @FindBy(xpath = "//android.widget.Button[@text='Installments']")
    WebElement installmentsButton;
    @FindBy(xpath = "//android.widget.RelativeLayout[contains(@resource-id,\"com.zoodel.kz:id/include_double_payment_method\")]")
    WebElement firstInstallmentButton;
    @FindBy(xpath = "//android.widget.Button[@text='Continue']")
    WebElement continueButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Pay cash on delivery\"]/..")
    WebElement payCashOnDelivery;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Pay online via Humocard / UzCard\"]/..")
    WebElement prepaidOption;
    @FindBy(xpath = "//android.widget.TextView[cntains(@text,'I confirm that')]/preceding-sibling::android.widget.ToggleButton")
    WebElement consentCheckbox;
    @FindBy(xpath = "//android.widget.TextView[cntains(@text,'I confirm that')]/preceding-sibling::android.widget.ToggleButton")
    WebElement likeButton;
}
