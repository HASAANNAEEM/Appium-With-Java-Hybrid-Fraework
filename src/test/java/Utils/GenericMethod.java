package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericMethod {
    public List<String> getTextOfElements(AppiumDriver driver, List<WebElement> elementsList){
        List<String> elementText = new ArrayList<>();
        elementsList.forEach(element -> {
            var elementValue = element.getText();
            if(elementValue!=null) elementText.add(elementValue.toLowerCase().trim());
        });
        return elementText;
    }
    public boolean isElementPresent(WebElement elementsList)
    {
        try{
            elementsList.isDisplayed();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean isSorted(List<String> listOfStrings, int index) {
        if (index < 2) {
            return true;
        } else if (listOfStrings.get(index - 2).compareTo(listOfStrings.get(index - 1)) > 0) {
            return false;
        } else {
            return isSorted(listOfStrings, index - 1);
        }
    }
    public void scrollToDown(WebDriver driver)
    {
        try{
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            HashMap<String, String> scrollObject = new HashMap<String, String>();
//            scrollObject.put("direction", "down");
//            js.executeScript("mobile: scroll", scrollObject);
//            System.out.println("Scroll to end");
            // assuming you have already instantiated the driver object and navigated to the desired screen

// get the dimensions of the screen
            String scrollToEnd = "window.scrollTo(0, document.body.scrollHeight)";

// execute the JavaScript code using the executeScript method
            ((JavascriptExecutor) driver).executeScript(scrollToEnd);


        }
        catch(Exception e){
            System.out.println("Failed to scroll to end : "+ e.toString());
        }
    }
    public void scrollToLastElement(WebDriver driver, WebElement element)
    {
        try{
            Dimension size = driver.manage().window().getSize();

            // Set the start and end points for the swipe gesture
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.8);
            int endY = (int) (size.height * 0.2);

            // Swipe up/down until the element is visible
            while (!this.isElementPresent(element)) {
                TouchAction action = new TouchAction((PerformsTouchActions) driver);
                action.press(ElementOption.point(startX, startY))
                        .moveTo(ElementOption.point(startX, endY))
                        .release()
                        .perform();
            }

//            Dimension size = driver.manage().window().getSize();
//            int startX = size.width / 2;
//            int startY = (int) (size.height * 0.8);
//            int endX = size.width / 2;
//            int endY = (int) (size.height * 0.2);
//
//// perform the scroll using the swipe method
//            new TouchAction((PerformsTouchActions) driver)
//                    .press(PointOption.point(startX, startY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(endX, endY))
//                    .release()
//                    .perform();


        }
        catch(Exception e){
            System.out.println("Failed to scroll to end : "+ e.toString());
        }
    }
}
