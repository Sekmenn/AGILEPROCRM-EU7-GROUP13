Feature: Message


  Scenario Outline: User should be able to create a quote by clicking on the Comma icon

    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Quote text" button
    And User type "new quote" into box
    Then Verify that user send the quote
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |