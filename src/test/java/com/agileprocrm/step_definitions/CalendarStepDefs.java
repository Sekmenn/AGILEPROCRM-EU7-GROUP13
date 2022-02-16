package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.CalendarPage;
import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();

    @Given("The user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get(userType));
    }

    @When("The user navigates to {string}")
    public void the_user_navigates_to(String tabName) {
        calendarPage.mainTabElement(tabName).click();
    }

    @And("The user clicks on {string}")
    public void the_user_clicks_on(String correctTab) {
        switch (correctTab){
            case "My Calendar":
                calendarPage.myCalendarTab.click();
                break;
            case "Company Calendar":
                calendarPage.companyCalendarTab.click();
                break;
        }
    }

    @Then("The title contains {string}")
    public void the_title_contains(String expectedTitle) {
        String actualTitle = calendarPage.pageTitle.getText();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Verify title",expectedTitle,actualTitle);
    }
}
