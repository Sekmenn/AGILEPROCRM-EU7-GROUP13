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

    @FindBy (id="1478Edit")
    public WebElement edit;

    @FindBy (id="FMeditorDescription")
    public WebElement changePictureName;

    @FindBy (xpath = "//*[@id='popupFM']/div[2]/span[1]")
    public WebElement saveButton;

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

    @FindBy (xpath = "//*[@id='tr_PROPERTY_3']/td[2]/select/option[3]")
    public WebElement dropDownSelect;

    @FindBy (xpath = "//*[@id='tr_PROPERTY_3']/td[2]/select/option")
    public List<WebElement> dropDownList;

    @FindBy (className = "adm-calendar-icon")
    public WebElement calendar;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/div/form/div[1]/div[2]/table/tbody/tr[3]/td[2]/div/span")
    public WebElement chooseDate;

    @FindBy (xpath = "//*[@id='popup-window-content-calendar_popup_0.2815721340672257']/div/div[3]/div/div[4]/a[3]")
    public WebElement selectDate;

    @FindBy (xpath= "/html/body/div[6]/div/div/div[4]/a")
    public WebElement setTime;

    @FindBy(xpath = "/html/body/div[6]/div/div/div[4]/a")
    public WebElement setHour;

    @FindBy(xpath = "//*[@id='popup-window-content-calendar_popup_0.934005528988352']/div/div[4]/div/span[2]/input[2]")
    public WebElement setMinute;

    @FindBy(xpath = "/html/body/div[6]/div/div/div[5]/a[1]/span[2]")
    public WebElement SelectButton;

    @FindBy (xpath= "//*[@id='bx_file_detail_picture_add']")
    public WebElement dr;

    @FindBy (className= "adm-fileinput-drag-area-input")
    public WebElement dragAndDrop;

    @FindBy (xpath = "/html/body/div[12]/span[2]/span[1]")
    public WebElement upload;

    @FindBy (id= "file1647086338563Del")
    public WebElement removeBotton;

    @FindBy (id = "maininterfacebuttons-tmp-frame-top_menu_id_about")
    public WebElement iframe;

    @FindBy (xpath = "//*[@id='TAGS886675456']")
    public WebElement tag;

    @FindBy (xpath = "//*[@id='tr_NAME']/td[2]/input")
    public WebElement title;

    @FindBy (id = "save_and_add")
    public WebElement saveAndAddButton;

}
