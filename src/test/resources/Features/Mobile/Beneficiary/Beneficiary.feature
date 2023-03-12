@BeneficiaryMobile @regression @e2e @sprint2
Feature: Beneficiary Module for Mobile Application

  @TC_Beneficiary_List&Details_01_01 @TC_Beneficiary_List&Details_02_01 @TC_Beneficiary_List&Details_02_02  @TC_Beneficiary_List&Details_02_03 @TC_Beneficiary_List&Details_02_04 @TC_Beneficiary_List&Details_02_05 @TC_OC_BENCREA_001_001 @TC_OC_BENCREA_001_002 @TC_OC_BENVW_001_001 @TC_OC_BENMGN_001_002 @TC_OC_BENMGN_001_003 @TC_OC_BENMGN_001_004 @TC_OC_BENMGN_001_005 @TC_OCAT_Activate_BSF_Beneficiaries_01_01 @TC_OC_BENVW_001_001  @TC_OC_BENSN_001_001 @TC_OC_BENMGN_001_001 @TC_OC_BENMGN_001_002 @TC_Create_Bene_01_01 @TC_Create_Bene_01_02 @TC_Create_Bene_02_01 @TC_Create_Bene_02_03 @TC_Create_Bene_02_05 @TC_Create_Bene_02_06 @TC_Create_Bene_02_07 @TC_Error_Handling_01_01 @TC_Error_Handling_01_02 @TC_Beneficiary_01_01
    @TC_Beneficiary_02_01 @TC_Beneficiary_02_02 @TC_Beneficiary_02_03 @TC_Beneficiary_02_05 @TC_Beneficiary_02_07 @mobile @sprint2
  Scenario Outline: To verify beneficiary message screen functionality
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user click on "More" icon
    Then the testcase "TC_OC_BENMGN_001_005" is complete
    Then user click on beneficiary button
    Then the testcase "TC_Beneficiary List & Details_02_01" is complete
    Then user verify if alert message is displayed click on try again
    Then the testcase "TC_Beneficiary List & Details_02_02" is complete
    Then the testcase "TC_Beneficiary List & Details_02_03" is complete
    Then user verify beneficiary list exist or "No Beneficiary Yet" message is displayed
    Then the testcase "TC_Beneficiary List & Details_02_04" is complete
    Then user verify beneficiary list is displayed
    Then the testcase "TC_OCAT_Activate BSF Beneficiaries_01_01" is complete
    Then the testcase "TC_OC_BENSN_001_001" is complete
#    Then user verify beneficiary end of list "You have reached the end of the list" is displayed
    Then the testcase "TC_OC_BENVW_001_001" is complete
    Then user verify beneficiary screen is displayed
    Then user verify beneficiary is exist or not
    Then user verify beneficiary account name
    Then user verify beneficiary account number
    Then user verify beneficiary account bank detail
    Then user verify beneficiary account status
    Then the testcase "TC_Beneficiary List & Details_01_01" is complete
    Then the testcase "TC_Beneficiary List & Details_02_05" is complete
    Then user delete "AccountName" beneficiary if already exist in the list
    Then user click on new beneficiary icon
    Then user verify "Add a beneficiary" beneficiary screen
    Then the testcase "TC_Create_Bene_01_01" is complete
    Then the testcase "TC_OC_BENCREA_001_001" is complete
    Then user select local type
    Then user on local toggle
    Then user click on continue button
    Then user verify create beneficiary account error message is displayed
    Then the testcase "TC_OC_BENMGN_001_002" is complete
    Then user enter "NonNumericAccountNumber" beneficiary
    Then user click on continue button
    Then user verify create beneficiary account error message is displayed
    Then the testcase "TC_OC_BENMGN_001_003" is complete
    Then user enter "Least2CharacterAccountNumber" beneficiary
    Then user click on continue button
    Then user verify create beneficiary account error message is displayed
    Then the testcase "TC_Create_Bene_02_05" is complete
    Then user click on continue button
    Then user verify create beneficiary account error message is displayed
    Then the testcase "TTC_OC_BENMGN_001_001" is complete
    Then user enter "InvalidAccountNumber" beneficiary
    Then user click on continue button
    Then user verify create beneficiary account error message is displayed
    Then the testcase "TC_OC_BENMGN_001_002" is complete
    Then user on local toggle
    Then user click on navigation up button
    Then user verify "AccountName" beneficiary exist
    Then the testcase "TC_OC_BENMGN_001_004" is complete
    Then user click on new beneficiary icon
    Then user enter beneficiary account number
    Then the testcase "TC_Create_Bene_02_06" is complete
    Then user enter beneficiary account name
    Then user click on continue button
    Then user verify "Review beneficiary" beneficiary screen
    Then the testcase "TC_OC_DMSBEN_001_001" is complete
    Then user verify "AccountType" beneficiary review detail
    Then user verify "AccountNumber" beneficiary review detail
    Then user verify "BankDetail" beneficiary review detail
    Then user verify "AccountName" beneficiary review detail
    Then the testcase "TC_OC_DMSBEN_001_002" is complete
    Then the testcase "TC_OC_BENCREA_001_002" is complete
    Then the testcase "TC_OC_LOCBEN_001_001" is complete
    Then user click on continue button
    Then user verify "AccountName" beneficiary exist
    Then the testcase "TC_OC_BENVW_001_001" is complete
    Then user click "AccountName" beneficiary status
    Then user verify "AccountName" detail beneficiary screen
    Then user verify "AccountType" beneficiary detail screen
    Then user verify "AccountNumber" beneficiary detail screen
    Then user verify "BankDetail" beneficiary detail screen
    Then user verify "AccountName" beneficiary detail screen
    Then the testcase "TC_OCAT_Activate BSF Beneficiaries_01_02" is complete

    Examples:
      |Application|
      |Android|

  @TC_Beneficiary_List&Details_01_02 @TC_OC_BENMNG_001_001 @TC_OC_BENMGN_001_006 @@TC_OC_BENMGN_001_008 @TC_OC_BENMNG_001_002 @TC_OC_BENMGN_001_001 @TC_OC_DMSBEN_001_001 @TC_OC_DMSBEN_001_002 @TC_OC_LOCBEN_001_001  @mobile @sprint2
  Scenario Outline: To verify beneficiary message screen functionality
    Given the application is open "<Application>"
    Then user logs in with username "username2" password "password2" otp "1234"
    Then verify the My Products page is open
    Then user click on "More" icon
    Then user click on beneficiary button
    Then user verify if alert message is displayed click on try again
    Then user verify beneficiary screen is displayed
    Then user verify beneficiary is exist or not
    Then the testcase "TC_OC_BENMGN_001_008" is complete
    Then user click on "AccountName" beneficiary
    Then user verify "AccountName" detail beneficiary screen
    Then the testcase "TC_Beneficiary List & Details_01_02" is complete
    Then user verify "AccountType" beneficiary detail screen
    Then user verify "AccountNumber" beneficiary detail screen
    Then user verify "BankDetail" beneficiary detail screen
    Then user verify "AccountName" beneficiary detail screen
    Then the testcase "TC_OC_BENMGN_001_006" is complete
    Then the testcase "TC_Beneficiary List & Details_01_02" is complete
    Then user click on delete icon
    Then user verify "Do you want to delete this beneficiary?" message
    Then the testcase "TC_OC_BENMNG_001_001" is complete
    Then user click on cancel button
    Then user click on navigation up button
    Then user verify "AccountName" beneficiary exist
    Then the testcase "TC_OC_BENMGN_001_001" is complete
    Then user click on "AccountName" beneficiary
    Then user click on delete icon
    Then user verify "Do you want to delete this beneficiary?" message
    Then user click on delete button
   Then the testcase "TC_OC_BENMNG_001_002" is complete

    Examples:
      |Application|
      |Android|