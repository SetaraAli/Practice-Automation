package zoopla.pagefactory.elements;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ups.nj.supperpage.SupperClass;

public class ZooplaLoginPage extends SupperClass {
	public ZooplaLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath = "(//*[text()='Sign in'])[1]")
	@FindBy (xpath="(//*[@data-testid='header-profile-sign-in'])[2]")
	@CacheLookup
	private WebElement ClickSigninBTN;
	public WebElement getClickSigninBTN() {
		return ClickSigninBTN;
	}
	//(//*[@data-testid='header-profile-sign-in'])[2]
		//id("input-email-address")
		//id("input-password")
		//[@data-testid='signin-button']
	//id=search-input-location-wrapper for location
	@FindBy(xpath = "(//*[text()='Accept all cookies'])[2]")
	@CacheLookup
	private WebElement acceptcookies;
	public WebElement getAcceptcookies() {
		return acceptcookies;
	}
	//@FindBy(id = "signin_email")
	@FindBy(id="input-email-address")
	@CacheLookup
	private WebElement sendUserName;
	public WebElement getSendUserName() {
		return sendUserName;
	}
	//@FindBy(id = "signin_password")
	@FindBy(id = "input-password")
	@CacheLookup
	private WebElement sendpassword;
	public WebElement getSendPWD() {
		return sendpassword;
		
		} 
	//@FindBy(id="search-input-location")
	@FindBy(id="search-input-location-wrapper for location")
	@CacheLookup
	private WebElement sendlocation;
	public WebElement getlocation() {
		return sendlocation;
	}
		

	@FindBy(xpath= "(//*[@class='css-18tfumg-Text eczcs4p0'])[2]")
	@CacheLookup
	private WebElement verifyPrice;
	public WebElement getverifyprice() {
		return verifyPrice;
	}
	
	
	
	
	
	public void getElement() {
		
List<WebElement> price = driver.findElements(By.xpath("//*[@class='css-18tfumg-Text eczcs4p0']"));
	
	System.out.println("Total property: "+ price.size());
	for(WebElement value:price) {
		String PriceValue=value.getText();
		System.out.println("Property price list: " +PriceValue);
	}
	}
	
	public void getClickProperty() {
		List<WebElement> element = driver.findElements(By.xpath("//*[@size='6']"));
		for(int i=0; i<element.size(); i++) {
			if(i>2) {
				System.out.println("Get selected property: "+ i);
				element.get(i).click();
				break;
			}
		}
	}
	
	
	
	
		
		// (//*[text()='Accept all cookies'])[2]
		// *[@id='ui-cookie-consent-overlay-wrap']/descendant::button[2]
	}

