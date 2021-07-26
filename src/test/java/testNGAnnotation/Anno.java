package testNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anno {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before Suite is running");
	}
		
	@BeforeTest
	public void beforetest() {
	System.out.println("before test is running");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class is running");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method is running");
	}
	@Test
	public void test1() {
		System.out.println("test1 is running");
	}
	@Test
	public void test2() {
		System.out.println("test 2 is running");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is running");
	}
	@AfterClass
	public void afterclass(){
		System.out.println("after class is running");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test is running");
	}

	@AfterSuite
	public void aftersuit() {
		System.out.println("after suite is running");

	}

}
