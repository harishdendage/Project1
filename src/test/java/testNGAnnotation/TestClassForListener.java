package testNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(testNGAnnotation.I_Test_Listeners.class)

public class TestClassForListener extends I_Test_Listeners{
	@Test
	public void test1() {
		//Assert.fail();
		System.out.println("Test 1 is passed");
		
		
	}

}
