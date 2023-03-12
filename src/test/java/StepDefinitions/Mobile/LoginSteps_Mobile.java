package StepDefinitions.Mobile;

import Pages.actions.Mobile.LoginPage_Mobile;
import Pages.actions.Mobile.MyProductsPage_Mobile;
import io.cucumber.java.en.Then;


public class LoginSteps_Mobile {

	LoginPage_Mobile loginPage_mobile = new LoginPage_Mobile();
	MyProductsPage_Mobile myProductsPage_mobile = new MyProductsPage_Mobile();

	@Then("user inputs the username {string} on the screen")
	public void userInputsTheUsernameOnTheScreen(String username) {
		loginPage_mobile.enterUsername(username);
	}

	@Then("user inputs the password {string} on the screen")
	public void userInputsThePasswordOnTheScreen(String password) {
		loginPage_mobile.enterPassword(password);
	}

	@Then("user enters the otp password {string}")
	public void userEntersTheOtpPassword(String optValue) {
		loginPage_mobile.enterOTP(optValue);
	}

	@Then("verify the My Products page is open")
	public void verifyTheMyProductsPageIsOpen() {
		myProductsPage_mobile = new MyProductsPage_Mobile();
		myProductsPage_mobile.verifyMyProductsScreen();
	}

	@Then("user verifies the screen select your language is open")
	public void userVerifiesTheScreenSelectYourLanguageIsOpen() {
		loginPage_mobile.verifySelectYourScreen();
	}

	@Then("user selects the language english from the screen")
	public void userSelectsTheLanguageEnglishFromTheScreen() {
		loginPage_mobile.selectEnglishLanguage();
	}

	@Then("user clicks on the button continue on the screen")
	public void userClicksOnTheButtonContinueOnTheScreen() {
		loginPage_mobile.selectContinueLanguage();
	}

	@Then("user verifies the screen Let's get started is open")
	public void userVerifiesTheScreenLetSGetStartedIsOpen() {
		loginPage_mobile.verifyLetsGetStartedScreen();
	}

	@Then("user clicks on the button Sign in on the screen")
	public void userClicksOnTheButtonSignInOnTheScreen() {
		loginPage_mobile.selectSignInButton();
	}

	@Then("user verifies the screen Enter one-time password is open")
	public void userVerifiesTheScreenEnterOneTimePasswordIsOpen() {
		loginPage_mobile.verifyOTPScreen();
	}

	@Then("user clicks on the button Submit on the screen")
	public void userClicksOnTheButtonSubmitOnTheScreen() {
		loginPage_mobile.selectSubmitButton();
	}

	@Then("user verifies the screen Create passcode is open")
	public void userVerifiesTheScreenCreatePasscodeIsOpen() {
		loginPage_mobile.verifyCreatePasscodeScreen();
	}

	@Then("user clicks on the button 0 on the screen")
	public void userClicksOnTheButtonOnThe0Screen() {
		loginPage_mobile.selectZeroDigitButton();
	}

	@Then("user clicks on the button 2 on the screen")
	public void userClicksOnTheButtonOnThe2Screen() {
		loginPage_mobile.selectTwoDigitButton();
	}

	@Then("user clicks on the button 4 on the screen")
	public void userClicksOnTheButtonOnThe4Screen() {
		loginPage_mobile.selectFourDigitButton();
	}

	@Then("user clicks on the button 6 on the screen")
	public void userClicksOnTheButtonOnThe6Screen() {
		loginPage_mobile.selectSixDigitButton();
	}

	@Then("user clicks on the button 8 on the screen")
	public void userClicksOnTheButtonOnThe8Screen() {
		loginPage_mobile.selectEightDigitButton();
	}

	@Then("user verifies the screen Confirm passcode is open")
	public void userVerifiesTheScreenConfirmPasscodeIsOpen() {
		loginPage_mobile.verifyConfirmPasscodeScreen();
	}

	@Then("user verifies the screen Well done! is open")
	public void userVerifiesTheScreenWellDoneIsOpen() {
		loginPage_mobile.verifyWellDoneScreen();
	}

	@Then("user clicks on the button Let's get started on the screen")
	public void userClicksOnTheButtonLetSGetStartedOnTheScreen() {
		loginPage_mobile.selectLetsGetStartedButton();
	}

	@Then("user verifies the screen Enable Biometrics is open")
	public void userVerifiesTheScreenEnableBiometricsIsOpen() {
		loginPage_mobile.verifyEnableBiometricScreen();
	}

	@Then("user clicks on the button enable biometrics on the screen")
	public void userClicksOnTheButtonEnableBiometricsOnTheScreen() {
		loginPage_mobile.selectEnableBiometricsButton();
	}

	@Then("complete the biometrics")
	public void completeTheBiometrics() {
		loginPage_mobile.completeBiometrics();
	}

	@Then("verify the password is masked {string}")
	public void verifyThePasswordIsVisible(String bool) {
		loginPage_mobile.verifyPasswordTextShown(Boolean.valueOf(bool));
	}

	@Then("user clicks on the eye icon")
	public void userClicksOnTheEyeIcon() {
		loginPage_mobile.selectPasswordEyeIcon();
	}

	@Then("verify the incorrect error message is shown")
	public void verifyTheIncorrectErrorMessageIsShown() {
		loginPage_mobile.verifyIncorrectMessageIsDisplayed();
	}

	@Then("user clicks on Forgot Credentials Icon")
	public void userClicksOnForgotCredentialsIcon() {
		loginPage_mobile.selectForgotCredentialsButton();
	}

	@Then("user verifies the screen Forgot Credentials is open")
	public void userVerifiesTheScreenForgotCredentialsIsOpen() {
		loginPage_mobile.verifyForgotCredentialsScreenIsDisplayed();
	}

	@Then("verify the splash screen")
	public void verifyTheSplashScreen() {
		loginPage_mobile.verifySplashScreen();
	}

	@Then("user verifies the invalid otp code error")
	public void userVerifiesTheInvalidOtpCodeError() {
		loginPage_mobile.verifyInvalidOTPCodeError();
	}

	@Then("user verifies the account is temporarily locked on the screen")
	public void userVerifiesTheAccountIsTemporarilyLockedOnTheScreen() {
		loginPage_mobile.verifyAccountBlockedCode();
	}

	@Then("verify repeating number error is shown")
	public void verifyRepeatingNumberErrorIsShown() {
		loginPage_mobile.verifyRepeatingNumberError();
	}

	@Then("verify passcode mismatch error is shown")
	public void verifyPasscodeMismatchErrorIsShown() {
		loginPage_mobile.verifyPasscodeMismatchError();
	}

	@Then("user verifies the enable biometrics pop up is open")
	public void userVerifiesTheEnableBiometricsPopUpIsOpen() {
		loginPage_mobile.verifyEnableBiometricPopUp();
	}

	@Then("user clicks on the button maybe later on the screen")
	public void userClicksOnTheButtonMaybeLaterOnTheScreen() {
		loginPage_mobile.selectMayBeLaterButton();
	}

	@Then("user fails the biometrics")
	public void userFailsTheBiometrics() {
		loginPage_mobile.failBiometrics();
	}

	@Then("user verifies the failed biometrics error is shown")
	public void userVerifiesTheFailedBiometricsErrorIsShown() {
		loginPage_mobile.verifyFailBiometricError();
	}

	@Then("user logs in with username {string} password {string} otp {string}")
	public void userLogsInWithUsernamePasswordOtp(String username, String password, String otpValue) {
		loginPage_mobile.verifySelectYourScreen();
		loginPage_mobile.selectEnglishLanguage();
		loginPage_mobile.selectContinueLanguage();
		loginPage_mobile.verifyLetsGetStartedScreen();
		loginPage_mobile.enterUsername("loginCredentials",username);
		loginPage_mobile.enterPassword("loginCredentials",password);
		loginPage_mobile.selectSignInButton();
//		loginPage_mobile.verifyOTPScreen();
//		loginPage_mobile.enterOTP(otpValue);
//		loginPage_mobile.selectSubmitButton();
		loginPage_mobile.verifyEnableBiometricScreen();
		loginPage_mobile.selectEnableBiometricsButton();
		loginPage_mobile.completeBiometrics();
		loginPage_mobile.verifyCreatePasscodeScreen();
		loginPage_mobile.selectZeroDigitButton();
		loginPage_mobile.selectTwoDigitButton();
		loginPage_mobile.selectFourDigitButton();
		loginPage_mobile.selectSixDigitButton();
		loginPage_mobile.selectEightDigitButton();
		loginPage_mobile.verifyConfirmPasscodeScreen();
		loginPage_mobile.selectZeroDigitButton();
		loginPage_mobile.selectTwoDigitButton();
		loginPage_mobile.selectFourDigitButton();
		loginPage_mobile.selectSixDigitButton();
		loginPage_mobile.selectEightDigitButton();
		loginPage_mobile.verifyWellDoneScreen();
		loginPage_mobile.selectLetsGetStartedButton();
		loginPage_mobile.selectProfile();
		try {
			loginPage_mobile.acceptNotification();
		}
		catch (Exception e){

		}
	}

	@Then("accept the popup notification if the device is ios")
	public void acceptThePopupNotificationIfTheDeviceIsIos() {
		loginPage_mobile.acceptNotification();
	}

	@Then("close the appium driver")
	public void closeTheAppiumDriver() {
		loginPage_mobile.closeDriver();
	}

    @Then("the testcase {string} is complete")
    public void theTestcaseIsComplete(String testCaseID) {
		System.out.println("TestCase "+testCaseID+" is completed");
    }
}
