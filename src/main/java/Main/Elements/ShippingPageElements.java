package Main.Elements;

import Main.Controllers.ShippingPage;
import Main.Customer;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static Main.BrowserSetup.driver;

public class ShippingPageElements {
    public static void email(String email) {
        driver.findElement(By.xpath("//div[@class='control _with-tooltip']//input[@type='email']")).sendKeys(email);
    }

    public static void FirstName() {
       driver.findElement(By.xpath("//*[text()='First Name']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomAlphabetic(8));
    }

    public static void PhoneNumber() {
        driver.findElement(By.xpath("//*[text()='Phone Number']/following::div")).sendKeys("021" + RandomStringUtils.randomNumeric(5));
    }

    public static void State() {
    }

    public static void ClickCountry() {
        //driver.findElement(By.xpath("//*[text()='Country']/following::div")).click();

    }
    public static void scrollCountryList() throws InterruptedException {

    }

    public static void City() {
        driver.findElement(By.xpath("//*[text()='City']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomAlphabetic(8));
    }

    public static void StreetName() {
        driver.findElement(By.xpath("//*[text()='Street Address']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomAlphabetic(8));

    }

    public static void LastName() {
        driver.findElement(By.xpath("//*[text()='Last Name']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomAlphabetic(8));

    }

    public static void Company() {
        driver.findElement(By.xpath("//*[text()='Company']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomAlphabetic(8));

    }

    public static void ZipCode() {
        driver.findElement(By.xpath("//*[text()='Zip/Postal Code']/following::div[@class='control']//input")).sendKeys(RandomStringUtils.randomNumeric(5));

    }
}
