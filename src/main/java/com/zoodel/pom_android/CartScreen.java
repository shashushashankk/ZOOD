package com.zoodel.pom_android;

import com.aventstack.extentreports.gherkin.model.And;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartScreen {
    AndroidDriver driver;

    CartScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this.getClass());
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Cart\"]")
    WebElement cartText;
    @FindBy(xpath = "//android.widget.Button[@text=\"Select Product\"]")
    WebElement selectProductButton;

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    @FindBy(xpath = "//android.widget.Button[contains(@text,'Checkout')]")
    WebElement checkoutButton;

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getCartText() {
        return cartText;
    }

    public WebElement getSelectProductButton() {
        return selectProductButton;
    }

    public WebElement getRequiredProductCheckbox(String productName) {
        return driver.findElement(By.xpath("//android.widget.TextView[@text='" + productName + "']/../preceding-sibling::android.widget.ToggleButton[@resource-id=\"com.zoodel.kz:id/togglebutton_cart_item\"]\n"));
    }

}
