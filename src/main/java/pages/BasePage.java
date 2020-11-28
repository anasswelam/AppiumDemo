package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver ;

    public BasePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);

    }



}
