Feature: AGIL-682_filter and search on Activity Stream
@wip
  Scenario Outline: TCO1_User_can_search_by_Author

    Given User enters "<userType>" information
    Then User should login
    Then The user should be able to click to "Filter and search" button
    And the user should be able to click to "Author" box
    And the user should be able to select "recent".
    Then the user should be able to click on "SEARCH" button.

  Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |




  Scenario Outline: TCO2_User_can_search_by_To

    Given User enters "<userType>" information
    Then User should login
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |

    Then The user should be able to click to "Filter and search" button
    And the user should be able to click to "To" box
    And the user should be able to select "recent".
    Then the user should be able to click on "SEARCH" button.

