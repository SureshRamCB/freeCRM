package pageObjectModel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://classic.crmpro.com/");
	}
	@Test
	public void login() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lp.setUserName("batchautomation");
		lp.setPassword("Test@12345");
		Thread.sleep(200);
		lp.clickLogin();
		lp.validation("CRMPRO");
	}
	
}
