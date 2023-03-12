package StepDefinitions.Browser;

import Pages.actions.Browser.AccountManagement_Browser;
import io.cucumber.java.en.Then;

public class AccountManagementSteps {



    AccountManagement_Browser AccountManagement= new AccountManagement_Browser();


    @Then("user is able to view saving account")
    public void click_saving_account()
    {
        AccountManagement.DisplaySavingAccount();
    }

    @Then("user is able to view current account")
    public void view_current_account()
    {
        AccountManagement.DisplayCurrentAccount();
    }

    @Then("user click on {string}")
    public void Click_manage_account(String value)
    {
        AccountManagement.getClickManageAccounts(value);
    }

    @Then("user click on Edit button of saving account")
    public void click_on_edit_button_of_saving_account()
    {
        AccountManagement.getSavingEditButton();
    }

    @Then("user clicks {string}")
    public void click_on_back_to_my_account(String button)
    {
        AccountManagement.ClickToMyAccountButton(button);
    }

    @Then("user click on account number")
    public void click_on_saving_account_number()
    {
        AccountManagement.GetSavingAccountClick();
    }

    @Then("user click on current account number")
    public void click_on_current_account_number()
    {
        AccountManagement.GetCurrentAccountClick();
    }

    @Then("user is able to view {string} & {string} tab")
    public void view_tabs(String value, String name)
    {
        AccountManagement.GetSavingAccountTabs(value,name);
    }

    @Then("user click on {string} tab")
    public void click_tabs(String value)
    {
        AccountManagement.GetClickOnTab(value);
    }

    @Then("user verify print icon")
    public void click_tabs()
    {
        AccountManagement.GetSavingAccountPrintIcon();
    }

    @Then("user verify {string} section")
    public void verify_section_name(String value)
    {
        AccountManagement.VerifySectionName(value);
    }

    @Then("user verify {string} section with field {string}")
    public void verify_section_name_fields(String value, String name)
    {
        AccountManagement.VerifySectionName(value);
        AccountManagement.VerifySectionName(name);
    }

    @Then("user click on print icon")
    public void click_print_btn() throws InterruptedException {
        AccountManagement.GetPrintBtnClick();
        try {
            AccountManagement.CancelPrintBtn();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user verify print window opens")
    public void verify_print_window() throws InterruptedException {
        try {
            AccountManagement.CancelPrintBtn();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user is able to view {string} message")
    public void verify_view_message(String message)
    {
        AccountManagement.GetTransactionMessage(message);
    }

    @Then("user enter name of Saving Account as {string}")
    public void enter_account_name(String value)
    {
        AccountManagement.SetAccountName(value);
    }

    @Then("user click on Accept button")
    public void click_accept_Btn()
    {
        AccountManagement.ClickAccountNameAccept();
    }

    @Then("user click on Edit button of current account")
    public void click_current_account()
    {
        AccountManagement.ClickCurrentEditButton();
    }

    @Then("user enter name of Current Account {string}")
    public void enter_currentAccount_Name(String value)
    {
        AccountManagement.SetCurrentAccountName(value);
    }

    @Then("user verify the message on manage screen as {string}")
    public void message_manageScreen(String message)
    {
        AccountManagement.VerifyManageScreenMessage(message);
    }

    @Then("user click on Toggle button of current account")
    public void click_toggleBtn() throws InterruptedException {
        AccountManagement.ClickToggleBtnOff();
    }

    @Then("user is able to see the header as {string}")
    public void user_is_able_to_see_the_header_as(String value) {
        AccountManagement.GetHeaderName(value);
    }
    @Then("user is able to see the verbiage as {string}")
    public void MyAccount_Verbiage(String value) {
        AccountManagement.GetAccountNameVerbiage(value);
    }
    @Then("user is able to see list of account")
    public void user_is_able_to_see_list_of_account() {
       AccountManagement.GetAccountList();
    }
    @Then("user is able to see the Account type as {string} & {string}")
    public void Show_Account_name(String value, String name) {
        AccountManagement.GetAccountName(value,name);
    }
    @Then("user is able to see Account Name")
    public void Show_Account() {
      AccountManagement.GetAccountNumber();
    }
    @Then("user is able to see edit icon")
    public void Account_edit_icon() {
       AccountManagement.GetEditButtonIcon();
    }
    @Then("user is able to see account number")
    public void Account_number_Viewable() {
        AccountManagement.GetAccountNumberView();
    }
    @Then("user is able to see Amount balance")
    public void Account_Balance() {
        AccountManagement.GetAccountBalance();
    }
    @Then("user is able to see toggle button")
    public void Show_toggle_button() {
       AccountManagement.GetToggleBtn();
    }
    @Then("user click on Cancel button")
    public void click_Cancel_Btn()
    {
        AccountManagement.ClickCancelBtn();
    }
    @Then("user is unable enter account name and field deactivated")
    public void Account_deactivated()
    {
        AccountManagement.getAccountNameField();
    }



}
