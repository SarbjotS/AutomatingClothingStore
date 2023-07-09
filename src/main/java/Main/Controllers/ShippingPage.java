package Main.Controllers;

import Main.Elements.ShippingPageElements;

import static Main.Cart.MasterCart;

public class ShippingPage {
    public static void InputEmail() {
        ShippingPageElements.email(MasterCart.getEmail());
    }
}
