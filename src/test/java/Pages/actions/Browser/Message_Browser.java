package Pages.actions.Browser;

import DriverManager.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Message_Browser {


    WebDriver driver;
    WebDriverWait wait;

    public Message_Browser() {
        this.driver = (WebDriver) Driver.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30),Duration.ofSeconds(60));
        PageFactory.initElements( driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//*[@name='ellipsis-h']")
    WebElement FurtherMenu;

    @FindBy(xpath = "//*[@id='bb_input_1']")
    WebElement MessageSubjectText;

    @FindBy(xpath = "//div[@aria-label='Message']")
    WebElement MessageText;

    public void ClickOnThreeDots() {

        wait.until(ExpectedConditions.visibilityOf(FurtherMenu));
        FurtherMenu.isDisplayed();
        FurtherMenu.click();

    }

    public void ClickOnMoreScreen(String value)
    {
        var val =driver.findElement(By.xpath("//*[@class='bb-layout__horizontal-nav-submenu-title' and contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.click();
    }

    public void ClickBtn(String value) {
        var val =driver.findElement(By.xpath("//*[@class='ng-star-inserted']//*[contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.click();
    }

    public void PopupScreenName(String value) {
        var val =driver.findElement(By.xpath("//*[@class='modal-content-container']//*[@class='ng-star-inserted' and contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.click();
    }

    public void EnterMessageSubject(String Subject) {
        wait.until(ExpectedConditions.visibilityOf(MessageSubjectText));
        MessageSubjectText.click();
        MessageSubjectText.sendKeys(Subject);
    }

    public void EnterMessage(String Message) {
        wait.until(ExpectedConditions.visibilityOf(MessageText));
        MessageText.click();
        MessageText.sendKeys(Message);
    }

    public void DiscardBtn(String value) {
        var val =driver.findElement(By.xpath("//*[@class='modal-footer']//*[contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.click();
    }


}
