package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ApplicationPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ApplicationsStepDef {

    ApplicationPage applicationPage = new ApplicationPage();

    @When("user should be able to click applications")
    public void user_should_be_able_to_click_applications() {
        applicationPage.CRM.click();
        applicationPage.applicationsButton.click();
    }

    @Then("user should be able to display the applications")
    public void user_should_be_able_to_display_the_applications() {
       Assert.assertTrue(applicationPage.pageTitle.isDisplayed());
    }

    @When("user should be able to click view button")
    public void user_should_be_able_to_click_view_button() {
    applicationPage.viewButton.click();

    }
    @When("user should be able to click install button")
    public void user_should_be_able_to_click_install_button() {
        WebElement iframe= Driver.get().findElement(By.xpath("(//iframe[contains(@id,'frame')])[2]"));
        Driver.get().switchTo().frame(iframe);
        applicationPage.installButton.click();
    }
    @Then("user should be able to send a request for installing")
    public void user_should_be_able_to_send_a_request_for_installing() {
        applicationPage.sendButton.click();
    }
    @Then("user should be able to display the application's features")
    public void user_should_be_able_to_display_the_application_s_features(List<String>applicatonsFeature) {
        WebElement iframe= Driver.get().findElement(By.xpath("(//iframe[contains(@id,'frame')])[2]"));
        Driver.get().switchTo().frame(iframe);
        List <String> actualOption = BrowserUtils.getElementsText(new ApplicationPage().applicationsFeatures);
        Assert.assertEquals(applicatonsFeature,actualOption);
        System.out.println("applicatonsFeature = " +applicatonsFeature );
        System.out.println("actualOption =" + actualOption);
    }
}