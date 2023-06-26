package Main.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static Main.Cart.MasterCart;
import static Main.BrowserSetup.driver;

public class ShoppingCartElements {



    public static String ValidateProduct(String ItemName) {
        return driver.findElement(By.xpath("//tr[@class='item-info']//a[text()='"+ItemName+"']")).getText();
    }
}
