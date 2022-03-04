package com.agileprocrm.pages;

import com.agileprocrm.utilities.Driver;
import org.openqa.selenium.By;

public class ActivityStreamPage extends BasePage {

    public void navigatesToMore(String subTab){
        Driver.get().findElement(By.id("feed-add-post-form-link-text")).click();
        Driver.get().findElement(By.xpath("//span[.='"+subTab+"']")).click();
    }
}
