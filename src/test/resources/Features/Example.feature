@LoginModule @regression
Feature: Login Modules

  @LoginUserCredential @android
  Scenario: Login with Right Credentials user input
    Then user inputs the username: "ku_marshad@dha.gov.ae"
    Then user inputs the password: "KVF"
    Then user clicks on signIn Button
    Then user is redirected to dashboard

  @iOS
  Scenario: Login with Right Credentials user input
    Given the application is open "iOS"

  @androidd
  Scenario: Login with Right Credentials user input
    Given the application is open "Android"

  @LoginUserCredential1
  Scenario: Login with Right Credentials user input
    Given the application is open "Android"
    Then user inputs the username: "ku_marshad@dha.gov.ae"
    Then user inputs the password: "KVF"
    Then user clicks on signIn Button
    Then user is redirected to dashboard
    Then close mobile application

  @LoginUserCredential2 @browser
  Scenario: Login with Right Credentials user input
    Given the browser is open
    Then close browser application


  @iOS
  Scenario: To verify the functionality Ios AddressBook Application.
    Given the application is open
    Then close mobile application