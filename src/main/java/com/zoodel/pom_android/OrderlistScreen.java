package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderlistScreen {
    AndroidDriver driver;

    public OrderlistScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this.getClass());
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Orders & Transactions\"]")
    WebElement ordersAndTransactionstext;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Order Details\"]")
    WebElement firstOrderDetailsButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"All\"]")
    WebElement allButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"ZOOD Mall\"]")
    WebElement zoodMallButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"ZOOD Card\"]")
    WebElement zoodCardButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"In-stores\"]")
    WebElement inStoresButton;
    @FindBy(xpath = "(//android.widget.TextView[contains(@text,\"#\")])[1]/../preceding-sibling::android.widget.LinearLayout/android.widget.TextView")
    WebElement firstOrderStatusText;


    public WebElement getOrdersAndTransactionstext() {
        return ordersAndTransactionstext;
    }

    public WebElement getFirstOrderDetailsButton() {
        return firstOrderDetailsButton;
    }

    public WebElement getAllButton() {
        return allButton;
    }

    public WebElement getZoodMallButton() {
        return zoodMallButton;
    }

    public WebElement getZoodCardButton() {
        return zoodCardButton;
    }

    public WebElement getInStoresButton() {
        return inStoresButton;
    }

    public WebElement getFirstOrderStatusText() {
        return firstOrderStatusText;
    }

    public WebElement getFirstProductName() {
        return firstProductName;
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tvproductname')]")
    WebElement firstProductName;
}
