package Main.Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Main.BrowserSetup.driver;

public class FilterItems {
    public static WebElement SelectFilterBox(String filterOption) {
        return driver.findElement(By.xpath("//div[text()='"+filterOption+"']"));
    }

    public static WebElement SelectItemToFilter(String filterOption) {
    return driver.findElement(By.xpath("//div[text()='"+filterOption+"']/following-sibling::*//span"));
    }
    ////dt[text()='Size']/following-sibling::dd[contains(text(),'S')]

    public static WebElement SelectColorOrSizeFilter(String Color){
        return driver.findElement(By.xpath("//div[@class='filter-options-content']//div[@option-label='"+Color+"']"));
    }
}
