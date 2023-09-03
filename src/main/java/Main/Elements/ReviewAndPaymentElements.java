package Main.Elements;

import org.openqa.selenium.By;

import java.io.File;

import static Main.BrowserSetup.driver;

public class ReviewAndPaymentElements {




    public static boolean FirstNameExists(String firstName) {
        return driver.findElement(By.xpath("//div[@class='billing-address-details' and text()='"+firstName+"']")).isDisplayed();
    }

    public static boolean SurnameExists(String lastName) {
        return driver.findElement(By.xpath("//div[@class='billing-address-details' and text()='"+lastName+"']")).isDisplayed();
    }

    public static boolean AddressExists(String address) {
        return driver.findElement(By.xpath("//div[@class='billing-address-details' and text()='"+address+"']")).isDisplayed();
    }

    public static boolean CityExists(String city) {
        return driver.findElement(By.xpath("//div[@class='billing-address-details' and text()='"+city.toUpperCase()+"']")).isDisplayed();

    }

    public static boolean ZipCodeExists(String zipCode) {
        return driver.findElement(By.xpath("//div[@class='billing-address-details' and text()='"+zipCode+"']")).isDisplayed();

    }

    public static boolean CountryExists(String country) {
        return driver.findElement(By.xpath("//div[@class='billing-address-details' and text()='"+country+"']")).isDisplayed();

    }

    public static boolean NumberExists(String phoneNumber) {
        return driver.findElement(By.xpath("//a[text()='"+phoneNumber+"']")).isDisplayed();
    }
}
