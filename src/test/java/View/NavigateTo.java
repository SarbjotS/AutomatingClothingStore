package View;


import Main.Cart;
import Main.HelperClass;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Hover;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;

import static Main.BrowserSetup.driver;
import static com.codeborne.selenide.Selenide.open;

public class NavigateTo {

    public static void NavigateToItemPage(String ItemWanted, Cart masterCart) {
        HoverOver(ItemWanted, masterCart);
        HelperClass.SetUpProducts();
        if (HelperClass.TopProducts.contains(ItemWanted)) {
            HoverOver("Tops", masterCart);
        } else if (HelperClass.BottomProducts.contains(ItemWanted)) {
            HoverOver("Bottoms", masterCart);
        } else{
            throw new RuntimeException("Product wanted is not stocked.");
        }


    }

    public static void HoverOver(String HoverOverItem, Cart MasterCart){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//li[@class='"+ HelperClass.returnNavBarType(HoverOverItem, MasterCart) +"']"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//li[@class='"+ HelperClass.returnNavBarType(HoverOverItem, MasterCart) +"']//*[text()='"+HelperClass.SubItem(HoverOverItem)+"']"))).perform();
    }
}
//li[@class="level0 nav-3 category-item level-top parent ui-menu-item"]//span[text()="Men"]
//li[@class="level0 nav- category-item level-top parent ui-menu-item"]
