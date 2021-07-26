package testNGAnnotation;

import org.testng.annotations.Test;

public class MockTestNG {
	@Test(priority=1)
	
	public void A() {
		System.out.println("method A");
		
	}
@Test(priority=1)
	
	public void B() {
		System.out.println("method B");
		
	}
@Test(priority=1)

public void C() {
	System.out.println("method C");
	
}
@Test(priority=1)

public void login() {
	System.out.println("method login");
	
}
}
