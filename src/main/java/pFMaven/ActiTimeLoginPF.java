package pFMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPF {
	//declartion
	@FindBy(xpath="//input[@name='username']")
	private WebElement un;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement login;
	
	WebDriver driver;
	
	//initialization
	public ActiTimeLoginPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//usage
	public void setActiTimeUsernamepf() {
		un.sendKeys("admin");
	}
	
	public void setActiTimepwdpf() {
		pwd.sendKeys("manager");
	}
	public void verifyActiTimeloginbutton() {
		login.click();
	}

}
