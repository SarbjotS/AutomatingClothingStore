package Main;

import java.util.HashSet;
import java.util.List;

public class HelperClass {

    public static HashSet<String> TopProducts = new HashSet<>();
    public static HashSet<String> BottomProducts = new HashSet<>();

    private static String NavBarWomen = "level0 nav-2 category-item level-top parent ui-menu-item";
    private static String NavBarMen = "level0 nav-3 category-item level-top parent ui-menu-item";
    private static String NavBarGear = "level0 nav-4 category-item level-top parent ui-menu-item";
    public static void SetUpProducts() {
        String[] TopList = {"Jacket", "Hoodies and Sweatshirts", "Tees", "Tanks"};
        TopProducts.addAll(List.of(TopList));
        String[] BottomList = {"Pants", "Shorts"};
        BottomProducts.addAll(List.of(BottomList));

    }

    public static String getNavBarWomen() {
        return NavBarWomen;
    }

    public static String getNavBarMen() {
        return NavBarMen;
    }
    public static String getNavBarGear() {
        return NavBarGear;
    }

    public static String returnNavBarType(String TopNavSelection, Cart masterCart){
        if (TopProducts.contains(TopNavSelection) || BottomProducts.contains(TopNavSelection)) {
            return masterCart.getUser().getGender().equals("Men") ? getNavBarMen() : getNavBarWomen();
        } else if (TopNavSelection.equals("Bags")) {
            return getNavBarGear();

        }
        return null;
    }

    public static String SubItem(String hoverOverItem) {
        if (TopProducts.contains(hoverOverItem) || BottomProducts.contains(hoverOverItem)) {
            return TopProducts.contains(hoverOverItem) ? "Tops" : "Bottoms";
        } else if (hoverOverItem.equals("Bags")){
            return "Bags";
        }
        return null;
    }

}

