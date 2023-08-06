package Main.Controllers;

import Main.Elements.ShippingPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Main.BrowserSetup.driver;
import static Main.Cart.MasterCart;

public class ShippingPage {
    public static void inputEmail() {
        ShippingPageElements.email(MasterCart.getUser().getEmail());
    }

    public static void inputFirstName() {
        ShippingPageElements.FirstName();
    }

    public static void inputLastName() throws InterruptedException {
        ShippingPageElements.LastName();
        Thread.sleep(1000);
    }

    public static void inputStreetAddress() {
        ShippingPageElements.StreetName();
    }

    public static void inputCity() {
        ShippingPageElements.City();
    }

    public static void SelectCountry() throws InterruptedException {
        ShippingPage.ScrollIntoView();
        ShippingPageElements.ClickCountry();
        SelectFirstCountry();
        ShippingPageElements.scrollCountryList();
        Thread.sleep(10000);

    }


    public static void inputState() {
        ShippingPageElements.State();
    }

    public static void inputPhoneNumber() {
        ShippingPageElements.PhoneNumber();
    }

    public static void inputCompany() {
        ShippingPageElements.Company();
    }

    public static void inputZip() throws InterruptedException {
        ShippingPageElements.ZipCode();
        Thread.sleep(5000);

    }

    private static void SelectFirstCountry() {
        new Actions(driver)
                .keyDown(Keys.SHIFT)
                .sendKeys("New Zealand")
                .keyDown(Keys.ENTER)
                .perform();
    }

    public static void ScrollIntoView() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ShippingPageElements.footer());
        Thread.sleep(500);
    }

    public static void PressNext() {
        ShippingPageElements.ClickNext();
    }
}



