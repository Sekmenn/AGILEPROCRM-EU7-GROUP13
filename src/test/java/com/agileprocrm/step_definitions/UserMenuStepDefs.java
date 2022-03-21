package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.pages.UserMenu;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class UserMenuStepDefs {

    UserMenu userMenu = new UserMenu();


    @Given("The user logged in as HR")
    public void theUserLoggedInAsHR() {
        LoginPage loginpage = new LoginPage();
        loginpage.loginAsHR();
    }

    @When("The user navigates to User Menu")
    public void theUserNavigatesToUserMenu() {
        userMenu.userMenuTab.click();
    }

    @And("The user clicks {string} tab")
    public void theUserClicksTab(String UserMenuTab) {
        switch (UserMenuTab) {
            case "Edit Profile Settings":
                userMenu.editProfileSettings.click();
                break;
            case "My Profile":
                userMenu.myProfile.click();
                break;
        }

    }

    @Then("The title of the window contains {string}")
    public void theTitleOfTheWindowContains(String expectedTitle) {
        String actualTitle = userMenu.editProfileSettingsTitle.getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("The user able to display {string}")
    public void theUserAbleToDisplay(String expectedResult) {
        String actualResult = userMenu.contactInformation.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
