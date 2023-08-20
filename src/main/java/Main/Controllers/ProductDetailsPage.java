package Main.Controllers;

import Main.Cart;
import Main.Elements.ProductDetailsElements;
import Main.HelperClass;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {
    private static Cart _cart = Cart.MasterCart;

    public static void SelectSize(String SizeWanted){
        try{
            ProductDetailsElements.selectSize(SizeWanted);
        }catch (Exception e){
            throw new RuntimeException("Size is not available");
        }
        _cart.setSize(SizeWanted);
        _cart.cart.put(_cart.getNumberofItems(), _cart.getSize());
    }

    public static void SelectColor(String ColorWanted){
        try{
            ProductDetailsElements.selectColor(ColorWanted);
        }catch (Exception e){
            throw new RuntimeException("Color is not available");
        }

        _cart.setColour(ColorWanted);
        _cart.cart.put(_cart.getNumberofItems(), _cart.getColour());

//Add all items in a variable called "Item in cart" once item and specs added increment
        //MasterCart
      //When on shopping cart page, go through all items to verify what is in cart

    }
    public static void SelectQuantity(String QuantityWanted){
        try{
            ProductDetailsElements.setQuantity(QuantityWanted);
        } catch (Exception e) {
            throw new RuntimeException("Unable to assign quantity");
        }

    }

    public static void AddItemToCart(){
        _cart.setItem(ProductDetailsElements.GrabProductName());
        _cart.setPrice(ProductDetailsElements.GrabProductPrice());
    }


    public static void AddToCart() {
        try{
            ProductDetailsElements.SelectAddToCart();
        }catch (Exception e){
            throw new RuntimeException("Button is not selectable");
        }
    }

    public static void SelectShoppingCart() {
        try{
            ProductDetailsElements.SelectShoppingCart();
        }catch (Exception e){
            throw new RuntimeException("Shopping cart link not visible");
        }
    }

}
