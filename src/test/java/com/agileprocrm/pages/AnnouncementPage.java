package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AnnouncementPage extends BasePage{

    public void selectIcon(String iconName){
        Driver.get().findElement(By.cssSelector("span[title='"+iconName+"']")).click();
    }

    @FindBy(xpath = "//span[.='Record Video']")
    public WebElement recordVideoIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndPictures;

    @FindBy(css = "span.f-wrap")
    public WebElement attachedFiles;

    @FindBy(xpath = "//span[.='Select document from Bitrix24']")
    public WebElement fromBitrix;

    public WebElement selectSupply(String supply){
        return Driver.get().findElement(By.xpath("//span[@title='"+supply+"']"));
    }

    public WebElement selectFile(String fileName){
        return Driver.get().findElement(By.xpath("//span[@title='Name: "+fileName+"']/a"));
    }

<<<<<<< HEAD
    @FindBy(xpath = "//span[contains(text(),'Sales and marketing')]")
    public WebElement trial;

    @FindBy(xpath = "//span[.='Select document']")
=======
    @FindBy(id = "Select document")
>>>>>>> origin/caner
    public WebElement selectButton;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreLink;

    public WebElement chooseTabFromContactList(String tabName){
        return  Driver.get().findElement(By.xpath("//a[.='"+tabName+"']"));
    }

    public WebElement findRecipient(String recipientUserName){
        return Driver.get().findElement(By.xpath("(//div[.='"+recipientUserName+"'])[3]"));
    }

    @FindBy(css = "#feed-add-post-destination-item>span")
    public List<WebElement> recipientList;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;

    @FindBy(id = "undefined")
    public WebElement saveButton;

    @FindBy(css = "iframe.bx-editor-iframe")
    public WebElement iframe;

    public WebElement messageBox(String link){
        return Driver.get().findElement(By.xpath("//a[@href='"+link+"']"));
    }

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBox;

    @FindBy(className = "bxhtmled-quote")
    public WebElement messageQuoteBox;

    @FindBy(className = "bxhtmled-metion")
    public WebElement messageBoxMention;

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement toolBar;

    @FindBy(id = "POST_TITLE")
    public WebElement topicBox;

    @FindBy(xpath = "//span[.='Allow']")
    public WebElement allowButton;

    @FindBy(name = "TAGS_blogPostForm")
    public WebElement tagForm;

    public WebElement tagName(String tagText){
        return Driver.get().findElement(By.xpath("//span[.='"+tagText+"']"));
    }

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(className = "bxhtmled-video-error-cell")
    public WebElement videoError;
<<<<<<< HEAD

    public WebElement selectExternalDrive(String driveName){
        return Driver.get().findElement(By.xpath("//span [.='"+driveName+"']"));
    }

    @FindBy(className= "ui-notification-balloon-content")
    public WebElement notifMessage;
=======
>>>>>>> origin/caner
}
