@userMenu
Feature: User Menu


  @AGIL-706
  Scenario: User should be able to display Edit User Profile window
    Given The user logged in as HR
    When The user navigates to User Menu
    And  The user clicks "Edit Profile Settings" tab
    Then The title of the window contains "Edit User Profile"


  @AGIL-707
  Scenario: User should be able to display Contact Information
    Given The user logged in as HR
    When The user navigates to User Menu
    And  The user clicks "My Profile" tab
    Then The user able to display "Contact information"





