
Feature: Calendar


  Scenario Outline: User should be able to display My Calendar by clicking "My Calendar" tab
    Given The user logged in as "<user>"
    When The user navigates to "Calendar"
    And  The user clicks on "My Calendar"
    Then The title contains "Calendar"
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  Scenario Outline: User should be able to display Company Calendar by clicking "Company Calendar" tab
    Given The user logged in as "<user>"
    When The user navigates to "Calendar"
    And  The user clicks on "Company Calendar"
    Then The title contains "Event Calendar"
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |