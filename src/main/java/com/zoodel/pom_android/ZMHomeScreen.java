package com.zoodel.pom_android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class ZMHomeScreen extends GlobalVariable {
    public ZMHomeScreen(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindAll({@FindBy(id = "//android.widget.TextView[contains(@resource-id,'id/imageview_flashy_banner'")})
    WebElement appLaunchBanner;

    @FindAll({
            @FindBy(xpath = "//android.widget.ImageView[ends-with(@resource-id,'id/imageview_flashy_banner')]/following-sibling::android.widget.ImageView")})
    WebElement appLaunchBannerCloseIcon;
    @FindAll({@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Home\"]"),
            @FindBy(id = "com.zoodel.kz.uat:id/navigation_home")})
    WebElement homeIcon;

    @FindAll({@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Categories\"]"),
            @FindBy(id = "com.zoodel.kz.uat:id/navigation_catalogue")})
    WebElement categoriesIcon;

    @FindAll({@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"ZOOD Pay\"]"),
            @FindBy(id = "com.zoodel.kz.uat:id/navigation_zoodpay")})
    WebElement zoodPayIcon;

    @FindAll({@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Cart\"]"),
            @FindBy(id = "com.zoodel.kz.uat:id/navigation_cart")})
    WebElement cartIcon;

    @FindAll({@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Account\"]"),
            @FindBy(id = "com.zoodel.kz.uat:id/navigation_account")})
    WebElement accounticon;

    @FindAll({@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/textview_search')]")})
    WebElement searchtextfield;

/*@FindAll({ @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Account\"]"),
			@FindBy(id = "com.zoodel.kz.uat:id/navigation_account") })
	WebElement accounticon;*/

    public WebElement getSearchtextfield() {
        return searchtextfield;
    }

    public WebElement getAccounticon() {
        return accounticon;
    }
    public WebElement getAppLaunchBanner() {
        return appLaunchBanner;
    }

    public WebElement getAppLaunchBannerCloseIcon() {
        return appLaunchBannerCloseIcon;
    }

    public WebElement getHomeIcon() {
        return homeIcon;
    }

    public WebElement getCategoriesIcon() {
        return categoriesIcon;
    }

    public WebElement getZoodPayIcon() {
        return zoodPayIcon;
    }

    public WebElement getCartIcon() {
        return cartIcon;
    }

    public WebElement getAccountIcon() {
        return accounticon;
    }

}
