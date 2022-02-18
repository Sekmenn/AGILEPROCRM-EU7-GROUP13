package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.Workgroups;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkgroupsStepDefs {

    @When("User clicks Join button to join group")
    public WebElement joinGroup() {
        Workgroups group = new Workgroups();
        WebElement message = Driver.get().findElement(By.xpath("//*[.='Join']/../span"));
        group.joinButton.click();
        return message;
    }

    @Then("Request has been sent message should be displayed")
    public void message_should_be_displayed() {

        Assert.assertTrue(joinGroup().isDisplayed());
    }

}
