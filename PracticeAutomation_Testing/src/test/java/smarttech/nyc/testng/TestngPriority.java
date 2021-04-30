package smarttech.nyc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//if I use @beforemethod browser will open 4 times but if I use @aftertest it will open 1 time
public class TestngPriority {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
		 driver = new ChromeDriver();
	driver.manage().window().maximize();
		System.out.println("Open the browser");
	}
	@Test(invocationCount=3)
public void logintest1() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL 1 ");
}
	@Test(priority=4)
public void logintest2() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL 2 ");
}
	@Test(priority=2)
public void logintest3() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL 3");
}
	@Test(priority=1)
public void logintest4() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL 4");
}



	@AfterTest
public void teardown() {
		driver.quit();
		System.out.println("quit the browser");
	}


}
