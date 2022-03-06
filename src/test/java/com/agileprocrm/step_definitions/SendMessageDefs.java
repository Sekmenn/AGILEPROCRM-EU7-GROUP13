package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.SendMessage;
import io.cucumber.java.en.And;

public class SendMessageDefs {

    SendMessage message = new SendMessage();

    @And("The user click on {string}")
    public void theUserClickOn(String tabName) {

        message.topTabs(tabName).click();



    }
}
