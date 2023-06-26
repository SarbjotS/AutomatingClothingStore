package Main.Controllers;
import static Main.Cart.MasterCart;
import Main.Elements.ShoppingCartElements;
import org.junit.Assert;

import static Main.BrowserSetup.driver;

public class ShoppingCartPage {

    public static void ValidateCartPage(){
        Assert.assertEquals("Item does not match", MasterCart.getItem(),ShoppingCartElements.ValidateProduct(MasterCart.getItem()).trim());
    }


}