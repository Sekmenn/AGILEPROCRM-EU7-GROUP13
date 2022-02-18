package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.TasksPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class tasksStepDefs {


    TasksPage taskPage = new TasksPage();

    @When("The user clicks on {string} tab")
    public void the_user_clicks_on_tab(String subTabs) {



        switch (subTabs){
            case  "All" :
                taskPage.allTab.click();
                break;

            case "Ongoing" :
                taskPage.ongoingTab.click();
                break;


        }

    }

    @Then("the user should be able to display {string} in the search box")
    public void the_user_should_be_able_to_display_in_the_search_box(String subTabs) {

        Assert.assertTrue(taskPage.searchBox.getText().contains(subTabs));



    }

}
