@AccountManagementMobile @regression @e2e @sprint1
Feature: Account Management Module for Mobile Application

  @TC_OCAT_AOD_01 @TC_OCAT_AOD_01_01 @TC_OCAT_AOD_01_02 @TC_OCAT_AOD_01_06 @mobile @sprint1
  Scenario Outline: To verify the functionality of Account and Transactions
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user clicks on the first savings account visible
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the details icon
    Then verify the account details screen is open
    Then close the appium driver
    Examples:
      |Application|
      |Android|
#      |browserstack-ios|

  @TC_OCAT_MPS_02 @TC_OCAT_MPS_02_01 @TC_OCAT_MPS_02_04 @TC_OCAT_MPS_02_05 @TC_OCAT_MPS_02_06 @mobile @sprint1
  Scenario Outline: To verify the functionality of My Products Screen
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then verify all the current accounts shown are grouped under the heading "Current Accounts"
    Then verify all the current accounts shown are grouped under the heading "Savings Accounts"
#    Then verify all the current accounts shown are grouped under the heading "My Cards Accounts"
#    Then verify all the current accounts shown are grouped under the heading "My Loans Accounts"
#    Then verify all the current accounts shown are grouped under the heading "My Term Deposits Accounts"
#    Then verify all the current accounts shown are grouped under the heading "My Investment Accounts"
    Then user clicks on the first savings account visible
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the details icon
    Then verify the account details screen is open
#    Then verify the account name is same as the one on my products page without alias "Saving Account"
    Then user clicks on the navigate back icon
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the navigate back icon my products page
    Then verify the My Products page is open
    Then verify all the accounts currency is the same as in the details page
    Then verify all the accounts balance is the same as in the details page
    Examples:
      |Application|
      |Android|
#      |browserstack-ios|

  @TC_OCAT_ADS_03 @TC_OCAT_ADS_03_01 @TC_OCAT_ADS_03_02 @TC_OCAT_ADS_03_03 @mobile @sprint2
  Scenario Outline: To verify the functionality of My Products Screen
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user clicks on the first current account visible
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the details icon
    Then verify the account details screen is open
#    Then verify the product icon is visible on the screen
    Then verify the account name is visible on the screen
    Then verify the account number is visible on the screen
    Then verify the account balance is visible on the screen
    Then verify the label "Account Details" is present "always"
    Then verify the label "General" is present "always"
    Then verify the label "Other" is present "always"
    Then verify the label "Overdraft Details" is present "If Any"
    Then the testcase "TC_OCAT_ADS_03_01" is complete
    Then verify the label account name with edit icon exists under the General Section
#    Then verify the label "Account Name" exists under the General Section
    Then verify the label "Account Type" exists under the General Section
    Then verify the label "Account Currency" exists under the General Section
#    Then verify the label "Swift Code" exists under the General Section
    Then the testcase "TC_OCAT_ADS_03_03 for Current Account" is complete
    Then user clicks on the navigate back icon
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the navigate back icon my products page
    Then user clicks on the first savings account visible
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the details icon
    Then verify the account details screen is open
#    Then verify the product icon is visible on the screen
    Then verify the account name is visible on the screen
    Then verify the account number is visible on the screen
    Then verify the account balance is visible on the screen
    Then verify the label "Account Details" is present "always"
    Then verify the label "General" is present "always"
    Then verify the label "Other" is present "always"
    Then verify the label "Profit Details" is present "If Any"
    Then the testcase "TC_OCAT_ADS_03_02" is complete
    Then verify the label account name with edit icon exists under the General Section
    Then verify the label "Account Name" exists under the General Section
    Then verify the label "Account Type" exists under the General Section
    Then verify the label "Account Currency" exists under the General Section
#    Then verify the label "Swift Code" exists under the General Section
    Then the testcase "TC_OCAT_ADS_03_03 for Saving Account" is complete
    Examples:
      |Application|
      |Android|
#      |browserstack-ios|


  @TC_OCAT_ADS_03_08 @TC_OCAT_ADS_03_01 @TC_OCAT_ADS_03_02 @TC_OCAT_ADS_03_02 @mobile @sprint2
  Scenario Outline: To verify the functionality of Account Details screen
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user clicks on the first savings account visible
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the details icon
#    Then verify the account details screen is open
#    Then verify the product icon is visible on the screen
    Then verify the account name is visible on the screen
    Then verify the account number is visible on the screen
    Then verify the account balance is visible on the screen
    Then user click on copy to clipboard "Account Name"
    Then verify user copy the "Account Name"
    Then user click on copy to clipboard "Account Number"
    Then verify user copy the "Account Number"
    Then user click on copy to clipboard "Account IBAN Number"
    Then verify user copy the "Account IBAN Number"
    Then user select the share button
    Then user click on message icon
    Then user send the detail using message
    Then user clicks on the navigate back icon
    Then user clicks on the navigate back icon my products page
    Then verify the My Products page is open
    Then user clicks on the first current account visible
#    Then verify the saving account name, number and currency value opened is same
    Then user clicks on the details icon
#    Then verify the account details screen is open
#    Then verify the product icon is visible on the screen
    Then verify the account name is visible on the screen
    Then verify the account number is visible on the screen
    Then verify the account balance is visible on the screen
    Then user click on copy to clipboard "Account Name"
    Then verify user copy the "Account Name"
    Then user click on copy to clipboard "Account Number"
    Then verify user copy the "Account Number"
    Then user click on copy to clipboard "Account IBAN Number"
    Then verify user copy the "Account IBAN Number"
    Then user select the share button
    Then user click on message icon
    Then user send the detail using message
    Then user clicks on the navigate back icon

    Examples:
      |Application|
      |Android|
