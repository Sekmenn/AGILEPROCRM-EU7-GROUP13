package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.LoginPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.ConfigurationReader;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Locale;

public class loginStepDefs {

    LoginPage login=new LoginPage();

    @Given("User enters {string} information")
    public void user_enters_information(String userType) {
        login.login(ConfigurationReader.get(userType));
    }

    @Then("User should login")
    public void user_should_login() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://qa.agileprocrm.com/stream/?login=yes";

        Assert.assertEquals("Verify the URL",expectedUrl,actualUrl);
    }

    @Given("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        login.loginNegative(username, password);
    }

    @Then("User should not login")
    public void user_should_not_login() {
        Assert.assertTrue(login.errorText.isDisplayed());
    }

    @Given("User enters invalid username and password five times")
    public void user_enters_invalid_username_and_password_five_times() {

        for (int i = 0; i < 6; i++) {
            login.loginNegative("username", "password");
//            BrowserUtils.waitFor(1);
        }
    }

    @Then("User should display {string}")
    public void user_should_display(String message) {

        String expectedMessage=message;
        String actualMessage= login.errorText.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Then("User should not login immediately")
    public void user_should_not_login_immediately() {
        login.loginAsHR();
        String url="https://qa.agileprocrm.com/stream/?login=yes";
        Assert.assertFalse(Driver.get().getCurrentUrl().equals(url));
    }

}
