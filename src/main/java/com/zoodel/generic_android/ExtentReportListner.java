package com.zoodel.generic_android;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExtentReportListner extends GlobalVariable implements ITestListener {
    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports = new ExtentReports();
    ExtentTest extentTest;

    @Override
    public void onFinish(ITestContext context) {

        log = LogManager.getLogger(this.getClass());
        ITestListener.super.onFinish(context);
        extentReports.flush();
    }

    @Override
    public void onStart(ITestContext context) {
        log = LogManager.getLogger(this.getClass());
        ITestListener.super.onStart(context);
        String reportName = "Automation Test Report " + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM-yyyy hhmmss") + ".html";
//        log.info("Report path is " + reportName,true);
        extentSparkReporter = new ExtentSparkReporter("./logs/" + reportName);
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
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.SKIP, result.getName() + " is skipped");
        TakesScreenshot sc = (TakesScreenshot) androidDriver;
        File temp = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\ER\\eclipse-workspace\\ZOOD\\logs\\" + "Skip " + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM-yyyy hh-mm-ss") + ".jpg");
        try {
            FileUtils.copyFile(temp, dest);
        } catch (IOException e) {
            Reporter.log(e.getLocalizedMessage());
        }
        System.out.println("temp file path is " + dest);
        extentTest.addScreenCaptureFromPath(dest.getAbsolutePath());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.FAIL, result.getName() + " is failed to execute");

        TakesScreenshot sc = (TakesScreenshot) androidDriver;
        File temp = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("./logs/" + "Succ_" + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM_hh-mm-ss") + ".jpg");
        try {
            FileUtils.copyFile(temp, dest);
        } catch (IOException e) {
            Reporter.log(e.getLocalizedMessage());
        }
        System.out.println("temp file path is " + dest);
        extentTest.addScreenCaptureFromPath(dest.getAbsolutePath());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.PASS, result.getName() + " is successfully executed");
        extentTest.log(Status.PASS, result.getName() + " another message");
        System.out.println("Entered success listner method");
        System.out.println("Initialized driver");
        TakesScreenshot sc = (TakesScreenshot) androidDriver;
        System.out.println("Took Screenshot");
        File temp = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("./logs/" + "Succ_" + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM_hh-mm-ss") + ".jpg");
        System.out.println("dest file created");
        try {
            FileUtils.copyFile(temp, dest);
            System.out.println("Screen shot copied");
        } catch (IOException e) {
            Reporter.log(e.getLocalizedMessage());
            System.out.println("Screen shot copy failed");
        }
        System.out.println("temp file path is " + dest);
        extentTest.addScreenCaptureFromPath(dest.getAbsolutePath());
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }
}
/*package com.zoodel.generic_android;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ExtentReportListener extends GlobalVariable implements ITestListener {
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
        String reportName = "Automation Test Report " + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM-yyyy hhmmss") + ".html";
        System.out.println("Report path is " + reportName);
        extentSparkReporter = new ExtentSparkReporter("./logs/" + reportName);
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
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.SKIP, result.getTestName() + " is skipped");

        WebDriver webdriver = (WebDriver) result.getAttribute("driver");
        if (webdriver != null) {
            takeScreenshot(webdriver, result.getMethod().getMethodName(), "SKIP");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.FAIL, result.getTestName() + " has failed");

        WebDriver webdriver = (WebDriver) result.getAttribute("driver");
        if (webdriver != null) {
            takeScreenshot(webdriver, result.getMethod().getMethodName(), "FAIL");
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        extentTest = extentReports.createTest(result.getTestClass().getName());
        extentTest.log(Status.PASS, result.getTestName() + " is successfully executed");

        WebDriver webdriver = (WebDriver) result.getAttribute("driver");
        if (webdriver != null) {
            takeScreenshot(webdriver, result.getMethod().getMethodName(), "PASS");
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    private void takeScreenshot(WebDriver driver, String methodName, String status) {
        // Create a unique filename for the screenshot
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String screenshotName = methodName + "_" + status + "_" + timestamp + ".png";
        String screenshotPath = "screenshots/" + screenshotName;

        // Take the screenshot and save it to the specified directory
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(screenshotPath));
            // Add the screenshot to the report using the correct path
            extentTest.addScreenCaptureFromPath(screenshotPath);
            System.out.println("Screenshot saved at " + screenshotPath);
        } catch (IOException e) {
            Reporter.log(e.getLocalizedMessage());
        }
    }
}
*/