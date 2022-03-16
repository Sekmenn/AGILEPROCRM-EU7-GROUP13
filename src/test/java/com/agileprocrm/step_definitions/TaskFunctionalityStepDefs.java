package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.TaskFunctionalityPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.util.Random;

public class TaskFunctionalityStepDefs {

    TaskFunctionalityPage taskFunctionalityPage = new TaskFunctionalityPage();

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
        Assert.assertTrue(taskFunctionalityPage.HighPriority.isSelected());

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

    @And("user adds himself herself as responsible person")
    public void userAddsHimselfHerselfAsResponsiblePerson() {
        taskFunctionalityPage.responsiblepersonBox.sendKeys("marketing1@cybertekschool.com");
    }


    @When("user clicks to More button")
    public void userClicksToTimeTrackingButton() {
        BrowserUtils.waitFor(2);
        taskFunctionalityPage.more.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
    }

    @When("user selects to task plan time section")
    public void user_selects_to_task_plan_time_section() {

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
        String expectedResult = "https://qa.agileprocrm.com/company/personal/user/693/tasks/templates/";
        String actuaLResult = Driver.get().getCurrentUrl();
        Assert.assertEquals("verify that user in the templates tasks page", actuaLResult, expectedResult);

    }

    @And("user mentions  a marketing user .")
    public void user_Mentions_AMarketing_User() {
        taskFunctionalityPage.mention.click();
        taskFunctionalityPage.EmployeesEmailList.click();
        taskFunctionalityPage.email.click();
    }

    @Then("user chooses Time Planning")
    public void user_Chooses_Time_Planning() {
        taskFunctionalityPage.timePlanning.click();
    }

    @Then("user selects deadline")
    public void user_Selects_deadline() {
        int day = LocalDate.now().getDayOfMonth();

        taskFunctionalityPage.startTimeBox.click();
        taskFunctionalityPage.deadlineSelectButton.click();

        taskFunctionalityPage.endTimeBox.click();
        WebElement deadlineDate = Driver.get().findElement(By.xpath("//div/a[@href='javascript:void(0)' and (.='" + (day + 5) + "')]"));
        deadlineDate.click();

        taskFunctionalityPage.hourBox.sendKeys("10");
        taskFunctionalityPage.minuteBox.sendKeys("15");
        taskFunctionalityPage.deadlineSelectButton.click();


    }

    @Then("user clicks to Option button")
    public void user_Clicks_To_Option_Button() {
        taskFunctionalityPage.Option.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }

    }
    @Then("user chooses the Responsible person can change deadline,Approve task when completed")
    public void userChoosesThe() {
        taskFunctionalityPage.ResponsiblePersonCanChangeDeadlineBox.click();
        System.out.println("taskFunctionalityPage.ResponsiblePersonCanChangeDeadlineBox.isSelected() = " +taskFunctionalityPage.ResponsiblePersonCanChangeDeadlineBox.isSelected());
        taskFunctionalityPage.ApproveTaskWhenCompletedBox.click();
        System.out.println("taskFunctionalityPage.ApproveTaskWhenCompletedBox.isSelected() = " + taskFunctionalityPage.ApproveTaskWhenCompletedBox.isSelected());
    }



    @Then("user chooses main grid checkbox")
    public void user_chooses_main_grid_checkbox() {
        taskFunctionalityPage.GridItem.click();


    }

    @Then("user chooses grid item")
    public void userChoosesGridItem() {

        //taskFunctionalityPage.GridItem.click();
    }

    @Then("user clicks to SELECT ACTION button")
    public void userClicksToSELECTACTIONButton() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 100; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
        taskFunctionalityPage.selectActionButton.click();
    }

    @Then("user chooses delete section")
    public void userChoosesDeleteSection() {
        taskFunctionalityPage.deletSection.click();
    }

    @Then("user clicks to apply button")
    public void userClicksToApplyButton() {
        taskFunctionalityPage.ApplyButton.click();
    }

    @And("user clicks to continue button")
    public void userClicksToContinueButton() {
        taskFunctionalityPage.ContinueButton.click();
    }


    @Then("user clicks to subtask button")
    public void userClicksToSubtaskButton() {

        taskFunctionalityPage.addSubtask.click();
    }

    @And("user adds task")
    public void userAddsTask() {
        taskFunctionalityPage.addSearchBox.sendKeys("make a appointment");
    }

    @Then("user clicks to subtask select button")
    public void userClicksToSubtaskSelectButton() {

        taskFunctionalityPage.subTaskSelectButton.click();
    }

    @When("user clicks to check list button")
    public void userClicksToCheckListButton() {

        taskFunctionalityPage.checkListButton.click();
    }

    @Then("user clicks check List add the item")
    public void userClicksCheckListAddTheItem() {
        taskFunctionalityPage.checkListAddButton.sendKeys("TEST1");
        taskFunctionalityPage.checkListAddButton.click();
        taskFunctionalityPage.checkListSeparatorButton.click();

        taskFunctionalityPage.checkListAddButton.sendKeys("TEST2");
        taskFunctionalityPage.checkListAddButton.click();
        taskFunctionalityPage.checkListSeparatorButton.click();
        taskFunctionalityPage.checkListAddButton.sendKeys("TEST3");
        taskFunctionalityPage.checkListAddButton.click();
        taskFunctionalityPage.checkListSeparatorButton.click();
    }

    @When("user clicks to Participants button")
    public void userClicksToParticipantsButton() {
        taskFunctionalityPage.ParticipantsButton.click();
        taskFunctionalityPage.ParticipantAddsButton.click();
       /* taskFunctionalityPage.EmployeesEmailList.click();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 5; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
*/
    }
    @Then("user adds an {string}")
    public void userAddsAn(String marketingUser) {
        taskFunctionalityPage.marketing1email.click();
        taskFunctionalityPage.closeButton.click();
    }

    @When("user clicks to Observers button")
    public void userClicksToObserversButton() {
        taskFunctionalityPage.ObserversButton.click();
        taskFunctionalityPage.ObserversAddButton.click();
       /* taskFunctionalityPage.EmployeesEmailList.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
*/

    }

    @Then("user adds an email")
    public void userAddsAnEmail() {

        taskFunctionalityPage.hr2email.click();
    }



    }


