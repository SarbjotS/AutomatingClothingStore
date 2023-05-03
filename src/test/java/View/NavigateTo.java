package View;


import Main.Cart;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Hover;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static Main.BrowserSetup.driver;
import static com.codeborne.selenide.Selenide.open;

public class NavigateTo {

    public static void NavigateToItemPage(String clothing, Cart masterCart) {
        //HoverOver()
        WebDriver driver1;
        //*[text()='Men']
         HoverOver(masterCart.getUser().getGender());
        //SelenideElement test = NavView.TopNavBar("Test");
        //driver.findElement(By.xpath("//*[text()='Men']")).click(); //Selenium
        //test.click();
        //java.lang.IllegalStateException: No webdriver is bound to current thread: 1. You need to call open(url) first. -> SelenideElement
        //If statement on malefemale nav
        // MasterCart.getUser().gender

    }

    public static void HoverOver(String HoverOverItem){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[text()='Men']"))).perform();
    }
}
