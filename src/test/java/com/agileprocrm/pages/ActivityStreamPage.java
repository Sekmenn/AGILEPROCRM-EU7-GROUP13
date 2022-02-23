package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sitemap-menu\"]")
    public WebElement CRS;
    @FindBy(xpath = "//*[@id=\"sitemap-content\"]/div[1]/div/a[1]")
    public WebElement ActivityStreamButton;
    @FindBy(className = "main-ui-filter-search-filter")
    public WebElement filterAndSearchBox;

    @FindBy(name = "CREATED_BY_ID_label")
    public WebElement author;

    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement Recent;


    @FindBy (id = "destDepartmentTab_CREATED_BY_ID")
    public WebElement EmployeeAndDepartment;

    @FindBy(className = "bx-finder-company-department-employee-name")
    public WebElement Employees_and_departmentsList;


    @FindBy(name = "TO_label")
    public WebElement To;

    @FindBy(id="destDepartmentTab_TO")
    public WebElement EmployeeAndDepartmentTo;

    @FindBy (xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[3]/div[2]/div/button")
    public WebElement searchBotton;

}
