package testNGAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGAnnotation.Listeners.class)
public class Listners_Test {
	@Test
	public void test1() {
		String path1="E:\\\\Programme_files\\\\chromedriver_win32\\\\chromedriver.exe\\";
		String k1= "webdriver.chrome.driver";
		System.setProperty(k1, path1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Apache_Maven");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.quit();
		
	}
	@Test
	public void test2() {
		System.out.println("Test 2 Dummy");
		
	}
	@Test
	public void test3() {
		System.out.println("test 3 also Dummy");
		
	}
	

}
