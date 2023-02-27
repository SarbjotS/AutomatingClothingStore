package StepDefs.TestRunner;

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
public class TestRunner {
   //@BeforeClass
    //public static void SetUp(){
        //WebDriver driver = WebDriverManager.edgedriver().create();
    //}
}
