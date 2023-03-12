@DraftMobile @regression @e2e @sprint2
Feature: Draft Module for Mobile Application

  @TC_Messages_01_05 @TC_Messages_01_06 @TC_Messages_inbox_01_01 @TC_Messages_inbox_01_02 @TC_Messages_inbox_01_02 @TC_Messages_Drafts_03_02 @TC_Messages_Drafts_03_03 @TC_Messages_Drafts_03_04 @TC_Messages_Drafts_03_05 @TC_Messages_Drafts_03_06 @mobile @sprint2
  Scenario Outline: To verify draft message screen functionality
  Given the application is open "<Application>"
  Then user logs in with username "username2" password "password2" otp "1234"
  Then verify the My Products page is open
  Then user click on "More" icon
  Then user click on "Messages" icon
  Then user click on new message icon
  Then user select topic for message screen
  Then user enter "Sample Subject" text into the subject
  Then user enter "Sample Message" text into the message
  Then user click on attached file icon
  Then user select "Files"
  Then user clicked on show roots icon
  Then user click on download button
  Then user select pdf file
  Then user click on cancel icon
  Then user click on "DRAFTS" icon
  Then user verify the draft message is displayed
  Then user click on navigation back icon
  Examples:
    |Application|
    |Android|

  @TC_OC_DRTMSG_001_001 @TC_Messages_inbox_01_03 @TC_Messages_inbox_01_04 @TC_Messages_Sent_02_03 @TC_Messages_Sent_02_04 @mobile @sprint2
  Scenario Outline: To verify draft send message screen functionality
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user click on "More" icon
    Then user click on "Messages" icon
    Then user click on new message icon
    Then user select topic for message screen
    Then user enter "Sample Subject" text into the subject
    Then user enter "Sample Message" text into the message
    Then user click on attached file icon
    Then user select "Files"
    Then user clicked on show roots icon
    Then user click on download button
    Then user select pdf file
    Then user click on send button
    Then user click on "SENT" icon
    Then user click on navigation back icon
    Examples:
      |Application|
      |Android|
