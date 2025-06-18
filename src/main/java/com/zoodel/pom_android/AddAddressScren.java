package com.zoodel.pom_android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressScren {
    AndroidDriver driver;

    AddAddressScren(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'First Name')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement firstNameTextfield;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Last Name')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement lastNameTextfield;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Mobile')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement mobileTextfield;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Additional number')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement additionalNumberTextfield;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Email')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement emailTextfield;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'District')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement districtTextfield;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Street')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement streetTextfield;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'House/Building Number')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement housingNumberTextfield;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Apartment number')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement apartmentNumberTextfield;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Zip Code')]/following-sibling::android.widget.LinearLayout//android.widget.EditText")
    WebElement zipCodeTextfield;
    @FindBy(xpath = "//android.widget.Button[contains(@text,'Save address')]")
    WebElement saveAdddressButton;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Region')]/following-sibling::android.widget.LinearLayout")
    WebElement regionDropdown;

    public AndroidDriver getDriver() {
        return driver;
    }

    public WebElement getFirstCityOption() {
        return firstCityOption;
    }

    public WebElement getSaveAsDefaultAddressRadioButton() {
        return saveAsDefaultAddressRadioButton;
    }

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'City')]/following-sibling::android.widget.LinearLayout")
    WebElement cityDropdown;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Choose Region')]")
    WebElement chooseRegionText;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'id/list')]//android.widget.CheckBox")
    WebElement firstRegionoption;
    @FindBy(xpath = "//android.widget.Button[@text='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'id/list')]//android.widget.CheckBox")
    WebElement firstCityOption;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Save as default address\"]/preceding-sibling::android.widget.ToggleButton")
    WebElement saveAsDefaultAddressRadioButton;


    public WebElement getRequiredCity(String cityName) {
        return driver.findElement(By.xpath("//android.widget.TextView[@text='" + cityName + "']/preceding-sibling::android.widget.CheckBox"));
    }

    public WebElement getRequiredRegion(String regionName) {
        return driver.findElement(By.xpath("//android.widget.TextView[@text='" + regionName + "']/preceding-sibling::android.widget.CheckBox"));
    }

    public WebElement getFirstNameTextfield() {
        return firstNameTextfield;
    }

    public WebElement getLastNameTextfield() {
        return lastNameTextfield;
    }

    public WebElement getMobileTextfield() {
        return mobileTextfield;
    }

    public WebElement getAdditionalNumberTextfield() {
        return additionalNumberTextfield;
    }

    public WebElement getEmailTextfield() {
        return emailTextfield;
    }

    public WebElement getDistrictTextfield() {
        return districtTextfield;
    }

    public WebElement getStreetTextfield() {
        return streetTextfield;
    }

    public WebElement getHousingNumberTextfield() {
        return housingNumberTextfield;
    }

    public WebElement getApartmentNumberTextfield() {
        return apartmentNumberTextfield;
    }

    public WebElement getZipCodeTextfield() {
        return zipCodeTextfield;
    }

    public WebElement getSaveAdddressButton() {
        return saveAdddressButton;
    }

    public WebElement getRegionDropdown() {
        return regionDropdown;
    }

    public WebElement getCityDropdown() {
        return cityDropdown;
    }

    public WebElement getChooseRegionText() {
        return chooseRegionText;
    }

    public WebElement getFirstRegionoption() {
        return firstRegionoption;
    }

    public WebElement getNextButton() {
        return nextButton;
    }
}
