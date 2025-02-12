package com.zoodel.generic_android;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReExecuteFailledTestCases implements IRetryAnalyzer{
	boolean stopReExecution = false;
	int initialCount = 0;
	int reExecutionCount = 2;

	@Override
	public boolean retry(ITestResult result) {
		if(initialCount<reExecutionCount) {
			initialCount++;
			return true;
		}
		return false;
	}
	
}
