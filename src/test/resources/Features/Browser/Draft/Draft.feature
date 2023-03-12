@Draft @regression @smoke @e2e @webv1.2
Feature: Draft

  @TS_0C_DR_WEB_16 @BrowserTest @browser @UnableToSelectTopic
  Scenario: To verify that message is move to draft when Save and Close CTA is Clicked.
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user click on three dots at header
    Then user click on "Messages" screen
    Then user able to see "Messages" screen
    Then user clicks on "Compose" button
    Then user is able to see the popup as "New message"
#    Then user select the topic ""
    Then user enter the Subject as "Subject Testing Draft"
    Then user enter the Message as "Message Testing Draft"
#    Then user attach some pdf file
    Then user clicks on "Save & Close" button
    Then user verify the message on manage screen as "Your draft has been successfully saved."

  @TS_0C_DR_WEB_17 @BrowserTest @browser @UnableToSelectTopic
  Scenario: To verify that message is discarded when user Clicks on Discard verbiage "Are you sure you want to discard this message? All filled data will be lost” along with Cancel And Discrd CTA. When user taps on discard then message is discarded.
    Given the browser is open
    Then  user input username: "gabrielbsf001"
    Then user click on "Next" button
    Then user able to see the "Password" screen
    Then user input password : "gabrielbsf001"
    Then user click on "Sign in" button
    Then user able to see "My Products" screen
    Then user click on three dots at header
    Then user click on "Messages" screen
    Then user able to see "Messages" screen
    Then user clicks on "Compose" button
    Then user is able to see the popup as "New message"
#    Then user select the topic ""
    Then user enter the Subject as "Subject Testing Draft"
    Then user enter the Message as "Message Testing Draft"
#    Then user attach some pdf file
    Then user clicks on "Discard" button
    Then user is able to see the popup as "Discard message?"
    Then user is able to see the popup as "Are you sure you want to discard this message? All filled data will be lost"
    Then user clicks on "Discard" button over discard popup

