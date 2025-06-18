package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLSuccessScreen {
    AndroidDriver driver;
    CLSuccessScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//android.widget.TextView[@text=\"Congratulations!\"]")
    WebElement congratulatiosText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Congratulations!\"]/following-sibling::android.widget.TextView[1]")
    WebElement CLAmountText;
    @FindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    WebElement continueButton;

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getCongratulatiosText() {
        return congratulatiosText;
    }

    public WebElement getCLAmountText() {
        return CLAmountText;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
