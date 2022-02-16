package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage{

    @FindBy(xpath = "(//a[@class='main-buttons-item-link'])[1]")
    public WebElement myCalendarTab;

    @FindBy(xpath = "(//a[@class='main-buttons-item-link'])[2]")
    public WebElement companyCalendarTab;

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;

}
