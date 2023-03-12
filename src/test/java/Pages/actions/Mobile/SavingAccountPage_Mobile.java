package Pages.actions.Mobile;

import DriverManager.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SavingAccountPage_Mobile {

	AppiumDriver driver;
	@AndroidFindBy(accessibility = "My Products")
	public WebElement MyProductsPage;
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Transfer']")
	public WebElement transferIcon;
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Statement']")
	public WebElement statementsIcon;

	@iOSXCUITFindBy(iOSNsPredicate = "label == \"Details\"")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Details']")
	public WebElement detailsIcon;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeStaticText)[1]")
	@AndroidFindBy(xpath = "(//android.widget.FrameLayout[@id='com.bsf.retail.dev:id/transactionsJourney_summaryStackView']//android.widget.TextView)[2]")
	public WebElement savingAccountName;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeStaticText)[2]")
	@AndroidFindBy(xpath = "(//android.widget.FrameLayout//following-sibling::android.widget.TextView)[3]")
	public WebElement savingAccountNumber;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTable//XCUIElementTypeOther//XCUIElementTypeStaticText)[3]")
	@AndroidFindBy(xpath = "(//android.widget.FrameLayout//following-sibling::android.widget.TextView)[4]")
	public WebElement savingAccountCurrencyValue;

	public SavingAccountPage_Mobile() {
		this.driver = (AppiumDriver) Driver.driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public String getElementValue(WebElement element) {
		return element.getText();
	}

	public void verifySavingAccountName(String name){
		System.out.println("Verifying Name");
		try {
			Thread.sleep(5000);
		} catch (Exception e){

		}
		savingAccountName.isDisplayed();
		Assert.assertEquals(savingAccountName.getText(),name);
	}

	public void verifySavingAccountNumber(String number){
		System.out.println("Verifying Number");
		savingAccountNumber.isDisplayed();
		Assert.assertEquals(savingAccountNumber.getText().replaceAll(" ", ""),number.replaceAll(" ", ""));
	}

	public void verifySavingAccountCurrencyValue(String currencyValue){
		System.out.println("Verifying Currency");
		savingAccountCurrencyValue.isDisplayed();
		Assert.assertEquals(savingAccountCurrencyValue.getText().replaceAll(" ", ""),currencyValue.replaceAll(" ", ""));
	}

	public void selectDetailsIcon(){
		System.out.println("Clicking  Details Icon");
		detailsIcon.click();
	}
	public void verifyDetailsIcon(){
		System.out.println("Verify  Details Icon");
		detailsIcon.isDisplayed();
	}

}
