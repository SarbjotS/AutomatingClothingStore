package StepDefs;

import Main.Cart;
import Controllers.CartController;
import Main.Customer;
import View.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Main.BrowserSetup.driver;
import static Main.GlobalValues.dummyPassword;


public class LumaStepDefs {

    public Cart MasterCart = new Cart();
    //Cart MasterCart = new Cart();
    //1 customer can be assigned 1 cart.
    //Customer class will parent cart class
    //Allows multiple items inside basket. Maybe make master basket and temp basket?
    @Given("The user is on the Luma homepage")
    public void theUserIsOnTheLumaHomepage(){
        driver.get("https://magento.softwaretestingboard.com/");


    }


    @When("the {string} decides to buy a {string}")
    public void theDecidesToBuyA(String User, String Clothing) {
        Customer NewCustomer = new Customer(User,dummyPassword,  MasterCart, "Men");
        MasterCart.setUser(NewCustomer);
        MasterCart.setPrice(342);


        NavigateTo.NavigateToItemPage(Clothing, MasterCart);
        MasterCart.setItem(CartController.getClothingItem());


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
