@CreditCardMobile @regression @e2e @sprint2
Feature: Credit Card Module for Mobile Application

  @TC_CCATL_01_01 @TC_CCATL_02_04 @TC_CCATL_02_05 @TC_CCAD_01_01 @TC_CCAD_02_02 @TC_CCAD_02_03 @TC_CCAD_02_05 @TC_CCAD_02_06 @TC_CCAD_02_07 @mobile @sprint2
  Scenario Outline: To verify the functionality of Credit card account transaction and list screen
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user select credit card
    Then the testcase "TC_CCATL_01_01" is complete
    Then user verify "No transactions yet" header and "We didn't find any transactions on this account." message is displayed or not
    Then the testcase "TC_CCATL_02_05" is complete
    Then user verify transaction detail is displayed in descending order
    Then user clicks on the details icon
    Then verify the account details screen is open
    Then user clicks on the navigate back icon
    Then verify the My Products page is open
    Then the testcase "TC_CCAD_02_02" is complete
    Then user clicks on the details icon
    Then verify the account details screen is open
    Then the testcase "TC_CCAD_01_01" is complete
    Then user verify card holder name is displayed
    Then user verify card expiry date is displayed
    Then the testcase "TC_CCAD_02_03" is complete
    Then user click on edit account name
    Then the testcase "TC_CCAD_02_05" is complete
    Then verify the "Would you like to give your account a new name?" screen
    Then verify the account icon is displayed
    Then the testcase "TC_CCAD_02_06" is complete
    Then user click on close button
    Then user clicks on the navigate back icon
    Then verify the account details screen is open

    Examples:
      |Application|
      |Android|