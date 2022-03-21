package com.agileprocrm.step_definitions;
import com.agileprocrm.utilities.BrowserUtils;
import com.agileprocrm.utilities.Driver;
import com.agileprocrm.pages.Poll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PollStepDefs {

    Poll poll = new Poll();

    @When("The user clicks on Poll module")
    public void theUserClicksOnPollModule() {

        poll.pollTab.click();
    }

    @And("the user clicks on The link icon")
    public void theUserClicksOnTheLinkIcon() {
        BrowserUtils.waitFor(3);
        poll.link.click();
    }

    @And("the user type agileprocrm.com on Link URL")
    public void theUserTypeAgileprocrmComOnLinkURL() {

            poll.inputLink.sendKeys("agileprocrm.com");
        }

        @When("the user clicks on Save button")
        public void theUserClicksOnSaveButton() {
            poll.saveLink.click();
        }

    @Then("the user should see attached Link in the content box")
    public void theUserShouldSeeAttachedLinkInTheContentBox() {
        Driver.get().switchTo().frame(poll.pollFrame);
        BrowserUtils.waitFor(3);
        String actualLink = "agileprocrm.com";
        String expectedLink = poll.message.getText();
        Assert.assertTrue(actualLink.contains(expectedLink));
    }

    @And("the user clicks on Add mention icon")
    public void theUserClicksOnAddMentionIcon() {
        poll.addMention.click();
    }

    @Then("the user clicks on the first username and see added user in the content box")
    public void theUserClicksOnTheFirstUsernameAndSeeAddedUserInTheContentBox() {
        String actualUser=poll.addMentionUserName.getText();
        poll.addMentionUserName.click();
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().frame(poll.pollFrame);
        String expectedUser= poll.addedUserName.getText();
        Assert.assertTrue(actualUser.contains(expectedUser));
    }






    @And("the user type Choose A or B in Question box")
    public void theUserTypeChooseAOrBInQuestionBox() {

        poll.firstQuestion.sendKeys("Choose A or B");

    }


    @And("the user type A in first answer box")
    public void theUserTypeAInFirstAnswerBox() {
        poll.firstAnswer.sendKeys("A");
    }

    @And("the user type B in second answer box")
    public void theUserTypeBInSecondAnswerBox() {
        poll.secondAnswer.sendKeys("B");
    }


    @When("the user clicks on Add question")
    public void theUserClicksOnAddQuestion() {
        poll.addQuestion.click();

    }

    @Then("the user should see new Question box")
    public void theUserShouldSeeNewQuestionBox() {
        WebElement secondQuestionBox = Driver.get().findElement(By.id("question_1"));
        Assert.assertTrue(secondQuestionBox.isDisplayed());


    }

    @Then("the user should see third answer box")
    public void theUserShouldSeeThirdAnswerBox() {
        WebElement thirdAnswerBox = Driver.get().findElement(By.xpath("//*[@id='votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff']/div/ol/li/ol/li[3]"));
        Assert.assertTrue(thirdAnswerBox.isDisplayed());

    }

    @When("the user select the Allow multiple choice checkbox")
    public void theUserSelectTheAllowMultipleChoiceCheckbox() {
        poll.allowMultiple.click();

    }

    @Then("the user should see the Allow multiple choice box is checked")
    public void theUserShouldSeeTheAllowMultipleChoiceBoxIsChecked() {
        WebElement allowMultiple = Driver.get().findElement(By.id("multi_0"));
        Assert.assertTrue(allowMultiple.isSelected());
    }

    @And("the user type Choose in Second Question box")
    public void theUserTypeChooseInSecondQuestionBox() {
        poll.secondQuestionBox.sendKeys("Choose");
    }

    @When("the user clicks on Cross icon of Question box")
    public void theUserClicksOnCrossIconOfQuestionBox() throws InterruptedException {
        WebElement cross = Driver.get().findElement(By.xpath("//*[@id='votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff']/div/ol/li[2]/div[1]/label"));
    BrowserUtils.clickWithJS(cross);
        Alert alert = Driver.get().switchTo().alert();
        BrowserUtils.waitFor(3);
        alert.accept();



    }


    @Then("the user should delete the second question")
    public void theUserShouldDeleteTheSecondQuestion() {
        WebElement questionBox = Driver.get().findElement(By.xpath("//*[@id='votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff']/div/ol/li[1]"));
        Assert.assertTrue(questionBox.isDisplayed());

    }

    @And("the user type C in third answer box")
    public void theUserTypeCInThirdAnswerBox() {
        poll.thirdAnswer.sendKeys("C");

    }

    @When("the user clicks on Cross icon of third answer")
    public void theUserClicksOnCrossIconOfThirdAnswer() throws InterruptedException {
        WebElement cross = Driver.get().findElement(By.xpath("//*[@id='votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff']/div/ol/li/ol/li[3]/label"));
        BrowserUtils.clickWithJS(cross);
        Alert alert = Driver.get().switchTo().alert();
        BrowserUtils.waitFor(3);
        alert.accept();
    }

    @Then("the user should delete the Answer")
    public void theUserShouldDeleteTheAnswer() {
        WebElement secondAnswer = Driver.get().findElement(By.id("answer_0__1_"));
        Assert.assertTrue(secondAnswer.isDisplayed());

    }

    @When("the user clicks on SEND button")
    public void theUserClicksOnSENDButton() {
        BrowserUtils.waitFor(3);
        poll.sendButton.click();
        BrowserUtils.waitFor(3);
    }




    @Then("the user should see the poll on Activity Stream")
    public void theUserShouldSeeThePollOnActivityStream() {
        WebElement heading = Driver.get().findElement(By.className("feed-post-text-block-inner-inner"));
        BrowserUtils.waitFor(3);
        String actualPollTitle = "abcdefg";
        String expectedPollTitle = heading.getText();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedPollTitle, actualPollTitle);

    }

    @And("the user clicks on Add more")
    public void theUserClicksOnAddMore() {

        poll.addMore.click();
    }

    @When("the user clicks on Employees and departments")
    public void theUserClicksOnEmployeesAndDepartments() {
        BrowserUtils.waitFor(3);
        poll.employDepart.click();
        BrowserUtils.waitFor(5);
    }

    @Then("the user clicks on the user and see added user in the box")
    public void theUserClicksOnTheUserAndSeeAddedUserInTheBox() {
        String actualUser= poll.addMoreUser.getText();
        poll.addMoreUser.click();
        BrowserUtils.waitFor(3);
        String expectedUser= poll.destinationBox.getText();
        Assert.assertTrue(expectedUser.contains(actualUser));
    }




    @And("the user type Finally in the text box")
    public void theUserTypeFinallyInTheTextBox() {
        Driver.get().switchTo().frame(poll.pollFrame);
        BrowserUtils.waitFor(3);
        WebElement message = Driver.get().findElement(By.xpath("/html/body[1]"));
        BrowserUtils.waitFor(3);
        message.sendKeys("abcdefg");
        Driver.get().switchTo().parentFrame();
    }
}


