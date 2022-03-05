@wip
Feature: Sending Announcement


  Scenario Outline: Uploading files and pictures from local disks
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Upload files" icon
    And The user uploads "<file>" file
    Then The "<file>" file  should be added
    Examples:
      | user               | file          |
      | hr_username        | imageFile.img |
      | helpdesk_username  | textFile.pdf  |
      | marketing_username | textFile.txt  |


  Scenario Outline: Selecting document from bitrix
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Upload files" icon
    And The user selects document from "Sales and marketing" and chooses "NextBaseCRM Test Plan.docx"
    Then The "Q3.java" file  should be added
    # problem with the clicking sales and marketing
    Examples:
      | user               |
      | hr_username        |
      #| helpdesk_username  |
      #| marketing_username |


  Scenario Outline: Adding recipients from contact lists
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on -Add more- link
    And The user selects "Employees and departments" and "hr77@cybertekschool.com" from contact lists
    Then "hr77@cybertekschool.com" should be added in to box.

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Attaching link by clicking on link icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Link" icon
    And The user fills up "google" and "www.google.com" boxes
    Then "google" or "www.google.com" should be added into message box.

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Inserting video by clicking on link icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Insert video" icon
    And The user fills up video source box with "https://www.youtube.com/watch?v=zcHb1UqSTR8"
    Then "https://www.youtube.com/watch?v=zcHb1UqSTR8" should be added into message box.
    #When passing the url into the box It gives an error message.
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Adding quote by clicking on camma icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Quote text" icon
    And The user writes a quote "Test for quote functionalty" into quote box
    Then "Test for quote functionalty" should be added into message box as a quote.

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Adding mention by clicking on mention icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Add mention" icon
    And The user selects "Employees and departments" and "hr76@cybertekschool.com" from contact lists
    Then "hr76@cybertekschool.com" should be added in the message box.

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Adding mention by clicking on mention icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Visual editor" icon
    Then The user should be see the editor text-bar on top of the message box

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Adding mention by clicking on mention icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Topic" icon
    Then The user should be see the announcement Topic text box on top of the message box

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Recording and attaching video by clicking on record video icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Record Video" icon
    And The user clicks on allow button
    Then The user should be record a video and attach it with the message.

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: Adding tag by clicking on add tag icon
    Given The user logged in as "<user>"
    And The user navigates to More and "Announcement"
    When The user clicks on "Add tag" icon
    And The user writes a tag "Add tag testing"
    Then "Add tag testing" should be viewed in the Tags box

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |