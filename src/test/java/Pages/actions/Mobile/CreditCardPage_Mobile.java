package Pages.actions.Mobile;
import DriverManager.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import Utils.GenericMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreditCardPage_Mobile {
    GenericMethod genericMethod = new GenericMethod();

    public AppiumDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No transactions yet']")
    public WebElement noTransactionsHeaderMessage;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='We didn't find any transactions on this account.']")
    public WebElement noTransactionsMessage;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/accountsTransactionsJourney_listView_sectionHeader")
    public List<WebElement> detailsDate;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cardholder name']//following-sibling::android.widget.TextView")
    public WebElement cardHolderName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Expiry date']//following-sibling::android.widget.TextView")
    public WebElement cardExpiryDate;

    @AndroidFindBy(accessibility = "Edit account name")
    public WebElement editAccountName;

    @AndroidFindBy(id = "com.bsf.retail.dev:id/transactionsJourney_transactionsDetailScreen_editAlias_titleView")
    public WebElement titleText;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/icon")
    public WebElement accountIcon;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/accountsAndTransactionJourney_accountDetailsFieldEditorScreen_textNameInout")
    public WebElement accountName;
    @AndroidFindBy(accessibility = "Close")
    public WebElement closeButton;

    public CreditCardPage_Mobile() {
        this.driver = (AppiumDriver) Driver.driver;
        PageFactory.initElements( new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void verifyHeaderMessage(String header, String message) {
        if(genericMethod.isElementPresent(noTransactionsHeaderMessage)) {
            noTransactionsMessage.isDisplayed();
        }

    }

    public void verifyTransactionDate() {
        List<String> elementText = new ArrayList<>();
        elementText = genericMethod.getTextOfElements(driver, detailsDate);
        genericMethod.isSorted(elementText, elementText.size());


    }



    public void verifyCardHolderNameIsDisplayed() {
        Assert.assertTrue(cardHolderName.isDisplayed());
        System.out.println(cardHolderName.getText()+" card holder name is displayed");
    }
    public void verifyExpiryDateIsDisplayed() {
        Assert.assertTrue(cardExpiryDate.isDisplayed());
        System.out.println(cardExpiryDate.getText()+" card expiry date is displayed");
    }

    public void clickOnEditAccountName() {
        Assert.assertTrue(editAccountName.isDisplayed());
        editAccountName.click();
    }

    public void clickOnCloseButton() {
        Assert.assertTrue(closeButton.isDisplayed());
        closeButton.click();
    }


    public void verifyTitle(String title) {
        Assert.assertTrue(titleText.isDisplayed());
        Assert.assertEquals(titleText.getText(), title);
    }
    public void verifyAccountIcon() {
        Assert.assertTrue(accountIcon.isDisplayed());
    }
    public void verifyAccountName() {
        Assert.assertTrue(genericMethod.isElementPresent(accountName), "Element is not editable");
        Assert.assertTrue(accountIcon.isDisplayed());
    }
}
