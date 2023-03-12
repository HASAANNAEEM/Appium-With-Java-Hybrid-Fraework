package StepDefinitions.Browser;

import Pages.actions.Browser.Message_Browser;
import io.cucumber.java.en.Then;

public class DraftSteps {

    Message_Browser Message= new Message_Browser();

    @Then("user click on three dots at header")
    public void click_saving_account()
    {
        Message.ClickOnThreeDots();
    }

    @Then("user click on {string} screen")
    public void user_click_on_screen(String value) {
        Message.ClickOnMoreScreen(value);
    }
    @Then("user clicks on {string} button")
    public void click_Btn(String value) {
        Message.ClickBtn(value);
    }
    @Then("user is able to see the popup as {string}")
    public void user_viewable_popupName(String value) {
        Message.PopupScreenName(value);
    }
    @Then("user select the topic {string}")
    public void user_select_the_topic(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user enter the Subject as {string}")
    public void enter_subject(String value) {
        Message.EnterMessageSubject(value);
    }
    @Then("user enter the Message as {string}")
    public void enter_message(String value) {
        Message.EnterMessage(value);
    }
    @Then("user attach some pdf file")
    public void user_attach_some_pdf_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks on {string} button over discard popup")
    public void user_click_on_on_new_message_screen(String value) {
        Message.DiscardBtn(value);
    }
}
