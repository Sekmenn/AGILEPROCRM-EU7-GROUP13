package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage extends BasePage{
    @FindBy (xpath= "//*[@id=\"sitemap-menu\"]")
    public WebElement CRM;

    @FindBy (xpath = "//*[@id=\"sitemap-content\"]/div[10]/a")
    public WebElement applicationsButton;

    @FindBy (className = "pagetitle-item")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"mp_category_new_free\"]/div[1]/div/div/div[2]/div[3]/div[1]")
    public WebElement viewButton;

    @FindBy (xpath="//a[contains(@class,'btn')]")
    public WebElement installButton;

    @FindBy (className = "popup-window-button popup-window-button-accept")
    public WebElement sendButton;


}
