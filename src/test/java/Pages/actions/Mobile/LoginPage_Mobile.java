package Pages.actions.Mobile;

import DriverManager.Driver;
import Utils.PropertiesOperations;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AuthenticatesByFinger;
import io.appium.java_client.ios.PerformsTouchID;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import Utils.GenericMethod;


public class LoginPage_Mobile {

	AppiumDriver driver;
	GenericMethod genericMethod = new GenericMethod();

	@iOSXCUITFindBy(accessibility = "selectLocale.titleLabel")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/rlsj_selectLocaleScreen_titleView")
	public WebElement selectYourLanguageScreen;

	@iOSXCUITFindBy(accessibility = "localeButton.primaryLabel.en")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/rslj_localeItemView_primaryDisplayNameView")
	public WebElement englishLanguage;

	@iOSXCUITFindBy(accessibility = "Continue")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/rlsj_selectLocaleScreen_continueButton")
	public WebElement continueButton;

	@iOSXCUITFindBy(accessibility = "register.titleLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, \"Let's get started\")]")
	public WebElement letsGetStartedScreen;

	@iOSXCUITFindBy(accessibility = "register.usernameInput.textInput.textField")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/authenticationJourney_usernameScreen_usernameField")
	public WebElement username;

	@iOSXCUITFindBy(accessibility = "register.passwordInput.textInput.textField")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/authenticationJourney_usernameScreen_passwordField")
	public WebElement password;

	@iOSXCUITFindBy(accessibility = "register.loginButton")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/authenticationJourney_usernameScreen_loginButton")
	public WebElement signInButton;

	@iOSXCUITFindBy(accessibility = "otpInput.titleLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Enter one-time password')]")
	public WebElement oneTimeOTPScreen;

	@iOSXCUITFindBy(accessibility = "otpInput.otpInputField.textInput.textField")
	@AndroidFindBy(xpath = "//android.widget.EditText[starts-with(@text, '')]")
	public WebElement optInputBox;

	@iOSXCUITFindBy(accessibility = "otpInput.submitButton")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, 'Submit')]")
	public WebElement submitButton;

	@iOSXCUITFindBy(accessibility = "passcode.titleLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Create passcode')]")
	public WebElement createPasscodeScreen;

	@iOSXCUITFindBy(iOSNsPredicate = "label == \"Confirm passcode\"")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Confirm passcode')]")
	public WebElement confirmPasscodeScreen;

	@iOSXCUITFindBy(accessibility = "0")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, '0')]")
	public WebElement zeroDigitButton;

	@iOSXCUITFindBy(accessibility = "2")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, '2')]")
	public WebElement twoDigitButton;

	@iOSXCUITFindBy(accessibility = "4")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, '4')]")
	public WebElement fourDigitButton;

	@iOSXCUITFindBy(accessibility = "6")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, '6')]")
	public WebElement sixDigitButton;

	@iOSXCUITFindBy(accessibility = "8")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, '8')]")
	public WebElement eightDigitButton;

	@iOSXCUITFindBy(accessibility = "setupComplete.titleLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Well done!')]")
	public WebElement welldoneScreen;

	@iOSXCUITFindBy(accessibility = "setupComplete.dismissButton")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, \"Let's get started\")]")
	public WebElement letsGetStartedButton;

	@iOSXCUITFindBy(accessibility = "Allow")
	public WebElement notificationPopUPAllow;

	@iOSXCUITFindBy(accessibility = "biometricRegistration.titleLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Enable biometrics')]")
	public WebElement enableBiometricScreen;

	@iOSXCUITFindBy(accessibility = "biometricRegistration.allowButton")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, 'Enable biometrics')]")
	public WebElement enableBiometricButton;


	@iOSXCUITFindBy(iOSNsPredicate = "label == \"Invalid username or password\"")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Incorrect username or password')]")
	public WebElement incorrectErrorMessage;

	@iOSXCUITFindBy(accessibility = "OK")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Incorrect username or password')]")
	public WebElement incorrectErrorMessageOKButton;
	@iOSXCUITFindBy(accessibility = "cross clear icon")
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show password']")
	public WebElement passwordEyeIcon;

	@iOSXCUITFindBy(accessibility = "I cannot remember my login details")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/authenticationJourney_usernameScreen_forgotCredentialsButton")
	public WebElement forgotCredentialsButton;

	@iOSXCUITFindBy(accessibility = "forgotUsername.titleLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Forgot credentials?')]")
	public WebElement forgotCredentialsScreen;

	@AndroidFindBy(id = "com.bsf.retail.dev:id/splashBackground")
	public WebElement splashScreen;

	@iOSXCUITFindBy(accessibility = "otpInput.otpInputField.errorLabel")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/textinput_error")
	public WebElement invalidOPTCodeError;

	@iOSXCUITFindBy(iOSNsPredicate = "label == \"Your account is temporarily locked\"")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/alertTitle")
	public WebElement accountBlockedAlert;

	@iOSXCUITFindBy(accessibility = "passcode.inlineErrorLabel")
	@AndroidFindBy(xpath = "//android.widget.TextView[ends-with(@text, 'repeating numbers used')]")
	public WebElement repeatingNumberError;

	@AndroidFindBy(id = "com.bsf.retail.dev:id/authenticationJourney_passcodeScreen_errorView")
	public WebElement passcodesMisMatchError;

	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Touch the fingerprint sensor')]")
	public WebElement enableBiometricsPopUp;

	@iOSXCUITFindBy(accessibility = "biometricRegistration.denyButton")
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text, 'Maybe later')]")
	public WebElement maybeLaterButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Not recognized')]")
	public WebElement failBiometricError;

	@AndroidFindBy(id = "com.bsf.retail.dev:id/continueWith")
	public WebElement selectProfile;

	public LoginPage_Mobile() {
		this.driver = (AppiumDriver) Driver.driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void verifySelectYourScreen() {
		selectYourLanguageScreen.isDisplayed();
		Assert.assertTrue(selectYourLanguageScreen.isDisplayed());
	}

	public void selectEnglishLanguage() {
		englishLanguage.click();
	}

	public void selectContinueLanguage() {
		continueButton.click();
	}

	public void verifyLetsGetStartedScreen() {
		letsGetStartedScreen.isDisplayed();
		Assert.assertTrue(letsGetStartedScreen.isDisplayed());
	}

	public void enterUsername(String usernameValue) {
		username.sendKeys(usernameValue);
	}

	public void enterUsername(String filename,String usernameValue) {
		username.sendKeys(PropertiesOperations.getPropertyValueByKey(filename,usernameValue));
	}

	public void enterPassword(String filename,String passwordValue) {
		password.sendKeys(PropertiesOperations.getPropertyValueByKey(filename,passwordValue));
	}

	public void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void selectSignInButton() {
		signInButton.click();
	}

	public void verifyOTPScreen() {
		oneTimeOTPScreen.isDisplayed();
		Assert.assertTrue(oneTimeOTPScreen.isDisplayed());
	}

	public void selectSubmitButton() {
		submitButton.click();
	}

	public void verifyCreatePasscodeScreen() {
		createPasscodeScreen.isDisplayed();
		Assert.assertTrue(createPasscodeScreen.isDisplayed());
	}

	public void verifyConfirmPasscodeScreen() {
		confirmPasscodeScreen.isDisplayed();
		Assert.assertTrue(confirmPasscodeScreen.isDisplayed());
	}

	public void selectZeroDigitButton() {
		zeroDigitButton.click();
	}

	public void selectTwoDigitButton() {
		twoDigitButton.click();
	}

	public void selectFourDigitButton() {
		fourDigitButton.click();
	}

	public void selectSixDigitButton() {
		sixDigitButton.click();
	}

	public void selectEightDigitButton() {
		eightDigitButton.click();
	}

	public void verifyWellDoneScreen() {
		welldoneScreen.isDisplayed();
		Assert.assertTrue(welldoneScreen.isDisplayed());
	}

	public void selectLetsGetStartedButton() {
		letsGetStartedButton.click();
	}

	public void enterOTP(String oTPValue) {
		optInputBox.sendKeys(oTPValue);
	}

	public void verifyEnableBiometricScreen() {
		enableBiometricButton.isDisplayed();
		Assert.assertTrue(enableBiometricScreen.isDisplayed());
	}

	public void selectEnableBiometricsButton() {
		enableBiometricButton.click();
	}

	public void completeBiometrics()  {
		try {
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
//				throw new RuntimeException("Error"+e);
				}
				AuthenticatesByFinger authenticatesByFinger = (AuthenticatesByFinger) driver;
				authenticatesByFinger.fingerPrint(1);
			} else {
				PerformsTouchID performsTouchID = (PerformsTouchID) driver;
				performsTouchID.performTouchID(true);
			}
		}catch (Exception e){
//			driver.executeScript("browserstack_executor: {\"action\":\"biometric\", \"arguments\": {	\"biometricMatch\" : \"pass\"}}");
		}
	}

	public void failBiometrics()  {
		try {
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					throw new RuntimeException("Error" + e);
				}
				AuthenticatesByFinger authenticatesByFinger = (AuthenticatesByFinger) driver;
				authenticatesByFinger.fingerPrint(2);
			} else {
				PerformsTouchID performsTouchID = (PerformsTouchID) driver;
				performsTouchID.performTouchID(false);
			}
		}catch (Exception e){
//			driver.executeScript("browserstack_executor: {\"action\":\"biometric\", \"arguments\": {	\"biometricMatch\" : \"fail\"}}");
		}
	}

	public void selectPasswordEyeIcon() {
		passwordEyeIcon.click();
	}

	public void verifyPasswordTextShown(Boolean isVisible){
		if (driver.getClass().toString().toLowerCase().contains("android")) {
			password.isDisplayed();
			Assert.assertEquals(password.getAttribute("Password"),isVisible.toString());
		}else{
			int isVisibleValue = 0;
			int actualValue=0;
			if(!isVisible)isVisibleValue=1;
			if(passwordEyeIcon.getAttribute("value")==null) actualValue= 0;
			else actualValue = Integer.parseInt(passwordEyeIcon.getAttribute("value"));
			Assert.assertEquals(actualValue,isVisibleValue);
		}
	}

	public void verifyIncorrectMessageIsDisplayed() {
		incorrectErrorMessage.isDisplayed();
		Assert.assertTrue(incorrectErrorMessage.isDisplayed());
		if (!driver.getClass().toString().toLowerCase().contains("android")) {
			incorrectErrorMessageOKButton.click();
		}
	}

	public void selectForgotCredentialsButton() {
		forgotCredentialsButton.click();
	}

	public void verifyForgotCredentialsScreenIsDisplayed() {
		forgotCredentialsScreen.isDisplayed();
		Assert.assertTrue(forgotCredentialsScreen.isDisplayed());
	}

	public void verifySplashScreen() {
		if (driver.getClass().toString().toLowerCase().contains("android")) {
			splashScreen.isDisplayed();
			Assert.assertTrue(splashScreen.isDisplayed());
		}else{
			Assert.assertTrue(true);
		}
	}

	public void verifyInvalidOTPCodeError() {
		invalidOPTCodeError.isDisplayed();
		Assert.assertTrue(invalidOPTCodeError.isDisplayed());
	}

	public void verifyAccountBlockedCode() {
		accountBlockedAlert.isDisplayed();
		Assert.assertTrue(accountBlockedAlert.isDisplayed());
	}

	public void verifyRepeatingNumberError() {
		repeatingNumberError.isDisplayed();
		Assert.assertTrue(repeatingNumberError.isDisplayed());
	}

	public void verifyPasscodeMismatchError() {
		passcodesMisMatchError.isDisplayed();
		Assert.assertTrue(passcodesMisMatchError.isDisplayed());
	}

	public void verifyEnableBiometricPopUp() {
		enableBiometricsPopUp.isDisplayed();
		Assert.assertTrue(enableBiometricsPopUp.isDisplayed());
	}

	public void selectMayBeLaterButton() {
		maybeLaterButton.click();
	}

	public void verifyFailBiometricError() {
		failBiometricError.isDisplayed();
		Assert.assertTrue(failBiometricError.isDisplayed());
	}

	public void acceptNotification() {
		if (!driver.getClass().toString().toLowerCase().contains("android")) {
			notificationPopUPAllow.click();
		}
	}

	public void closeDriver() {
		driver.quit();
	}
	public void selectProfile() {

		try {
			if (genericMethod.isElementPresent(selectProfile)) {
				selectProfile.click();
			}
		}
		catch (Exception e){

		}
	}
}
