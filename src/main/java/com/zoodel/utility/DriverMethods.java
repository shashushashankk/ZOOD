package com.zoodel.utility;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Reporter;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class DriverMethods extends GlobalVariable {
    private AndroidDriver driver;

    public DriverMethods(AndroidDriver driver) {
        this.driver = driver;
    }

    public String getBrowserScreenshot(String name, WebDriver driver) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File temp = screenshot.getScreenshotAs(OutputType.FILE);
        Reporter.log("Screenshot temp path is " + temp);
        File destination = new File(
                screenShotPath + name + baseUtility.dateAndTime.getCurrentDateAndTime("dd-MM-yyyy hh-mm-ss") + ".jpg");
        Reporter.log("Screenshot permanent path is " + destination, true);
        try {
            FileUtils.copyFile(temp, destination);
        } catch (Exception e) {
            Reporter.log(e.getLocalizedMessage(), true);
        }
        return destination.getAbsolutePath();
    }

    public boolean hideSoftKeyBoard() {
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            if (!driver.isKeyboardShown()) {
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public static void swipeUpTillElementToBeVisible(String xpath, String direction, int maxSwipeCount) {
        isDisplayed = false;
        WebElement element = null;
		int initialCount = 0;
        while (!isDisplayed) {
            try {
				if(initialCount==maxSwipeCount){
					break;
				}
				log.info("Searching for element");
                element = androidDriver.findElement(By.xpath(xpath));
				log.info("Element found");
                break;
            } catch (NoSuchElementException e) {
                log.info("Element Not found, swipe started");
                Dimension dimension = androidDriver.manage().window().getSize();
                Point location = androidDriver.manage().window().getPosition();
                int height = dimension.getHeight();
                int width = dimension.getWidth();
                int midX = width / 2;
                int midY = height / 2;
                int startX=0;
                int startY=0;
                int endX=0;
                int endY=0;
                switch (direction.toLowerCase()) {
                    case "up": {
                        startX = midX;
                        endX = midX;
                        startY = midY + midY / 2;
                        endY = midY - midY / 2;
                        break;
                    }
                    case "down": {
                        startX = midX;
                        endX = midX;
                        startY = midY - midY / 2;
                        endY = midY + midY / 2;
                        break;
                    }
                    case "left": {
                        startY = midY;
                        endY = midY;
                        startX = midX + midX / 2;
                        endY = midX - midX / 2;
                        break;
                    }
                    case "right": {
                        startY = midY;
                        endY = midY;
                        startX = midX - midX / 2;
                        endY = midX + midX / 2;
                        break;
                    }
                    default: {
                        Reporter.log("Please select any of these option 'up' or 'down' or 'right' or 'left'", true);
                        break;
                    }
                }
				PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
				Sequence sequence = new Sequence(finger,1);
				sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX,startY));
				sequence.addAction(finger.createPointerDown(0));
				sequence.addAction(finger.createPointerMove(Duration.ofMillis(300),PointerInput.Origin.viewport(),endX,endY));
				sequence.addAction(finger.createPointerUp(0));
				androidDriver.perform(Arrays.asList(sequence));
				initialCount++;
            }
        }
    }
}