
Feature: Sending Message as Helpdesk User

  Background:
    Given The user logged in as "helpdesk_username"
    Then The user click on "Message"

  Scenario: User should be able to click on upload files icon to upload files
    Given User click Upload Files button
    When User upload "file1.docx"
    Then user verify the uploaded file name "file1"


  Scenario: User should be able to click on upload files icon to upload picture
    Given User click Upload Files button
    When User upload "picture1.jpeg"
    Then user verify the uploaded picture name "picture1"