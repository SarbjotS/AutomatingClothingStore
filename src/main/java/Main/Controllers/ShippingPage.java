package Main.Controllers;

import Main.Elements.ShippingPageElements;

import static Main.Cart.MasterCart;

public class ShippingPage {
    public static void inputEmail() {
        ShippingPageElements.email(MasterCart.getUser().getEmail());
    }

    public static void inputFirstName() {
        ShippingPageElements.FirstName(MasterCart.getUser());
    }

    public static void inputLastName() {
    }

    public static void inputStreetAddress() {
    }

    public static void inputCity() {
    }

    public static void SelectCountry() {
    }

    public static void inputState() {
    }

    public static void inputPhoneNumber() {
    }
}
