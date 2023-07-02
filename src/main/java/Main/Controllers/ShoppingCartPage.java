package Main.Controllers;
import static Main.Cart.MasterCart;
import Main.Elements.ShoppingCartElements;
import org.junit.Assert;

import static Main.BrowserSetup.driver;

public class ShoppingCartPage {

    public static void ValidateCartPage(){
        Assert.assertEquals("Item does not match", MasterCart.getItem(),ShoppingCartElements.ValidateProduct(MasterCart.getItem()).trim());
        Assert.assertEquals("Colour does not match", MasterCart.getColour(), ShoppingCartElements.ValidateColour());
        Assert.assertEquals("Size does not match", MasterCart.getSize(), ShoppingCartElements.ValidateSize());
        Assert.assertEquals("Price does not match", MasterCart.getPrice(), ShoppingCartElements.ValidatePrice());
        //Assert.assertEquals("Subtotal does not match", MasterCart.getPrice(), ShoppingCartElements.ValidateTotal  Price); Add running subtotal

    }


    public static void ProceedToCheckout() {
        ShoppingCartElements.SelectCheckoutButton();
    }
}
