package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionScreen {
    AndroidDriver driver;
    ProductDescriptionScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this.getClass());
    }
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Home\"]")
    WebElement homeIcon;
    @FindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.zoodel.kz:id/imgCart\"]")
    WebElement cartIcon;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"back\"]")
    WebElement backIcon;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/textview_product_name\"]")
    WebElement productNameText;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/textview_product_name\"]/following-sibling::android.widget.LinearLayout/android.widget.ToggleButton")
    WebElement wishlistIcon;
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.zoodel.kz:id/textview_product_name\"]/following-sibling::android.widget.LinearLayout/android.widget.ImageView")
    WebElement shareIcon;
    @FindBy(xpath = "//android.widget.Button[@text=\"BUY NOW\"]")
    WebElement buyNowButton;
    @FindBy(xpath = "//android.widget.Button[@text=\"Add to Cart\"]")
    WebElement addToCartButton;
    @FindBy(xpath = "//android.widget.TextView[@@text=\"Description\"]")
    WebElement descriptionText;

}
