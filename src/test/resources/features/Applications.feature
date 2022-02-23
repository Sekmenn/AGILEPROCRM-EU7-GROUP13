@wip
Feature: As a user, I can use Applications menu; so that I can install or manage the applications.

  Scenario Outline: User can display the applications
Given User enters "<userType>" information
Then User should login
When user should be able to click applications
Then user should be able to display the applications
Examples:
| userType           |
| marketing_username |
| helpdesk_username  |
| hr_username        |


Scenario Outline: User can send a request for installing if there is no permission for installing
Given User enters "<userType>" information
Then User should login
When user should be able to click applications
And user should be able to click view button
And user should be able to click install button
Then user should be able to send a request for installing

Examples:
| userType           |
| marketing_username |
| helpdesk_username  |
| hr_username        |


  Scenario Outline: User can display the application's description, versions, support and installation
    Given User enters "<userType>" information
    Then User should login
    When user should be able to click applications
    And user should be able to click view button
    Then user should be able to display the application's features
      | Description |
      | Versions    |
      | Support     |
      | Install     |

    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |