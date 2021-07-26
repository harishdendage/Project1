package testNGAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pFMaven.ActiTimeHomepagePF;
import pFMaven.ActiTimeLoginPF;

public class ActiTimeTestNGtestclass {
	WebDriver driver;
	ActiTimeLoginPF login;
	ActiTimeHomepagePF home;
	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Programme_files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		login=new ActiTimeLoginPF(driver);
		home=new ActiTimeHomepagePF(driver);
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Closed browser");
		driver.close();
		
	}
	@BeforeMethod
	public void loginActiTime() {
		login.setActiTimeUsernamepf();
		login.setActiTimepwdpf();
		login.verifyActiTimeloginbutton();
	}
	@AfterMethod
	public void logoutActitime() {
		System.out.println("logout from app");
		home.setActiTimelogout();
	}
	@Test
	public void scenarioverifylogo() {
		System.out.println("checking 1st scenario");
		home.setActiTimelogo();
		System.out.println("1st scenario verified");
	}

}
