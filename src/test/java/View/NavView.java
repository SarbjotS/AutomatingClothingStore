package View;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class NavView {

    public static SelenideElement TopNavBar(String hoverOverItem) {
        return $(By.xpath("//*[text()='Men']"));
    }
}
