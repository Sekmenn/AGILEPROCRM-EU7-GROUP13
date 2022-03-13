Feature: Message

  Scenario Outline: User should be able to add mention by clicking on the Add mention icon

    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Add mention" button
    And User click Employees and departments list
    And User select a person from the list
    Then Verify that user added mention
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |
