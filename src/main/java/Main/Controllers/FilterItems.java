package Main.Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Main.BrowserSetup.driver;

public class FilterItems {
    public static WebElement SelectFilter(String filterOption) {
        return driver.findElement(By.xpath("//div[text()='"+filterOption+"']"));
    }

    public static WebElement FilterItem(String filterOption) {
    return driver.findElement(By.xpath("//div[text()='"+filterOption+"']/following-sibling::*//span"));
    }
}
