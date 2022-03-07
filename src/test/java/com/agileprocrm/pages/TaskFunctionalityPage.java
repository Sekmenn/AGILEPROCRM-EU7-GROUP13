package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskFunctionalityPage extends BasePage{

    @FindBy (className = "ui-btn-main")
    public WebElement NewTaskButton;

    @FindBy (xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[1]/div[1]/div[2]/input")
    public WebElement AddThings;


    @FindBy (id = "task-edit-priority-cb")
    public WebElement HighPriority;


    @FindBy (id = "dateplanmanager-deadline")
    public WebElement DeadLine;

    //add mention
    @FindBy (id="bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement Mention;


    @FindBy (className = "ui-btn ui-btn-success")
    public WebElement AddTsk;

    @FindBy (className = " bx-calendar-cell bx-calendar-active")
    public WebElement Calendar;

    @FindBy(xpath = "//*[@id=\"popup-window-content-calendar_popup_0.014847807354024356\"]/div/div[5]/a[1]/span[2]")
    public  WebElement deadlineSelectButton;

    @FindBy (className = "bx-finder-box-item-t7-name")
    public WebElement mentionList;

    @FindBy(xpath=("//*[@id=\"tasks-iframe-popup-scope\"]"))
    public WebElement iframe;
}
