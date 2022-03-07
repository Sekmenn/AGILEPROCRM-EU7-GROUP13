package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public WebElement mainTabElement(String tabName){
       return Driver.get().findElement(By.xpath("//a[@title='"+tabName+"']"));
    }

    public WebElement topTabs(String tabName){
        return Driver.get().findElement(By.xpath("//*/span[.='"+tabName+"']"));
    }

//    public void navigateToModule(String module){
//        Driver.get().findElement(By.xpath("//li/a[@title='"+module+"']")).click();
//    }
}
