package ups.nj.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.nj.supperpage.SupperClass;
import ups.nj.utility.CommonUtility;
import zoopla.pagefactory.elements.ZooplaLoginPage;

public class LoginStepDef extends SupperClass{

	ZooplaLoginPage pf ;
	
@Given("^User can open any browser$")
public void user_can_open_any_browser() {
	 openBrowser();
	 pf = new ZooplaLoginPage(driver);
	 pf = PageFactory.initElements(driver, ZooplaLoginPage.class);
	 
}

@Given("^User able to enter \"([^\"]*)\" url$")
public void user_able_to_enter_url(String url) {
  driver.get(url);
    
}

@When("^User able to click on the login button$")
public void user_able_to_click_on_the_login_button() {
	CommonUtility .getexplicitwait(pf.getAcceptcookies(), driver, 30);
	pf.getAcceptcookies();
	
	CommonUtility .getexplicitwait(pf.getClickSigninBTN(), driver, 300);
	pf.getClickSigninBTN();
}

@When("^User enter the userName \"([^\"]*)\" and password \"([^\"]*)\"$")
public void user_enter_the_userName_and_password(String userName, String PWD) {
	pf.getSendUserName();
    pf.getSendPWD().sendKeys(PWD);
}

@When("^User click on the signing button$")
public void user_click_on_the_signing_button() {
  pf.getSendPWD().click();
    
}

@Then("^User able to verify successfully login and verify the homepage title$")
public void user_able_to_verify_successfully_login_and_verify_the_homepage_title() {
	String expected = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
	Assert.assertEquals(expected, driver.getTitle());
	System.out.println(expected);
	
	driver.quit();
    
}

}



