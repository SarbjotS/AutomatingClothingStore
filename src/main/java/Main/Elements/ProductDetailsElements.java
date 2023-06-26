package Main.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Main.BrowserSetup.driver;

public class ProductDetailsElements {
    public static void selectColor(String colorWanted) {
        driver.findElement(By.xpath("//div[@option-label='"+colorWanted+"']")).click();
    }

    public static void setQuantity(String Quantity) {
        WebElement ClearAndEnter = driver.findElement(By.xpath("//input[@name='qty']"));
        ClearAndEnter.clear();
        ClearAndEnter.sendKeys(Quantity);
    }

    public static void selectSize(String sizeWanted) {
        driver.findElement(By.xpath("//div[@option-label='"+sizeWanted+"']")).click();

    }

    public static void SelectAddToCart() {
        driver.findElement(By.xpath("//button[@title ='Add to Cart']")).click();
    }

    public static void SelectShoppingCart() {
        driver.findElement(By.xpath("//div[@class ='page messages']//a[text()='shopping cart']")).click();
    }

    public static String GrabProductName(){
        return driver.findElement(By.xpath("//span[@class='base']")).getText();
    }
}
