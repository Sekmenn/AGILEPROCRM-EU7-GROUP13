package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TaskFunctionalityPage extends BasePage{

    @FindBy (className = "ui-btn-main")
    public WebElement NewTaskButton;

    @FindBy (xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[1]/div[1]/div[2]/input")
    public WebElement AddThings;


    @FindBy (xpath = "//*[@id='tasks-task-priority-cb']")
    public WebElement HighPriority;


    @FindBy (xpath ="(//*/input[@data-bx-id='datepicker-display'])[1]")
    public WebElement DeadLine;

    //add mention
    @FindBy (id="bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement Mention;


    @FindBy (xpath = "(//*/button[@data-bx-id='task-edit-submit'])[1]")
    public WebElement AddTsk;

    @FindBy (className = "bx-calendar-cell bx-calendar-active")
    public WebElement Calendar;

    @FindBy(xpath = "//*/span[.='Select']")
    public  WebElement deadlineSelectButton;

    @FindBy(className = "task-additional-alt-more")
    public WebElement more;


    @FindBy(xpath="//input[contains(@class,'js-id-timeestimate-flag')]")
    public WebElement TaskPlanedTimeBox;
    //timeBoxInput
    @FindBy(xpath ="//*/input[@class=\"js-id-timeestimate-time js-id-timeestimate-hour task-options-inp\"]")
    public WebElement HourBox;
    @FindBy(xpath ="//*/input[@class=\"js-id-timeestimate-time js-id-timeestimate-minute task-options-inp\"]")
    public WebElement MinuteBox;


    @FindBy (className ="bx-finder-box-item-t7-name")
    public WebElement mentionList;

    @FindBy(xpath=("//iframe[contains(@id,'iframe')]"))
    public WebElement iframe;



    @FindBy (xpath = "//*/span[.='Remind']")
    public WebElement Remind;

    @FindBy (xpath = "//*/span[.='Add reminder']")
    public WebElement AddRemind;

    @FindBy (xpath = "//*[@id=\"popup-window-content-reminder-bitrix_tasks_task_default_1-form\"]/span/div/span[1]/span/input[1]")
    public WebElement dataBox;

    @FindBy (xpath = "//*/span[@class=\"bx-calendar-button-text\"][1]")
    public WebElement Select2;

    @FindBy(className = "task-options-reminder-link-mail")
    public  WebElement MailSection;
    @FindBy (xpath = " //*[@id=\"popup-window-content-reminder-bitrix_tasks_task_default_1-form\"]/span/div/span[3]/select\n")
    public WebElement MailBox;


    @FindBy (id = "bx-component-scope-bitrix_tasks_task_default_1-responsible")
    public WebElement AddMore;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td")
    public WebElement emailTable;


    @FindBy (xpath = "//*[@id=\"bx-component-scope-dependson-bitrix_tasks_task_default_1\"]/span[2]/a/span[1]")
    public  WebElement DependentTasks;

    @FindBy (xpath = "//*[@id=\"dependson_last\"]/table")
    public WebElement RecentTasks;

    @FindBy(xpath = "//*[@id=\"task-item-set-popupdependson\"]/div[2]/span[1]")
    public WebElement DependenTasktSelectButton;


    @FindBy(xpath = "//*[@id=\"bx-component-scope-templateselector\"]/button")
    public WebElement TaskTemplatesButton;


    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-templateselector-form-transport\"]/div/div/a[3]/span[2]")
    public WebElement AllTemplates;

    @FindBy(id="bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement mention;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-bitrix_tasks_task_default_1-responsible\"]/span[2]/a[1]")
    public WebElement responsiblepersonBox;

    @FindBy (xpath = "//*/input[@class='bx-calendar-form-input'][1]")
    public WebElement TimeBox1;

    @FindBy (xpath = "//*/input[@class='bx-calendar-form-input'][2]")
    public WebElement TimeBox2;

    @FindBy(xpath = "//*[@id=\"task-form-bitrix_tasks_task_default_1\"]/div[3]/div[2]/div/div[1]/span[2]/span[2]")
    public WebElement Option;

    @FindBy (xpath = "//*[@id=\"bx-component-scope-options-bitrix_tasks_task_default_1\"]/div[1]/div/label/input")
    public WebElement ResponsiblePersonCanChangeDeadlineBox;


    @FindBy (xpath = "//*[@id=\"bx-component-scope-options-bitrix_tasks_task_default_1\"]/div[3]/div/label")
    public WebElement ApproveTaskWhenCompletedBox;




@FindBy(className = "bx-finder-box-item-t7-name")
public WebElement email;


    @FindBy(xpath = "//*[@id=\"popup-window-content-BXSocNetLogDestination\"]/div")
    public List<WebElement> mentionEmailList;





    @FindBy (xpath = "//input[contains(@id,'main-grid-checkbox')]")
    public WebElement mainGridCheckbox;

}
