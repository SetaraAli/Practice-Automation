package smarttech.nyc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTest1 {
	WebDriver driver;
	@BeforeTest(enabled= true)
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
		 driver = new ChromeDriver();
	driver.manage().window().maximize();
		System.out.println("Open the browser");
	}
	@Test
public void logintest1() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL ");
}

	@AfterTest
public void teardown() {
		driver.quit();
		System.out.println("quit the browser");
	}
}
