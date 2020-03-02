package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	@org.testng.annotations.Test
	public static void testmethod() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.ie.driver", "C://Users//Prathap//Downloads//chromedriver_win32 (9)");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/google.com");
	}
}
