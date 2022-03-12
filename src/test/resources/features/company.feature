
Feature: AGIL 740-As a user, I should be able to add news under Company

      #bug
      Scenario Outline: TC01 Marketing User should be able to select type of information under preview text
        Given User enters "<userType>" information
        And User should login
        And User clicks to Company button
        Then User clicks to Add News button
        Examples:
          | userType           |
          | marketing_username |
    #bug
    Scenario Outline: TC02 Marketing User should be able to select date and set a time under preview text
      Given User enters "<userType>" information
      And User should login
      And User clicks to Company button
      Then User clicks to Add News button
      Examples:
        | userType           |
        | marketing_username |
  #bug
    Scenario Outline: TC03 Marketing User should be able to add and remove a picture under details
      Given User enters "<userType>" information
      And User should login
      And User clicks to Company button
      Then User clicks to Add News button
      Examples:
        | userType           |
        | marketing_username |


      #passed
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
        #after that
        Then User selects day
        Then User sets an hour
        And User sets a minute
        Then User clicks Select button
        Examples:
          | userType           |
          | hr_username        |
  @wip
      Scenario Outline: TC06 HR User should be able to add and remove a picture under details
        Given User enters "<userType>" information
        And User should login
        And User clicks to Company button
        Then User clicks to Add News button
        And user clicks details
        #after that
        And user clicks drag&Drop
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
        #after that
        And user add a new picture
        And user clicks to pencil
        And user can edit picture name
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
    #after that
        And user clicks tag button
        And user adds tags
        Then user can save changes
        Examples:
          | userType           |
          | hr_username        |


      #passed
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

        #bug
        Scenario Outline: TC10 Helpdesk User should be able to send news
          Given User enters "<userType>" information
          And User should login
          And User clicks to Company button
          Then User clicks to Add News button
          Examples:
            | userType           |
            | helpdesk_username  |

      #passed
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