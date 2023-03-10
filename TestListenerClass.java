package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test CASE PASSED");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test CASE FAILED");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test CASE SKIPPED");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test SUITE STARTED");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test SUITE FINISHED");
	
	}

}
