package Main.Controllers;

import org.openqa.selenium.By;

import static Main.BrowserSetup.driver;

public class ProductListingPage {
    public static void SelectFilter(String FilterOption) {
        driver.findElement(By.xpath("//div[text()='"+FilterOption+"']")).click();
    }
}
