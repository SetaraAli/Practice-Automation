package com.readexcel;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowserTesting  {
	
WebDriver driver;

@BeforeMethod
@Parameters("browser")
public void setUp(String browser)  {
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","/Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
	} 
	
	 
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

@Test
public void loginWebZooplaPage() throws IOException {
	driver.get("https://www.zoopla.co.uk/");
	driver.findElement(By.xpath("(//*[text()='Accept all cookies'])[2]")).click();	
	driver.findElement(By.xpath("(//*[@data-testid='header-profile-sign-in'])[2]")).click();
	driver.findElement(By.id("input-email-address")).sendKeys("alammohammed79@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("SAYEDawan2008@");
	driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();

}

}


