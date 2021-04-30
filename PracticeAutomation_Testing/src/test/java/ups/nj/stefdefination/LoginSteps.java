package ups.nj.stefdefination;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.nj.supperpage.SupperClass;
import ups.nj.utility.CommonUtility;
import zoopla.pagefactory.elements.ZooplaLoginPage;

public class LoginSteps extends SupperClass{
	ZooplaLoginPage pf;
	@Given("^User can open any browser$")
	public void user_can_open_any_browser()  {
		//openBrowser();
		pf= PageFactory.initElements(driver,ZooplaLoginPage.class);
	}
	  
	

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url)  {
		logger.info("********>User able to enter url <********");
		 driver.get(url);
		 
	  
	}

	@When("^User able to click on the login button$")
	public void user_able_to_click_on_the_login_button()  {
		logger.info("********>User able to click on the login button <********");
		CommonUtility.getActionClick(pf.getAcceptcookies());
		CommonUtility.getActionClick(pf.getClickSigninBTN());
	  
	  
	}

	@When("^User enter the userName \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_userName_and_password(String userName, String PWD)  {
		logger.info("********>User enter the userName and password <********");
		  pf.getSendUserName().sendKeys(userName);
		  pf.getSendPWD().sendKeys(PWD);
	}

	@When("^User click on the signing button$")
	public void user_click_on_the_signing_button()  {
		logger.info("********>User click on the signing button<********");
		 pf.getSendPWD().submit();
			//pf.getPwd().submit();
	}

	@Then("^User able to verify successfully login and verify the homepage title$")
	public void user_able_to_verify_successfully_login_and_verify_the_homepage_title() throws IOException{
		logger.info("********>User able to verify successfully login and verify the homepage title<********");
		//String expected = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
		String expected = "Sign in to Zoopla - Zoopla";
		Assert.assertEquals(expected, driver.getTitle());
		System.out.println(expected);
		logger.info("********>User able to verify successfully login and verify the homepage title<********");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		 CommonUtility.getScreenShot();
		//driver.quit();

	  
	}

	/*@Given("^User able to enter the location as\"([^\"]*)\" in text box$")
	public void user_able_to_enter_the_location_as_in_text_box(String location)  {
	  pf.getlocation().sendKeys(location);
	  pf.getlocation().sendKeys(Keys.ENTER);  
	}

	@When("^User able to print  all property value/price in consule and click on thard property$")
	public void user_able_to_print_all_property_value_price_in_consule() throws InterruptedException  {
	/*pf.getElement();
	pf.getClickProperty();	
	}

	@Then("^Verify the price of the property$")
	public void verify_the_price_of_the_property() {
  String price = pf.getverifyprice().getText();
     System.out.println("verify the price: " + price);
     
	}*/
    
	}


