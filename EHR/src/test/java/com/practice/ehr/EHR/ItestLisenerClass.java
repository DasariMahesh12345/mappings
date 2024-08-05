package com.practice.ehr.EHR;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestLisenerClass extends Login implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		captureScreenshots(result.getMethod().getMethodName()+".jpg");
		
	}

}
