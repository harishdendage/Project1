package testNGAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TwoBrowserHandling {
	@Test(timeOut=6000)
	public void afirefox() {
		String path2="E:\\Programme_files\\geckodriver-v0.29.1-win64\\geckodriver.exe\\";
		String k2="webdriver.gecko.driver";
		System.setProperty(k2, path2);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Apache_Maven");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	@Test
	public void fbc() {
		System.out.println("FBC is Running");
	}
	@Test(dependsOnMethods="afirefox")
	public void def() {
	System.out.println("DEF is running");
	
	
		
	}
	

}
