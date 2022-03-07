package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ActivityStreamPage;
import com.agileprocrm.pages.TaskFunctionalityPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TaskFunctionality_AGIL_737  {

TaskFunctionalityPage taskFunctionalityPage= new TaskFunctionalityPage();

    @Then("user clicks to New Task button")
    public void user_clicks_to_button() {
        taskFunctionalityPage.NewTaskButton.click();
    }

    @Then("user adds things to do")
    public void user_adds_things_to_do() {
        Driver.get().switchTo().frame(taskFunctionalityPage.iframe);
      taskFunctionalityPage.AddThings.sendKeys("make a appointment");

    }
    @Then("user creates a high priority task")
    public void user_creates_a_high_priority_task() {
        taskFunctionalityPage.HighPriority.isSelected();

    }

    @Then("user creates  task in duration of the certain deadline")
    public void user_creates_task_in_duration_of_the_certain_deadline() {
        taskFunctionalityPage.DeadLine.click();
        taskFunctionalityPage.Calendar.click();
        taskFunctionalityPage.deadlineSelectButton.click();

    }

    @Then("user mentions a user.")
    public void user_mentions_a_user() {
        taskFunctionalityPage.Mention.click();
        taskFunctionalityPage.mentionList.click();


    }

    @Then("user adds Task")
    public void user_adds_Task() {
        taskFunctionalityPage.AddTsk.click();

    }

    @When("user selects to task plan time section")
    public void user_selects_to_task_plan_time_section() {

    }

    @Then("user creates the tracking time {string}")
    public void user_creates_the_tracking_time(String string) {

    }

    @Then("user selects the time")
    public void user_selects_the_time() {

    }

    @Then("user chooses the {string} section")
    public void user_chooses_the_mail_section(String string) {

    }

    @Then("user adds an email to reminder")
    public void user_adds_an_email_to_reminder() {

    }

    @Then("User  adds one more responsible person as {string}")
    public void user_adds_one_more_responsible_person_as(String string) {

    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {

    }

    @Then("user chooses {string} section")
    public void user_chooses_section(String string) {

    }

    @Then("user verify that user in the templates tasks page")
    public void user_verify_that_user_in_the_templates_tasks_page() {

    }

    @Then("user mentions  a user {string}.")
    public void user_mentions_a_user(String string) {

    }

    @Then("user selects the time {string}, {string}")
    public void user_selects_the_time(String string, String string2) {

    }

    @Then("user chooses the {string} and {string} section")
    public void user_chooses_the_and_section(String string, String string2) {

    }

    @Then("user chooses {string}")
    public void user_chooses(String string) {

    }

}
