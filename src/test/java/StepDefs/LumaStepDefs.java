package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaStepDefs {
    @Given("The user is on the Luma homepage")
    public void theUserIsOnTheLumaHomepage(){
        System.out.println("Test");
    }

    @When("the {string} decides to buy {string}")
    public void theDecidesToBuy(String arg0, String arg1) {
        System.out.println("test1");
    }

    @And("the user filters how much they wish to {string}, {string} and {string}")
    public void theUserFiltersHowMuchTheyWishToAnd(String arg0, String arg1, String arg2) {
        
    }

    @Then("rolls a dice depending on the number of options presented")
    public void rollsADiceDependingOnTheNumberOfOptionsPresented() {
        
    }

    @And("rolls a dice depending on the number of options presented and selects the option")
    public void rollsADiceDependingOnTheNumberOfOptionsPresentedAndSelectsTheOption() {
    }

    @And("enters selects the options on the details page and adds to cart")
    public void entersSelectsTheOptionsOnTheDetailsPageAndAddsToCart() {
    }

    @And("then proceed to checkout and input shipping address")
    public void thenProceedToCheckoutAndInputShippingAddress() {
    }

    @Then("the user reviews the order and submits")
    public void theUserReviewsTheOrderAndSubmits() {
    }
}
