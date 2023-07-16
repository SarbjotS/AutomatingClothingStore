package Main.Elements;

import Main.Customer;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static Main.BrowserSetup.driver;

public class ShippingPageElements {
    public static void email(String email) {
        driver.findElement(By.xpath("//div[@class='control _with-tooltip']//input[@type='email']")).sendKeys(email);
    }

    public static void FirstName() {
       driver.findElement(By.xpath("//*[text()='First Name']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomAlphabetic(8));
    }

    public static void PhoneNumber() {
    }

    public static void State() {
    }

    public static void Country() {
    }

    public static void City() {
    }

    public static void StreetName() {
    }

    public static void LastName() {
    }
}
