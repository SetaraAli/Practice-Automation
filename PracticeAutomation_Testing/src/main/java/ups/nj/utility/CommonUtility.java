package ups.nj.utility;





import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import ups.nj.supperpage.SupperClass;

public class CommonUtility extends SupperClass {
	
	public static void getJSclick( WebElement elm) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].Click()", elm);
	}
public static void getActionClick(WebElement elr) {
	Actions action = new Actions(driver);
	action.click(elr).build().perform();
}
public static WebElement getexplicitwait(WebElement elem, WebDriver driver, long time ) {
	WebDriverWait wait =  new WebDriverWait(driver, time);
	WebElement element =wait.until(ExpectedConditions.elementToBeClickable(elem));
	return element;
}
public static void getScreenShot() throws IOException {
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File targetfile = new File(System.getProperty("user.dir") +"//screenshot/screenshot.png");
	 targetfile.getParentFile().mkdir();
	 srcfile.createNewFile();
	 Files.copy(srcfile, targetfile );
	 
}
	
}


