package Main.Controllers;

import Main.Cart;
import Main.Elements.ProductDetailsElements;
import Main.HelperClass;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {
    private static Cart _cart = Cart.MasterCart;

    public static void SelectSize(String SizeWanted){
        //_cart.cart.put()
    }
    public static void SelectColor(String ColorWanted){
        _cart.setColour(ColorWanted);
        _cart.cart.put(0, _cart.getColour());
        ProductDetailsElements.selectColor(ColorWanted);

//Add all items in a variable called "Item in cart" once item and specs added increment
        //MasterCart
      //When on shopping cart page, go through all items to verify what is in cart

    }
    public static void SelectQuantity(String QuantityWanted){
        ProductDetailsElements.setQuantity(QuantityWanted);

    }


}
