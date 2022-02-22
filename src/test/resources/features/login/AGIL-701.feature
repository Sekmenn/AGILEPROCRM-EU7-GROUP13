Feature: Default

	#AC:
	#
	#User should be able to login as HR user with Valid Credentials
	#User should be able to login as Helpdesk user with Valid Credentials
	#User should be able to login as Marketing user with Valid Credentials.
	#Users should not be able to login with invalid credentials
	#{color:#FF0000}*Users should not be able to try to login after 5 tries with invalid credentials. (Error message should be "Please try again after one minute")*{color}
	@AGIL-701
	Scenario: Verify that users should not be able to try to login after 5 tries with invalid credentials.
		Given User enters invalid username and password five times
		And User should not login immediately
		Then User should display "Please try again after one minute"