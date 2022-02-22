Feature: Default

	#AC: 
	#
	#User should be able to login as HR user with Valid Credentials
	#User should be able to login as Helpdesk user with Valid Credentials
	#User should be able to login as Marketing user with Valid Credentials.
	#*{color:#FF0000}Users should not be able to login with invalid credentials{color}*
	#Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  @AGIL-700
  Scenario Outline: Verify that users should not be able to login with invalid credentials
    Given User enters "<username>" and "<password>"
    Then User should not login

    Examples:
      | username               | password |
      | user1                  | UserUser |
      |                        | UserUser |
      | hr1@cybertekschool.com |          |
      | hr1@cybertekschool.com | abc123   |
      |                        |          |