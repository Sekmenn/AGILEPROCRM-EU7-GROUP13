@login
Feature: Login function

  Scenario: User login to the application as an HR
    Given User enters "hr" information
    Then User should login

  Scenario: User login to the application as an HR
    Given User enters "helpdesk" information
    Then User should login

  Scenario: User login to the application as an HR
    Given User enters "marketing" information
    Then User should login


  Scenario Outline: User should not be able to login with wrong credentials
    Given User enters "<username>" and "<password>"
    Then User should not login

    Examples:
      | username               | password |
      | user1                  | UserUser |
      |                        | UserUser |
      | hr1@cybertekschool.com |          |
      | hr1@cybertekschool.com | abc123   |
      |                        |          |

