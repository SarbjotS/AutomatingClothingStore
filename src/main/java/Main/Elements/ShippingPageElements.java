package Main.Elements;

import Main.Customer;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static Main.BrowserSetup.driver;

public class ShippingPageElements {
    public static void email(String email) {
        driver.findElement(By.xpath("//div[@class='control _with-tooltip']//input[@type='email']")).sendKeys(email);
    }

    public static void FirstName(Customer user) {
       driver.findElement(By.xpath("//*[text()='First Name']/following::div[@class='control']//input")).sendKeys("Test");
    }
}
