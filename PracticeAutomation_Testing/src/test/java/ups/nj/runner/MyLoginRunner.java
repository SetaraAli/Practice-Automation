package ups.nj.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin=  {"pretty","json:CucumberReport/cucumber-reports/cucumber.json"},
		//features means location of Cucumber feature and folder
		features= "CucumbeBDD/LoginFunction.feature",	
       glue = {"ups.nj.stefdefination","com.ny.hooks"}
      //dryRun = true//If is true it will display the compilation error but in false it will not display
      //monochrome= true //true means console output is much more readable and false is not much more readable 
                        //as it should be
     //  strict = true//true means when cucumber encounters any undefined or pending code build will be fail
                    //but in false it will be success
)
		


public class MyLoginRunner extends AbstractTestNGCucumberTests {

}
