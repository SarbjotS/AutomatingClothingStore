package StepDefs;

import Main.Cart;
import Main.Controllers.ProductDetailsPage;
import Main.Controllers.ProductListingPage;
import Main.Controllers.ShippingPage;
import Main.Controllers.ShoppingCartPage;
import Main.Customer;
import Main.CustomerSetup;
import Main.HelperClass;
import View.NavigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Main.BrowserSetup.driver;
import static Main.Resources.GlobalValues.dummyPassword;


public class SingleItemStepDefs {

    public static Cart _MasterCart = new Cart();
    //Cart MasterCart = new Cart();
    //1 customer can be assigned 1 cart.
    //Customer class will parent cart class
    //Allows multiple items inside basket. Maybe make master basket and temp basket?
    @Given("The user is on the Luma homepage")
    public void theUserIsOnTheLumaHomepage(){
        driver.get("https://magento.softwaretestingboard.com/");


    }


    //-----------------NavBar------------------//
    @When("the {string} decides to buy a {string}")
    public void theDecidesToBuyA(String User, String Clothing) {
        //Probably take customer setup out and move to different class
        Customer NewCustomer = new Customer(User,dummyPassword,  _MasterCart, "Men");
        _MasterCart.setUser(NewCustomer);

        NavigateTo.NavigateToItemPage(Clothing, _MasterCart);
        Cart.MasterCart = _MasterCart;

        HelperClass.SetUpProducts(); //Only setup if customer is buying something
        CustomerSetup.setupCustomer();

    }

    //-------------Filter-----------------//
    @And("the user uses a {string}")
    public void theUserUsesA(String ApplyingFilter) {
        ProductListingPage.SelectFilter(ApplyingFilter);

    }

    @And("selects the {string} they wish to buy")
    public void selectsTheTheyWishToBuy(String ItemSelected) {
        ProductListingPage.SelectProduct(ItemSelected);

    }

    @And("enters the {string}, {string} and {string} on the details page and adds to cart")
    public void entersTheAndOnTheDetailsPageAndAddsToCart(String Size, String Color, String Quantity) {
        ProductDetailsPage.AddItemToCart();
        ProductDetailsPage.SelectColor(Color);
        ProductDetailsPage.SelectQuantity(Quantity);
        ProductDetailsPage.SelectSize(Size);
        ProductDetailsPage.AddToCart();


    }

    @And("verify the contents of the shopping cart page")
    public void verifyTheContentsOfTheShoppingCartPage() {
        ProductDetailsPage.SelectShoppingCart();
        ShoppingCartPage.ValidateCartPage();
        ShoppingCartPage.ProceedToCheckout();
    }

    @And("then proceed to checkout and input shipping address")
    public void thenProceedToCheckoutAndInputShippingAddress() throws InterruptedException {
        ShippingPage.inputEmail();
        ShippingPage.inputFirstName();
        ShippingPage.inputLastName();
        ShippingPage.inputCompany();
        ShippingPage.inputStreetAddress();
        ShippingPage.SelectCountry();
        ShippingPage.inputCity();
        //ShippingPage.inputState(); Only required if country is US
        ShippingPage.inputPhoneNumber();
        ShippingPage.inputZip();
        ShippingPage.getShippingCost();
        ShippingPage.PressNext();


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
