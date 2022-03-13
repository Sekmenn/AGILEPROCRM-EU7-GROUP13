package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.SendMessage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class SendMessageDefs {
    String messageText="testing";
    String videoUrl="https://www.youtube.com/watch?v=aazMMhTBbac&feature=youtu.be";

    SendMessage message = new SendMessage();

    @And("The user click on {string}")
    public void theUserClickOn(String tabName) {
        message.topTabs(tabName).click();
    }

    @When("User upload {string}")
    public void userUploadAFile(String FileName) {
        String projectPath=System.getProperty("user.dir");
        String file = projectPath+"/src/test/resources/Files/"+ FileName;
        message.choiceFile.sendKeys(file);
        BrowserUtils.waitFor(1);
        message.sendButton.click();
    }

    @Then("user verify the uploaded file named {string}")
    public void userVerifyTheUploadedFileName(String FileName) {
        String actualName = message.sentFile.getText();
        String expectedName = FileName;
        Assert.assertTrue(actualName.contains(expectedName));
    }

    @Then("user verify the uploaded picture named {string}")
    public void userVerifyTheUploadedPictureName(String FileName) {
        BrowserUtils.waitFor(2);
        String actualName = message.sentImage.getAttribute("alt");
        String expectedName = FileName;
        Assert.assertTrue(actualName.contains(expectedName));
    }

    @When("User click Add persons box")
    public void userClickAddPersonsBox() {
        Driver.get().switchTo().frame(message.textIframe);

        Driver.get().findElement(By.xpath("//body")).sendKeys(messageText);

        Driver.get().switchTo().defaultContent();
        message.addPersonBox.click();
    }


    @And("User click Employees and departments list")
    public void userClickEmployeesAndDepartmentsList() {
        message.employeesTab.click();
    }

    @Then("User add two persons from the list")
    public void UserAddTwoPersonsFromTheList() {
        message.person1.click();
        message.person2.click();
        Driver.get().findElement(By.xpath("//*[@class='popup-window-close-icon']")).click();
    }

    @And("Verify that user send the message")
    public void verifyThatUserSendTheMessage() {

        message.sendButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(messageText,message.sentText.getText());
    }

    @And("User type text and link into boxes")
    public void userTypeTextAndLinkIntoBoxes() {
        message.linkTextBox.sendKeys(messageText);
        message.linkBox.sendKeys("www.youtube.com");

    }

    @Then("user click save button")
    public void userClickSaveButton() {

        message.saveButton.click();
    }

    @When("User click {string} button")
    public void userClickAttach(String str) {
        BrowserUtils.waitFor(1);
        message.attachment(str);
    }

    @And("User type the source")
    public void userTypeTheSource() {
        message.videoSource.sendKeys("https://www.youtube.com/watch?v=aazMMhTBbac&feature=youtu.be");
    }

    @And("Verify that user send the video")
    public void verifyThatUserSendTheVideo() {
        message.sendButton.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(videoUrl,message.sentText.getText());
    }

    @And("User type {string} into box")
    public void userTypeIntoBox(String str) {
        Driver.get().switchTo().frame(message.textIframe);
        Driver.get().findElement(By.className("bxhtmled-quote")).sendKeys(str);
        Driver.get().switchTo().defaultContent();
    }

    @Then("Verify that user send the quote")
    public void verifyThatUserSendTheQuote() {
        message.sendButton.click();
        BrowserUtils.waitFor(2);
        String expectedTitle= "Quote";
        String actualTitle = Driver.get().findElement(By.className("blog-post-quote")).getAttribute("title");
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("User select a person from the list")
    public void userSelectAPersonFromTheList() {
        message.person1.click();
    }

    @Then("Verify that user added mention")
    public void verifyThatUserAddedMention() {
        message.sendButton.click();
        BrowserUtils.waitFor(2);

        Assert.assertTrue(message.mentionedPerson.getText().contains("cybertekschool.com"));

    }
}
