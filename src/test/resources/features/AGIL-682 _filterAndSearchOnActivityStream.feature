Feature: AGIL-682_filter and search on Activity Stream

  Scenario Outline: TCO1_User_can_search_by_Author

Given user navigates to login page
    And user enters "<usertype>"
    And user enter "<user_password>"
    And user click to log in button

Examples: test data
| usertype                        |user_password         |
| helpdesk1@cybertekschool.com    |  UserUser            |
| hr1@cybertekschool.com          |  UserUser            |
| marketing@cybertekschool.com    |  UserUser            |

    Then The user should be able to click to "Filter and search" button
    And the user should be able to click to "Author" box
    And the user should be able to select "recent".
    Then the user should be able to click on "SEARCH" button.



  Scenario Outline: TCO2_User_can_search_by_To

    Given user navigates to login page
    And user enters "<usertype>"
    And user enter "<user_password>"
    And user click to log in button

    Examples: test data
      | usertype                        |user_password         |
      | helpdesk1@cybertekschool.com    |  UserUser            |
      | hr1@cybertekschool.com          |  UserUser            |
      | marketing@cybertekschool.com    |  UserUser            |

    Then The user should be able to click to "Filter and search" button
    And the user should be able to click to "To" box
    And the user should be able to select "recent".
    Then the user should be able to click on "SEARCH" button.

