Feature: Default

	#AC:
	#
	#*{color:#FF0000}User should be able to login as HR user with Valid Credentials{color}*
	#*{color:#FF0000}User should be able to login as Helpdesk user with Valid Credentials{color}*
	#*{color:#FF0000}User should be able to login as Marketing user with Valid Credentials.{color}*
	#Users should not be able to login with invalid credentials
	#Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")
  @AGIL-699
  Scenario Outline: Verify that user login to the application with valid credentials
    Given User enters "<userType>" information
    Then User should login
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |