Feature: Default

	#AC:
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	#2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#*{color:#de350b}5. User should be able to create a quote by clicking on the Comma icon.{color}*
	#6. User should be able to add mention by clicking on the Add mention icon.
	#7. User should be able to send a message.
  @AGIL-815
  Scenario Outline: Verify that user should be able to create a quote by clicking on the Comma icon
    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Quote text" button
    And User type "new quote" into box
    And User click send button
    Then Verify that user send the quote
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |