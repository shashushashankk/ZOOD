package com.zoodel.pom_android;

import com.zoodel.generic_android.GlobalVariable;

import io.appium.java_client.android.AndroidDriver;

public class BaseScreen extends GlobalVariable {
    public AccountScreen accountScreen;
    public AccountSettingScreen accountSettingScreen;
    public CountryScreen countryScreen;
    public EducationalBannerScreen educationalBannerScreen;
    public LoginScreen loginScreen;
    public OTPScreen otpScreen;
    public SelectLanguageBottomScreen selectLanguageBottomScreen;
    public ZMHomeScreen zmHomeScreen;
    public CartScreen cartScreen;
    public DeliveryScreeen deliveryScreeen;
    public EKYCScreen ekycScreen;
    public PaymentMethodScreen paymentMethodScreen;
    public ProductDescriptionScreen productDescriptionScreen;
    public ProductListScreen productListScreen;
    public SearchScreen searchScreen;


    public BaseScreen(AndroidDriver driver) {
        accountScreen = new AccountScreen(driver);
        accountSettingScreen = new AccountSettingScreen(driver);
        countryScreen = new CountryScreen(driver);
        educationalBannerScreen = new EducationalBannerScreen(driver);
        loginScreen = new LoginScreen(driver);
        otpScreen = new OTPScreen(driver);
        selectLanguageBottomScreen = new SelectLanguageBottomScreen(driver);
        zmHomeScreen = new ZMHomeScreen(driver);
        cartScreen = new CartScreen(driver);
        deliveryScreeen = new DeliveryScreeen(driver);
        ekycScreen = new EKYCScreen(driver);
        paymentMethodScreen = new PaymentMethodScreen(driver);
        productListScreen = new ProductListScreen(driver);
        productDescriptionScreen = new ProductDescriptionScreen(driver);
        searchScreen = new SearchScreen(driver);
    }
}
