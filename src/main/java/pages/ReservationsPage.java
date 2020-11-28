package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservationsPage extends BasePage {

    public ReservationsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageView[contains(@index,'1')]")
   public WebElement plusBtn1;

    @FindBy(xpath = "//*[@text='Name']")
    WebElement Namebox;

    @FindBy(xpath = "//*[@text='Phone']")
    WebElement Phonebox;

    @FindBy(xpath = "//android.widget.EditText[contains(@text,'Sat, 28.11')]")
    WebElement date;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'OK')]")
    WebElement okDate;

    @FindBy(xpath = "//android.widget.EditText[contains(@text,'08:00 PM')]")
    WebElement time;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'OK')]")
    WebElement okTime;

    @FindBy(xpath = "//android.widget.TextView[contains(@index,'2')]")
    WebElement plusGuestBtn;

    @FindBy(xpath = "//*[@text='1st floor']")
    WebElement sectionDDL;

    @FindBy(xpath = "//android.widget.CheckedTextView[contains(@text,'3rd floor')]")
    WebElement sction3;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'1')]")
    WebElement tableDDL;

    @FindBy(xpath = "//android.widget.CheckedTextView[contains(@text,'4')]")
    WebElement table4;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'in-person')]")
    WebElement personDDL;

    @FindBy(xpath = "//android.widget.CheckedTextView[contains(@text,'online')]")
    WebElement online;

    @FindBy(xpath = "//*[@text='DONE']")
    WebElement DoneBtn;

    @FindBy(xpath = "//android.widget.ImageButton[contains(@index,'0')]")
   public WebElement BackBtn;

    public void clickonPlusBtn() {

      plusBtn1.click();
    }

    public void AddNewReservation(String name, String phone) throws InterruptedException {
        Namebox.sendKeys(name);
        Phonebox.sendKeys(phone);
        date.click();
        Thread.sleep(2000);
        okDate.click();
        Thread.sleep(2000);
        time.click();
        Thread.sleep(2000);
        okTime.click();
        Thread.sleep(2000);
        plusGuestBtn.click();
        sectionDDL.click();
        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOf(sction3));
        sction3.click();
        Thread.sleep(2000);
        tableDDL.click();
        Thread.sleep(2000);
        table4.click();
        Thread.sleep(2000);
        personDDL.click();
        Thread.sleep(2000);
        online.click();
        Thread.sleep(2000);
        DoneBtn.click();
    }
    public void UserCanBack(){

        BackBtn.click();
    }
}