Feature: Default

	#AC:
	#
	#User should be able to Join groups
	#*{color:#FF0000}User should be able to add groups to favorite{color}*
  @AGIL-704
  Scenario Outline: Verify that user can add a group to favorites
    Given User enters "<user>" information
    When The user navigates to "Workgroups"
    And User hover over star button of "Sales" group
    Then Verify "Add to favorites" is displayed under "Sales" group
    And User click star button of "Sales" group

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |