package testNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert softAssert=new SoftAssert();
	@Test
	public void hardAssertion() {
		Assert.assertEquals("pass", "pass");
		System.out.println("This line is expected because assertEquals"+"Passed as both the strings are same");
		Assert.assertNull("Assertion");
		System.out.println("Since object is under assertion"+"is not null, assertion will fail "+"This line will not Execute");
		
	}
	@Test
	public void softassertion() {
		softAssert.assertNull("Assertion");
		System.out.println("we are using softassert in this method"+"  So this line code will be get execcuted even id "+"the Assertion fails"+"\n"+"Whenever we want to execute full test case/method we will use SoftAssertion");
		softAssert.assertAll();
			
	}

	@Test
	public void softAssertEquals() {
		softAssert.assertEquals("This assertion will pass", "This assertion will pass");
		System.out.println("This line is expected because assertEquals" + "Passed as both the strings are same");
 	    softAssert.assertEquals("assertion", "This assertion will fail");
		
		System.out.println("This line will not be execute because assert equal fails as both strings are different also test method will declared as fail");
	    softAssert.assertAll();
	}

}
