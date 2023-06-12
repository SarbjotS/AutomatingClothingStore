package Main.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Main.BrowserSetup.driver;

public class ProductDetailsElements {
    public static void selectColor(String colorWanted) {
        driver.findElement(By.xpath("//div[@option-label='"+colorWanted+"']")).click();
    }

    public static void setQuantity(String Quantity) {
        driver.findElement(By.xpath("//input[@name='qty']")).sendKeys(Quantity);
    }
}
