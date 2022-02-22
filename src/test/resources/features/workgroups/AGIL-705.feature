Feature: Default

	#AC:
	#
	#User should be able to Join groups
	#{color:#FF0000}*User should be able to add groups to favorite*{color}
  @AGIL-705
  Scenario Outline: Verify that user can remove the group from favorites
    Given User enters "<user>" information
    And The user navigates to "Workgroups"
    When User hover over star button of "Sales" group
    Then Verify "Remove from favorites" is displayed under "Sales" group
    And User click star button of "Sales" group

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |