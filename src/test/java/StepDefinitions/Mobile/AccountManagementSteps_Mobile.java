package StepDefinitions.Mobile;

import Pages.actions.Mobile.AccountDetailsPage_Mobile;
import Pages.actions.Mobile.LoginPage_Mobile;
import Pages.actions.Mobile.MyProductsPage_Mobile;
import Pages.actions.Mobile.SavingAccountPage_Mobile;
import Utils.JsonHandler;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;

public class AccountManagementSteps_Mobile {
    MyProductsPage_Mobile myProductsPage_mobile = new MyProductsPage_Mobile();
    AccountDetailsPage_Mobile accountDetailsPage_mobile = new AccountDetailsPage_Mobile();
    SavingAccountPage_Mobile savingAccountPageMobile = new SavingAccountPage_Mobile();
    JsonHandler jsonHandler = new JsonHandler();

    @Then("user clicks on the first savings account visible")
    public void userClicksOnTheFirstSavingsAccountVisible() {
        myProductsPage_mobile.selectFirstSavingsAccount();
    }

    @Then("user clicks on the second savings account visible")
    public void userClicksOnTheSecondSavingsAccountVisible() {
        myProductsPage_mobile.selectSecondSavingsAccount();
    }

    @Then("verify the saving account name, number and currency value opened is same")
    public void verifyTheSavingAccountNameNumberAndCurrencyValueOpenedIsSame() {
        savingAccountPageMobile = new SavingAccountPage_Mobile();
        savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
        savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
        savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
    }

    @Then("user clicks on the details icon")
    public void userClicksOnTheDetailsIcon() {
        savingAccountPageMobile.selectDetailsIcon();
    }

    @Then("user verify transaction details screen")
    public void userVerifyDetailsIcon() {
        savingAccountPageMobile.verifyDetailsIcon();
    }

    @Then("verify the account details screen is open")
    public void verifyTheAccountDetailsScreenIsOpen() {
        accountDetailsPage_mobile = new AccountDetailsPage_Mobile();
        accountDetailsPage_mobile.verifyAccountDetailsScreen();
    }

    @Then("verify all the current accounts shown are grouped under the heading {string}")
    public void verifyAllTheCurrentAccountsShownAreGroupedUnderTheHeadingMyCurrentAccounts(String headingName) {
        myProductsPage_mobile.verifyAllAccountTypesUnderHeading(savingAccountPageMobile,accountDetailsPage_mobile,headingName);
    }

    @Then("verify the account name is same as the one on my products page")
    public void verifyTheAccountNameIsSameAsTheOneOnMyProductsPage() {
        accountDetailsPage_mobile.verifyAccountName(myProductsPage_mobile);
    }

    @Then("verify the account name is same as the one on my products page without alias {string}")
    public void verifyTheAccountNameIsSameAsTheOneOnMyProductsPageWithoutAlias(String headingName) {
        accountDetailsPage_mobile.verifyAccountName(myProductsPage_mobile,headingName);
    }

    @Then("user clicks on the navigate back icon")
    public void userClicksOnTheNavigateBackIcon() {
        accountDetailsPage_mobile.selectBackButton();
    }

    @Then("verify all the accounts currency is the same as in the details page")
    public void verifyAllTheAccountsCurrencyIsTheSameAsInTheDetailsPage() {
        myProductsPage_mobile.verifyCurrencyForAllAccounts(savingAccountPageMobile,accountDetailsPage_mobile);
    }

    @Then("verify all the accounts balance is the same as in the details page")
    public void verifyAllTheAccountsBalanceIsTheSameAsInTheDetailsPage() {
        myProductsPage_mobile.verifyAllAccountBalance(savingAccountPageMobile,accountDetailsPage_mobile);
    }

    @Then("user clicks on the first current account visible")
    public void userClicksOnTheFirstCurrentAccountVisible() {
        myProductsPage_mobile.selectFirstCurrentAccount();
    }

    @Then("verify the product icon is visible on the screen")
    public void verifyTheProductIconIsVisibleOnTheScreen() {
        accountDetailsPage_mobile.verifyAccountProductIcon();
    }

    @Then("verify the account number is visible on the screen")
    public void verifyTheAccountNumberIsVisibleOnTheScreen() {
        accountDetailsPage_mobile.verifyAccountNumber();
    }

    @Then("verify the account balance is visible on the screen")
    public void verifyTheAccountBalanceIsVisibleOnTheScreen() {
        accountDetailsPage_mobile.verifyAccountBalance();
    }

    @Then("verify the label {string} is present {string}")
    public void verifyTheLabelIsPresent(String headingLabel, String exists) {
        accountDetailsPage_mobile.labelExists(headingLabel,exists);
    }

    @Then("verify the account name is visible on the screen")
    public void verifyTheAccountNameIsVisibleOnTheScreen() {
        accountDetailsPage_mobile.verifyAccountName();
    }

    @Then("verify the label {string} exists under the General Section")
    public void verifyTheLabelExistsUnderTheGeneralSection(String label) {
        accountDetailsPage_mobile.verifyLabelUnderGeneralSection(label);
    }

    @Then("verify the label account name with edit icon exists under the General Section")
    public void verifyTheLabelAccountNameWithEditIconExistsUnderTheGeneralSection() {
        accountDetailsPage_mobile.verifyLabelWithEditIcon();
    }

    @Then("user clicks on the navigate back icon my products page")
    public void userClicksOnTheNavigateBackIconMyProductsPage() {
        if(accountDetailsPage_mobile.driver.getClass().toString().toLowerCase().contains("android")) accountDetailsPage_mobile.selectBackButton();
        else myProductsPage_mobile.selectBackButton();
    }

    @Then("verify user copy the {string}")
    public void userVerifyCopyToClipboard(String fieldName) {
        accountDetailsPage_mobile.verifyAccountNumberCopied(fieldName);
    }

    @Then("user click on copy to clipboard {string}")
    public void userClickOnCopyToClickButton(String title) {
        accountDetailsPage_mobile.clickOnCopyToClipBoard(title);
    }

    @Then("user select the share button")
    public void userSelectShare() {
        accountDetailsPage_mobile.selectShare();
    }

    @Then("user send the detail using message")
    public void userSelectContactNumber() {
        accountDetailsPage_mobile.selectContactNumber();
    }

}
