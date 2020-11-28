package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@text='GET STARTED']")
    WebElement GetBtn;

    @FindBy(xpath = "//*[@class='android.widget.ImageButton']")
  public  WebElement menuBtn;

    @FindBy(xpath = "//*[@text='Code samples']")
    WebElement codeExlink;

    @FindBy(xpath = "//*[@text='Chrome']")
    WebElement chromeLink;


    @FindBy(xpath = "//*[@text='Reservations']")
   public WebElement ReservationBtn;

    @FindBy(xpath = "//*[@text='Layouts']")
    public WebElement LayoutsText;

    public void GetStatred()
    {
        GetBtn.click();
    }

    public void openReservationPage()
    {
        ReservationBtn.click();
    }

        public void openMenu () throws InterruptedException {
            menuBtn.click();
            Thread.sleep(2000);
            codeExlink.click();
            Thread.sleep(2000);
            chromeLink.click();
        }
    }