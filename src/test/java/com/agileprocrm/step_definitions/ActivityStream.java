package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.ActivityStreamPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ActivityStream {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @And("The user should be able to click to Filter and search button")
    public void the_user_should_be_able_to_click_to_button() {
        activityStreamPage.CRS.click();
        activityStreamPage.ActivityStreamButton.click();
        activityStreamPage.filterAndSearchBox.click();

    }

    @Then("the user should be able to click to author box")
    public void the_user_should_be_able_to_click_to_author_box() {
        activityStreamPage.author.click();


    }

    @Then("the user should be able to select Employee and Department.")
    public void the_user_should_be_able_to_select() {
        activityStreamPage.EmployeeAndDepartment.click();
        activityStreamPage.Employees_and_departmentsList.click();

    }

    @Then("the user should be able to click on SEARCH button.")
    public void the_user_should_be_able_to_click_on_SEARCH_button() {
        activityStreamPage.searchBotton.click();


    }

    @Then("the user should be able to click to To box")
    public void the_user_should_be_able_to_click_to_To_box() {
        activityStreamPage.To.click();


    }
    @Then("the user should be able to select Employee and DepartmentTo.")
    public void the_user_should_be_able_to_select_Employee_and_DepartmentTo() {
        activityStreamPage.EmployeeAndDepartmentTo.click();
        activityStreamPage.Employees_and_departmentsList.click();
    }
}
