package testNGAnnotation;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed successfully"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test Failed"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test class started"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test class finished"+context.getName());
		
	}

}
