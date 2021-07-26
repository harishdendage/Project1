package testNGAnnotation;

import org.testng.annotations.Test;

public class Keywords {
	@Test(priority=-10,enabled=false)
	public void xyz() {
		System.out.println("XYZ is running");
	}
	@Test(priority=-10,invocationCount=3)
	public void abc() {
		System.out.println("ABC is running");
	}
	@Test(priority=-5)
	public void def() {
		System.out.println("DEF is running");
	}
	@Test(priority=2)
	public void mno() {
		System.out.println("MNO is running");
	}

}
