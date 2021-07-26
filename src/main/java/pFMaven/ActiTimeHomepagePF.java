package pFMaven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomepagePF {
	@FindBy(xpath = "//img[@height='61']")
	private WebElement logo;
	
	@FindBy(xpath="//input[@id='SubmitTTButton']")
	private WebElement savebutton;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;

	WebDriver driver;

	public ActiTimeHomepagePF(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setActiTimelogo() {
		boolean hari = logo.isDisplayed();
		if (hari == true) {
			System.out.println("test is passed");

		} else {
			System.out.println("test is failed");
		}
	}
	public void ActiTimeSavebutton() {

		
		savebutton.click();
	}

	public void setActiTimelogout() {
		
		logout.click();
	}

}
