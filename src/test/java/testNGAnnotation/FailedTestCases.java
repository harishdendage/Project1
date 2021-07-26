package testNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("Test 1 is running");	
		Assert.fail();
	}
	@Test(groups= {"sanity","smoke"})
	public void test2() {
		System.out.println("Test 2 is running");	
		Assert.fail();
	}
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("Test 3 is running");	
	}
	@Test(groups= {"sanity"})
	public void test4() {
		System.out.println("Test 4 is running");	
	}

}
