package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test cases finished and details are-:\t"+ result.getName());
	}
	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test cases start and details are-:\t"+ result.getName());
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test cases finished and details are-:\t"+ result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cases failed and details are-:\t"+ result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cases skipped and details are-:\t"+ result.getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test cases on start and details are-:\t"+ result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases successed and details are-:\t"+ result.getName());
	}
}