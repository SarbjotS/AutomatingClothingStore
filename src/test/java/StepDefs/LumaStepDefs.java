package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;


public class LumaStepDefs {


    @Then("clicks search and views the results")
    public void clicksSearchAndViewsTheResults()  {

    }

    @Given("I am on the Expedia home page")
    public void iAmOnTheExpediaHomePage() {
        System.out.println("Test");
    }

    @And("user enters their {string} and {string}")
    public void userEntersTheirAnd(String arg0, String arg1) {
    }

    @And("selects the {string} of travellers")
    public void selectsTheOfTravellers(String arg0) {

    }

    @And("selects their preferred flight {string}")
    public void selectsTheirPreferredFlight(String arg0) {
    }

    @When("user selects the {string} option and enters their {string} and {string}")
    public void userSelectsTheOptionAndEntersTheirAnd(String arg0, String arg1, String arg2) {
    }
}
