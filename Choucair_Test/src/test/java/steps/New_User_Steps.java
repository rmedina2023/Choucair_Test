package steps;
import cucumber.api.java.en.*;
import pages.New_User_Screen;


public class New_User_Steps {
    New_User_Screen newUser = new New_User_Screen();
    
    @Given("^The user navigates tu utest.com$")
    public void navigateToUtestWebsite(){
        newUser.navigateToUtestWebsite();
        newUser.clickJoinTodayButton();
    }
    @And("^The user introduce the general information$")
    public void introduceInformation(){
        newUser.introduceGeneralInformation();
        newUser.clickNextLocation();

    }
    @And("^The user introduce the location information$")
    public void introduceLocationInformation(){
        newUser.introduceLocationInformation();
        newUser.clickNextDevices();

    }
    @And("^The user introduce the devices information$")
    public void introduceDevicesInformation(){
        newUser.clickLastStep();
    }
    @And("^The user introduce the password$")
    public void introducePasswordInformation(){
        
        newUser.introducePassword();
    }
    @Then("^The register of a new user is complete")
    public void clickComplete (){
        newUser.clickComplete();
    }
}
