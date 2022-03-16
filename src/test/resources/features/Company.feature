
Feature: AGIL 740-As a user, I should be able to add news under Company

  Scenario Outline: TC01 Marketing User should be able to select type of information under preview text
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    Examples:
      | userType           |
      | marketing_username |

  Scenario Outline: TC02 Marketing User should be able to select date and set a time under preview text
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    Examples:
      | userType           |
      | marketing_username |

  Scenario Outline: TC03 Marketing User should be able to add and remove a picture under details
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    Examples:
      | userType           |
      | marketing_username |

  Scenario Outline: TC04 HR User should be able to select type of information under preview text
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    Then User selects to type of information
    Examples:
      | userType           |
      | hr_username        |

  Scenario Outline: TC05 HR User should be able to select date and set a time under preview text
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    And User clicks to calendar
    Then User selects day
    Then User sets a time
    Then User clicks Select button
    Examples:
      | userType           |
      | hr_username        |

  Scenario Outline: TC06 HR User should be able to add and remove a picture under details
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    And user clicks details
    And user add a new picture
    Then user remove the picture
    Examples:
      | userType           |
      | hr_username        |


  Scenario Outline: TC07 HR User should be able to edit a picture under details
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    When user clicks details
    And user add a new picture
    And user clicks to pencil
    Then user can save changes
    Examples:
      | userType           |
      | hr_username        |



  Scenario Outline: TC08 HR User should be able to add tags under details
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    And user clicks details
    And user clicks tag button
    And user adds tags
    Then user can save changes
    Examples:
      | userType           |
      | hr_username        |


  Scenario Outline: TC09 HR User should be able to select Text, HTML and Visual Editor
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    And User selects Text
    And User selects HTML
    Then User selects Visual Editor
    Examples:
      | userType           |
      | hr_username        |


  Scenario Outline: TC10 Helpdesk User should be able to send news
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    Examples:
      | userType           |
      | helpdesk_username  |


  Scenario Outline: TC11 HR User should be able to send news
    Given User enters "<userType>" information
    And User should login
    And User clicks to Company button
    Then User clicks to Add News button
    And User writes to a title
    Then User clicks to Save and Add button
    Examples:
      | userType           |
      | hr_username        |