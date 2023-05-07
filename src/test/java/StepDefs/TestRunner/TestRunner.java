package StepDefs.TestRunner;

import Main.BrowserSetup;
import Main.HelperClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/Luma.feature",
        glue = {"StepDefs"},
        stepNotifications = true,
        tags = "@Shirt"
)

public class TestRunner extends BrowserSetup{
   @BeforeClass
    public static void SetUp(){
       BrowserSetup.DriverSetup();
       HelperClass.SetUpProducts();


    }
}
