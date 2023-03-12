package StepDefinitions.Mobile;

import io.cucumber.java.en.Then;
import Pages.actions.Mobile.MyProductsPage_Mobile;
import Pages.actions.Mobile.CreditCardPage_Mobile;


public class CreditCardSteps_Mobile {
    MyProductsPage_Mobile myProductsPage_mobile = new MyProductsPage_Mobile();
    CreditCardPage_Mobile creditCardPage_mobile = new CreditCardPage_Mobile();

    @Then("user select credit card")
    public void selectCreditCard() {
        myProductsPage_mobile.clickOnCreditCard();
    }
    @Then("user verify {string} header and {string} message is displayed or not")
    public void verifyHeaderMessage(String header,String message) {
        creditCardPage_mobile.verifyHeaderMessage(header, message);
    }
    @Then("user verify transaction detail is displayed in descending order")
    public void verifyTransactionDetailInDescendingOrder() {
        creditCardPage_mobile.verifyTransactionDate();
    }

    @Then("user verify card holder name is displayed")
    public void verifyCardHolderName() {
        creditCardPage_mobile.verifyCardHolderNameIsDisplayed();
    }

    @Then("user verify card expiry date is displayed")
    public void verifyCardExpiryDate() {
        creditCardPage_mobile.verifyExpiryDateIsDisplayed();
    }
    @Then("verify the {string} screen")
    public void verifyTheTitle(String titleText) {
        creditCardPage_mobile.verifyTitle(titleText);
    }

    @Then("verify the account icon is displayed")
    public void verifyTheAccountIcon() {
        creditCardPage_mobile.verifyAccountIcon();
    }

    @Then("user click on edit account name")
    public void clickOnEditAccountName() {
        creditCardPage_mobile.clickOnEditAccountName();
    }
    @Then("user click on close button")
    public void clickOnCloseButton() {
        creditCardPage_mobile.clickOnCloseButton();
    }
}
