package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryScreeen {
    AndroidDriver driver;
    DeliveryScreeen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this.getClass());
    }

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Delivery\"])[2]")
    WebElement deliverText;
    @FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"com.zoodel.kz:id/layout_tab1\"]/android.widget.TextView[@text='Delivery']")
    WebElement deliverTabText;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/textview_product_name\"]")
    WebElement productName;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/textview_product_price\"]")
    WebElement productPrice;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/tv_shipping_fee_text\"]/following-sibling::android.widget.TextView")
    WebElement shipFeePrice;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/tv_estimated_delivery_text\"]/following-sibling::android.widget.TextView")
    WebElement deliveryDateText;
    @FindBy(xpath = "//android.widget.TextView[@text='Edit Delivery Options']")
    WebElement editDeliveryText;
    @FindBy(xpath = "//android.widget.Button[@text='Continue']")
    WebElement continueButton;

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getDeliverText() {
        return deliverText;
    }

    public WebElement getDeliverTabText() {
        return deliverTabText;
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getProductPrice() {
        return productPrice;
    }

    public WebElement getShipFeePrice() {
        return shipFeePrice;
    }

    public WebElement getDeliveryDateText() {
        return deliveryDateText;
    }

    public WebElement getEditDeliveryText() {
        return editDeliveryText;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
