package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CompanyPage extends BasePage {

    @FindBy (id= "sitemap-menu")
    public WebElement CRM;

    @FindBy (xpath = "//*[@id='sitemap-content']/div[9]/a")
    public WebElement companyButton;

    @FindBy (xpath = "//*[@id='bx_intranet_toolbar']/a[1]/span[2]")
    public WebElement AddNewsButton;

    @FindBy (id="tab_cont_cedit2")
    public WebElement Details;

    @FindBy (xpath="//span[contains(@class,'adm-fileinput-item-panel-btn')][1]")
    public WebElement pencil;

    @FindBy (name= "savebtn")
    public WebElement saveButton;

    @FindBy (xpath = "//span[contains(@class,'popup-window-button')][1]")
    public WebElement savebtn;

    @FindBy (id = "bxed_PREVIEW_TEXT_html")
    public WebElement radioButton1;

    @FindBy (id="bxed_PREVIEW_TEXT_editor")
    public WebElement radioButton2;

    @FindBy (id="bxed_PREVIEW_TEXT_text")
    public WebElement radioButton3;

    @FindBy(xpath =  "//*[@id='tr_PROPERTY_3']/td[2]/select/option[3]")
    public WebElement drop1;

    @FindBy(xpath = "//*[@id='tr_PROPERTY_3']/td[2]/select/option[1]")
    public WebElement dropDownButton;

    @FindBy (className = "adm-calendar-icon")
    public WebElement calendar;

    @FindBy (className= "bx-calendar-set-time")
    public WebElement setTime;

    @FindBy (xpath = "//*/span[.='Select']")
    public WebElement TimeSelectButton;

    @FindBy (className= "adm-fileinput-drag-area-input")
    public WebElement dragAndDrop;

    @FindBy (xpath = "/html/body/div[12]/span[2]/span[1]")
    public WebElement upload;

    @FindBy (xpath= "//span[contains(@class,'adm-fileinput-item-panel-btn')][2]")
    public WebElement removeBotton;

    @FindBy (id = "maininterfacebuttons-tmp-frame-top_menu_id_about")
    public WebElement iframe;

    @FindBy (xpath = "//input[starts-with(@id,'TAGS')]")
    public WebElement tag;

    @FindBy (xpath = "//*[@id='tr_NAME']/td[2]/input")
    public WebElement title;

    @FindBy (id = "save_and_add")
    public WebElement saveAndAddButton;

}
