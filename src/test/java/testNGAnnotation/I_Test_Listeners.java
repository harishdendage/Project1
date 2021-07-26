package testNGAnnotation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class I_Test_Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Completed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skipped"+result.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test is failed");
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test has been started"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test has been finished"+context.getName());
		
	}

	

}
