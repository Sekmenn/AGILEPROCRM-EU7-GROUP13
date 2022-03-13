Feature: Message


  Scenario Outline: User should be able to insert videos by clicking
  on the video icon and entering the video URL

    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Insert video" button
    And User type the source
    Then user click save button
    And Verify that user send the video
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |