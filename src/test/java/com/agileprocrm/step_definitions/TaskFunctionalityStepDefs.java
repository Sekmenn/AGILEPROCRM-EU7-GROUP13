package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.TaskFunctionalityPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class TaskFunctionalityStepDefs {

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

        taskFunctionalityPage.HighPriority.click();
        Assert.assertTrue( taskFunctionalityPage.HighPriority.isSelected());

    }

    @Then("user creates  task in duration of the certain deadline")
    public void user_creates_task_in_duration_of_the_certain_deadline() {
        taskFunctionalityPage.DeadLine.click();
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

    @When("user clicks to More button")
    public void userClicksToTimeTrackingButton()  {
        BrowserUtils.waitFor(2);
        taskFunctionalityPage.more.click();
    }

    @When("user selects to task plan time section")
    public void user_selects_to_task_plan_time_section() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
        taskFunctionalityPage.TaskPlanedTimeBox.click();
       Assert.assertTrue(taskFunctionalityPage.TaskPlanedTimeBox.isSelected());

    }

    @Then("user creates the tracking time {string} and {string}")
    public void user_creates_the_tracking_time(String hour, String minute) {
        taskFunctionalityPage.HourBox.sendKeys("2");
        taskFunctionalityPage.MinuteBox.sendKeys("30");

    }


    @Then("user clicks to Add Reminder button")
    public void userClicksToAddReminderButton() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
        taskFunctionalityPage.AddRemind.click();

    }
    @Then("user selects the time")
    public void user_selects_the_time() {
        taskFunctionalityPage.dataBox.click();
        taskFunctionalityPage.Select2.click();

    }
    @Then("user chooses the mail section")
    public void userChoosesTheMailSection() {
        taskFunctionalityPage.MailSection.click();

    }

    @Then("user adds an email to reminder")
    public void user_adds_an_email_to_reminder() {
        taskFunctionalityPage.MailBox.sendKeys(" alper@cybertekschool.com");

    }

    @Then("User  adds one more responsible person")
    public void user_adds_one_more_responsible_person() {
        taskFunctionalityPage.AddMore.click();
       Assert.assertTrue(taskFunctionalityPage.emailTable.getText().contains("marketing27@cybertekschool.com"));


    }

    @When("user clicks add dependent task button")
    public void user_clicks_add_dependent_task_button() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 5; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
        taskFunctionalityPage.DependentTasks.click();


    }

    @Then("user chooses recent tasks section")
    public void user_chooses_recent_taskssection() {
        taskFunctionalityPage.RecentTasks.click();

    }
    @Then("user clicks to select button")
    public void userClicksToSelectButton() {

        taskFunctionalityPage.DependenTasktSelectButton.click();
    }
    @Then("user clicks to  Task Templates button")
    public void user_Clicks_To_Task_Templates_button() {

        taskFunctionalityPage.TaskTemplatesButton.click();
    }
    @Then("user chooses All templates section")
    public void userChoosesAllTemplatesSection() {
        taskFunctionalityPage.AllTemplates.click();

    }
    @Then("user verify that user in the templates tasks page")
    public void user_verify_that_user_in_the_templates_tasks_page() {
        String expectedResult="https://qa.agileprocrm.com/company/personal/user/693/tasks/templates/";
        String actuaLResult = Driver.get().getCurrentUrl();
        Assert.assertEquals("verify that user in the templates tasks page",actuaLResult,expectedResult);

    }

    @And("user mentions  a marketing user .")
    public void userMentionsAMarketingUser() {
    taskFunctionalityPage.responsiblepersonBox.click();
    //taskFunctionalityPage.mentionEmailList.get(3).click();
    //Assert.assertTrue(taskFunctionalityPage.mentionEmailList.contains("marketing27@cybertekschool.com"));
    taskFunctionalityPage.email.click();
    }

    @Then("user chooses deadline section")
    public void userChoosesDeadlineSection() {
        taskFunctionalityPage.DeadLine.click();
    }

    @Then("user selects the time {string}, {string} and {string}")
    public void userSelectsTheTimeAnd(String day, String hour, String minute) {

        taskFunctionalityPage.TimeBox1.sendKeys("2");
        taskFunctionalityPage.TimeBox2.sendKeys("30");
        taskFunctionalityPage.deadlineSelectButton.click();


    }
    @Then("user clicks to Option button")
    public void userClicksToOptionButton() {
        taskFunctionalityPage.Option.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 2; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }


    }
    @Then("user chooses the {string} and {string} section")
    public void userChoosesTheAndSection(String ResponsiblePersonCanChangeDeadline, String ApproveTaskWhenCompleted) {
        taskFunctionalityPage.ResponsiblePersonCanChangeDeadlineBox.click();
        Assert.assertTrue(taskFunctionalityPage.ResponsiblePersonCanChangeDeadlineBox.isSelected());
        taskFunctionalityPage.ApproveTaskWhenCompletedBox.click();
        Assert.assertTrue(taskFunctionalityPage.ApproveTaskWhenCompletedBox.isSelected());


    }
}




