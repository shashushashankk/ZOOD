package com.zoodel.generic_android;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Listners extends GlobalVariable implements ITestListener {
	Logger log = LogManager.getLogger(this.getClass());
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        Reporter.log("Execution started at " + baseUtility.dateAndTime.convertMIliSecondToDate(result.getStartMillis()),
                true);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestSuccess(result);
        Reporter.log("Execution success at " + baseUtility.dateAndTime.convertMIliSecondToDate(result.getStartMillis()),
                true);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        Reporter.log("Execution failed at " + baseUtility.dateAndTime.convertMIliSecondToDate(result.getStartMillis()),
                true);
//		baseUtility.driverMethods.getBrowserScreenshot(result.getName(),androidDriver);
        if (result.getMethod().getRetryAnalyzerClass() == null) {
            result.getMethod().setRetryAnalyzerClass(com.zoodel.generic_android.RetryAnalyzer.class);
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        Reporter.log("Execution skipped at " + baseUtility.dateAndTime.convertMIliSecondToDate(result.getStartMillis()),
                true);
        baseUtility.driverMethods.getBrowserScreenshot(result.getName(), androidDriver);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // TODO Auto-generated method stub
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        ITestListener.super.onStart(context);


    }

}
