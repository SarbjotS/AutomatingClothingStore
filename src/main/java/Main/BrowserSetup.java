package Main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;


public class BrowserSetup implements GlobalValues {
    public static WebDriver driver;
    public static String DriverSelected = GlobalValues.webDriverSelected;

    public static void DriverSetup(){

        switch(DriverSelected){
            case("edge"): driver = WebDriverManager.edgedriver().create();
            break;
            case("chrome"): driver = WebDriverManager.chromedriver().create();
            break;
            case("firefox"): driver = WebDriverManager.firefoxdriver().create();
            break;
            default:
                throw new InvalidArgumentException("Please enter a valid browser");
        }


    }
}
