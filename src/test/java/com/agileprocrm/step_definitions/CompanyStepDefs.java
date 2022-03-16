package com.agileprocrm.step_definitions;

import com.agileprocrm.pages.CompanyPage;
import com.agileprocrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;


public class CompanyStepDefs {
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
        companyPage.calendar.click();
    }

    @Then("User selects day")
    public void user_selects_day() {

    }

    @Then("User sets a time")
    public void user_sets_a_time() {
        companyPage.setTime.click();

    }


    @Then("User clicks Select button")
    public void user_clicks_Select_button() {
        companyPage.TimeSelectButton.click();

    }
    @When("user clicks drag&Drop")
    public void user_clicks_drag_Drop() {
        WebElement iframe = Driver.get().findElement(By.xpath("//iframe[contains(@id,'maininterfacebuttons')]"));
        Driver.get().switchTo().frame(iframe);
        companyPage.dragAndDrop.click();
        companyPage.upload.click();

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
    public void user_add_a_new_picture(){
        WebElement UploadImg = companyPage.dragAndDrop;
        UploadImg.sendKeys("/Users/evaberg/Desktop/Project.png");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("user clicks details")
    public void user_clicks_details() {
        companyPage.Details.click();
    }

    @And("user clicks to pencil")
    public void user_clicks_to_pencil() {
        companyPage.pencil.click();
    }

    @Then("user can save changes")
    public void user_can_save_changes() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        for (int i = 0; i < 5; i++) {
            jse.executeScript("window.scrollBy(0,250)");
        }
        companyPage.savebtn.click();
    }

    @When("user clicks tag button")
    public void user_clicks_tag_button() {
        companyPage.tag.click();
    }

    @And("user adds tags")
    public void user_adds_tags() {
        companyPage.tag.sendKeys("2022,technology");

    }
    @Then("User writes to a title")
    public void user_writes_to_a_title() {
        companyPage.title.sendKeys("Title");
    }
    @Then("User clicks to Save and Add button")
    public void user_clicks_to_Save_and_Add_button() {
        companyPage.saveButton.click();
    }
}