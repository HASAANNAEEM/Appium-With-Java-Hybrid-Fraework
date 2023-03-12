package StepDefinitions.Mobile;

import Pages.actions.Mobile.DraftPage_Mobile;
import io.cucumber.java.en.Then;


public class DraftSteps_Mobile {
    DraftPage_Mobile draftPage_mobile = new DraftPage_Mobile();
    @Then("user click on more icon")
    public void clickOnMoreIconOnTheScreen() {
        draftPage_mobile.clickMoreIcon();
    }
    @Then("user click on message icon")
    public void clickOnMessageIconOnTheScreen() {
        draftPage_mobile.clickMessageIcon();
    }

    @Then("user click on new message icon")
    public void clickOnNewMessageIconOnTheScreen() {
        draftPage_mobile.clickNewMessageIcon();
    }

    @Then("user select topic for message screen")
    public void selectTopicOnTheScreen() throws InterruptedException {
        draftPage_mobile.selectTopicSpinner();
    }
    @Then("user enter {string} text into the subject")
    public void enterSubjectTextOnTheScreen(String subjectText) {
        draftPage_mobile.enterSubject(subjectText);
    }
    @Then("user enter {string} text into the message")
    public void enterMessageTextOnTheScreen(String messageText) {
        draftPage_mobile.enterMessage(messageText);
    }

    @Then("user click on cancel icon")
    public void clickOnCancelIconOnTheScreen() {
        draftPage_mobile.clickCancelIcon();
    }

    @Then("user click on {string} icon")
    public void clickOnIconOnTheScreen(String title) {
        draftPage_mobile.clickIcon(title);
    }

    @Then("user select {string}")
    public void clickOnTextOnTheScreen(String title) {
        draftPage_mobile.clickIcon(title);
    }
    @Then("user clicked on {string} icon")
    public void clickOnIconIdOnTheScreen(String title) {
        draftPage_mobile.clickOnIdIcon(title);
    }

    @Then("user clicked on show roots icon")
    public void clickOnShowRootsOnTheScreen() {
        draftPage_mobile.clickOnShowRootsIcon();
    }

    @Then("user select pdf file")
    public void selectFileOnTheScreen() {
        draftPage_mobile.selectFile();
    }

    @Then("user click on send button")
    public void clickOnSendButton() throws InterruptedException {
        draftPage_mobile.clickOnSendIcon();
    }
    @Then("user click on attached file icon")
    public void clickOnAttachIconOnTheScreen() {
        draftPage_mobile.clickOnAttachIcon();
    }

    @Then("user click on navigation back icon")
    public void clickOnBackIconOnTheScreen() {
        draftPage_mobile.clickOnNavigation();
    }

    @Then("user click on download button")
    public void clickOnDownloadIconOnTheScreen() {
        draftPage_mobile.clickOnDownload();
    }

    @Then("user verify the draft message is displayed")
    public void verifyMessage() {
        draftPage_mobile.verifyDraftMessageIsDisplay();
    }

}
