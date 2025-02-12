package com.zoodel.utility;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Reporter;

import com.zoodel.generic_android.GlobalVariable;

import java.time.Duration;
import java.util.Arrays;

public class ElementFunctions extends GlobalVariable {
    public void clickOnElement(WebElement element) {
        element.click();
        Reporter.log("Successfully clicked on element", true);
    }

    public void enterInputIntoElement(WebElement element, String input) {
        element.click();
        element.sendKeys(input);
        Reporter.log("Successfully enter " + input + " on element", true);
    }

    public void clickOnElement(int xCoordinate, int yCoordinate) {
        actions.moveToLocation(xCoordinate, yCoordinate).click().perform();
        Reporter.log("Successfully clicked on element", true);
    }

    public void clickOnElementActions(WebElement element) {
        actions.click(element);
        Reporter.log("Successfully clicked on element", true);
    }

    public String getAttributefromTheElement(WebElement element, String attributeName) {
        return element.getDomAttribute(attributeName);
    }

    public void swipeTillTheElement(WebElement refferenceEle, String targetEleXpath, String direction, int swipeMaxCount) {
        int startXLoc;
        int startYLoc;
        int endXLoc;
        int endYLoc;
        Point location = refferenceEle.getLocation();
        int xCord = location.getX();
        int yCord = location.getY();
        Dimension dimension = refferenceEle.getSize();
        int refHeight = dimension.getHeight();
        int refWidth = dimension.getWidth();
        int midX = xCord + (refWidth / 2);
        int midY = yCord + (refHeight / 2);
        switch (direction.toLowerCase()) {
            case "down": {
                startXLoc = midX;
                startYLoc = midY - (int) (refHeight * 0.25);
                endXLoc = midX;
                endYLoc = midY + (int) (refHeight * 0.25);
                break;
            }
            case "left": {
                startYLoc = midY;
                startXLoc = (int) (midX + (refWidth * 0.25));
                endYLoc = midY;
                endXLoc = (int) (midX - (refWidth * 0.25));
                break;
            }
            case "right": {
                startYLoc = midY;
                startXLoc = (int) (midX - (refWidth * 0.25));
                endYLoc = midY;
                endXLoc = (int) (midX + (refWidth * 0.25));
                break;

            }
            default: {
                startXLoc = midX;
                startYLoc = midY + (int) (refHeight * 0.25);
                endXLoc = midX;
                endYLoc = midY - (int) (refHeight * 0.25);
                break;
            }
        }
        boolean isDisplayed = false;
        int count = 0;
        while (!isDisplayed) {
            try {
                if (count == swipeMaxCount) {
                    break;
                }
                androidDriver.findElement(By.xpath(targetEleXpath));
                isDisplayed = true;
            } catch (NoSuchElementException e) {
                PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                Sequence sequence = new Sequence(finger, 0);
                sequence.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startXLoc, startYLoc));
                sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                sequence.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endXLoc, endYLoc));
                sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
                androidDriver.perform(Arrays.asList(sequence));
            }
        }
    }

    public void swipeTillTheElement(String targetEleXpath, String direction, int swipeMaxCount) {
        int startXLoc;
        int startYLoc;
        int endXLoc;
        int endYLoc;
        Dimension size = androidDriver.manage().window().getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        int midX = (width / 2);
        int midY = (height / 2);
        switch (direction.toLowerCase()) {
            case "down": {
                startXLoc = midX;
                startYLoc = midY - (int) (height * 0.25);
                endXLoc = midX;
                endYLoc = midY + (int) (height * 0.25);
                break;
            }
            case "left": {
                startYLoc = midY;
                startXLoc = (int) (midX + (width * 0.25));
                endYLoc = midY;
                endXLoc = (int) (midX - (width * 0.25));
                break;
            }
            case "right": {
                startYLoc = midY;
                startXLoc = (int) (midX - (width * 0.25));
                endYLoc = midY;
                endXLoc = (int) (midX + (width * 0.25));
                break;

            }
            default: {
                startXLoc = midX;
                startYLoc = midY + (int) (height * 0.25);
                endXLoc = midX;
                endYLoc = midY - (int) (height * 0.25);
                break;
            }
        }
        boolean isDisplayed = false;
        int count = 0;
        while (!isDisplayed) {
            try {
                if (count == swipeMaxCount) {
                    break;
                }
                androidDriver.findElement(By.xpath(targetEleXpath));
                isDisplayed = true;
            } catch (NoSuchElementException e) {
                PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                Sequence sequence = new Sequence(finger, 0);
                sequence.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startXLoc, startYLoc));
                sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                sequence.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), endXLoc, endYLoc));
                sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
                androidDriver.perform(Arrays.asList(sequence));
            }
        }
    }
}

