package Main.Controllers;

import Main.Elements.ShippingPageElements;

import static Main.Cart.MasterCart;

public class ShippingPage {
    public static void inputEmail() {
        ShippingPageElements.email(MasterCart.getUser().getEmail());
    }

    public static void inputFirstName() {
        ShippingPageElements.FirstName();
    }

    public static void inputLastName() {
        ShippingPageElements.LastName();
    }

    public static void inputStreetAddress() {
        ShippingPageElements.StreetName();
    }

    public static void inputCity() {
        ShippingPageElements.City();
    }

    public static void SelectCountry() throws InterruptedException {
        ShippingPageElements.ClickCountry();
        ShippingPageElements.scrollCountryList();
    }

    public static void inputState() {
        ShippingPageElements.State();
    }

    public static void inputPhoneNumber() {
        ShippingPageElements.PhoneNumber();
    }

    public static void inputCompany() {
        ShippingPageElements.Company();
    }

    public static void inputZip() {
        ShippingPageElements.ZipCode();
    }
}
