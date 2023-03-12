@LoginModuleMobile @regression @e2e
Feature: Login Modules for Mobile Application

  @TC_OC_Mobile_Login_01 @TC_OC_Login_01_01 @TC_OC_Login_01_02 @TC_OC_Login_01_03 @TC_OC_Login_01_04 @mobile @sprint1
  Scenario Outline: To verify the functionality of Login
    Given the application is open "<Application>"
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "michaelbsf0010" on the screen
    Then user inputs the password "michaelbsf0010" on the screen
    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "1234"
#    Then user clicks on the button Submit on the screen
    Then user verifies the screen Enable Biometrics is open
    Then user clicks on the button enable biometrics on the screen
    Then complete the biometrics
    Then user verifies the screen Create passcode is open
    Then user clicks on the button 0 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 4 on the screen
    Then user clicks on the button 6 on the screen
    Then user clicks on the button 8 on the screen
    Then user verifies the screen Confirm passcode is open
    Then user clicks on the button 0 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 4 on the screen
    Then user clicks on the button 6 on the screen
    Then user clicks on the button 8 on the screen
    Then user verifies the screen Well done! is open
    Then user clicks on the button Let's get started on the screen
    Then accept the popup notification if the device is ios
    Then verify the My Products page is open
#    Then close the appium driver
    Examples:
      |Application|
      |android|
#      |browserstack-ios|

  @TC_OC_Mobile_LWUP_02 @TC_OC_LWUP_02_01 @TC_OC_LWUP_02_02 @TC_OC_LWUP_02_03 @TC_OC_LWUP_02_05 @TC_OC_LWUP_02_07 @mobile @sprint1
  Scenario Outline: To verify the functionality of Login Screen
    Given the application is open "<Application>"
    Then verify the splash screen
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "asdasd" on the screen
    Then user inputs the password "asdasd" on the screen
    Then verify the password is masked "true"
    Then user clicks on the eye icon
    Then verify the password is masked "false"
    Then user clicks on the button Sign in on the screen
    Then verify the incorrect error message is shown
    Then user clicks on Forgot Credentials Icon
    Then user verifies the screen Forgot Credentials is open
#    Then close the appium driver
    Examples:
      |Application|
      |Android|
#      |browserstack-ios|

#  @TC_OC_LWUP_OTP_03 @TC_OC_LWUP_OTP_03_05 @TC_OC_LWUP_OTP_03_07 @mobile @sprint1
#  Scenario Outline: To verify th functionality of OTP Screen
#    Given the application is open "<Application>"
#    Then user verifies the screen select your language is open
#    Then user selects the language english from the screen
#    Then user clicks on the button continue on the screen
#    Then user verifies the screen Let's get started is open
#    Then user inputs the username "charlesbsf001" on the screen
#    Then user inputs the password "charlesbsf001" on the screen
#    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "4321"
#    Then user clicks on the button Submit on the screen
#    Then user verifies the invalid otp code error
#    Then user clicks on the button Submit on the screen
#    Then user verifies the invalid otp code error
#    Then user clicks on the button Submit on the screen
#    Then user verifies the invalid otp code error
#    Then user clicks on the button Submit on the screen
#    Then user verifies the invalid otp code error
#    Then user clicks on the button Submit on the screen
#    Then user verifies the account is temporarily locked on the screen
#    Then close the appium driver
#    Examples:
#      |Application|
#      |Android|
#      |browserstack-ios|

  @TC_OC_LWUP_CPS1_06 @TC_OC_LWUP_CPS_06 @TC_OC_LWUP_CPS_06_01 @TC_OC_LWUP_CPS_06_02 @mobile @sprint1
  Scenario Outline: To verify the functionality of create passcode screen
    Given the application is open "<Application>"
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "michaelbsf0010" on the screen
    Then user inputs the password "michaelbsf0010" on the screen
    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "1234"
#    Then user clicks on the button Submit on the screen
    Then user verifies the screen Enable Biometrics is open
    Then user clicks on the button enable biometrics on the screen
    Then complete the biometrics
    Then user verifies the screen Create passcode is open
    Then user clicks on the button 0 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 4 on the screen
    Then user clicks on the button 6 on the screen
    Then user clicks on the button 8 on the screen
    Then user verifies the screen Confirm passcode is open
    Then user clicks on the button 0 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 4 on the screen
    Then user clicks on the button 6 on the screen
    Then user clicks on the button 8 on the screen
    Then user verifies the screen Well done! is open
    Then user clicks on the button Let's get started on the screen
    Then accept the popup notification if the device is ios
    Then verify the My Products page is open
#    Then close the appium driver
    Examples:
      |Application|
      |Android|
#      |browserstack-ios|

  @TC_OC_LWUP_CPS2_06 @TC_OC_LWUP_CPS_06 @TC_OC_LWUP_CPS_06_01 @TC_OC_LWUP_CPS_06_02 @mobile @sprint1
  Scenario Outline: To verify the functionality of create passcode screen
    Given the application is open "<Application>"
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "michaelbsf0010" on the screen
    Then user inputs the password "michaelbsf0010" on the screen
    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "1234"
#    Then user clicks on the button Submit on the screen
    Then user verifies the screen Enable Biometrics is open
    Then user clicks on the button enable biometrics on the screen
    Then complete the biometrics
    Then user verifies the screen Create passcode is open
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user verifies the screen Confirm passcode is open
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 2 on the screen
    Then verify repeating number error is shown
    Then user verifies the screen Create passcode is open
    Then user clicks on the button 0 on the screen
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 4 on the screen
    Then user clicks on the button 6 on the screen
    Then user clicks on the button 8 on the screen
    Then user verifies the screen Confirm passcode is open
    Then user clicks on the button 2 on the screen
    Then user clicks on the button 4 on the screen
    Then user clicks on the button 6 on the screen
    Then user clicks on the button 8 on the screen
    Then user clicks on the button 0 on the screen
    Then verify passcode mismatch error is shown
#    Then close the appium driver
    Examples:
      |Application|
      |Android|
#      |browserstack-ios|

  @TC_OC_LWUP_TOUCH_ID1_05 @TC_OC_LWUP_TOUCH_ID_05_01 @TC_OC_LWUP_TOUCH_ID_05_02 @mobile @sprint1
  Scenario: To verify the functionality of Enable Biometrics Screen
    Given the application is open "Android"
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "michaelbsf0010" on the screen
    Then user inputs the password "michaelbsf0010" on the screen
    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "1234"
#    Then user clicks on the button Submit on the screen
    Then user verifies the screen Enable Biometrics is open
    Then user clicks on the button enable biometrics on the screen
    Then user verifies the enable biometrics pop up is open
    Then complete the biometrics
    Then user verifies the screen Create passcode is open

  @TC_OC_LWUP_TOUCH_ID2_05 @TC_OC_LWUP_TOUCH_ID_05 @TC_OC_LWUP_TOUCH_ID_05_03 @mobile @sprint1
  Scenario: To verify the functionality of Enable Biometrics Screen
    Given the application is open "Android"
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "michaelbsf0010" on the screen
    Then user inputs the password "michaelbsf0010" on the screen
    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "1234"
#    Then user clicks on the button Submit on the screen
    Then user verifies the screen Enable Biometrics is open
    Then user clicks on the button maybe later on the screen
    Then user verifies the screen Create passcode is open

  @TC_OC_LWUP_TOUCH_ID3_05 @TC_OC_LWUP_TOUCH_ID_05_04 @mobile @sprint1
  Scenario: To verify the functionality of Enable Biometrics Screen
    Given the application is open "Android"
    Then user verifies the screen select your language is open
    Then user selects the language english from the screen
    Then user clicks on the button continue on the screen
    Then user verifies the screen Let's get started is open
    Then user inputs the username "michaelbsf0010" on the screen
    Then user inputs the password "michaelbsf0010" on the screen
    Then user clicks on the button Sign in on the screen
#    Then user verifies the screen Enter one-time password is open
#    Then user enters the otp password "1234"
#    Then user clicks on the button Submit on the screen
    Then user verifies the screen Enable Biometrics is open
    Then user clicks on the button enable biometrics on the screen
    Then user verifies the enable biometrics pop up is open
    Then user fails the biometrics
    Then user verifies the failed biometrics error is shown