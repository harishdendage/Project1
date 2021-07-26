package PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
	public static String browserName;
	public static String projectpath=System.getProperty("user.dir");
	WebDriver driver;
	
	@Test
	public void settest() {
		PropertiesFiles.getproperties();
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\\\Programme_files\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\\\Programme_files\\\\chromedriver_win32\\\\chromedriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		
	}

}
