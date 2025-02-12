package com.zoodel.StepGroup;

import com.zoodel.generic_android.GlobalVariable;
import com.zoodel.pom_android.BaseScreen;
import com.zoodel.utility.BaseUtility;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class StepGroup extends GlobalVariable {
    public static void openZoodApp(boolean noReset){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:platformName", "android");
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:noReset", noReset);
        cap.setCapability("appium:autoGrantPermissions", autoDrantPermissions);
        cap.setCapability("appium:app", appPath);
        try {
            androidDriver = new AndroidDriver(new URI(appiumUrl).toURL(), cap);
        } catch (Exception e) {
            Reporter.log(e.getLocalizedMessage());
        }
        actions = new Actions(androidDriver);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        baseUtility = new BaseUtility(androidDriver);
        baseScreen = new BaseScreen(androidDriver);
        Reporter.log("Applicationed launched successfully", true);
    }

    public static void loginToZoodApp() {
        try {
            WebElement continueButton = baseScreen.selectLanguageBottomScreen.getselectLanguageText();
            baseUtility.elementFunctions.clickOnElement(continueButton);
        } catch (Exception e){
            Reporter.log("Handled",true);
        }
        if(!noReset){
            WebElement CountryOption = baseScreen.countryScreen.getCountryOption(market);
            baseUtility.waitUntill.elementToBeCLickable(CountryOption);
            Reporter.log("Navigated to Country screen", true);
            baseUtility.elementFunctions.clickOnElement(CountryOption);
            WebElement continueButton = baseScreen.countryScreen.getContinueButton();
            Reporter.log("Successfully searched the Continue button element", true);
            baseUtility.elementFunctions.clickOnElement(continueButton);
            WebElement selectLanguageText = baseScreen.selectLanguageBottomScreen.getselectLanguageText();
            baseUtility.waitUntill.elementToBeVisible(selectLanguageText);
            WebElement languageOption = baseScreen.selectLanguageBottomScreen.languageOption("English");
            baseUtility.elementFunctions.clickOnElement(languageOption);
            Reporter.log("Navigated to educational screen", true);
        }
        WebElement skipButton = baseScreen.educationalBannerScreen.getSkipButton();
        baseUtility.elementFunctions.clickOnElement(skipButton);
        WebElement closeIcon = baseScreen.zmHomeScreen.getAppLaunchBannerCloseIcon();
        baseUtility.elementFunctions.clickOnElement(closeIcon);
        Reporter.log("Navigated to home screen", true);
        WebElement accountIcon = baseScreen.zmHomeScreen.getAccountIcon();
        baseUtility.waitUntill.elementToBeCLickable(accountIcon);
        baseUtility.elementFunctions.clickOnElement(accountIcon);
        Reporter.log("Navigated to account screen", true);
        WebElement phoneNumberTextfield = baseScreen.loginScreen.getPhoneNumberTextfield();
        Reporter.log("Navigated to Login screen", true);
//		baseUtility.explicitWait.waitTillElementToBeVisible(phoneNumberTextfield);
        baseUtility.elementFunctions.enterInputIntoElement(phoneNumberTextfield, phoneNumber);
        boolean isHidden = baseUtility.driverMethods.hideSoftKeyBoard();
        assertion.assertTrue(isHidden);
        WebElement getOTPButton = baseScreen.loginScreen.getGetOTPButton();
        baseUtility.elementFunctions.clickOnElement(getOTPButton);
        WebElement enterOTPCodeText = baseScreen.otpScreen.getEnterOTPCodeText();
        baseUtility.waitUntill.elementToBeCLickable(enterOTPCodeText);
        WebElement getOTPText = baseScreen.otpScreen.getOTPText();
        String otp = baseUtility.elementFunctions.getAttributefromTheElement(getOTPText, "text");
        WebElement oTPTextfield = baseScreen.otpScreen.getOTPTextfield();
        baseUtility.elementFunctions.enterInputIntoElement(oTPTextfield, otp);
        baseUtility.driverMethods.hideSoftKeyBoard();
        WebElement confirmButton = baseScreen.otpScreen.getConfirmButton();
        baseUtility.elementFunctions.clickOnElement(confirmButton);
    }
}
