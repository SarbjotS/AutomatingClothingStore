package StepDefs;

import Main.Cart;
import Main.Customer;
import Main.GlobalValues;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.*;

import static Main.BrowserSetup.driver;
import static Main.GlobalValues.emailUsed;



public class LumaStepDefs {

    //1 customer can be assigned 1 cart.
    //Customer class will parent cart class
    //Allows multiple items inside basket. Maybe make master basket and temp basket?
    @Given("The user is on the Luma homepage")
    public void theUserIsOnTheLumaHomepage(){
        driver.get("https://www.google.com/");
        Cart MasterCart = new Cart();
        Cart TemporaryCart = new Cart();
        Customer NewCustomer = new Customer(GlobalValues.emailUsed,"123abcD!",  MasterCart);

        TemporaryCart.setItem("wed");
        TemporaryCart.setSize("XL");
        TemporaryCart.setColour("red");
        TemporaryCart.setPrice(41);
        MasterCart.cart.put(0,TemporaryCart.copy());
        TemporaryCart.emptyCart();

       //NewCustomer.updateCart(c);

        //Customer NewCustomer1 = new Customer("GlobalValues.emailUsed","123abcD!", D);


        TemporaryCart.setItem("tue");
        TemporaryCart.setSize("S");
        TemporaryCart.setColour("pink");
        TemporaryCart.setPrice(100);
        //NewCustomer1.updateCart(D);
        TemporaryCart.cart.put(1,TemporaryCart);

        System.out.println("test"); //make items, colour, size arrays





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


    @And("then proceed to checkout and input shipping address")
    public void thenProceedToCheckoutAndInputShippingAddress() {
    }

    @Then("the user reviews the order and submits")
    public void theUserReviewsTheOrderAndSubmits() {
    }


    @And("the user clicks on {string} and selects the compare button")
    public void theUserClicksOnAndSelectsTheCompareButton(String arg0) {
    }

    @And("then the user hovers over {string} and selects the compare button")
    public void thenTheUserHoversOverAndSelectsTheCompareButton(String arg0) {

    }

    @Then("the user proceeds to the compare page")
    public void theUserProceedsToTheComparePage() {
    }

    @And("the user adds the cheaper product to the cart")
    public void theUserAddsTheCheaperProductToTheCart() {
    }
    

    @And("the user selects a {string} and {string} and adds the cheaper product to the cart")
    public void theUserSelectsAAndAndAddsTheCheaperProductToTheCart(String arg0, String arg1) {
    }

    @When("the User selects the buy three tee get one free promo")
    public void theUserSelectsTheBuyThreeTeeGetOneFreePromo() {
    }

    @And("selects the {string} they wish to buy")
    public void selectsTheTheyWishToBuy(String arg0) {
    }

    @And("enters the options on the details page and adds to cart")
    public void entersTheOptionsOnTheDetailsPageAndAddsToCart() {
    }

    @Then("selects the next button")
    public void selectsTheNextButton() {
    }

    @And("the user adds first four products to the cart")
    public void theUserAddsFirstFourProductsToTheCart() {
    }

    @Then("the user checks that they're receiving a free tee")
    public void theUserChecksThatTheyReReceivingAFreeTee() {
    }
}
