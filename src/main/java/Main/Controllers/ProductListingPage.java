package Main.Controllers;

import Main.HelperClass;

public class ProductListingPage {
    public static void SelectFilter(String FilterOption) {
        //Add switch to select color & size
        try {
            FilterItems.SelectFilterBox(FilterOption).click();
        }catch (Exception e) {
            throw new RuntimeException("Filter doesn't exist");
        }

        if (FilterOption.equals("Color") || FilterOption.equals("Size")) {
            FilterItems.SelectColorOrSizeFilter(HelperClass.returnSpecialFilter(FilterOption)).click();
        } else {
            FilterItems.SelectItemToFilter(FilterOption).click();
        }
    }
}
