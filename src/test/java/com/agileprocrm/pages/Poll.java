package com.agileprocrm.pages;


import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Poll extends BasePage {

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement link;

    @FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement inputLink;

    @FindBy(xpath = "//*[@id='undefined']")
    public WebElement saveLink;

    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention;

    @FindBy(className = "'feed-add-post-del-but'")
    public WebElement allEmployeeCross;

    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement addMore;

    @FindBy(linkText = "Add question")
    public WebElement addQuestion;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(id = "multi_0")
    public WebElement allowMultiple;

    @FindBy(id = "question_0")
    public WebElement firstQuestion;

    @FindBy(id = "answer_0__0_")
    public WebElement firstAnswer;

    @FindBy(id = "answer_0__1_")
    public WebElement secondAnswer;

    @FindBy (id ="answer_0__2_")
    public WebElement thirdAnswer;

    @FindBy (id = "question_1")
    public WebElement secondQuestionBox;

    @FindBy(className = "bx-editor-iframe")
    public WebElement pollFrame;



    @FindBy(className = "bx-finder-box-item-t7-name")
    public WebElement addMentionUserName;

    @FindBy(className = "bxhtmled-metion")
    public WebElement addedUserName;

    @FindBy (css = "a[href='#switchTab']:nth-child(3)")
    public WebElement employDepart;

    @FindBy (xpath = "//*[@id='bx-lm-category-relation-129']/a[1]/div[1]/div[1]")
    public WebElement addMoreUser;

    @FindBy (xpath = "//*[@id='feed-add-post-destination-item']/span[2]")
    public WebElement addedMoreUser;

    @FindBy (xpath = "//*[@id='votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff']/div/ol/li[2]/div[1]/label")
    public WebElement crossButton;



    @FindBy (id = "feed-add-post-destination-container")
    public WebElement destinationBox;

    @FindBy(xpath = "/html/body[1]")
    public WebElement message;

    @FindBy (className = "feed-post-text-block-inner-inner")
    public WebElement heading;



}










