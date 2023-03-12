
package Pages.actions.Mobile;
        import DriverManager.Driver;
        import Utils.PropertiesOperations;
        import io.appium.java_client.AppiumDriver;
        import io.appium.java_client.pagefactory.AndroidFindBy;
        import io.appium.java_client.pagefactory.AppiumFieldDecorator;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebElement;
        import Utils.GenericMethod;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.concurrent.TimeUnit;
public class BeneficiaryAccountPage_Mobile {
    GenericMethod genericMethod = new GenericMethod();
    public AppiumDriver driver;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Beneficiaries']")
    public WebElement beneficiaryButton;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@content-desc,'Beneficiaries')]")
    public WebElement beneficiaryScreen;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryPreview_nameView")
    public List<WebElement> beneficiaryNameList;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryList_endOfListMessageView")
    public WebElement endOfListBeneficiaryMessage;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'No Beneficiary Yet')]")
    public WebElement noBeneficiaryYetTextView;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Would you like to add your first beneficiary.')]")
    public WebElement addFirstBeneficiaryTextView;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryPreview_nameView")
    public List<WebElement> beneficiaryAccountName;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryPreview_statusView")
    public List<WebElement> beneficiaryAccountStatus;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryPreview_accountNumberView")
    public List<WebElement> beneficiaryAccountNumber;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryPreview_bankView")
    public List<WebElement> beneficiaryAccountBankDetail;
    @AndroidFindBy(accessibility = "Search")
    public WebElement searchIcon;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/search_src_text")
    public WebElement searchTextView;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Oops, Loading Failed')]")
    public WebElement alertMessage;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Something went wrong. Please try again')]")
    public WebElement errorMessage;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Try again')]")
    public WebElement tryAgainButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Add a beneficiary')]")
    public WebElement createBeneficiaryScreen;
    @AndroidFindBy(accessibility = "Add Contact")
    public WebElement newBeneficiaryIcon;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'beneficiaryFormScreenTypeSelect')]//android.widget.Spinner")
    public WebElement selectType;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Local')]")
    public WebElement selectLocal;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryLocalSwitch")
    public WebElement beneficiaryLocalToggle;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryFormScreenAccountField")
    public WebElement createBeneficiaryAccountNumberTextView;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryFormScreenNameField")
    public WebElement createBeneficiaryAccountNameTextView;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/textinput_error")
    public WebElement createBeneficiaryErrorMessage;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryFormScreen_submitButton")
    public WebElement continueButton;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/menu_delete")
    public WebElement deleteIcon;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'DELETE')]")
    public WebElement deleteButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'CANCEL')]")
    public WebElement cancelButton;
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'CLOSE')]")
    public WebElement closeButton;
    @AndroidFindBy(accessibility = "Navigate up")
    public WebElement navigationUP;
    @AndroidFindBy(id = "android:id/message")
    public WebElement beneficiaryMessage;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/activateButton")
    public WebElement activateButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
    public WebElement doneButton;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'beneficiaryFormScreen_toolbar')]//android.widget.TextView")
    public WebElement beneficiaryToolbar;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryDetailsScreen_title")
    public WebElement beneficiaryDetailsTitle;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryFormScreenTypeField")
    public WebElement beneficiaryType;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryDetailsScreen_identifierValue")
    public WebElement beneficiaryDetailType;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryFormScreenBankField")
    public WebElement beneficiaryBank;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryDetailsScreen_identifierValue")
    public WebElement beneficiaryDetailBank;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryFormScreenFullNameField")
    public WebElement beneficiaryFullName;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryDetailsScreen_identifierValue")
    public WebElement beneficiaryDetailFullName;
    @AndroidFindBy(id = "com.bsf.retail.dev:id/beneficiaryDetailsScreen_identifierValue")
    public WebElement beneficiaryDetailAccountNumber;


    public BeneficiaryAccountPage_Mobile() {
        this.driver = (AppiumDriver) Driver.driver;
        PageFactory.initElements( new AppiumFieldDecorator(driver), this);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void clickOnBeneficiaryButton() {
        Assert.assertTrue(beneficiaryButton.isDisplayed());
        beneficiaryButton.click();
    }
    public void clickOnSearchButton() {
        Assert.assertTrue(searchIcon.isDisplayed());
        searchIcon.click();
    }
    public void verifyBeneficiaryExist() {
        if(genericMethod.isElementPresent(noBeneficiaryYetTextView)){
            Assert.assertTrue(noBeneficiaryYetTextView.isDisplayed());
            Assert.assertTrue(addFirstBeneficiaryTextView.isDisplayed());
        }
    }

    public void enterAccountNameInSearchTextView(String name) {
        Assert.assertTrue(searchTextView.isDisplayed());
        searchTextView.sendKeys(name.trim());
    }
    public void verifyBeneficiaryScreen() {
        Assert.assertTrue(beneficiaryScreen.isDisplayed(), "Beneficiary screen is not displayed");
    }
    public void verifyBeneficiaryNameList() {
        for(WebElement name: beneficiaryNameList) {
            Assert.assertTrue(name.isDisplayed(), "Beneficiary name list is not displayed");
        }
    }

    public void verifyEndOfListBeneficiaryMessage(String message) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("direction", "down");
//        js.executeScript("mobile: scroll", scrollObject);


//        while (true) {
//            if (genericMethod.isElementPresent(endOfListBeneficiaryMessage)) {
//                System.out.println("Beneficiary account end list message : " + endOfListBeneficiaryMessage.getText());
//                Assert.assertEquals(endOfListBeneficiaryMessage.isDisplayed(), message, "Beneficiary end of list message : " + endOfListBeneficiaryMessage.getText() + "is not displayed");
//
//
//            } else {
                genericMethod.scrollToLastElement(driver, endOfListBeneficiaryMessage);

//            }
//        }
    }

    public void verifyAccountFirstName(String filename, String accountName) {
        ArrayList<String> listAccountName = new ArrayList<>();
        for(WebElement element : beneficiaryAccountName){
            Assert.assertTrue(element.isDisplayed());

            listAccountName.add(element.getText().trim());
        }
        Assert.assertTrue(listAccountName.contains(PropertiesOperations.getPropertyValueByKey(filename,accountName).trim()), "Failed to verify "+accountName+" exist in beneficiary");
    }
    public void clickOnAccountFirstName() {

        Assert.assertTrue(beneficiaryAccountName.get(0).isDisplayed());
        beneficiaryAccountName.get(0).click();
    }
    public void verifyAccountFirstNumber(String filename, String accountNumber) {
        ArrayList<String> listAccountNumber = new ArrayList<>();
        for(WebElement element : beneficiaryAccountNumber){
            Assert.assertTrue(element.isDisplayed());
            listAccountNumber.add(element.getText().trim());
        }
        Assert.assertTrue(listAccountNumber.contains(PropertiesOperations.getPropertyValueByKey(filename,accountNumber).trim()), "Failed to verify "+accountNumber+" exist in beneficiary");
    }
    public void verifyAccountFirstBankDetail(String filename, String accountBankDetail) {
        ArrayList<String> listAccountBankDetail = new ArrayList<>();
        for(WebElement element : beneficiaryAccountBankDetail){
            Assert.assertTrue(element.isDisplayed());
            listAccountBankDetail.add(element.getText().trim());
        }
        Assert.assertEquals(listAccountBankDetail.contains(PropertiesOperations.getPropertyValueByKey(filename, accountBankDetail).trim()), "Failed to verify "+accountBankDetail+" exist in beneficiary");
    }
    public void verifyAccountStatus(String filename,String accountStatus) {
        for(WebElement element : beneficiaryAccountStatus){
            Assert.assertTrue(element.isDisplayed());
            Assert.assertEquals(element.getText().trim(),PropertiesOperations.getPropertyValueByKey(filename,accountStatus).trim(), "Failed to verify "+accountStatus+" status in beneficiary");

        }
    }

    public void verifyAlertIsDisplayedOrNot() {
        if(genericMethod.isElementPresent(alertMessage)){
            Assert.assertTrue(alertMessage.isDisplayed());
            Assert.assertTrue(errorMessage.isDisplayed());
            Assert.assertTrue(tryAgainButton.isDisplayed());
            tryAgainButton.click();

        }
    }
    public void clickOnNewBeneficiaryIcon() {
        Assert.assertTrue(newBeneficiaryIcon.isDisplayed());
        newBeneficiaryIcon.click();
    }
    public void selectLocalType() throws InterruptedException {
        Thread.sleep(10);
        if(genericMethod.isElementPresent(selectType)) {
            selectType.click();
            Thread.sleep(10);
            selectLocal.click();
        }

    }
    public void onToggle() {
        beneficiaryLocalToggle.click();
    }
    public void enterCreateBeneficiaryAccountNumber(String filename, String accountNumber) {
        Assert.assertTrue(createBeneficiaryAccountNumberTextView.isDisplayed());
        createBeneficiaryAccountNumberTextView.sendKeys(PropertiesOperations.getPropertyValueByKey(filename, accountNumber).trim());
    }
    public void enterCreateBeneficiaryAccountName(String filename, String accountName) {
        Assert.assertTrue(createBeneficiaryAccountNameTextView.isDisplayed());
        createBeneficiaryAccountNameTextView.sendKeys(PropertiesOperations.getPropertyValueByKey(filename, accountName).trim());
    }
    public void verifyCreateBeneficiaryErrorMessage() {
        Assert.assertTrue(createBeneficiaryErrorMessage.isDisplayed(), "Failed to verify create Beneficiary error message is not displayed");
    }
    public void clickOnContinueButton() {
        Assert.assertTrue(continueButton.isDisplayed());
        continueButton.click();
    }
    public void deleteBeneficiaryIfExist(String filename, String beneficiaryAccountNameValue) {
        for(WebElement element : beneficiaryAccountName){
            Assert.assertTrue(element.isDisplayed());
            if(element.getText().toLowerCase().trim().equals(PropertiesOperations.getPropertyValueByKey(filename, beneficiaryAccountNameValue).toLowerCase().trim())){
                element.click();
                deleteIcon.click();
                deleteButton.click();
                navigationUP.click();
            }
        }
    }
    public void selectBeneficiary(String filename, String beneficiaryAccountNameValue) {
        for(WebElement element : beneficiaryAccountName){
            Assert.assertTrue(element.isDisplayed());
            if(element.getText().toLowerCase().trim().equals(PropertiesOperations.getPropertyValueByKey(filename, beneficiaryAccountNameValue).toLowerCase().trim())){
                element.click();
            }
        }
    }
    public void verifyBeneficiary(String filename, String beneficiaryAccountNameValue) {
        boolean exist = false;
        for(WebElement element : beneficiaryAccountName){
            Assert.assertTrue(element.isDisplayed());
            if(element.getText().toLowerCase().trim().equals(PropertiesOperations.getPropertyValueByKey(filename, beneficiaryAccountNameValue).toLowerCase().trim())){
                exist = true;
            }
        }
        if(!exist) Assert.assertTrue(false, "Beneficiary name: "+ PropertiesOperations.getPropertyValueByKey(filename, beneficiaryAccountNameValue)+" not exist");
    }
    public void clickOnDeleteIcon() {
        Assert.assertTrue(deleteIcon.isDisplayed());
        deleteIcon.click();
    }
    public void clickOnDeleteButton() {
        Assert.assertTrue(deleteButton.isDisplayed());
        deleteButton.click();
    }
    public void clickOnCancelButton() {
        Assert.assertTrue(cancelButton.isDisplayed());
        cancelButton.click();
    }
    public void clickOnCloseButton() {
        Assert.assertTrue(closeButton.isDisplayed());
        closeButton.click();
    }
    public void clickOnNavigationButton() {
        Assert.assertTrue(navigationUP.isDisplayed());
        navigationUP.click();
    }
    public void verifyMessage(String message) {
        Assert.assertTrue(beneficiaryMessage.isDisplayed());
        Assert.assertEquals(beneficiaryMessage.getText().trim(), message.trim(), "Failed to verify "+ message);
    }
    public void verifyMessageExist(String message) {
        if(genericMethod.isElementPresent(beneficiaryMessage)) {
            Assert.assertEquals(beneficiaryMessage.getText().trim(), message.trim(), "Failed to verify " + message);
        }
    }
    public void clickBeneficiaryStatus(String filename, String beneficiaryAccountNameValue) {
        WebElement element = null;
        String name = PropertiesOperations.getPropertyValueByKey(filename, beneficiaryAccountNameValue);
        if (driver.getClass().toString().toLowerCase().contains("android")) {
            element = driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+name+"')]//following-sibling::android.widget.TextView[contains(@resource-id,'beneficiaryPreview_statusView')]"));
            element.click();

        }else{
            //IOS code
        }
    }
    public void verifyBeneficiaryToolbar(String text) {

        Assert.assertTrue(beneficiaryToolbar.isDisplayed());
        Assert.assertEquals(beneficiaryToolbar.getText().trim(), text, "Failed to verify "+ text+ " is displayed");
    }
    public void verifyBeneficiaryDetailTitle(String filename, String accountName) {

        Assert.assertTrue(beneficiaryDetailsTitle.isDisplayed());
        Assert.assertEquals(beneficiaryDetailsTitle.getText().trim(), PropertiesOperations.getPropertyValueByKey(filename, accountName).toLowerCase(), "Failed to verify "+ accountName+ " is displayed");
    }
    public void verifyBeneficiaryReviewAccountNumber(String filename, String accountNumber) {
        Assert.assertTrue(createBeneficiaryAccountNumberTextView.isDisplayed());
        String number = "SA"+PropertiesOperations.getPropertyValueByKey(filename, accountNumber).trim();
        Assert.assertEquals(createBeneficiaryAccountNumberTextView.getText().trim(), number, "Failed to verify " + number + " account beneficiary detail");
    }
    public void verifyBeneficiaryDetailAccountNumber(String filename, String accountNumber) {
        Assert.assertTrue(beneficiaryDetailAccountNumber.isDisplayed());
        String number = "SA"+PropertiesOperations.getPropertyValueByKey(filename, accountNumber).trim();
        Assert.assertEquals(beneficiaryDetailAccountNumber.getText().trim(), number, "Failed to verify " + number + " account beneficiary detail");
    }
    public void verifyBeneficiaryReviewAccountName(String filename, String accountName) {
        Assert.assertTrue(beneficiaryFullName.isDisplayed());
        String value = PropertiesOperations.getPropertyValueByKey(filename, accountName).trim();
        Assert.assertEquals(beneficiaryFullName.getText().trim(), value, "Failed to verify " + value + " account beneficiary detail");
    }
    public void verifyBeneficiaryDetailAccountName(String filename, String accountName) {
        Assert.assertTrue(beneficiaryDetailFullName.isDisplayed());
        String value = PropertiesOperations.getPropertyValueByKey(filename, accountName).trim();
        Assert.assertEquals(beneficiaryDetailFullName.getText().trim(), value, "Failed to verify " + value + " account beneficiary detail");
    }
    public void verifyBeneficiaryReviewAccountBankName(String filename, String accountBankName) {
        Assert.assertTrue(beneficiaryBank.isDisplayed());
        String value = PropertiesOperations.getPropertyValueByKey(filename, accountBankName).trim();
        Assert.assertEquals(beneficiaryBank.getText().trim(), value, "Failed to verify " + value + " account beneficiary detail");
    }
    public void verifyBeneficiaryDetailAccountBankName(String filename, String accountBankName) {
        Assert.assertTrue(beneficiaryDetailBank.isDisplayed());
        String value = PropertiesOperations.getPropertyValueByKey(filename, accountBankName).trim();
        Assert.assertEquals(beneficiaryDetailBank.getText().trim(), value, "Failed to verify " + value + " account beneficiary detail");
    }
    public void verifyBeneficiaryReviewType(String filename, String accountType) {
        Assert.assertTrue(beneficiaryType.isDisplayed());
        String value = PropertiesOperations.getPropertyValueByKey(filename, accountType).trim();
        Assert.assertEquals(beneficiaryType.getText().trim(), value, "Failed to verify " + value + " account beneficiary detail");
    }
    public void verifyBeneficiaryDetailType(String filename, String accountType) {
        Assert.assertTrue(beneficiaryDetailType.isDisplayed());
        String value = PropertiesOperations.getPropertyValueByKey(filename, accountType).trim();
        Assert.assertEquals(beneficiaryDetailType.getText().trim(), value, "Failed to verify " + value + " account beneficiary detail");
    }
    public void verifyBeneficiaryReviewScreen(String filename, String value) {
        switch (value.toLowerCase()) {
            case "AccountType" -> {verifyBeneficiaryReviewType(filename, value);}
            case "AccountNumber"->{
                verifyBeneficiaryReviewAccountNumber(filename, value);
            }
            case "BankDetail"->{
                verifyBeneficiaryReviewAccountBankName(filename, value);
            }
            case "AccountName"->{verifyBeneficiaryReviewAccountName(filename, value);}
        }
    }
    public void verifyBeneficiaryDetailScreen(String filename, String value) {
        switch (value.toLowerCase()) {
            case "AccountType" -> {verifyBeneficiaryDetailType(filename, value);}
            case "AccountNumber"->{
                verifyBeneficiaryDetailAccountNumber(filename, value);
            }
            case "BankDetail"->{
                verifyBeneficiaryDetailAccountBankName(filename, value);
            }
            case "AccountName"->{verifyBeneficiaryDetailAccountName(filename, value);}
        }
    }
}
