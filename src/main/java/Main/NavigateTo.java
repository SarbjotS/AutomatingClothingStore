package Main;

import Main.Controllers.CartController;

public class NavigateTo {

    public static void NavigateToItemPage(String clothing, Cart masterCart) {
        //HoverOver()
        //*[text()='Men']
        HoverOver(masterCart.getUser().getGender());
        //If statement on malefemale nav
        // MasterCart.getUser().gender

    }

    public static void HoverOver(String HoverOverItem){
        CartController.TopNavBar(HoverOverItem);
    }
}
