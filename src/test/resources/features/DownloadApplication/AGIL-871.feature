Feature: Default

	#AC:
	#
	#1. *{color:#de350b}User should be able to click on Mac OS icon under Desktop{color}*
	#*{color:#de350b}Client to download Mac version of Bitrix.{color}*
	#2. User should be able to click on Windows icon under Desktop Client to download Windows version of Bitrix.
	#3. User should be able to click on Linux icon under Desktop
	#Client to download Linux version of Bitrix.
	@AGIL-871
	Scenario Outline: User should be able to click on Mac OS icon under Desktop Client to download Mac version of Bitrix
		Given The user logged in as "<userType>"
		    When The user click on "Mac OS" under Desktop Client
		    Then The user should be able to download Desktop version of the application
		    Examples:
		      | userType           |
		      | marketing_username |
		      | helpdesk_username  |
		      | hr_username        |