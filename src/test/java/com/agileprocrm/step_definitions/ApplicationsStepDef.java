package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ApplicationPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
      /*
        String actualTitle =applicationPage.pageTitle.getText();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Verify title",expectedTitle,actualTitle);*/

    }

    @When("user should be able to click view button")
    public void user_should_be_able_to_click_view_button() {
    applicationPage.viewButton.click();

    }
    @When("user should be able to click install button")
    public void user_should_be_able_to_click_install_button() {
        //WebElement input = Driver.get().findElement(By.xpath("//*[@id=\"detail_cont\"]/div[1]/div[2]/div[3]/a"));
        //new Actions(Driver.get()).moveToElement(input).click().perform();
        applicationPage.installButton.click();
    }

    @Then("user should be able to send a request for installing")
    public void user_should_be_able_to_send_a_request_for_installing() {
    applicationPage.sendButton.click();
    }

    @Then("user should be able to display the application's features")
    public void user_should_be_able_to_display_the_application_s_features(io.cucumber.datatable.DataTable dataTable) {


    }
}
