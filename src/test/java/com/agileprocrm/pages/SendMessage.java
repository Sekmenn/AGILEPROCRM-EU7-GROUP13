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

    @FindBy(xpath = "(//div/input[contains(@type,'file')])[1]")
    public WebElement choiceFile;

    @FindBy(xpath = "(//*/span[@class='f-wrap']")
    public WebElement UploadedFile;

    @FindBy(id = "blog-submit-button-save")
    public WebElement submitButton;

    @FindBy(xpath = "(//a[contains(@id,'disk-attach')])[1]")
    public WebElement sentFile;

    @FindBy(xpath = "(//img[contains(@id,'disk-attach')])[1]")
    public WebElement sentImage;






}
