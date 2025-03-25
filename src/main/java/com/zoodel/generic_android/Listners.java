package com.zoodel.generic_android;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.zoodel.utility.BaseUtility;

@Listeners(com.zoodel.generic_android.Listners.class)
public class Listners extends GlobalVariable implements ITestListener {

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
		baseUtility.driverMethods.getBrowserScreenshot(result.getName(),androidDriver);
		if(result.getMethod().getRetryAnalyzerClass()==null) {
			result.getMethod().setRetryAnalyzerClass(com.zoodel.generic_android.ReExecuteFailledTestCases.class);
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Execution skipped at " + baseUtility.dateAndTime.convertMIliSecondToDate(result.getStartMillis()),
				true);
		baseUtility.driverMethods.getBrowserScreenshot(result.getName(),androidDriver);
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

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
