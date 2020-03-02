package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver idriver;
	
	LoginPage(WebDriver rdriver){
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="username")
	WebElement txt_userName;
	
	@FindBy(name ="password")
	WebElement txt_passWord;
	
	@FindBy(xpath = "//div[@class='input-group-btn']")
	WebElement btn_login;
	
	public void setUserName(String uname) {
		txt_userName.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txt_passWord.sendKeys(pwd);
	}
	public void clickLogin() {
		btn_login.click();
	}
	public void validation(String expexted) {
		Assert.assertTrue(idriver.getPageSource().contains(expexted));
		System.out.println("logged in Home page sucessfull");	
		}
}
