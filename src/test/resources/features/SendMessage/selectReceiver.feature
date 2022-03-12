Feature: Add multiple users from Employees and Departments
@wip
  Scenario Outline: User should be able to add users from selecting multiple contacts from
  Employees and Departments contact lists.

    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click Add persons box
    And User click Employees and departments list
    Then user add two persons from the list
    And Verify that user sends the message
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


