package com.zoodel.utility;

import org.testng.annotations.DataProvider;

public class DataDrivenData {
    @DataProvider(name = "Amazon Product Details")
    public String[] amazonData(){
        String[] product={"one plus mobile","Samusung Galaxy s25", "Iphone 16pro Max","Mi 11x","Vivo v15 pro"};
        return product;
    }
}
