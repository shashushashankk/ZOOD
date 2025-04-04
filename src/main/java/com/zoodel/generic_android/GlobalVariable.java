package com.zoodel.generic_android;

import com.zoodel.pom_android.BaseScreen;
import com.zoodel.utility.BaseUtility;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class GlobalVariable implements FrameWorkConstants {
	public static WebDriver webdriver = null;
	public static AndroidDriver androidDriver = null;
	public static boolean noReset = false;
	public static boolean autoDrantPermissions = true;
	public static BaseScreen baseScreen = null;
	public static BaseUtility baseUtility = new BaseUtility();
//	public static StepGroup stepGroup = new StepGroup();
	public static String market = "'Uzbekistan'";
	public static int implicitWait = 30;
	public static int explicitWait = 30;
	public static Actions actions = null;
	public static SoftAssert softAssert = new SoftAssert();
	public static Assertion assertion = new Assertion();
	public static Logger log;
	public static boolean isDisplayed;
	static String appiumServerFilePath = "./src/main/resources/Appium Server.bat";

}
