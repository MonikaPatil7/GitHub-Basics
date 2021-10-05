package gitHubBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin() {

		driver.get("http://gamil.com");
	}

	@AfterSuite
	public void tearDown() {
		
		driver.close();
	}
}
