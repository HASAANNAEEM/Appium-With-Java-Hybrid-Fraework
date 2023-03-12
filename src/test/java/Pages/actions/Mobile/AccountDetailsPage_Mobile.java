package Pages.actions.Mobile;

import DriverManager.Driver;
import Utils.JsonHandler;
import com.adobe.s3fs.com.amazonaws.services.dynamodbv2.xspec.S;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.*;
import org.joda.time.Duration;
import io.appium.java_client.clipboard.ClipboardContentType;
import io.appium.java_client.clipboard.HasClipboard;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AccountDetailsPage_Mobile {


	public AppiumDriver driver;
	JsonHandler jsonHandler = new JsonHandler();

	@iOSXCUITFindBy(iOSNsPredicate = "label == \"Account details\"")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account details']")
	public WebElement accountDetailsPage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Account type']//following-sibling::*")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Type']//following-sibling::*")
	public WebElement accountType;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Account name' or  @label='Account name ' or @label='Account number']//following-sibling::*")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account Name']//following-sibling::*")
	public WebElement accountName;

	@iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypeImage\"")
	@AndroidFindBy(id = "com.bsf.retail.dev:id/icon")
	public WebElement accountProductIcon;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[5]")
	@AndroidFindBy(xpath = "(//android.widget.TextView)[1]")
	public WebElement accountNameText;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[6]")
	@AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
	public WebElement accountNumber;
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[7]")
	@AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
	public WebElement accountBalance;

	@iOSXCUITFindAll({
			@iOSXCUITBy(className = "XCUIElementTypeStaticText")
	})
	@AndroidFindAll({
			@AndroidBy(className = "android.widget.TextView")
	})
	public List<WebElement> headingLabels;

	@iOSXCUITFindAll({
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@label='General']//following-sibling::*//XCUIElementTypeStaticText")
	})
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='General']//following-sibling:://android.widget.TextView")
	})
	public List<WebElement> headingLabelsUnderGeneralSection;


	@iOSXCUITFindBy(accessibility = "Back")
	@AndroidFindBy(accessibility = "Navigate up")
	public WebElement navigateBackButton;

	@iOSXCUITFindBy(accessibility = "ExternalAction")
	@AndroidFindBy(accessibility = "Edit account name")
	public WebElement accountNameEditIcon;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Copied to Clipboard'])[1]")
	public WebElement accountNameCopyToClipboard;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Copied to Clipboard'])[2]")
	public WebElement accountNumberCopyToClipboard;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc='Copied to Clipboard'])[3]")
	public WebElement accountIbanNoCopyToClipboard;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share']")
	public WebElement accountShareText;
	@AndroidFindBy(id = "com.bsf.retail.dev:id/continueWith")
	public WebElement selectProfile;

	@AndroidFindBy(id = "com.google.android.apps.messaging:id/name")
	public WebElement selectFirstContactNumber;

	@AndroidFindBy(id = "android:id/button1")
	public WebElement selectNewMessageButton;

	@AndroidFindBy(id = "com.google.android.apps.messaging:id/recipient_text_view")
	public WebElement enterNumber;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[ends-with(@resource-id,'contact_picker_create_group')]")
	public WebElement sendTo;

	@AndroidFindBy(accessibility = "Send SMS")
	public WebElement clickSendSMS;

	public AccountDetailsPage_Mobile() {
		this.driver = (AppiumDriver) Driver.driver;
		PageFactory.initElements( new AppiumFieldDecorator(driver), this);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void verifyAccountDetailsScreen() {
		System.out.println("Verifying Details Screen");
		accountDetailsPage.isDisplayed();
		Assert.assertTrue(accountDetailsPage.isDisplayed());
	}


	public void selectBackButton(){
		System.out.println("Tap Back Button");
		navigateBackButton.click();
	}

	public void verifyAccountName(MyProductsPage_Mobile myProductsPage_mobile) {
		accountName.isDisplayed();
		Assert.assertEquals(accountName.getText(),jsonHandler.getJsonValue("savingAccountDetails","accountName"));
	}

	public void verifyAccountName(MyProductsPage_Mobile myProductsPage_mobile,String heading) {
		accountName.isDisplayed();
		Assert.assertEquals(accountName.getText(),jsonHandler.getJsonValue("savingAccountDetails","accountName"));
		Assert.assertEquals(accountName.getText(),heading);
	}

	public void verifyAccountProductIcon() {
		accountProductIcon.isDisplayed();
		Assert.assertTrue(accountProductIcon.isDisplayed());
	}

	public void verifyAccountName() {
		accountNameText.isDisplayed();
		Assert.assertTrue(accountNameText.isDisplayed());
	}

	public void verifyAccountNumber() {
		accountNumber.isDisplayed();
		Assert.assertTrue(accountNumber.isDisplayed());
	}

	public void verifyAccountBalance() {
		accountBalance.isDisplayed();
		Assert.assertTrue(accountBalance.isDisplayed());
	}

	public List<String> getTextOfElements(List<WebElement> elementsList){
		List<String> elementText = new ArrayList<>();
//		System.out.println("List Size:"+elementsList.size());
		elementsList.forEach(element -> {
			var elementValue = element.getText();
//			System.out.println("Value: "+elementValue);
			if(elementValue!=null) elementText.add(elementValue.toLowerCase().trim());
		});
		return elementText;
	}

	public void labelExists(String headingLabel,String exists){
		List<String> elementsText = getTextOfElements(headingLabels);
		if (exists.equalsIgnoreCase("if any")) {
			try {
				Assert.assertTrue(elementsText.contains(headingLabel));
				return;
			} catch (AssertionError error) {
				System.out.println("No Heading Found:" + headingLabel);
				return;
			}
		}
		Assert.assertTrue(elementsText.contains(headingLabel.toLowerCase()));
	}


	public void verifyLabelUnderGeneralSection(String label) {
		List<String> elementsText = getTextOfElements(headingLabelsUnderGeneralSection);
		Assert.assertTrue(elementsText.contains(label.toLowerCase()));
	}

	public void verifyLabelWithEditIcon() {
			accountNameEditIcon.isDisplayed();
			Assert.assertTrue(accountNameEditIcon.isDisplayed());
			Assert.assertTrue(accountName.isDisplayed());
	}
	public void verifyAccountNumberCopied(String title) {
		String result;
		if(title.toLowerCase().contains("name")) {
			result = ((HasClipboard) driver).getClipboardText();
		}
		else if(title.toLowerCase().contains("number")){
			result = ((HasClipboard) driver).getClipboardText();
		}
		else{
			result = ((HasClipboard) driver).getClipboardText();

		}
		Assert.assertFalse(result.isEmpty());
	}
	public void clickOnCopyToClipBoard(String title) {
		if(title.toLowerCase().contains("name")){
			accountNameCopyToClipboard.click();
		}
		else if(title.toLowerCase().contains("number")){
			accountNumberCopyToClipboard.click();
		}
		else{
			accountIbanNoCopyToClipboard.click();
		}
	}
	public void selectProfile() {
		selectProfile.isDisplayed();
		selectProfile.click();
	}

	public void selectShare() {
		accountShareText.isDisplayed();
		accountShareText.click();
	}

	public void selectContactNumber() {
		if(selectFirstContactNumber.isDisplayed()) {
			selectFirstContactNumber.click();
		}
		else{
			selectNewMessageButton.click();
			enterNumber.sendKeys("0999999999");
			sendTo.click();

		}
		clickSendSMS.click();
		driver.navigate().back();

	}
}
