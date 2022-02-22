package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.Workgroups;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WorkgroupsStepDefs {
    Workgroups workgroups=new Workgroups();

    @When("User clicks Join button to join {string} group")
    public void user_clicks_Join_button_to_join_group(String name) {
        workgroups.joinGroup(name);
    }

    @Then("Request message should be displayed under {string} group")
    public void request_message_should_be_displayed_under_group(String groupName) {
        workgroups.isMessageDisplayed(groupName);
        workgroups.invokeGroup(groupName);
    }

    @When("User hover over star button of {string} group")
    public void user_hover_over_star_button_of_group(String groupName) {
        workgroups.moveToFavorite(groupName);

    }

    @Then("Verify {string} is displayed under {string} group")
    public void verify_is_displayed_under_group(String message, String groupName) {
        String actualMessage = workgroups.favoriteMessageDisplayed(groupName);
        Assert.assertEquals(message,actualMessage);
    }

    @When("User click star button of {string} group")
    public void user_click_star_button_of_group(String groupName) {
        workgroups.clickToFavorite(groupName);
    }
}
