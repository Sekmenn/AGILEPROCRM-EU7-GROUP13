
Feature: AGIL-682_filter and search on Activity Stream

  Scenario Outline: TCO1_User_can_search_by_Author

    Given User enters "<userType>" information
    Then User should login
    And The user should be able to click to Filter and search button
    And the user should be able to click to author box
    And the user should be able to select Employee and Department.
    Then the user should be able to click on SEARCH button.

  Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |



  @wip
  Scenario Outline: TCO2_User_can_search_by_To

    Given User enters "<userType>" information
    Then User should login
    Then The user should be able to click to Filter and search button
    And the user should be able to click to To box
    And the user should be able to select Employee and DepartmentTo.
    Then the user should be able to click on SEARCH button.
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |


