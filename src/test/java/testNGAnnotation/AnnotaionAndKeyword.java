package testNGAnnotation;

import org.testng.annotations.Test;

public class AnnotaionAndKeyword {
	@Test(priority=0)
	public void xyz() {
		System.out.println("XYZ is ruuning");
	}
	@Test (priority=1)
	public void abc() {
		System.out.println("ABC is running");
	}
	@Test(priority=300)
	public void def() {
		System.out.println("DEF is running");
	}
	@Test
	public void mno() {
		System.out.println("MNO is running");
	}
	@Test(priority=99)
	public void pqr() {
		System.out.println("PQR is running");
	}

}
