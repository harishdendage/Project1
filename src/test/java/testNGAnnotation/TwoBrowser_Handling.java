package testNGAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TwoBrowser_Handling {
	@Test(timeOut=60000)
	public void afirefox() {
		String path2="E:\\Programme_files\\geckodriver-v0.29.1-win64\\geckodriver.exe\\";
		String k2="webdriver.gecko.driver";
		System.setProperty(k2, path2);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Apache_Maven");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	@Test(timeOut=60000)
	public void achrome() {
		String path1="E:\\\\Programme_files\\\\chromedriver_win32\\\\chromedriver.exe\\";
		String k1= "webdriver.chrome.driver";
		System.setProperty(k1, path1);
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Apache_Maven");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

}
