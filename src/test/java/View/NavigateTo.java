package View;
import Main.Cart;
import Main.Controllers.NavigateWebElements;
import Main.HelperClass;
import com.codeborne.selenide.commands.Hover;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import static Main.BrowserSetup.driver;

//Class specifically to use the navigate bar
public class NavigateTo {
    static NavigateWebElements getElement = new NavigateWebElements();
    public static void NavigateToItemPage(String ItemWanted, Cart masterCart) {
        if (HelperClass.TopProducts.contains(ItemWanted) || HelperClass.BottomProducts.contains(ItemWanted)||HelperClass.MiscProducts.contains(ItemWanted)) {
            getElement.InitialiseElements();
            HoverOver(ItemWanted, masterCart);
        } else {
            throw new RuntimeException("Product wanted is not stocked.");
        }

    }
    public static void HoverOver(String HoverOverItem, Cart MasterCart) {
        Actions action = new Actions(driver);
        if(getElement.getWebElementByText(HoverOverItem).isDisplayed()){
            action.click(getElement.SaleElement).perform();
        }else {
            String NavBarOption = HelperClass.returnNavBarType(HoverOverItem, MasterCart);
            action.moveToElement(getElement.getWebElement(NavBarOption)).perform();
            action.moveToElement( getElement.getNestedWebElementByText(NavBarOption,HelperClass.SubItem(HoverOverItem))).perform();
            action.click( getElement.getNestedWebElementByText(NavBarOption, HoverOverItem)).perform();

        }
    }
}

