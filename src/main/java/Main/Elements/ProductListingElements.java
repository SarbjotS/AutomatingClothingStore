package Main.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Main.BrowserSetup.driver;

public class ProductListingElements {


    public static WebElement ProductSelected(String ItemWanted){
        return driver.findElement(By.xpath("//a[contains(text(),'" + ItemWanted +"')]"));
    }

}
