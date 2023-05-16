//Get Webelements specifically for nav bar
package Main.Controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

import static Main.BrowserSetup.driver;

public class NavigateWebElements {

    @FindBy(xpath = "//*[text()='What's new'")
    public WebElement WhatisNew;
    @FindBy(xpath = "//*[text()='Sale']")
    public WebElement SaleElement;

    //@FindBy(xpath = )

    public void InitialiseElements(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getWebElement(String navBarOption) {
        if (navBarOption.equals("Sale")) {
            return SaleElement;
        } else if (navBarOption.equals("What's new?")) {
            return WhatisNew;
        } else {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver.findElement(By.xpath("//*[@class='" + navBarOption + "']"));
            // return (WebElement)
        }
    }
    public WebElement getWebElementByText(String TextSent){
        return driver.findElement(By.xpath("//*[text()='"+TextSent+"']"));
    }
    public WebElement getNestedWebElementByText (String NavBar, String TextSent){
        return driver.findElement(By.xpath("//li[@class='"+NavBar+"']//*[text()='"+TextSent+"']"));
    }

}
