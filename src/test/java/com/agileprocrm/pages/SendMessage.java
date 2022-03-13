package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMessage extends BasePage{

    public void attachment(String type){
        Driver.get().findElement(By.xpath("(//span[@title='"+type+"'])[1]")).click();
    }

    @FindBy(css = "#video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSource;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;

    @FindBy(id = "undefined")
    public WebElement saveButton;


    @FindBy(id = "bx-destination-tag")
    public WebElement AddMore;

    @FindBy(xpath = "//*[contains(@id,'destDepartmentTab')]")
    public WebElement contactList;

    @FindBy(xpath = "(//div/input[contains(@type,'file')])[1]")
    public WebElement choiceFile;

    @FindBy(xpath = "(//*/span[@class='f-wrap']")
    public WebElement UploadedFile;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "(//a[contains(@id,'disk-attach')])[1]")
    public WebElement sentFile;

    @FindBy(xpath = "(//img[contains(@id,'disk-attach')])[1]")
    public WebElement sentImage;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement addPersonBox;

    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab')]")
    public WebElement employeesTab;

    @FindBy(xpath = "//div/a[@href='#U512']")
    public WebElement person1;

    @FindBy(xpath = "//div/a[@href='#U514']")
    public WebElement person2;

    @FindBy(className = "bx-editor-iframe")
    public WebElement textIframe;

    @FindBy(xpath = "//div[contains(@id,'blog_post_outer')]/div/div")
    public WebElement sentText;

    @FindBy(className = "feed-post-text-block-inner-inner")
    public WebElement mentionedPerson;










}
