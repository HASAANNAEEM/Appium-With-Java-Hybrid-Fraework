package Pages.actions.Mobile;

import DriverManager.Driver;
import Utils.JsonHandler;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AuthenticatesByFinger;
import io.appium.java_client.ios.PerformsTouchID;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class MyProductsPage_Mobile {

	AppiumDriver driver;
	public String firstSavingsAccountFieldName,firstSavingsAccountFieldNumber,firstSavingsAccountFieldCurrencyValue;
	JsonHandler jsonHandler = new JsonHandler();

	@iOSXCUITFindBy(iOSNsPredicate = "label == 'Products'")
	@AndroidFindBy(accessibility = "Products")
	public WebElement MyProductsPage;

	@iOSXCUITFindBy(accessibility = "AccountRow_My Savings Account")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='SAVING ACCOUNTS']//following-sibling::android.view.ViewGroup)[1]")
	public WebElement firstSavingsAccount;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@label='Current accounts']/..//following-sibling::*//XCUIElementTypeButton)[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[ends-with(@text,'CURRENT ACCOUNTS')]//following-sibling::android.view.ViewGroup)[1]")
	public WebElement firstCurrentAccount;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@label='Saving accounts']/..//following-sibling::*)[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='MY SAVING ACCOUNTS']//following-sibling::android.view.ViewGroup)[2]")
	public WebElement secondSavingsAccount;

	@iOSXCUITFindBy(accessibility = "Products")
	@AndroidFindBy(accessibility = "Navigate up")
	public WebElement backButton;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='Current accounts']/..//following-sibling::*/XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='MY CURRENT ACCOUNTS']//following-sibling::*")
	})
	public List<WebElement> allMyCurrentsAccounts;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='Saving accounts']/..//following-sibling::*/XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='MY SAVING ACCOUNTS']//following-sibling::*")
	})
	public List<WebElement> allMySavingsAccounts;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='My Cards']/..//following-sibling::*/XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='MY CARDS']//following-sibling::*")
	})
	public List<WebElement> allMyCardsAccounts;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='Loans']/..//following-sibling::*/XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='MY LOANS']//following-sibling::*")
	})
	public List<WebElement> allMyLoansAccounts;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='My Term Deposits']/..//following-sibling::*/XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='MY TERM DEPOSITS']//following-sibling::*")
	})
	public List<WebElement> allMyTermDeposits;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='My Investment Accounts']/..//following-sibling::*/XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='MY INVESTMENT ACCOUNTS']//following-sibling::*")
	})
	public List<WebElement> allMyInvestmentAccounts;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Account currency']//following-sibling::*")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Currency']//following-sibling::*")
	public WebElement currencyTypeVerify;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "XCUIElementTypeStaticText[ends-with(@label, '.0')")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[ends-with(@text, '.00')]")
	})
	public List<WebElement> currencyType;

	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText)[4]")
	@AndroidFindBy(xpath = "(//android.widget.LinearLayout//android.widget.TextView)[3]")
	public WebElement currentBalance;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeScrollView//XCUIElementTypeOther//XCUIElementTypeButton")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup")
	})
	public List<WebElement> allAccounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Credit Card')]//..")
	public WebElement creditCard;


	public MyProductsPage_Mobile() {
		this.driver = (AppiumDriver) Driver.driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void selectBackButton(){
		backButton.click();
	}

	public void verifyMyProductsScreen() {
		try{
		Thread.sleep(6000);
		Assert.assertTrue(MyProductsPage.isDisplayed());
		System.out.println("My Products page verification");
		Thread.sleep(5000);}
		catch (Exception e){
			throw new RuntimeException(e);
		}
	}

	public void selectFirstSavingsAccount(){
		saveAccountDetails();
		firstSavingsAccount.click();
	}

	public void selectSecondSavingsAccount(){
		saveAccountDetails();
		secondSavingsAccount.click();
	}

	public void saveAccountDetails(){
		String[] contentDescription = null;
		if (driver.getClass().toString().toLowerCase().contains("android")) {
			System.out.println("Android");
			contentDescription = firstSavingsAccount.getAttribute("content-desc").split(", ");
		}else{
			contentDescription = firstSavingsAccount.getAttribute("label").split(", ");
		}
		System.out.println("Saving Account Details:"+ Arrays.toString(contentDescription));
		jsonHandler.writeJsonValue("savingAccountDetails","accountName",contentDescription[0]);
		jsonHandler.writeJsonValue("savingAccountDetails","accountNumber",contentDescription[1]);
		jsonHandler.writeJsonValue("savingAccountDetails","accountCurrency",contentDescription[2]);
	}

	public void saveAccountDetails(WebElement element,String attribute){
		String[] contentDescription = element.getAttribute(attribute).split(", ");
		System.out.println("Saving Account Details:"+ Arrays.toString(contentDescription));
		jsonHandler.writeJsonValue("savingAccountDetails","accountName",contentDescription[0]);
		jsonHandler.writeJsonValue("savingAccountDetails","accountNumber",contentDescription[1]);
		jsonHandler.writeJsonValue("savingAccountDetails","accountCurrency",contentDescription[2]);
	}

	public void verifyAllAccountTypesUnderHeading(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile,String headingName) {
		switch (headingName.toLowerCase()) {
			case "current accounts" -> {
				if (driver.getClass().toString().toLowerCase().contains("android")) myCurrentAccountsVerification(savingAccountPageMobile,accountDetailsPage_mobile);
				else myCurrentAccountsVerificationIOS(savingAccountPageMobile,accountDetailsPage_mobile);
			}
			case "savings accounts" -> {
				if (driver.getClass().toString().toLowerCase().contains("android")) mySavingsAccountsVerification(savingAccountPageMobile,accountDetailsPage_mobile);
				else mySavingsAccountsVerificationIOS(savingAccountPageMobile,accountDetailsPage_mobile);
			}
			case "my cards" -> myCardsVerification(savingAccountPageMobile,accountDetailsPage_mobile);
			case "my loans" -> myLoansVerification(savingAccountPageMobile,accountDetailsPage_mobile);
			case "my term deposits" -> myTermDepositsVerification(savingAccountPageMobile,accountDetailsPage_mobile);
			case "my investment accounts" -> myInvestmentsVerification(savingAccountPageMobile,accountDetailsPage_mobile);
			default -> throw new RuntimeException("Wrong Header Passed: " + headingName);
		}
	}

	public void currentAccountVerification(WebElement element, SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		element.click();
		savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
		savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
		savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
		savingAccountPageMobile.selectDetailsIcon();
		accountDetailsPage_mobile.verifyAccountDetailsScreen();
		verifyAccountType(accountDetailsPage_mobile, "Current Account");
		accountDetailsPage_mobile.selectBackButton();
		savingAccountPageMobile = new SavingAccountPage_Mobile();
		savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
		savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
		savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
		selectBackButton();
		verifyMyProductsScreen();
	}

	public void myCurrentAccountsVerificationIOS(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		int numberOfAccounts = allMyCurrentsAccounts.size();
		WebElement element = null;
		System.out.println("Number of Accounts Found: "+numberOfAccounts);

		for(int i = 1;i<=numberOfAccounts;i++) {
			element = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@label='Current accounts']/..//following-sibling::*/XCUIElementTypeButton)["+i+"]"));
			saveAccountDetails(element,"label");
			currentAccountVerification(element,savingAccountPageMobile,accountDetailsPage_mobile);
			System.out.println("Verification Completed: "+i);
		}
	}

	public void myCurrentAccountsVerification(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		int numberOfAccounts = 0;
		WebElement element = null;
		for (var item:allMyCurrentsAccounts) {
			System.out.println("Item: "+item.getAttribute("class"));
			if (!Objects.equals(item.getAttribute("class"), "android.widget.TextView")) numberOfAccounts++;
			else break;
		}
		System.out.println("Number of Accounts Found: "+numberOfAccounts);

		for(int i = 1;i<=numberOfAccounts;i++) {
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				element = driver.findElement(By.xpath("(//android.widget.TextView[@text='MY CURRENT ACCOUNTS']//following-sibling::android.view.ViewGroup)["+i+"]"));
			}
			saveAccountDetails(element,"content-desc");
			currentAccountVerification(element,savingAccountPageMobile,accountDetailsPage_mobile);
		}
	}

	public void myCardsVerification(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		throw new RuntimeException("Function not complete");
	}

	public void savingAccountVerification(WebElement element,SavingAccountPage_Mobile savingAccountPageMobile, AccountDetailsPage_Mobile accountDetailsPage_mobile){
		element.click();
		savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
		savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
		savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
		savingAccountPageMobile.selectDetailsIcon();
		accountDetailsPage_mobile.verifyAccountDetailsScreen();
		verifyAccountType(accountDetailsPage_mobile, "Savings Account");
		accountDetailsPage_mobile.selectBackButton();
		savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
		savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
		savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
		selectBackButton();
		verifyMyProductsScreen();
	}

	public void mySavingsAccountsVerification(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		int numberOfAccounts = 0;
		WebElement element = null;
		for (var item:allMySavingsAccounts) {
			System.out.println("Item: "+item.getAttribute("class"));
			if (!Objects.equals(item.getAttribute("class"), "android.widget.TextView")) numberOfAccounts++;
			else break;
		}
		System.out.println("Number of Accounts Found: "+numberOfAccounts);

		for(int i = 1;i<=numberOfAccounts;i++) {
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				element = driver.findElement(By.xpath("(//android.widget.TextView[@text='MY SAVING ACCOUNTS']//following-sibling::android.view.ViewGroup)["+i+"]"));
			}
			saveAccountDetails(element,"content-desc");
			savingAccountVerification(element,savingAccountPageMobile,accountDetailsPage_mobile);
		}
	}

	public void mySavingsAccountsVerificationIOS(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		int numberOfAccounts = allMySavingsAccounts.size();
		WebElement element = null;
		System.out.println("Number of Accounts Found: "+numberOfAccounts);

		for(int i = 1;i<=numberOfAccounts;i++) {
			element = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@label='Saving accounts']/..//following-sibling::*/XCUIElementTypeButton)["+i+"]"));
			saveAccountDetails(element,"label");
			savingAccountVerification(element,savingAccountPageMobile,accountDetailsPage_mobile);
			System.out.println("Verification Completed: "+i);
		}
	}

	public void myLoansVerification(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		throw new RuntimeException("Function not complete");
	}

	public void myTermDepositsVerification(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		throw new RuntimeException("Function not complete");
	}

	public void myInvestmentsVerification(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile){
		throw new RuntimeException("Function not complete");
	}

	public void verifyCurrencyForAllAccounts(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile) {
		WebElement element = null;
		for(int i = 1;i<=allAccounts.size();i++) {
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				element = driver.findElement(By.xpath("(//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup)["+i+"]"));
				saveAccountDetails(element,"content-desc");
			}else {
				element = driver.findElement(By.xpath("(//XCUIElementTypeScrollView//XCUIElementTypeOther//XCUIElementTypeButton)["+i+"]"));
				saveAccountDetails(element,"label");
			}
			element.click();
			savingAccountPageMobile.selectDetailsIcon();
			accountDetailsPage_mobile.verifyAccountDetailsScreen();
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				Assert.assertTrue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency").contains(currencyTypeVerify.getText()));
			}else {
				Assert.assertTrue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency").contains(currencyTypeVerify.getAttribute("label")));

			}
			accountDetailsPage_mobile.selectBackButton();
			savingAccountPageMobile = new SavingAccountPage_Mobile();
			savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
			savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
			savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
			selectBackButton();
			verifyMyProductsScreen();
		}
	}

	public void verifyAllAccountBalance(SavingAccountPage_Mobile savingAccountPageMobile,AccountDetailsPage_Mobile accountDetailsPage_mobile) {
		WebElement element = null;
		for(int i = 1;i<=currencyType.size();i++) {
			if (driver.getClass().toString().toLowerCase().contains("android")) {
				element = driver.findElement(By.xpath("(//android.widget.TextView[ends-with(@text, '.00')])["+i+"]"));
			}else {
				element = driver.findElement(By.xpath("(XCUIElementTypeStaticText[ends-with(@label, '.0')]))["+i+"]"));
			}
			saveAccountDetails();
			element.click();
			savingAccountPageMobile.selectDetailsIcon();
			accountDetailsPage_mobile.verifyAccountDetailsScreen();
			String origBalance = jsonHandler.getJsonValue("savingAccountDetails","accountCurrency").trim().replace("SAR","");
			String detailsPageBalance = currentBalance.getText().trim().replace("SAR","");
			Assert.assertEquals(detailsPageBalance,origBalance);
			accountDetailsPage_mobile.selectBackButton();
			savingAccountPageMobile = new SavingAccountPage_Mobile();
			savingAccountPageMobile.verifySavingAccountName(jsonHandler.getJsonValue("savingAccountDetails","accountName"));
			savingAccountPageMobile.verifySavingAccountNumber(jsonHandler.getJsonValue("savingAccountDetails","accountNumber"));
			savingAccountPageMobile.verifySavingAccountCurrencyValue(jsonHandler.getJsonValue("savingAccountDetails","accountCurrency"));
			accountDetailsPage_mobile.selectBackButton();
			verifyMyProductsScreen();
		}
	}

	public void verifyAccountType(AccountDetailsPage_Mobile accountDetailsPage_mobile,String type){
		Assert.assertEquals(accountDetailsPage_mobile.accountType.getText(),type);
	}

	public void selectFirstCurrentAccount() {
		firstCurrentAccount.isDisplayed();
		if (driver.getClass().toString().toLowerCase().contains("android")) {
			saveAccountDetails(firstCurrentAccount,"content-desc");;
		}else {
			saveAccountDetails(firstCurrentAccount,"label");;
		}
		firstCurrentAccount.click();
	}

	public void clickOnCreditCard(){
		creditCard.click();
	}
}
