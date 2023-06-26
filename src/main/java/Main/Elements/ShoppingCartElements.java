package Main.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static Main.Cart.MasterCart;

public class ShoppingCartElements {



    public static String ValidateProduct(String ItemName){
        MasterCart.setItem(ItemName);
        return By.xpath("//a[text()='"+ ItemName +" ']").toString();
    }
}
