package StepDefinitions;
import java.net.URL;
import java.net.MalformedURLException;

import Utils.JsonHandler;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class TestRunner_BrowserStack {
	public static void main(String[] args) throws MalformedURLException {

		JsonHandler jsonHandler = new JsonHandler();
		System.out.println("Executing");
		jsonHandler.writeJsonValue("savingAccountDetails","accountName","hai");
		jsonHandler.writeJsonValue("savingAccountDetails","accountNumber","asd");
		jsonHandler.writeJsonValue("savingAccountDetails","accountCurrency","123");

	}
}