package Main.Controllers;

import org.openqa.selenium.By;

import java.util.logging.Filter;

import static Main.BrowserSetup.driver;

public class ProductListingPage {
    public static void SelectFilter(String FilterOption) {
        driver.findElement(By.xpath("//div[text()='"+FilterOption+"']")).click();
        driver.findElement(By.xpath("//div[text()='"+FilterOption+"']/following-sibling::*//span")).click();
    }
}
