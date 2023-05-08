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

        if (HelperClass.TopProducts.contains(ItemWanted) || HelperClass.BottomProducts.contains(ItemWanted)||HelperClass.MiscProducts.contains(ItemWanted)) {
            HoverOver(ItemWanted, masterCart);
        } else {
            throw new RuntimeException("Product wanted is not stocked.");
        }
    }
//Adapt to Sale and not open menu for Men or Women selection
    public static void HoverOver(String HoverOverItem, Cart MasterCart) {
        Actions action = new Actions(driver);
        String NavBarOption = HelperClass.returnNavBarType(HoverOverItem, MasterCart);
        action.moveToElement(driver.findElement(By.xpath("//li[@class='" + NavBarOption + "']"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//li[@class='" + NavBarOption + "']//*[text()='" + HelperClass.SubItem(HoverOverItem) + "']"))).perform();
        action.click(driver.findElement(By.xpath("//li[@class='" + NavBarOption + "']//*[text()='" + HoverOverItem + "']"))).perform();
    }
}

