package Main.Elements;

import Main.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static Main.BrowserSetup.driver;

public class ShoppingCartElements {

    public static String ValidateColour() {
        return driver.findElement(By.xpath("//dl[@class='item-options']//dt[text()='Color']/following-sibling::dd")).getText();
    }

    public static String ValidateSize() {
        return driver.findElement(By.xpath("//dl[@class='item-options']//dt[text()='Size']/following-sibling::dd")).getText();
    }

    public static String ValidatePrice() {
        return driver.findElement(By.xpath( "//span[@class='cart-price']//span")).getText();
    }


    public static String ValidateProduct(String ItemName) {
        return driver.findElement(By.xpath("//tr[@class='item-info']//a[text()='"+ItemName+"']")).getText();
    }

}
