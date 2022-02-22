Feature: Default

	#AC:
	#
	#{color:#FF0000}*User should be able to Join groups*{color}
	#User should be able to add groups to favorite
  @AGIL-703
  Scenario Outline: Verify that user can join groups
    Given User enters "<user>" information
    When The user navigates to "Workgroups"
    And User clicks Join button to join "Sales" group
    Then Request message should be displayed under "Sales" group

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |