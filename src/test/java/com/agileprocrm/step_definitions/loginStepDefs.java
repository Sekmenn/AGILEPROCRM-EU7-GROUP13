package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Locale;

public class loginStepDefs {

    LoginPage login=new LoginPage();

    @Given("User enters {string} information")
    public void user_enters_information(String userType) {

        String user = userType.toLowerCase();

        switch (user) {
            case "hr":
                login.loginAsHR();
                break;
            case "helpdesk":
                login.loginAsHelpDesk();
                break;
            case "marketing":
                login.loginAsMarketing();
                break;
        }
    }

    @Then("User should login")
    public void user_should_login() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://qa.agileprocrm.com/stream/?login=yes";

        Assert.assertEquals("Verify the URL",expectedUrl,actualUrl);
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        login.login(username, password);
    }

    @Then("User should not login")
    public void user_should_not_login() {
        Assert.assertTrue(login.errorText.isDisplayed());
    }
}
