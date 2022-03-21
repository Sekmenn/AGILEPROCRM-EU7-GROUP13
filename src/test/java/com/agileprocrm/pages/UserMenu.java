package com.agileprocrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMenu extends BasePage {
    @FindBy(id="user-name")
    public WebElement userMenuTab;

    @FindBy(css = "a[href='/company/personal/user/693/edit/']:nth-child(2)")
    public WebElement editProfileSettings;

    @FindBy(linkText = "My Profile")
    public WebElement myProfile;


    @FindBy(xpath ="//*[@id='pagetitle']")
    public WebElement editProfileSettingsTitle;


    @FindBy(xpath = ("//*[.='Contact information']"))
    public WebElement contactInformation;
}