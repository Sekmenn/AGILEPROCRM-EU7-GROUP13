Feature: User should be able to click on upload files icon to upload files and pictures from local disks.

  Scenario Outline: User should be able to click on upload files icon to upload files
    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Upload files" button
    And User upload "file1.docx"
    Then user verify the uploaded file named "file1"
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  Scenario Outline: User should be able to click on upload files icon to upload picture
    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Upload files" button
    And User upload "picture1.jpeg"
    Then user verify the uploaded picture named "picture1"
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |