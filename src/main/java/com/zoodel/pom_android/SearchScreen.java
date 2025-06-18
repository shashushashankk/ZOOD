package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchScreen {
    SearchScreen(AndroidDriver driver){
        PageFactory.initElements(driver, this.getClass());
    }
    @FindBys({@FindBy(xpath = "//android.widget.EditText[contains(@resource-id,'id/etsearch')]")})
    WebElement searchTextfield;
    @FindBys({@FindBy(xpath = "//android.widget.TextView[contains(@text,'All Categories')]")})
    WebElement allCategories;
    @FindBys({@FindBy(xpath = "//android.widget.TextView[@text=\"SEARCH HISTORY\"]/following-sibling::android.widget.LinearLayout//android.widget.ImageView[@resource-id=\"com.zoodel.kz:id/imageview_delete\"]/preceding-sibling::android.widget.TextView")})
    List<WebElement> searchHistoryOptiona;
    @FindBys({@FindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.zoodel.kz:id/imageview_clear\"]")})
    WebElement clearIcon;

    public WebElement getSearchTextfield() {
        return searchTextfield;
    }

    public WebElement getAllCategories() {
        return allCategories;
    }

    public List<WebElement> getSearchHistoryOptiona() {
        return searchHistoryOptiona;
    }

    public WebElement getClearIcon() {
        return clearIcon;
    }
}
