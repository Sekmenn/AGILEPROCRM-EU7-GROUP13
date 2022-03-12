package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.CompanyPage;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CompanyStepDef {
    CompanyPage companyPage = new CompanyPage();

    @When("User clicks to Company button")
    public void user_clicks_to_Company_button() {
        companyPage.CRM.click();
        companyPage.companyButton.click();
    }

    @When("User clicks to Add News button")
    public void user_clicks_to_Add_News_button() {
        companyPage.AddNewsButton.click();

    }
    @Then("User selects to type of information")
    public void user_selects_to_type_of_information() {
        companyPage.dropDownButton.click();
        companyPage.drop1.isSelected();

       System.out.println("companyPage.dropDownButton.isSelected() = " + companyPage.dropDownButton.isSelected());
    }
    @When("User clicks to calendar")
    public void user_clicks_to_calendar() {
        companyPage.AddNewsButton.click();
        companyPage.calendar.click();
    }

    @Then("User selects day")
    public void user_selects_day() {
    companyPage.selectDate.click();

    }

    @Then("User sets an hour")
    public void user_sets_an_hour() {
    companyPage.setTime.click();
    companyPage.setHour.click();

    }

    @Then("User sets a minute")
    public void user_sets_a_minute() {
    companyPage.setMinute.sendKeys("30");
    }

    @Then("User clicks Select button")
    public void user_clicks_Select_button() {
        companyPage.SelectButton.click();

    }
    @When("user clicks drag&Drop")
    public void user_clicks_drag_Drop() throws InterruptedException {
        WebElement iframe = Driver.get().findElement(By.xpath("//iframe[contains(@id,'maininterfacebuttons')]"));
        Driver.get().switchTo().frame(iframe);

        companyPage.dragAndDrop.click();
        Thread.sleep(3000);
        companyPage.upload.click();
        Thread.sleep(3000);

    }
        @Then("user remove the picture")
        public void user_remove_the_picture() {
        companyPage.removeBotton.click();
    }
    @When("User selects Text")
    public void user_selects_Text() {
        companyPage.radioButton1.click();
        System.out.println("companyPage.radioButton1.isSelected() = " + companyPage.radioButton1.isSelected());
    }
    @When("User selects HTML")
    public void user_selects_HTML() {
        companyPage.radioButton2.click();
        System.out.println("companyPage.radioButton2.isSelected() = " + companyPage.radioButton2.isSelected());
    }
    @Then("User selects Visual Editor")
    public void user_selects_Visual_Editor() {
        companyPage.radioButton3.click();
        System.out.println("companyPage.radioButton3.isSelected() = " + companyPage.radioButton3.isSelected());
    }
    @When("user add a new picture")
    public void user_add_a_new_picture() throws InterruptedException {
        WebElement chooseFile = companyPage.dragAndDrop;
        chooseFile.sendKeys("/Users/evaberg/Desktop/Screenshots/Skärmavbild 2021-11-28 kl. 09.55.31.png");
        Thread.sleep(5000);
    }


    @And("user clicks details")
    public void user_clicks_details() {
        companyPage.Details.click();
    }

    @And("user clicks to pencil")
    public void user_clicks_to_pencil() {
        companyPage.edit.click();
    }

    @And("user can edit picture name")
    public void user_can_edit_picture_name() {
        companyPage.changePictureName.sendKeys("edited");
    }

    @Then("user can save changes")
    public void user_can_save_changes() {
        companyPage.saveButton.click();
    }

    @When("user clicks tag button")
    public void user_clicks_tag_button() {
        Driver.get().switchTo().frame(companyPage.iframe);
        companyPage.tag.click();
    }

    @And("user adds tags")
    public void user_adds_tags() {
        companyPage.tag.sendKeys("Added");
    }
    @Then("User writes to a title")
    public void user_writes_to_a_title() {
        companyPage.title.sendKeys("Title");
    }

    @Then("User clicks to Save and Add button")
    public void user_clicks_to_Save_and_Add_button() {
        companyPage.saveAndAddButton.click();
    }
}