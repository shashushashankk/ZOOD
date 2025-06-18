package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ProductListScreen {
    AndroidDriver driver;
    ProductListScreen(AndroidDriver driver) {
        this.driver=driver;
        PageFactory.initElements(this.driver, this.getClass());
    }

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text=\"FILTER\"]"),
            @FindBy(xpath = "//android.widget.TextView[@text=\"FILTER\"]/preceding-sibling::android.widget.ImageView")})
    WebElement filterButton;

    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text=\"FILTER\"]"),
            @FindBy(xpath = "//android.widget.TextView[@text=\"SORT\"]/preceding-sibling::android.widget.ImageView")})
    WebElement sortButton;

    @FindBys({@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.zoodel.kz:id/ln_crossed_price\"])[1]/../../preceding-sibling::android.widget.TextView")})
    WebElement firstProductName;

    @FindBys({@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.zoodel.kz:id/ln_crossed_price\"])[1]//android.widget.TextView")})
    WebElement firstProductCrossedPrice;

    @FindBys({@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.zoodel.kz:id/layout_discount\"])[1]/android.widget.TextView")})
    WebElement firstProductDiscountPrice;

    @FindBys({@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.zoodel.kz:id/layout_discount\"])[1]/../following-sibling::android.widget.LinearLayout[1]/android.widget.TextView[2]"),})
    WebElement firstProductSellingPrice;

    public WebElement getFilterButton() {
        return filterButton;
    }

    public WebElement getSortButton() {
        return sortButton;
    }

    public WebElement getFirstProductName() {
        return firstProductName;
    }

    public WebElement getFirstProductCrossedPrice() {
        return firstProductCrossedPrice;
    }

    public WebElement getFirstProductDiscountPrice() {
        return firstProductDiscountPrice;
    }

    public WebElement getFirstProductSellingPrice() {
        return firstProductSellingPrice;
    }
    public WebElement getRequiredProduct(String productName) {
        return driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+productName+"')]"));
    }
}
