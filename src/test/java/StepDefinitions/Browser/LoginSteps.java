package StepDefinitions.Browser;

import Pages.actions.Browser.AccountManagement_Browser;
import Pages.actions.Browser.LoginPage_Browser;
import DriverManager.Driver;
import Pages.actions.Mobile.LoginPage_Mobile;
import Pages.actions.Mobile.MyProductsPage_Mobile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginSteps {

	LoginPage_Browser browserloginPage;

	AccountManagement_Browser AccountManagement;
	private Object timeout;



	@Given("the browser is open")
	public void browser_is_open() throws Exception {
		browserloginPage = new LoginPage_Browser();
		browserloginPage.openURL();
		if (Driver.driver == null) {
			System.out.println("Driver is: " + Driver.driver);
			System.out.println("loginPage Object is: " + browserloginPage);
		}
	}

	@Given("the application is open {string}")
	public void opening_app(String env) {
		System.out.println("Before Setup Started");
		try {
			Driver.setUp(env);
		} catch (Exception e) {
			System.out.println("Cause: " + e.getCause());
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Application Started");
	}

	@Then("close mobile application")
	public void closeMobileApplication() {
		Driver.stopAppium();
	}

	@Then("close browser application")
	public void closeBrowserApplication() {
		Driver.stopBrowserDriver();
	}

	@Then("user inputs the username: {string}")
	public void user_input_the_username(String username) {
		browserloginPage.enterUsername(username);
	}

	@Then("user inputs the password: {string}")
	public void user_inputs_the_password(String password) {
		browserloginPage.enterPassword(password);
	}

	@Then("user clicks on signIn Button")
	public void user_clicks_on_signIn_Button(String value) {
		browserloginPage.ClickNextButton(value);
	}

	@Then("user is redirected to dashboard")
	public void user_is_redirected_to_dashboard() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("user input username: {string}")
	public void user_input_username(String username)
	{

		browserloginPage.enterUsername(username);
	}

	@Then("user click on {string} button")
	public void user_click_on(String name)
	{
		browserloginPage.ClickNextButton(name);

	}

	@Then("user input password : {string}")
	public void user_enter_password(String pass)
	{
		browserloginPage.enterPassword(pass);
	}

	@Then("user able to see the {string} screen")
	public void password_screen(String value)
	{
		browserloginPage.GetText(value);
	}

	@Then("user able to see {string} screen")
	public void getTitle(String value)
	{
		browserloginPage.GetMyProductHeadingText(value);
	}

	@Then("user click on Language selection dropdown")
	public void MultiLangDropdownClick()
	{
		browserloginPage.GetLanguageClick();
	}

	@Then("user able to select {string} Language")
	public void languageClick(String value)
	{
		browserloginPage.ClickLanguage(value);
	}

	@Then("login Screen is displayed in {string} Language with page title {string}")
	public void LoginScreenDisplayed(String value, String title)
	{
		browserloginPage.GetLanguageNameTitle(value,title);
	}

	@Then("message should be displayed {string}")
	public void LoginScreenDisplayed(String name) throws Exception {
		browserloginPage.GetMessage(name);
	}

	@Then("message should be displayed {string} and showing the count {string}")
	public void ErrorMessageAttempt(String msg, String count) throws Exception {
		browserloginPage.GetErrorMessageAttempt(msg,count);
	}

	@Then("user click on show password icon")
	public void GetPasswordVisbile()
	{
		browserloginPage.GetPasswordVisbile();
	}
}
