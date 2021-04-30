package ups.nj.supperpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupperClass{
	public static Logger logger;
	public static Properties prop;
	public static WebDriver driver;


	public SupperClass() {
		logger=Logger.getLogger("zoopla automation");
		PropertyConfigurator.configure("log4j.propeties");
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/usa/config/Config.properties");
			
				prop.load(ip);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		}
	
	
	
	public static void openBrowser() {
	logger.info("********> application start testing with chrome browser<********");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		/*String browser = prop.getProperty("BrowserType");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			 driver = new ChromeDriver();
				
		}
		//else if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.geko.driver", "./Driver/geckodriver.exe");
			// driver = new FirefoxDriver();
				
		//}*/
	}
	

}
