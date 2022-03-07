package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.SendMessage;
import com.agileprocrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.File;

public class SendMessageDefs {

    SendMessage message = new SendMessage();

    @And("The user click on {string}")
    public void theUserClickOn(String tabName) {
        message.topTabs(tabName).click();
    }

    @When("User click Upload Files button")
    public void userClickUploadFilesButton() {
        message.UploadFiles.click();
    }

    @When("User upload {string}")
    public void userUploadAFile(String FileName) {
        String projectPath=System.getProperty("user.dir");
        String file = projectPath+"/src/test/resources/Files/"+ FileName;
        message.choiceFile.sendKeys(file);
        BrowserUtils.waitFor(1);
        message.submitButton.click();
    }

    @Then("user verify the uploaded file name {string}")
    public void userVerifyTheUploadedFileName(String FileName) {
        String actualName = message.sentFile.getText();
        String expectedName = FileName;
        Assert.assertTrue(actualName.contains(expectedName));
    }

    @Then("user verify the uploaded picture name {string}")
    public void userVerifyTheUploadedPictureName(String FileName) {
        BrowserUtils.waitFor(2);
        String actualName = message.sentImage.getAttribute("alt");
        String expectedName = FileName;
        Assert.assertTrue(actualName.contains(expectedName));
    }
}
