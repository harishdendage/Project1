package testNGAnnotation;

import org.testng.annotations.Test;

import com.sun.java.swing.plaf.windows.resources.windows;

public class Regular_Expression {
	
	@Test(groups="windows.sanity")
	public void test10() {
		System.out.println("Test 10 is running");	
		//Assert.fail();
	}
	@Test(groups="linux.regression")
	public void test11() {
		System.out.println("Test 11 is running");	
	}
	@Test(groups="windows.regression")
	public void test13() {
		System.out.println("Test 13 is running");	
	}
	@Test(groups={"windows.regression","linux.smoke"})
	public void test12() {
		System.out.println("Test 12 is running");	
	}


}
