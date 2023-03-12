package Pages.actions.Browser;

import DriverManager.Driver;
import Utils.PropertiesOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage_Browser {



	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='bb-username-then-password-input']")
	WebElement userName;

	@FindBy(xpath = "//*[@id='bb-username-then-password-input']")
	WebElement NextButton;

	@FindBy(xpath = "//*[@name='password']")
	WebElement password;

	@FindBy(xpath = "//*[@id='bb-input-password']/label")
	WebElement PasswordText;

	@FindBy(xpath = "//*[@class='col-md-8']//h1")
	WebElement MyProductHeading;

	@FindBy(xpath = "//*[@id='kc-current-locale-link']")
	WebElement LanguageClick;

	@FindBy(xpath = "//*[@id='kc-current-locale-link']//span")
	WebElement LanguageName;

	@FindBy(xpath = "//*[@id='kc-page-title']")
	WebElement PageTitle;

	@FindBy(xpath = "//*[@id='bb-username-then-password-input-required']")
	WebElement UserNameMessage;

	@FindBy(xpath = "//*[@class='alert-description']")
	WebElement PasswordAlertMessage;

	@FindBy(xpath = "//*[@id='kc-form']//*[@class='bb-input-validation-message']")
	WebElement AttemptMessage;

	@FindBy(xpath = "//*[@id='bb-toggle-password-visibility-button']")
	WebElement PasswordVisiblityBtn;


	public LoginPage_Browser() {
		this.driver = (WebDriver) Driver.driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30),Duration.ofSeconds(60));
		PageFactory.initElements( driver, this);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void GetMessage(String name) throws Exception {
		String UserNameMess = UserNameMessage.getAttribute("outerText");
		Assert.assertEquals(name,UserNameMess);
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	

	public void openURL() throws Exception {
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(PropertiesOperations.getPropertyValueByKey("url"));
	}

	public void enterUsername(String username) {
		userName.sendKeys(username);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);

	}

	public void ClickNextButton(String value) {
		var val =driver.findElement(By.xpath("//button[@id='kc-form-buttons' and contains(text(),'"+value+"')]"));
		val.click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void GetText(String value)
	{
		String passText = PasswordText.getAttribute("outerText");
		Assert.assertEquals(value,passText);
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void GetMyProductHeadingText(String value)
	{
		var val =driver.findElement(By.xpath("//*[@data-role='headings' and contains(text(),'"+value+"')]"));
		wait.until(ExpectedConditions.visibilityOf(val));
		val.isDisplayed();
//		String MyProductText = MyProductHeading.getAttribute("outerText");
//		Assert.assertEquals(value,MyProductText);

	}

	public void GetLanguageClick()
	{
		LanguageClick.click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void ClickLanguage(String value) {
		var val =driver.findElement(By.xpath("//*[@id='kc-locale-dropdown-menu']//a[contains(text(),'"+value+"')]"));
		val.click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void GetLanguageNameTitle(String value, String Title)
	{
		String LangName = LanguageName.getAttribute("textContent");
		System.out.println("Language is"+LangName);
		String TitleName = PageTitle.getAttribute("outerText");
		System.out.println("Language is"+TitleName);
		Assert.assertEquals(value,LangName);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(Title,TitleName);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void GetErrorMessageAttempt(String value, String Title)
	{
		String ErrMessage = PasswordAlertMessage.getAttribute("outerText");
		System.out.println("Language is"+ErrMessage);
		String AttemptAlert = AttemptMessage.getAttribute("outerText");
		System.out.println("Language is"+AttemptAlert);
		Assert.assertEquals(value,ErrMessage);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(Title,AttemptAlert);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void GetPasswordVisbile()
	{
		PasswordVisiblityBtn.click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
}
