package Pages.actions.Mobile;

import DriverManager.Driver;
import Utils.PropertiesOperations;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AuthenticatesByFinger;
import io.appium.java_client.ios.PerformsTouchID;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DraftPage_Mobile {

    AppiumDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
    public WebElement moreIcon;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Messages']")
    public WebElement messageIcon;
    @AndroidFindBy(accessibility = "New Message")
    public WebElement newMessageIcon;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/topic")

    public WebElement selectTopic;

    @AndroidFindBy(id = "android:id/text1")
    public WebElement clickOnSampleTopic;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/subject")
    public WebElement subjectTextview;

    @AndroidFindBy(id = "com.bsf.retail.dev:id/body")
    public WebElement messageTextview;

    @AndroidFindBy(id = "com.bsf.retail.dev:id/menu_messages_attach_file")
    public WebElement attachFileIcon;

    @AndroidFindBy(id = "com.google.android.documentsui:id/icon_thumb")
    public WebElement selectFile;

    @AndroidFindBy(xpath = "//android.widget.TextView[ends-with(@text,'.pdf')]")
    public WebElement selectPDFFile;

    @AndroidFindBy(accessibility = "Show roots")
    public WebElement showRoots;
    @AndroidFindBy(accessibility = "Send")
    public WebElement sendButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New message']//..//android.widget.ImageButton")
    public WebElement cancelIcon;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Messages']/android.view.ViewGroup/android.widget.ImageButton")
    public WebElement navigateBackButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Downloads']")
    public WebElement downloadIcon;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/draftSubjectTextView")
    public List<WebElement> draftMessageSubject;


    public DraftPage_Mobile() {
        this.driver = (AppiumDriver) Driver.driver;
        PageFactory.initElements( new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    public void clickMoreIcon() {
        moreIcon.click();
    }
    public void clickMessageIcon() {
        messageIcon.click();
    }

    public void clickNewMessageIcon() {
        newMessageIcon.click();
    }
    public void selectTopicSpinner() throws InterruptedException {
        Thread.sleep(10);
        if(selectTopic.isDisplayed()) {
            selectTopic.click();
            Thread.sleep(10);
            WebElement value  = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(android.widget.Spinner).childSelector(new UiSelector().className(android.widget.EditText).index(0))"));
            String val = value.getText();
            clickOnSampleTopic.click();
        }

    }
    public void enterSubject(String subject) {
        subjectTextview.sendKeys(subject);
    }

    public void enterMessage(String message) {
        messageTextview.sendKeys(message);
    }

    public void clickCancelIcon() {
        cancelIcon.click();
    }
    public void clickOnAttachIcon() {
        attachFileIcon.click();
    }
    public void clickOnShowRootsIcon() {
        showRoots.click();
    }
    public void clickOnSendIcon() throws InterruptedException {
        Thread.sleep(120);
        sendButton.isEnabled();
        sendButton.click();
    }

    public void clickIcon(String title) {

        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        ele.isDisplayed();
        ele.click();
    }


    public void clickOnIdIcon(String title) {
        driver.findElement(By.id(""+title+"")).click();
    }
    public void selectFile() {
        selectPDFFile.click();
    }

    public void clickOnNavigation() {
        navigateBackButton.click();
    }

    public void clickOnDownload() {
        if(downloadIcon.isEnabled() && !downloadIcon.isSelected()) {
            downloadIcon.click();
        }

    }

    public void verifyDraftMessageIsDisplay() {
        for(WebElement draftElement : draftMessageSubject){
            draftElement.isDisplayed();
        }

    }
}
