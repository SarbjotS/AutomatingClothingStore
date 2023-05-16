package Main.Controllers;

import org.openqa.selenium.By;

import java.util.logging.Filter;

import static Main.BrowserSetup.driver;

public class ProductListingPage {
    public static void SelectFilter(String FilterOption) {
        //Add switch to select color & size
        FilterItems.SelectFilter(FilterOption).click();
        FilterItems.FilterItem(FilterOption).click();
    }
}
