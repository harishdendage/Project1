package testNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Practice {
	@Test
	public void test1() {
		System.out.println("test 1");
		Assert.assertEquals("ravi","ravi");
		Assert.assertEquals("13","13");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
		Assert.assertNotEquals("Hanumant","ravi");
		Assert.assertNotEquals("15","15");
	}
	@Test
	public void test3() {
		System.out.println("test 3");
	Assert.assertTrue(true);
	}
	@Test
	public void test4() {
		System.out.println("test 4");
		Assert.assertNotEquals("Hanumant","ravi");
		Assert.assertNotEquals("15","16");
		Assert.assertNull(null);
		Assert.assertNotNull("n");
		
	}
	@Test
	public void method1() {
		SoftAssert SoftAssert=new SoftAssert();
		
		
		
	}
	

}
