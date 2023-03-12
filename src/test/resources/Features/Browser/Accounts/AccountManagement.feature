@AccountManagement @regression @smoke @e2e @webv1.2
Feature: Account Management

  @TS_0C_AM_WEB_06 @BrowserTest @smokeTest @browser @OverdraftDetailIsMissing
  Scenario: Verify that the user is navigated to savings account information screen on clicking "Account Info" tab on my products page
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user is able to view saving account
    Then user click on account number
    Then user is able to view "Transactions" & "Account Info" tab
    Then user click on "Account Info" tab
    Then user verify print icon
    Then user verify "General" section
    Then user verify "General" section with field "Account Type"
    Then user verify "General" section with field "Account Owner(s)"
    Then user verify "General" section with field "IBAN"
    Then user verify "General" section with field "Account Currency"
    Then user verify "General" section with field "Available Balance"
    Then user verify "Interest Details" section
    Then user verify "Interest Details" section with field "Accrued Interest"
    Then user verify "Other" section
    Then user verify "Other" section with field "Account Opening Date"


  @TS_0C_AM_WEB_07 @BrowserTest @browser @smokeTest
  Scenario: Verify that the user is navigated to savings account information screen on clicking "Account Info" tab on my products page
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user click on "Manage Accounts"
    Then user click on Edit button of saving account
    Then user clicks "Back to my Account"
    Then user able to see "My Products" screen
    Then user is able to view saving account
    Then user click on account number
    Then user is able to view "Transactions" & "Account Info" tab
    Then user click on "Account Info" tab
    Then user verify print icon

  @TS_0C_AM_WEB_08 @BrowserTest @browser @MyCreditCardMyLoanMyTermDepositNotAppearing @smokeTest
  Scenario: Verify that the user is navigated to the My product screen after successfully logging in.
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user is able to view saving account
    Then user is able to view current account

  @TS_0C_AM_WEB_09 @BrowserTest @browser @smokeTest
  Scenario: Verify that the user is navigated to savings account information screen on clicking "Account Info" tab on my products page
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user is able to view current account
    Then user click on current account number
    Then user is able to view "Transactions" & "Account Info" tab
    Then user click on "Account Info" tab
    Then user verify print icon
    Then user verify "General" section
    Then user verify "General" section with field "Account Type"
    Then user verify "General" section with field "IBAN"
    Then user verify "General" section with field "Account Currency"
    Then user verify "General" section with field "Account Number"
    Then user verify "Other" section
    Then user verify "Other" section with field "Last Updated Date"

  @TS_0C_AM_WEB_10 @BrowserTest @browser @smokeTest
  Scenario: Verify that product type(e.g. Savings Account) is displayed as alias name if alias name is not available.
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user is able to view current account
    Then user is able to view saving account

  @TS_0C_AM_WEB_11 @BrowserTest @browser
  Scenario: Verify that If no transactions are available, then "No transaction found."  message is displayed to the user.
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user is able to view current account
    Then user click on current account number
    Then user is able to view "Transactions" & "Account Info" tab
    Then user is able to view "No Transactions Found" message


  @TS_0C_AM_WEB_12 @BrowserTest @browser
  Scenario: Verify that the alias name is updated and "successfully updated" message is displayed to the user on clicking the "tick" icon below the text field
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user is able to view current account
    Then user is able to view saving account
    Then user click on "Manage Accounts"
    Then user click on Edit button of saving account
    Then user enter name of Saving Account as "saving account"
    Then user click on Accept button
    Then user verify the message on manage screen as "Successfully Updated"
    Then user clicks "Back to my Account"
    Then user click on "Manage Accounts"
    Then user click on Edit button of current account
    Then user enter name of Current Account "current account"
    Then user click on Accept button
    Then user verify the message on manage screen as "Successfully Updated"

  @TS_0C_AM_WEB_13 @BrowserTest @browser
  Scenario: Verify that the user is able to disable an account using the toggle button on manage accounts page
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user click on "Manage Accounts"
#    Then user click on Toggle button of current account
#    Then user verify the message on manage screen as "Successfully Updated"
#    Then user clicks "Back to my Account"
#    Then user is not able to view current account
#    Then user click on "Manage Accounts"
#    Then user click on Toggle button of current account
#    Then user is able to view current account

  @TS_0C_AM_WEB_14 @BrowserTest @browser
  Scenario: To verify the functionality of Manage Accounts
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user click on "Manage Accounts"
    Then user is able to see the header as "Manage my Accounts"
    Then user is able to see list of account
    Then user is able to see the Account type as "Current Account" & "Savings Account"
    Then user is able to see Account Name
    Then user is able to see edit icon
    Then user is able to see account number
    Then user is able to see Amount balance
    Then user is able to see toggle button

  @TS_0C_AM_WEB_15 @BrowserTest @browser
  Scenario: Verify that the the text field is deactivated on clicking the "x" icon on edit name field
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user click on "Manage Accounts"
    Then user click on Edit button of saving account
    Then user click on Cancel button
    Then user is unable enter account name and field deactivated


