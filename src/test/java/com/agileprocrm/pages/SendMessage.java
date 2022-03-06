package com.agileprocrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMessage extends BasePage{

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement UploadFiles;

    @FindBy(xpath = "(//span[contains(@title,'Link')])[1]")
    public WebElement Link;

    @FindBy(id = "bx-destination-tag")
    public WebElement AddMore;

    @FindBy(xpath = "//*[contains(@id,'destDepartmentTab')]")
    public WebElement contactList;






}
