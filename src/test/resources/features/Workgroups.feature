Feature: Workgroups

  Scenario Outline: User should be able to Join groups
    Given User enters "<user>" information
    When The user navigates to "Workgroups"
    And User clicks Join button to join group
    Then Request has been sent message should be displayed

    Examples:
      | user               |
      | hr_username        |
#      | helpdesk_username  |
#      | marketing_username |