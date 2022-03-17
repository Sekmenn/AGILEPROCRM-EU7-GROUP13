package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.DownloadApp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DownloadAppStepDefs {

    DownloadApp download = new DownloadApp();

    @When("The user click on {string} under Desktop Client")
    public void the_user_click_on_under_Desktop_Client(String OS) {
        download.downloadApp(OS).click();
    }

    @Then("The user should be able to download Desktop version of the application")
    public void the_user_should_be_able_to_download_Desktop_version_of_the_application(){
        Assert.assertTrue(download.isFileDownloaded("bitrix24_desktop.exe"));
    }
}
