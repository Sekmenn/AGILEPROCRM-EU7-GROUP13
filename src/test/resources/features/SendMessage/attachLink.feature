Feature: Message


  Scenario Outline: User should be able to attach link by clicking on the link icon

    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Link" button
    And User type text and link into boxes
    Then user click save button
    And Verify that user send the message
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |
