package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentReportClass implements ITestListener {
	public static ExtentTest extenttest;

	public void onStart(ITestContext context) {
		ExtentReportClass.setUp();
	}

	public void onTestStart(ITestResult result) {
		extenttest = extentreport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.addScreenCaptureFromPath(
				ExtentReportClass.captureScreenshot("PassScreenshot", result.getMethod().getMethodName()));

		extenttest.log(Status.PASS, "Test Case Pass name is " + result.getMethod().getMethodName());

		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, "Test Case Fail name is " + result.getMethod().getMethodName());

		extenttest.addScreenCaptureFromPath(
				ExtentReportClass.captureScreenshot("FailScreenshot", result.getMethod().getMethodName()));

		extenttest.log(Status.FAIL, result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, "Test Case Skip name is " + result.getMethod().getMethodName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onFinish(ITestContext context) {
		extentreport.flush();
	}

}
