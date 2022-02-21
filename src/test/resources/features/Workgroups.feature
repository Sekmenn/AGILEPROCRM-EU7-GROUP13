@workGroups
Feature: Workgroups

  Scenario Outline: User should be able to Join groups
    Given User enters "<user>" information
    When The user navigates to "Workgroups"
    And User clicks Join button to join "Sales" group
    Then Request message should be displayed under "Sales" group

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  Scenario Outline: User should be able to add groups to favorites
    Given User enters "<user>" information
    When The user navigates to "Workgroups"
    And User hover over star button of "Sales" group
    Then Verify "Add to favorites" is displayed under "Sales" group

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  Scenario Outline: User should be able to remove groups from favorites
    Given User enters "<user>" information
    And The user navigates to "Workgroups"
    When User click star button of "Sales" group
    And User hover over star button of "Sales" group
    Then Verify "Remove from favorites" is displayed under "Sales" group

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |