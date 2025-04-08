package com.zoodel.StepGroup;

import com.zoodel.generic_android.GlobalVariable;
import com.zoodel.pom_android.BaseScreen;
import com.zoodel.utility.BaseUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.NoSuchElementException;

public class StepGroup extends GlobalVariable {
    {
        log = LogManager.getLogger(this.getClass());
    }

    public static void openZoodApp(boolean noReset) throws URISyntaxException, MalformedURLException {
        GlobalVariable.noReset = noReset;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:platformName", "android");
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:noReset", noReset);
        cap.setCapability("appium:autoGrantPermissions", autoDrantPermissions);
        cap.setCapability("appium:app", appPath);
        androidDriver = new AndroidDriver(new URI(appiumUrl).toURL(), cap);
        try {

        } catch (Exception e) {
            Reporter.log(e.getLocalizedMessage(), true);
        }
        log.info("Android driver launched successfully");
        actions = new Actions(androidDriver);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        baseUtility = new BaseUtility(androidDriver);
        baseScreen = new BaseScreen(androidDriver);
        log.info("Application launched successfully");
    }

    public static void loginToZoodApp() {
        if (!noReset) {
            WebElement CountryOption = baseScreen.countryScreen.getCountryOption(market);
            baseUtility.waitUntill.elementToBeCLickable(CountryOption);
            Reporter.log("Navigated to Country screen", true);
            log.info("Navigated to Country screen");
            baseUtility.elementFunctions.clickOnElement(CountryOption);
            WebElement continueButton = baseScreen.countryScreen.getContinueButton();
            Reporter.log("Successfully searched the Continue button element", true);
            baseUtility.elementFunctions.clickOnElement(continueButton);
            log.info("Clicked on Continue button");
            WebElement selectLanguageText = baseScreen.selectLanguageBottomScreen.getselectLanguageText();
            baseUtility.waitUntill.elementToBeVisible(selectLanguageText);
            WebElement languageOption = baseScreen.selectLanguageBottomScreen.languageOption("English");
            baseUtility.elementFunctions.clickOnElement(languageOption);
            Reporter.log("Navigated to educational screen", true);
            log.info("Language selected and navigated to Educational screen");
        }
        try {
            WebElement skipButton = baseScreen.educationalBannerScreen.getSkipButton();
            baseUtility.elementFunctions.clickOnElement(skipButton);
            log.info("Navigated to home screen");
            WebElement closeIcon = baseScreen.zmHomeScreen.getAppLaunchBannerCloseIcon();
            baseUtility.elementFunctions.clickOnElement(closeIcon);
            log.info("Closed the App Launch Banner");
        } catch (NoSuchElementException e) {
            log.info("App launch Banner is not Displayed", true);
        }
        WebElement accountIcon = baseScreen.zmHomeScreen.getAccountIcon();
        baseUtility.waitUntill.elementToBeCLickable(accountIcon);
        baseUtility.elementFunctions.clickOnElement(accountIcon);
        log.info("Navigated to account screen");
        WebElement phoneNumberTextfield = baseScreen.loginScreen.getPhoneNumberTextfield();
        log.info("Navigated to Login screen");
        baseUtility.waitUntill.elementToBeCLickable(phoneNumberTextfield);
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
        isHidden = baseUtility.driverMethods.hideSoftKeyBoard();
        Assert.assertTrue(isHidden);
        WebElement confirmButton = baseScreen.otpScreen.getConfirmButton();
        baseUtility.elementFunctions.clickOnElement(confirmButton);
        log.info("Logged in successfully");
    }

    public static void logout() {
        log.info("Logout function start to executed", true);
        WebElement accountIcon = baseScreen.zmHomeScreen.getAccountIcon();
        baseUtility.waitUntill.elementToBeCLickable(accountIcon);
        baseUtility.elementFunctions.clickOnElement(accountIcon);
        softAssert.assertTrue(accountIcon.isDisplayed());
        log.info("Navigated to Account screen", true);
        WebElement settingIcon = baseScreen.accountScreen.getSettingIcon();
        baseUtility.waitUntill.elementToBeCLickable(settingIcon);
        settingIcon.click();
        log.info("Navigated to Account Setting screen", true);
        String signOut = "//android.widget.TextView[@text='Sign Out']";
        baseUtility.driverMethods.swipeUpTillElementToBeVisible(signOut, "up", 3);
        WebElement signOutButton = baseScreen.accountSettingScreen.getSignOutbutton();
        signOutButton.click();
        accountIcon = baseScreen.zmHomeScreen.getAccountIcon();
        baseUtility.waitUntill.elementToBeVisible(accountIcon);
        log.info("Navigated to Home screen", true);
        accountIcon.click();
        WebElement inputYourPhoneNumberText = baseScreen.loginScreen.getInputYourPhoneNumberText();
//        inputYourPhoneNumberText.getDomAttribute()
        String acttext = inputYourPhoneNumberText.getDomAttribute("text");
        String expectText = "Input your phone number";
        Assert.assertTrue(inputYourPhoneNumberText.isDisplayed());
        softAssert.assertEquals(acttext, expectText);
        log.info("Successfully Logged out", true);
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
        WebElement homeIcon=baseScreen.zmHomeScreen.getHomeIcon();
        baseUtility.waitUntill.elementToBeVisible(homeIcon);
        Assert.assertTrue(homeIcon.isDisplayed());
    }
}
