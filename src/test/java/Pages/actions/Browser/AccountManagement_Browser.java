package Pages.actions.Browser;

import DriverManager.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AccountManagement_Browser {

    WebDriver driver;

    WebDriverWait wait;

    public AccountManagement_Browser() {
        this.driver = (WebDriver) Driver.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30),Duration.ofSeconds(60));
        PageFactory.initElements( driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//*[@data-role='savings-accounts']")
    WebElement SavingAccount;

    @FindBy(xpath = "//*[@data-role='current-accounts']")
    WebElement CurrentAccount;

    @FindBy(xpath = "//*[@class='col-md-8']//*[contains(text(),'Manage Accounts')]")
    WebElement ManageAccounts;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//*[@class='bb-list__item ng-star-inserted'][2]//button")
    WebElement SavingEditButton;

    @FindBy(xpath = "//*[@class='ng-star-inserted']//*[contains(text(),'Back to my Accounts')]/..")
    WebElement BackToMyAccountButton;

    @FindBy(xpath = "//*[@data-role='savings-accounts']//*[@class='contextual-alternates-off ng-star-inserted']")
    WebElement savingAccountClick;

    @FindBy(xpath = "//*[@data-role='current-accounts']//*[@class='contextual-alternates-off ng-star-inserted']")
    WebElement currentAccountClick;

    @FindBy(xpath = "//*[@class='bb-tab-container__tabs nav nav-tabs']//span[contains(text(),'Transactions') or contains(text(),'Account Info')]")
    WebElement savingAccountTabs;

    @FindBy(xpath = "//*[@class='bb-icon bb-icon-print bb-icon--md']")
    WebElement savingAccountPrintIcon;

    @FindBy(xpath = "//*[@data-role='product-summary-details-header']//button")
    WebElement savingAccountPrintBtn;

    @FindBy(xpath = "//*[@class='d-block']//*[contains(text(),'No Transactions Found')]")
    WebElement transactionMessage;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[contains(text(),'Savings Account')]/../../..//input[@data-role='input']")
    WebElement SavingAccountAccountName;

    @FindBy(xpath = "//*[@aria-label='Accept']")
    WebElement AcceptBtn;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//*[@class='bb-list__item ng-star-inserted'][1]//button")
    WebElement CurrentEditButton;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[contains(text(),'Current Account')]/../../..//input[@data-role='input']")
    WebElement CurrentAccountAccountName;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//*[@class='bb-list__item ng-star-inserted'][1]//input[@type='checkbox']")
    WebElement CurrentToggleBtn;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']")
    WebElement AccountList;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[@data-role='inline-edit-text']")
    WebElement AccountName;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//button[@data-role='inline-edit-btn']")
    WebElement EditButtonIcon;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[@data-role='product-number']")
    WebElement AccountNumber;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[@data-role='bb-amount-value__amount']")
    WebElement AccountBalance;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[@class='bb-switch__slider slider']")
    WebElement ToggleBtn;

    @FindBy(xpath = "//*[@aria-label='Cancel']")
    WebElement CancelBtn;

    @FindBy(xpath = "//*[@class='bb-list bb-list--density-md']//span[contains(text(),'Current Account')]/../../..//span[@data-role='inline-edit-text']")
    WebElement DisableCurrentEdit;



    public void DisplaySavingAccount() {

        wait.until(ExpectedConditions.visibilityOf(SavingAccount));
        SavingAccount.isDisplayed();

    }

    public void DisplayCurrentAccount() {

        wait.until(ExpectedConditions.visibilityOf(CurrentAccount));
        CurrentAccount.isDisplayed();

    }

    public void getClickManageAccounts(String value)
    {
        wait.until(ExpectedConditions.visibilityOf(ManageAccounts));
        var val =driver.findElement(By.xpath("//*[@class='col-md-8']//*[contains(text(),'"+value+"')]"));
        val.click();
    }

    public void getSavingEditButton()
    {
        SavingEditButton.click();
    }


    public void ClickToMyAccountButton(String value)
    {
        wait.until(ExpectedConditions.visibilityOf(BackToMyAccountButton));
        var val =driver.findElement(By.xpath("//*[@class='ng-star-inserted']//*[contains(text(),'"+value+"')]/.."));
        val.click();
    }

    public void GetSavingAccountClick()
    {
        wait.until(ExpectedConditions.visibilityOf(savingAccountClick));
        savingAccountClick.click();
    }

    public void GetCurrentAccountClick()
    {

        wait.until(ExpectedConditions.visibilityOf(currentAccountClick));
        currentAccountClick.click();
    }

    public void GetSavingAccountTabs(String value, String name)
    {
        wait.until(ExpectedConditions.visibilityOf(savingAccountTabs));
        var val =driver.findElement(By.xpath("//*[@class='bb-tab-container__tabs nav nav-tabs']//span[contains(text(),'"+value+"') or contains(text(),'"+name+"')]"));
        val.isDisplayed();
    }

    public void GetClickOnTab(String value)
    {

        var val =driver.findElement(By.xpath("//*[@class='bb-tab-container__tabs nav nav-tabs']//span[contains(text(),'"+value+"')]/.."));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.click();
    }

    public void GetSavingAccountPrintIcon()
    {
        wait.until(ExpectedConditions.visibilityOf(savingAccountPrintIcon));
        savingAccountPrintIcon.isDisplayed();
    }

    public void VerifySectionName(String value)
    {

        var val =driver.findElement(By.xpath("//*[@class='bb-product-summary-details card ng-star-inserted']//*[contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.isDisplayed();
    }

    public void GetPrintBtnClick()
    {
        wait.until(ExpectedConditions.visibilityOf(savingAccountPrintBtn));
        savingAccountPrintBtn.click();
    }

    public void CancelPrintBtn() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('print-preview-app').shadowRoot.querySelector('print-preview-sidebar').shadowRoot.querySelector('print-preview-header').shadowRoot.querySelector('paper-button.cancel-button').click();");
    }

    public void GetTransactionMessage(String message)
    {
        wait.until(ExpectedConditions.visibilityOf(transactionMessage));
        String passText = transactionMessage.getAttribute("outerText");
        Assert.assertEquals(message,passText);
    }

    public void SetAccountName(String message)
    {
        wait.until(ExpectedConditions.visibilityOf(SavingAccountAccountName));
        SavingAccountAccountName.click();
        SavingAccountAccountName.clear();
        SavingAccountAccountName.sendKeys(message);
    }

    public void ClickAccountNameAccept()
    {
       // wait.until(ExpectedConditions.visibilityOf(AcceptBtn));
        AcceptBtn.click();
    }

    public void ClickCurrentEditButton()
    {
        wait.until(ExpectedConditions.visibilityOf(CurrentEditButton));
        CurrentEditButton.click();
    }

    public void SetCurrentAccountName(String value)
    {
        wait.until(ExpectedConditions.visibilityOf(CurrentAccountAccountName));
        CurrentAccountAccountName.click();
        CurrentAccountAccountName.clear();
        CurrentAccountAccountName.sendKeys(value);
    }

    public void VerifyManageScreenMessage(String message)
    {
        String val =driver.findElement(By.xpath("//*[@data-role='notification-alert']//*[contains(text(),'"+message+"')]")).getText();
        Assert.assertEquals(message,val);
    }

    public void ClickToggleBtnOff() throws InterruptedException {
        Thread.sleep(100000);
        CurrentToggleBtn.click();
    }

    public void GetHeaderName(String value)
    {
        var val =driver.findElement(By.xpath("//*[@data-role='headings' and contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.isDisplayed();
    }

    public void GetAccountNameVerbiage(String value)
    {
        var val =driver.findElement(By.xpath("/*[@data-role='product-summary-manage-accounts-initial-message' and contains(text(),'"+value+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.isDisplayed();
    }

    public void GetAccountList() {

        wait.until(ExpectedConditions.visibilityOf(AccountList));
        AccountList.isDisplayed();
    }

    public void GetAccountName(String value,String name)
    {
        var val =driver.findElement(By.xpath("//*[@class='bb-list bb-list--density-md']//span[contains(text(),'"+value+"') or contains(text(),'"+name+"')]"));
        wait.until(ExpectedConditions.visibilityOf(val));
        val.isDisplayed();
    }

    public void GetAccountNumber() {

        wait.until(ExpectedConditions.visibilityOf(AccountName));
        AccountName.isDisplayed();
    }

    public void GetEditButtonIcon() {

        wait.until(ExpectedConditions.visibilityOf(EditButtonIcon));
        EditButtonIcon.isDisplayed();
    }

    public void GetAccountNumberView() {
        wait.until(ExpectedConditions.visibilityOf(AccountNumber));
        AccountNumber.isDisplayed();
    }

    public void GetAccountBalance() {
        wait.until(ExpectedConditions.visibilityOf(AccountBalance));
        AccountBalance.isDisplayed();
    }

    public void GetToggleBtn() {
        wait.until(ExpectedConditions.visibilityOf(ToggleBtn));
        ToggleBtn.isDisplayed();
    }

    public void ClickCancelBtn()
    {
         wait.until(ExpectedConditions.visibilityOf(CancelBtn));
        CancelBtn.click();
    }

    public void getAccountNameField()
    {
        wait.until(ExpectedConditions.visibilityOf(DisableCurrentEdit));
        DisableCurrentEdit.isDisplayed();
        DisableCurrentEdit.isEnabled();
        }
}