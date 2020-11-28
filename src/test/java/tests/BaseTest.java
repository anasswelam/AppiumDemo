package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void startApp(){
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName","SM-J320F");
            caps.setCapability("platformName", "ANDROID");
            caps.setCapability("platformVersion", "5.1.1");
            caps.setCapability("udID", "420070c860b43400");
            caps.setCapability("appPackage", "org.nativescript.examples");
            caps.setCapability("appActivity", "com.tns.NativeScriptActivity");



            URL url = new URL ("http://0.0.0.0:4723/wd/hub");
            driver= new AppiumDriver<MobileElement>(url,caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
