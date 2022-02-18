package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {


    @FindBy(xpath = "//span[contains(text(), 'Tasks')] ")
    public WebElement tasks;


    @FindBy(xpath = "//*[.= 'All']")
    public WebElement allTab;

    @FindBy(xpath = "//*[.= 'Ongoing']")
    public WebElement ongoingTab;

    @FindBy (xpath = "//div[@id= 'TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_search_container']")
    public WebElement searchBox;


    public TasksPage(){
        PageFactory.initElements(Driver.get(), this);

    }
public void clickTab(String string){
        if(string.equals("All")){
            allTab.click();
        }else if(string.equals("Ongoing")){
            ongoingTab.click();
        }
}













}
