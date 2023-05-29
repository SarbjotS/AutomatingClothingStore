//Helper class for setting up prior
package Main;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class HelperClass {

    public static HashSet<String> TopProducts = new HashSet<>();
    public static HashSet<String> BottomProducts = new HashSet<>();

    public static HashSet<String> MiscProducts = new HashSet<>();

    //Find better way to handle nav bar instead of hardcoding
    private static String NavBarWomen = "level0 nav-2 category-item level-top parent ui-menu-item";
    private static String NavBarMen = "level0 nav-3 category-item level-top parent ui-menu-item";
    private static String NavBarGear = "level0 nav-4 category-item level-top parent ui-menu-item";

    public static String Color = "Black";

    public static String Size = "L";


    public static void SetUpProducts() {
        String[] TopList = {"Women","Men","Tops","Jackets", "Hoodies and Sweatshirts", "Tees", "Tanks"};
        TopProducts.addAll(List.of(TopList));
        String[] BottomList = {"Women","Men","Bottoms","Pants", "Shorts"};
        BottomProducts.addAll(List.of(BottomList));
        String[] MiscItems = {"Bags", "Fitness Equipment", "Watches", "Video Download", "Sale", "What's New"};
        MiscProducts.addAll(List.of(MiscItems));
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
        throw new RuntimeException("This product doesn't exist");
    }

    public static String SubItem(String hoverOverItem) {
        if (TopProducts.contains(hoverOverItem) || BottomProducts.contains(hoverOverItem)) {
            return TopProducts.contains(hoverOverItem) ? "Tops" : "Bottoms";
        } else if (hoverOverItem.equals("Bags")){
            return "Bags";
        }
        return null;
    }

    public static String returnSpecialFilter(String filterType){
        if (filterType.equals("Color")) {
            return Color;
        }else{
            return Size;
        }
    }
    public static void ParseJson() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("src/JsonItemData.json");
        JSONArray obj = (JSONArray) jsonParser.parse(reader);

        JSONArray x =  obj;
        System.out.println(x);
//Read JSON file
    }
}

