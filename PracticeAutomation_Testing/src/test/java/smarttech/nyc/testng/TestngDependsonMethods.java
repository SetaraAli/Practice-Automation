package smarttech.nyc.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDependsonMethods {
	WebDriver driver;
	@BeforeMethod(enabled= true)
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
	@Test(dependsOnMethods= {"logintest1"})
public void logintest2() {
		driver.get("https://github.c");
	System.out.println("enter the application URL ");
}
	@Test(dependsOnMethods= {"logintest2"})
public void logintest3() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL ");
}
	@Test(dependsOnMethods= {"logintest3"})
public void logintest4() {
		driver.get("https://github.com/");
	System.out.println("enter the application URL ");
}



	@AfterMethod
public void teardown() {
		driver.quit();
		System.out.println("quit the browser");
	}

}
