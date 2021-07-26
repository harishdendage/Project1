package testNGAnnotation;

import org.testng.annotations.Test;

public class Meta_Group {
	@Test(groups="sanity")
	public void test5() {
		System.out.println("Test 5 is running");
	}
	@Test(groups={"sanity","regression"})
	public void test6() {
		System.out.println("Test 6 is running");	
		//Assert.fail();
	}
	@Test(groups="sanity")
	public void test7() {
		System.out.println("Test 7 is running");	
		//Assert.fail();
	}
	@Test(groups="regression")
	public void test8() {
		System.out.println("Test 8 is running");	
	}
	@Test(groups={"regression","smoke"})
	public void test9() {
		System.out.println("Test 9 is running");	
	}

}
