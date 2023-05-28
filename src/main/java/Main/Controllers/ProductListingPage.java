package Main.Controllers;

import Main.GlobalValues;
import Main.HelperClass;
import org.openqa.selenium.By;

import java.util.logging.Filter;

import static Main.BrowserSetup.driver;

public class ProductListingPage {
    public static void SelectFilter(String FilterOption) {
        //Add switch to select color & size
        try {
            FilterItems.SelectFilterBox(FilterOption).click();
        }catch (Exception e) {
            throw new RuntimeException("Filter doesn't exist");
        }

        if (FilterOption.equals("Color") || FilterOption.equals("Size")) {
            FilterItems.SelectColorOrSizeFilter(HelperClass.Size).click();
        } else {
            FilterItems.SelectItemToFilter(FilterOption).click();
        }
    }
}
