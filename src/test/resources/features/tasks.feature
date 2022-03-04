
Feature: As a user, I should be able to use Tasks function on Tasks Page

  Background:

    Scenario Outline: display tasks in progress
    Given The user logged in as "<user>"
    When The user navigates to "Tasks"
    And  The user clicks on "All" tab
    Then the user should be able to display 'In progress' in the search box
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

    Scenario Outline: display tasks "Ongoing Tasks" tab
     Given The user logged in as "<user>"
      When The user navigates to "Tasks"
      And  The user clicks on "Ongoing" tab
     Then the user should be able to display 'Ongoing' in the search box
     Examples:
       | user               |
       | hr_username        |
       | helpdesk_username  |
       | marketing_username |


