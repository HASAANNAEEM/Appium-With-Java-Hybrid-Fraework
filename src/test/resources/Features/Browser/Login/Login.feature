@LoginModule @regression @smoke @e2e @webv1.2
Feature: Login Modules

  @TC_OC_LG_WEB_01 @BrowserTest @smokeTest @browser @Bug:OTPScreenNotWorking
  Scenario: OmniChannel_Sprint 1_Login
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
#    Then user able to see the OTP screen
#    Then user input "1234" as OTP
#    Then user click on "Submit" button
    Then user able to see "My Products" screen

  @TC_OC_LG_WEB_02 @BrowserTest @smokeTest @browser
  Scenario: Omni Channel_Sprint 1_Alternative And Negative Scenarios For Login Screen
    Given the browser is open
    Then user click on Language selection dropdown
    Then user able to select "Arabic" Language
    Then login Screen is displayed in "Arabic" Language with page title "مرحبًا بك في الخدمات المصرفية عبر الإنترنت"
    Then user click on Language selection dropdown
    Then user able to select "English" Language
    Then login Screen is displayed in "English" Language with page title "Welcome to your online banking"

  @TC_OC_LG_WEB_03 @BrowserTest @smokeTest @browser
  Scenario: Omni Channel_Sprint 1_Alternative And Negative Scenarios For Login Screen
    Given the browser is open
    Then user click on "Next" button
    Then message should be displayed "This is a required field."
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user click on "Sign in" button
    Then message should be displayed "This is a required field."
    Then user input password : "char123"
    Then user click on show password icon
    Then user click on "Sign in" button
    Then message should be displayed "Please check your credentials and try again." and showing the count "You have 2 attempts left"
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button

#  @TC_OC_LG_WEB_04@BrowserTest @browser @OTPScreenNotInBrowser
#  Scenario: Omni Channel_Sprint 1_Alternative And Negative Scenarios For OTP Screen
#    Given the browser is open
#
#  @TC_OC_LG_WEB_05 @BrowserTest @browser @IkamaNumberNotProvided
#  Scenario: Omni Channel_Sprint 12-[Forgot Username] - Retrieve/Show Username
#    Given the browser is open
#    Then user click on "Forgot Credentials"
