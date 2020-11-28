package tests;

import data.JsonFile;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ReservationsPage;
import java.io.IOException;

public class ReservationTest extends BaseTest {

    @Test
    public void CreateNewReservation() throws IOException, ParseException, InterruptedException {
        JsonFile jsonreader = new JsonFile();
        jsonreader.JsonReader();
        HomePage Hpage =new HomePage(driver);
        Hpage.GetStatred();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(Hpage.LayoutsText));
        Assert.assertTrue(Hpage.LayoutsText.getText().contains("Layouts"));
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
        } catch (InvalidSelectorException e)
        {
            // ignore
        }
        Hpage.openReservationPage();
        ReservationsPage Rpage = new ReservationsPage(driver);
        WebDriverWait wait1 = new WebDriverWait(driver,5);
        wait1.until(ExpectedConditions.visibilityOf(Rpage.plusBtn1));
        Rpage.clickonPlusBtn();
        Rpage.AddNewReservation(jsonreader.Name,jsonreader.Phone);
        WebDriverWait wait2 = new WebDriverWait(driver,5);
        wait2.until(ExpectedConditions.visibilityOf(Rpage.BackBtn));
        Rpage.UserCanBack();
        WebDriverWait wait3 = new WebDriverWait(driver,5);
        wait3.until(ExpectedConditions.visibilityOf(Hpage.menuBtn));
        Hpage.openMenu();

   }

    }
