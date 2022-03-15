Feature: Default

	#*AC:*
	#
	#{color:#de350b}*1. User should be able to click on upload files icon to upload files and pictures from local disks.*{color}
	#2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon.
	#7. User should be able to send a message.
  @AGIL-781
  Scenario Outline: Verify that user should be able to click on upload files icon to upload files from local disks
    Given The user logged in as "<userType>"
    And The user click on "Message"
    When User click "Upload files" button
    And User upload "file1.docx"
    And User click send button
    Then user verify the uploaded file named "file1"
    Examples:
      | userType           |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |