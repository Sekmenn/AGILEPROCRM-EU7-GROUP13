package com.agileprocrm.pages;

import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Workgroups extends BasePage{

        public void joinGroup(String name){
                WebElement joinButton= Driver.get().findElement(By.xpath("//div/span/span/span[.='"+name+"']/../../span[4]/span[2]"));
               joinButton.click();
        }

        public void isMessageDisplayed(String name){
                WebElement message= Driver.get().findElement(By.xpath("//div/span/span/span[.='"+name+"']/../../span[4]/span[1]"));
                BrowserUtils.waitFor(1);
                Assert.assertTrue(message.isDisplayed());

        }
        public void invokeGroup(String groupName){
                Driver.get().findElement(By.xpath("//div/span/span/span[.='"+groupName+"']")).click();
                Driver.get().findElement(By.cssSelector("button[class='ui-btn ui-btn-md ui-btn-danger'")).click();
        }

        public void moveToFavorite(String groupName){
                WebElement favoriteButton = Driver.get().findElement(By.xpath("//div/span/span/span[.='"+groupName+"']/../span[2]"));
                BrowserUtils.hover(favoriteButton);
        }

        public String favoriteMessageDisplayed(String groupName){
                BrowserUtils.waitFor(2);
                WebElement favoriteButton = Driver.get().findElement(By.xpath("//div/span/span/span[.='"+groupName+"']/../span[2]"));
                Assert.assertTrue(favoriteButton.isDisplayed());
                return favoriteButton.getAttribute("title");
        }

        public void clickToFavorite(String groupName){
                WebElement favoriteButton = Driver.get().findElement(By.xpath("//div/span/span/span[.='"+groupName+"']/../span[2]"));
                favoriteButton.click();
        }

}
