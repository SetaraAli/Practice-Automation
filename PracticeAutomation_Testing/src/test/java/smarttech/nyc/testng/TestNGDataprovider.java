package smarttech.nyc.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {
	
	WebDriver driver;
	
	@DataProvider(name = "aunthitication")
	public static Object[][]crediantial(){
		return new Object [][]{ {"alammohammed79@gmail.com", "SAYEDawan2008@"},
			                    {"alammohammed79@gmail.com", "SAYEDawan2008@"}};
		                      
		}
	@Test(dataProvider="aunthitication")
	public void testwebsite(String userName, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");

driver.findElement(By.xpath("(//*[text()='Accept all cookies'])[2]")).click();
driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();

driver.findElement(By.id("signin_email")).sendKeys(userName);
driver.findElement(By.id("signin_password")).sendKeys(pwd);

driver.findElement(By.id("signin_submit")).click();

//driver.quit();
}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}