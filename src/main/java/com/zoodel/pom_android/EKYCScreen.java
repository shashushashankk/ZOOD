package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EKYCScreen {
    AndroidDriver driver;

    EKYCScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this.getClass());
    }

    @FindBy(xpath = "//android.widget.Button[@text=\"Unlock Now!\"]")
    WebElement unlockNowButton;
    @FindBy(xpath = "//android.widget.ImageView[contains(@resource-id,\"imgClose\")]")
    WebElement closeIcon;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"back\"]")
    WebElement backIcon;
    @FindBy(xpath = "//android.widget.TeView[@text='Identity Document']")
    WebElement identityDocumentText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Date of Birth\"]/following-sibling::android.widget.LinearLayout/android.widget.TextView")
    WebElement dateOfBirthTextfield;
    @FindBy(xpath = "//android.widget.Button[@text='OK']")
    WebElement OKButton;
    @FindBy(xpath = "//android.widget.EditText[@text='Passport or National ID number']")
    WebElement passportOrNationalIDNumberTextfield;
    @FindBy(xpath = "//android.widget.Button[@text='Continue']")
    WebElement continueButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Take a Selfie']")
    WebElement takeASelfieText;
    @FindBy(xpath = "//android.widget.Button[@text='Gallery']")
    WebElement galleryButton;
    @FindBy(xpath = "(//android.widget.FrameLayout[@content-desc=\"Button\"])[1]")
    WebElement photoButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Your identity verification has failed\"]")
    WebElement identityFailedMessageText;
    @FindBy(xpath = "//android.widget.TextView[@text='Albums']")
    WebElement albumsButton;
    @FindBy(xpath = "//android.widget.TextView[@text='Pictures']/../../preceding-sibling::android.widget.FrameLayout[last()]")
    WebElement picturesButton;
    @FindBy(xpath = "//android.widget.FrameLayout[@Text=\"Please wait\"]")
    WebElement pleaseWaitLoader;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Successfully Verified\"]")
    WebElement successMessage;

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getUnlockNowButton() {
        return unlockNowButton;
    }

    public WebElement getCloseIcon() {
        return closeIcon;
    }

    public WebElement getBackIcon() {
        return backIcon;
    }

    public WebElement getIdentityDocumentText() {
        return identityDocumentText;
    }

    public WebElement getDateOfBirthTextfield() {
        return dateOfBirthTextfield;
    }

    public WebElement getOKButton() {
        return OKButton;
    }

    public WebElement getPassportOrNationalIDNumberTextfield() {
        return passportOrNationalIDNumberTextfield;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getTakeASelfieText() {
        return takeASelfieText;
    }

    public WebElement getGalleryButton() {
        return galleryButton;
    }

    public WebElement getPhotoButton() {
        return photoButton;
    }

    public WebElement getIdentityFailedMessageText() {
        return identityFailedMessageText;
    }

    public WebElement getAlbumsButton() {
        return albumsButton;
    }

    public WebElement getPicturesButton() {
        return picturesButton;
    }

    public WebElement getPleaseWaitLoader() {
        return pleaseWaitLoader;
    }


}