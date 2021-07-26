package pFTestMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pFMaven.ActiTimeHomepagePF;
import pFMaven.ActiTimeLoginPF;

public class PFTestMaven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Programme_files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.navigate().to("http://localhost/login.do");
		Thread.sleep(3000);
		//1st object
	ActiTimeLoginPF v=new ActiTimeLoginPF(driver);
	v.setActiTimeUsernamepf();
	v.setActiTimepwdpf();
	v.verifyActiTimeloginbutton();
	
	ActiTimeHomepagePF b=new ActiTimeHomepagePF(driver);
	b.setActiTimelogo();
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("scroll(0,300)");
	b.ActiTimeSavebutton();
	b.setActiTimelogout();
	
	}
}
