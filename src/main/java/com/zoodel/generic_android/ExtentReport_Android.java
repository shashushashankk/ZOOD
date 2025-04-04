package com.zoodel.generic_android;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.List;

public class ExtentReport_Android extends GlobalVariable implements ITestListener {
    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports = new ExtentReports();
    ExtentTest extentTest;
    public  Logger log = LogManager.getLogger(this.getClass());

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        extentReports.flush();
        log.info("Report flushed successfully",true);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        //C:\Users\ER\eclipse-workspace\ZOOD\src\main\resources\Suite Report
        String reportPath = "./src/main/resources/Suite Report/" + context.getCurrentXmlTest().getSuite().getName() + " Report.html";
        log.info("Report path is "+reportPath,true);
        extentSparkReporter = new ExtentSparkReporter(reportPath);
        extentSparkReporter.config().setReportName("Automation Test");
        extentSparkReporter.config().setDocumentTitle("Automation Test");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentReports.setSystemInfo("Machine Name", System.getProperty("os.name"));
        extentReports.setSystemInfo("Environment", System.getProperty("UAT"));
        List groups = context.getCurrentXmlTest().getIncludedGroups();
        if (groups != null) {
            extentReports.setSystemInfo("Groups", groups.toString());
        }
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        extentTest.log(Status.PASS, result.getName() + " execution skipped");
        System.out.println("driver is " + androidDriver);
        String filePath = baseUtility.driverMethods.getBrowserScreenshot(result.getName(), androidDriver);
//        extentTest.log(Status.PASS,"");
        extentTest.addScreenCaptureFromPath(filePath);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        extentTest.log(Status.PASS, result.getName() + " failed to executed");
        System.out.println("driver is " + androidDriver);
        String filePath = baseUtility.driverMethods.getBrowserScreenshot(result.getName(), androidDriver);
        extentTest.log(Status.FAIL, "");
        extentTest.addScreenCaptureFromPath(filePath);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        extentTest.log(Status.PASS, result.getName() + " successfully executed");
        System.out.println("driver is " + androidDriver);
        String filePath = baseUtility.driverMethods.getBrowserScreenshot(result.getName(), androidDriver);
        extentTest.log(Status.PASS, "");
        extentTest.addScreenCaptureFromPath(filePath);
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        extentTest = extentReports.createTest(result.getName());
    }
}
