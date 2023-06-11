package Main.Controllers;

import Main.Cart;
import Main.HelperClass;

public class ProductDetailsPage {

    public static void SelectSize(String SizeWanted){


    }
    public static void SelectColor(String ColorWanted){
        Cart _cart = Cart.MasterCart;
        _cart.showCart(_cart.User);
        _cart.cart.put(0,_cart.Colour= ColorWanted);
        _cart.cart.put(1,_cart.Colour= "Blue");
        System.out.println(_cart.cart.get(0));
//Add all items in a variable called "Item in cart" once item and specs added increment
        //MasterCart
      //When on shopping cart page, go through all items to verify what is in cart

    }
    public static void SelectQuantity(String QuantityWanted){

    }


}
