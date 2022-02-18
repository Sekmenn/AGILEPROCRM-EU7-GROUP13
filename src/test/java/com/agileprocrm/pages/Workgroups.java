package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class Workgroups extends BasePage{


        @FindBy(xpath = "//*[.='Join']")
        public WebElement joinButton;
}
