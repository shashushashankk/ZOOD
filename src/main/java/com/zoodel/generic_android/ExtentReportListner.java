package com.zoodel.generic_android;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.util.List;

public class ExtentReportListner extends GlobalVariable implements ITestListener {
    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports = new ExtentReports();
    ExtentTest extentTest;

    @Override
    public void onFinish(ITestContext context) {

        ITestListener.super.onFinish(context);
        extentReports.flush();
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        String reportName = "Automation TEst Report " + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM-yyyy hhmmss")+".html";
        System.out.println("Report path is " + reportName);
        extentSparkReporter = new ExtentSparkReporter("./logs/"+reportName);
        extentSparkReporter.config().setDocumentTitle("Automation Document Title");
        extentSparkReporter.config().setReportName("Automation Report Name");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setJs("console.log('Javascript')");
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Machine Name", System.getProperty("os.name"));
        extentReports.setSystemInfo("Application Name", "ZOOD App");
        extentReports.setSystemInfo("Environment", "Staging");
        List<String> groupsName = context.getCurrentXmlTest().getIncludedGroups();
        if (groupsName != null) {
            extentReports.setSystemInfo("Groups", groupsName.toString());
        }
//        context.
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
        {
            ITestListener.super.onTestSuccess(result);
            extentTest = extentReports.createTest(result.getTestClass().getName());
            extentTest.log(Status.SKIP, result.getTestName() + " is successfully executed");
            WebDriver webdriver = (WebDriver) result.getAttribute("driver");
            TakesScreenshot sc = (TakesScreenshot) webdriver;
            File temp = sc.getScreenshotAs(OutputType.FILE);
            System.out.println("temp file path is " + temp);
            extentTest.addScreenCaptureFromPath(temp.toString());
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        {
            ITestListener.super.onTestSuccess(result);
            extentTest = extentReports.createTest(result.getTestClass().getName());
            extentTest.log(Status.FAIL, result.getTestName() + " is failed to execut");
            WebDriver webdriver = (WebDriver) result.getAttribute("driver");
            TakesScreenshot sc = (TakesScreenshot) webdriver;
            File temp = sc.getScreenshotAs(OutputType.FILE);
            System.out.println("temp file path is " + temp);
            extentTest.addScreenCaptureFromPath(temp.toString());
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.PASS, result.getTestName() + " is successfully executed");
        WebDriver webdriver = (WebDriver) result.getAttribute("driver");
        TakesScreenshot sc = (TakesScreenshot) webdriver;
        File temp = sc.getScreenshotAs(OutputType.FILE);
        System.out.println("temp file path is " + temp);
        extentTest.addScreenCaptureFromPath(temp.toString());
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }
}
