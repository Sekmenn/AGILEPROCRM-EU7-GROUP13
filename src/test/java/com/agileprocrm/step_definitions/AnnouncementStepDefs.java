package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ActivityStreamPage;
import com.agileprocrm.pages.AnnouncementPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.List;

public class AnnouncementStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    AnnouncementPage announcementPage = new AnnouncementPage();

    @And("The user navigates to More and {string}")
    public void theUserNavigatesToMoreAnd(String subTab) {
        activityStreamPage.navigatesToMore(subTab);
    }

    @When("The user clicks on {string} icon")
    public void the_user_clicks_on_icon(String iconName) {
        if(iconName.equals("Record Video")){
            announcementPage.recordVideoIcon.click();
        }else {
            announcementPage.selectIcon(iconName);
        }
    }

    @And("The user uploads {string} file")
    public void theUserUploadsFile(String fileName) {
        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/testFiles/"+fileName;
        String fullPath = projectPath + "/" + filePath;
        announcementPage.uploadFilesAndPictures.sendKeys(fullPath);
    }

    @Then("The {string} file  should be added")
    public void theFileShouldBeAdded(String expectedFileName) {
        expectedFileName = expectedFileName.substring(0,expectedFileName.indexOf("."));
        String actualFileName = announcementPage.attachedFiles.getText();
        Assert.assertTrue("Verify attached files",actualFileName.contains(expectedFileName));
    }

    @And("The user selects document from {string} and chooses {string}")
    public void theUserSelectsDocumentFromAndChooses(String supply, String fileName) {
        announcementPage.fromBitrix.click();
        BrowserUtils.clickWithJS(announcementPage.trial);//announcementPage.selectSupply(supply).click();
        //announcementPage.trial.click();
        announcementPage.selectFile(fileName).click();
        announcementPage.selectButton.click();
    }

    @When("The user clicks on -Add more- link")
    public void theUserClicksOnAddMoreLink() {
        announcementPage.addMoreLink.click();
    }

    @And("The user selects {string} and {string} from contact lists")
    public void theUserSelectsAndFromContactLists(String tabName, String reciepentUserName) {
        announcementPage.chooseTabFromContactList(tabName).click();
        announcementPage.findRecipient(reciepentUserName).click();
        BrowserUtils.waitFor(2);
    }

    @Then("{string} should be added in to box.")
    public void shouldBeAddedInToBox(String reciepentUserName) {
        List<String> Elements = BrowserUtils.getElementsText(announcementPage.recipientList);
        Assert.assertTrue(Elements.contains(reciepentUserName));
    }

    @And("The user fills up {string} and {string} boxes")
    public void theUserFillsUpAndBoxes(String text, String link) {
        announcementPage.textBox.sendKeys(text);
        announcementPage.linkBox.sendKeys(link);
        announcementPage.saveButton.click();

    }

    @Then("{string} or {string} should be added into message box.")
    public void orShouldBeAddedIntoMessageBox(String text, String link) {
        Driver.get().switchTo().frame(announcementPage.iframe);
        String actualResult = announcementPage.messageBox(link).getText();
        Assert.assertTrue(actualResult.equals(text)||actualResult.equals(link));
    }

    @And("The user fills up video source box with {string}")
    public void theUserFillsUpVideoSourceBoxWith(String videoUrl) {
       BrowserUtils.waitFor(3);
        announcementPage.videoSourceBox.sendKeys(videoUrl);
        BrowserUtils.waitFor(3);
        Assert.assertFalse(announcementPage.videoError.isDisplayed());
        announcementPage.saveButton.click();
    }

    @Then("{string} should be added into message box.")
    public void shouldBeAddedIntoMessageBox(String videoUrl) {
        Driver.get().switchTo().frame(announcementPage.iframe);
        String actualResult = announcementPage.messageBox(videoUrl).getText();
        Assert.assertTrue(actualResult.equals(videoUrl));
    }

    @And("The user writes a quote {string} into quote box")
    public void theUserWritesAQuoteIntoQuoteBox(String quoteText) {
        Driver.get().switchTo().frame(announcementPage.iframe);
        announcementPage.messageQuoteBox.sendKeys(quoteText);
    }

    @Then("{string} should be added into message box as a quote.")
    public void shouldBeAddedIntoMessageBoxAsAQuote(String quoteText) {
        String actualResult = announcementPage.messageQuoteBox.getText();
        Assert.assertEquals(quoteText,actualResult);
    }

    @Then("{string} should be added in the message box.")
    public void shouldBeAddedInTheMessageBox(String mentionUserName) {
        Driver.get().switchTo().frame(announcementPage.iframe);
        String actualResult = announcementPage.messageBoxMention.getText();
        Assert.assertEquals(mentionUserName,actualResult);
    }

    @Then("The user should be see the editor text-bar on top of the message box")
    public void theUserShouldBeSeeTheEditorTextBarOnTopOfTheMessageBox() {
        Assert.assertTrue(announcementPage.toolBar.isDisplayed());
    }

    @Then("The user should be see the announcement Topic text box on top of the message box")
    public void theUserShouldBeSeeTheAnnouncementTopicTextBoxOnTopOfTheMessageBox() {
        Assert.assertTrue(announcementPage.topicBox.isDisplayed());
    }

    @And("The user clicks on allow button")
    public void theUserClicksOnAllowButton() {
        announcementPage.allowButton.click();
    }

    @Then("The user should be record a video and attach it with the message.")
    public void theUserShouldBeRecordAVideoAndAttachItWithTheMessage() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(announcementPage.topicBox.isDisplayed());
    }

    @And("The user writes a tag {string}")
    public void theUserWritesATag(String tagText) {
        announcementPage.tagForm.sendKeys(tagText);
        announcementPage.addButton.click();
    }

    @Then("{string} should be viewed in the Tags box")
    public void shouldBeViewedInTheTagsBox(String tagText) {
        String actualResult = announcementPage.tagName(tagText).getText();
        Assert.assertEquals(tagText,actualResult);
    }

    @And("The user selects one of {string} external drive")
    public void theUserSelectsOneOfExternalDrive(String driveName) {
        announcementPage.selectExternalDrive(driveName).click();
    }

    @Then("The notification message shouldn't be appeared.")
    public void theNotificationMessageShouldnTBeAppeared() {
        Assert.assertFalse("verify notification message",announcementPage.notifMessage.isDisplayed());
    }
}
