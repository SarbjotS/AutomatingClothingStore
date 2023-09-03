package Main.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Main.BrowserSetup.driver;
import static Main.Cart.MasterCart;

public class ShippingPageElements {

    @FindBy(xpath = "//*[text()='Country']/following::div")
    public static WebElement country;
    //@FindBy(xpath = "//small[@class='copyright']")
    //public static WebElement footer;
    public static void email() {
        driver.findElement(By.xpath("//div[@class='control _with-tooltip']//input[@type='email']")).sendKeys(MasterCart.getUser().getEmail());
    }

    public static WebElement footer(){
      //  return By.xpath("//small[@class='copyright']");
        return driver.findElement(By.xpath("//small[@class='copyright']" ));
    }
    public static void FirstName() {
       driver.findElement(By.xpath("//*[text()='First Name']/following::div[@class='control']//input")).sendKeys(MasterCart.getUser().getFirstName());
    }

    public static void PhoneNumber() {
        driver.findElement(By.xpath("//*[text()='Phone Number']/following::input")).sendKeys(MasterCart.getUser().getPhoneNumber());
    }

    public static void State() {
    }

    public static void ClickCountry() {
        driver.findElement(By.xpath("//*[text()='Country']/following::div")).click();

    }
    //public static void scrollCountryList() throws InterruptedException {}

    public static void City() {
        driver.findElement(By.xpath("//*[text()='City']/following::div[@class='control']//input")).sendKeys(MasterCart.getUser().getCity());
    }

    public static void StreetName() {
        driver.findElement(By.xpath("//*[text()='Street Address']/following::div[@class='control']//input")).sendKeys(MasterCart.getUser().getAddress());

    }

    public static void LastName() {
        driver.findElement(By.xpath("//*[text()='Last Name']/following::div[@class='control']//input")).sendKeys(MasterCart.getUser().getLastName());

    }

    public static void Company() {
        driver.findElement(By.xpath("//*[text()='Company']/following::div[@class='control']//input")).sendKeys(MasterCart.getUser().getCompanyName());

    }

    public static void ZipCode() {
        driver.findElement(By.xpath("//*[text()='Zip/Postal Code']/following::div[@class='control']//input")).sendKeys(MasterCart.getUser().getZipCode());

    }

    public static String ShippingCost(){
        return driver.findElement(By.xpath("//span[@class='price']")).getText();
    }

    public static void ClickNext() {
        driver.findElement(By.xpath("//*[text()='Next']")).click();
    }
}
