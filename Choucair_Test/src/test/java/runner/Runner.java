package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.ScreenPlay;



//Run With to execute Selenium with Cucumber
@RunWith(Cucumber.class)
//Files for the execution - declaration 
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber-reports.json"},
    tags = "@Test"

)

//Execution
public class Runner {
    
    @AfterClass
    public static void cleanDriver(){
     //Close the browser
        ScreenPlay.closeBrowser();
    }
}
