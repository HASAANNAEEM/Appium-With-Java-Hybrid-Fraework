package StepDefinitions.Mobile;

import Pages.actions.Mobile.BeneficiaryAccountPage_Mobile;
import io.cucumber.java.en.Then;

public class BeneficiaryAccountSteps_Mobile {

    BeneficiaryAccountPage_Mobile beneficiaryAccountPage_mobile = new BeneficiaryAccountPage_Mobile();

    @Then("user click on beneficiary button")
    public void selectCreditCard() {
        beneficiaryAccountPage_mobile.clickOnBeneficiaryButton();
    }
    @Then("user verify beneficiary screen is displayed")
    public void verifyBeneficiaryScreen() {
        beneficiaryAccountPage_mobile.verifyBeneficiaryScreen();
    }

    @Then("user verify beneficiary list is displayed")
    public void verifyBeneficiaryList() {
        beneficiaryAccountPage_mobile.verifyBeneficiaryNameList();
    }
    @Then("user verify beneficiary end of list {string} is displayed")
    public void verifyEndOfListBeneficiaryMessage(String message) {
        beneficiaryAccountPage_mobile.verifyEndOfListBeneficiaryMessage(message);
    }
    @Then("user verify if alert message is displayed click on try again")
    public void verifyBeneficiaryAlertExistOrNot() {
        beneficiaryAccountPage_mobile.verifyAlertIsDisplayedOrNot();
    }
    @Then("user verify beneficiary is exist or not")
    public void verifyBeneficiaryExistOrNot() {
        beneficiaryAccountPage_mobile.verifyBeneficiaryExist();
    }
    @Then("user verify beneficiary account name")
    public void verifyBeneficiaryAccountName() {
        beneficiaryAccountPage_mobile.verifyAccountFirstName("beneficiaryAccount", "AccountName");
    }
    @Then("user click beneficiary account name")
    public void clickOnBeneficiaryFirstnameAccountName() {
        beneficiaryAccountPage_mobile.clickOnAccountFirstName();
    }
    @Then("user verify beneficiary account number")
    public void verifyBeneficiaryAccountNumber() {
        beneficiaryAccountPage_mobile.verifyAccountFirstNumber("beneficiaryAccount", "AccountNumber");
    }
    @Then("user verify beneficiary account bank detail")
    public void verifyBeneficiaryAccountBankDetail() {
        beneficiaryAccountPage_mobile.verifyAccountFirstBankDetail("beneficiaryAccount", "BankDetail");
    }
    @Then("user verify beneficiary account status")
    public void verifyBeneficiaryAccountStatus() {
        beneficiaryAccountPage_mobile.verifyAccountStatus("beneficiaryAccount", "Status");
    }
    @Then("user click on new beneficiary icon")
    public void clickOnNewBeneficiaryIcon(){
        beneficiaryAccountPage_mobile.clickOnNewBeneficiaryIcon();
    }
    @Then("user select local type")
    public void selectLocalType() throws InterruptedException {
        beneficiaryAccountPage_mobile.selectLocalType();
    }
    @Then("user on local toggle")
    public void onToggle(){
        beneficiaryAccountPage_mobile.onToggle();
    }
    @Then("user enter beneficiary account number")
    public void enterBeneficiaryAccountNumber(){
        beneficiaryAccountPage_mobile.enterCreateBeneficiaryAccountNumber("beneficiaryAccount", "AccountNumber");
    }
    @Then("user enter {string} beneficiary")
    public void enterBeneficiaryAccountNumber(String value){
        beneficiaryAccountPage_mobile.enterCreateBeneficiaryAccountNumber("beneficiaryAccount", value);
    }

    @Then("user enter beneficiary account name")
    public void enterBeneficiaryAccountName(){
        beneficiaryAccountPage_mobile.enterCreateBeneficiaryAccountName("beneficiaryAccount", "AccountName");
    }
    @Then("user verify create beneficiary account error message is displayed")
    public void verifyCreateBeneficiaryErrorMessage(){
        beneficiaryAccountPage_mobile.verifyCreateBeneficiaryErrorMessage();
    }
    @Then("user click on continue button")
    public void clickOnContinueButton(){
        beneficiaryAccountPage_mobile.clickOnContinueButton();
    }
    @Then("user delete {string} beneficiary if already exist in the list")
    public void deleteBeneficiaryAccount(String beneficiaryAccountName){
        beneficiaryAccountPage_mobile.deleteBeneficiaryIfExist("beneficiaryAccount", beneficiaryAccountName);
    }
    @Then("user click on {string} beneficiary")
    public void clickBeneficiaryAccount(String beneficiaryAccountName){
        beneficiaryAccountPage_mobile.selectBeneficiary("beneficiaryAccount", beneficiaryAccountName);
    }
    @Then("user verify {string} beneficiary exist")
    public void verifyBeneficiaryAccount(String beneficiaryAccountName){
        beneficiaryAccountPage_mobile.verifyBeneficiary("beneficiaryAccount", beneficiaryAccountName);
    }
    @Then("user click on delete icon")
    public void clickOnDeleteIcon(){
        beneficiaryAccountPage_mobile.clickOnDeleteIcon();
    }
    @Then("user click on delete button")
    public void clickOnDeleteButton(){
        beneficiaryAccountPage_mobile.clickOnDeleteButton();
    }
    @Then("user click on cancel button")
    public void clickOnCancelButton(){
        beneficiaryAccountPage_mobile.clickOnCancelButton();
    }
//    @Then("user click on close button")
//    public void clickOnCloseButton(){
//        beneficiaryAccountPage_mobile.clickOnCloseButton();
//    }
    @Then("user click on navigation up button")
    public void clickOnNavigationButton(){
        beneficiaryAccountPage_mobile.clickOnNavigationButton();
    }
    @Then("user verify {string} message")
    public void verifyMessage(String messageText){
        beneficiaryAccountPage_mobile.verifyMessage(messageText);
    }
    @Then("user verify beneficiary list exist or {string} message is displayed")
    public void verifyMessageExist(String messageText){
        beneficiaryAccountPage_mobile.verifyMessageExist(messageText);
    }
    @Then("user click {string} beneficiary status")
    public void clickBeneficiaryStatus(String beneficiaryAccountName){
        beneficiaryAccountPage_mobile.clickBeneficiaryStatus("beneficiaryAccount", beneficiaryAccountName);
    }
    @Then("user verify {string} beneficiary screen")
    public void verifyBeneficiaryReviewScreen(String title){
        beneficiaryAccountPage_mobile.verifyBeneficiaryToolbar(title);
    }
    @Then("user verify {string} detail beneficiary screen")
    public void verifyBeneficiaryDetailScreen(String accountName){
        beneficiaryAccountPage_mobile.verifyBeneficiaryDetailTitle("beneficiaryAccount", accountName);
    }
    @Then("user verify {string} beneficiary review detail")
    public void verifyBeneficiaryReview(String title){
        beneficiaryAccountPage_mobile.verifyBeneficiaryReviewScreen("beneficiaryAccount", title);
    }
    @Then("user verify {string} beneficiary detail screen")
    public void verifyBeneficiaryDetail(String title){
        beneficiaryAccountPage_mobile.verifyBeneficiaryDetailScreen("beneficiaryAccount", title);
    }
}

