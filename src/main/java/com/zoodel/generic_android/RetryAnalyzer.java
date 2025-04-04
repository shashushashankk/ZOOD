package com.zoodel.generic_android;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int initCount=0;
    int maxRetry=2;
    @Override
    public boolean retry(ITestResult result) {

        if(initCount<maxRetry){
            initCount++;
            return true;
        }
        return false;
    }
}
