package com.zoodel.utility;

import com.zoodel.StepGroup.StepGroup;
import com.zoodel.generic_android.BaseClass;
import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;

public class BaseUtility extends GlobalVariable {
    public DateAndTime dateAndTime = new DateAndTime();
    public WaitUntill waitUntill = null;
    public StepGroup stepGroup = null;
    public DriverMethods driverMethods = null;
    public ElementFunctions elementFunctions = new ElementFunctions();

    public BaseUtility(AndroidDriver driver) {
        waitUntill = new WaitUntill(driver);
        driverMethods = new DriverMethods(driver);
    }
    public BaseUtility(){

    }
}
