package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TaskFunctionalityPage extends BasePage{

    @FindBy (className = "ui-btn-main")
    public WebElement NewTaskButton;

    @FindBy (xpath = "//*[@id='task-form-bitrix_tasks_task_default_1']/div[1]/div[1]/div[2]/input")
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
    @FindBy(xpath ="//*/input[@class='js-id-timeestimate-time js-id-timeestimate-hour task-options-inp']")
    public WebElement HourBox;
    @FindBy(xpath ="//*/input[@class='js-id-timeestimate-time js-id-timeestimate-minute task-options-inp']")
    public WebElement MinuteBox;


    @FindBy (className ="bx-finder-box-item-t7-name")
    public WebElement mentionList;

    @FindBy(xpath=("//iframe[contains(@id,'iframe')]"))
    public WebElement iframe;



    @FindBy (xpath = "//*/span[.='Remind']")
    public WebElement Remind;

    @FindBy (xpath = "//*/span[.='Add reminder']")
    public WebElement AddRemind;

    @FindBy (xpath = "//*[@id='popup-window-content-reminder-bitrix_tasks_task_default_1-form']/span/div/span[1]/span/input[1]")
    public WebElement dataBox;

    @FindBy (xpath = "//*/span[@class='bx-calendar-button-text'][1]")
    public WebElement Select2;

    @FindBy(className = "task-options-reminder-link-mail")
    public  WebElement MailSection;
    @FindBy (xpath = " //*[@id='popup-window-content-reminder-bitrix_tasks_task_default_1-form']/span/div/span[3]/select")
    public WebElement MailBox;


    @FindBy (id = "bx-component-scope-bitrix_tasks_task_default_1-responsible")
    public WebElement AddMore;

    @FindBy(xpath = "//*[@id='bx-lm-box-last-content']/table/tr/td")
    public WebElement emailTable;


    @FindBy (xpath = "//*[@id='bx-component-scope-dependson-bitrix_tasks_task_default_1']/span[2]/a/span[1]")
    public  WebElement DependentTasks;

    @FindBy (xpath = "//*[@id='dependson_last']/table")
    public WebElement RecentTasks;

    @FindBy(xpath = "//*[@id='task-item-set-popupdependson']/div[2]/span[1]")
    public WebElement DependenTasktSelectButton;


    @FindBy(xpath = "//*[@id='bx-component-scope-templateselector']/button")
    public WebElement TaskTemplatesButton;


    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-templateselector-form-transport']/div/div/a[3]/span[2]")
    public WebElement AllTemplates;

    @FindBy(id="bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement mention;

    @FindBy(xpath = "//*[@id='bx-component-scope-bitrix_tasks_task_default_1-responsible']/span[2]/a[1]")
    public WebElement responsiblepersonBox;
    @FindBy(css = "a[id^='destDepartmentTab_']")
    public WebElement EmployeesEmailList;

    @FindBy(xpath = "//*[@href='#U666']")
    public WebElement email;


    @FindBy (xpath = "(//input[@data-bx-id='datepicker-display'])[2]")
    public WebElement startTimeBox;

    @FindBy (xpath = "(//input[@data-bx-id='datepicker-display'])[3]")
    public WebElement endTimeBox;

    @FindBy (xpath = "//span[.='Time planning']")
    public WebElement timePlanning;

    @FindBy (xpath = "//input[@class='bx-calendar-form-input'][1]")
    public WebElement hourBox;

    @FindBy (xpath = "//input[@class='bx-calendar-form-input'][2]")
    public WebElement minuteBox;

    @FindBy(xpath = "//*[@id='task-form-bitrix_tasks_task_default_1']/div[3]/div[2]/div/div[1]/span[2]/span[2]")
    public WebElement Option;

    @FindBy (xpath = "//*[@id='bx-component-scope-options-bitrix_tasks_task_default_1']/div[1]/div/label/input")
    public WebElement ResponsiblePersonCanChangeDeadlineBox;


    @FindBy (xpath = "//*[@id='bx-component-scope-options-bitrix_tasks_task_default_1']/div[3]/div/label/input")
    public WebElement ApproveTaskWhenCompletedBox;


    @FindBy (xpath = "//input[contains(@id,'TASKS_GRID_ROLE_ID_')]")
    public WebElement mainGridCheckbox;
    @FindBy (xpath = "//*[@id='TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_table']/tbody/tr[22]/td[1]/span")
    public WebElement GridItem;

    @FindBy (id= "action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control")
    public WebElement selectActionButton;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-action_button_TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_control_menu']/div/div/span[13]")
    public WebElement deletSection;

    @FindBy(id="apply_button_control")
    public WebElement ApplyButton;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement ContinueButton;



    @FindBy (xpath = "//*[@id='bx-component-scope-parenttask-bitrix_tasks_task_default_1']/span[2]/a/span[1]")
    public  WebElement addSubtask;

@FindBy (xpath = "//*[@id='parenttask_task_input']")
    public  WebElement addSearchBox;

@FindBy(xpath = "//*[@id='task-item-set-popupparenttask']/div[2]/span[1]")
    public WebElement subTaskSelectButton;


    @FindBy(xpath = "//span[@class='task-dashed-link-inner'][2]")
    public WebElement ParticipantsButton;

    @FindBy (xpath = "//*[@id='bx-component-scope-bitrix_tasks_task_default_1-accomplice']/span[2]/a[2]")
    public  WebElement  ParticipantAddsButton;

    @FindBy (xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeButton;

    @FindBy(xpath = "//span[@class='task-dashed-link-inner'][3]")
    public WebElement ObserversButton;
    @FindBy (xpath = "//*[@id='bx-component-scope-bitrix_tasks_task_default_1-auditor']/span[2]/a[2]")
    public  WebElement  ObserversAddButton;


    @FindBy (xpath = "//*[@href='#U592']")
     public WebElement marketing1email;
    @FindBy (xpath = " //*[@href='#U694']")
    public WebElement hr2email;








    @FindBy(xpath = "//span[.='Checklist']")
    public WebElement checkListButton;
    @FindBy(xpath = "//input[contains(@class,'js-id-checklist-is-form-title')]")
    public WebElement checkListAddButton;

    @FindBy(xpath = " //span[.='separator']")
    public WebElement checkListSeparatorButton;



}
