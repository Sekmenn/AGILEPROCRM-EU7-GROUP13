@Poll
Feature: Poll

@AGIL-783
  Scenario Outline: User should be able to attach link by clicking on the link icon.
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user clicks on The link icon
    And the user type agileprocrm.com on Link URL
    When the user clicks on Save button
    Then the user should see attached Link in the content box
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  @AGIL-784
  Scenario Outline: User should be able to add user
    Given The user logged in as "<user>"
    And The user clicks on Poll module
    When the user clicks on Add mention icon
    Then the user clicks on the first username and see added user in the content box

    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |



  @AGIL-785
  Scenario Outline::User should be able to add questions
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user type Choose A or B in Question box
    And the user type A in first answer box
    And the user type B in second answer box
    When the user clicks on Add question
    Then the user should see new Question box
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  @AGIL-786
  Scenario Outline:User should be able to add multiple answers.
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user type Choose A or B in Question box
    And the user type A in first answer box
    When the user type B in second answer box
    Then the user should see third answer box
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  @AGIL-787
  Scenario Outline:User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user type Choose A or B in Question box
    And the user type A in first answer box
    And the user type B in second answer box
    When the user select the Allow multiple choice checkbox
    Then the user should see the Allow multiple choice box is checked
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  @AGIL-788
  Scenario Outline:User should be able to delete questions
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user type Choose A or B in Question box
    And the user type A in first answer box
    And the user type B in second answer box
    And the user clicks on Add question
    And the user type Choose in Second Question box
   When the user clicks on Cross icon of Question box
    Then the user should delete the second question
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |
  @AGIL-789
  Scenario Outline:User should be able to delete multiple answers.
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user type Choose A or B in Question box
    And the user type A in first answer box
    And the user type B in second answer box
    And the user type C in third answer box
    When the user clicks on Cross icon of third answer
    Then the user should delete the Answer
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |


  @AGIL-792
  Scenario Outline:User should be able to add users from Employees and Departments contact lists.
    Given The user logged in as "<user>"
    And The user clicks on Poll module
    And the user clicks on Add more
    When the user clicks on Employees and departments
    Then the user clicks on the user and see added user in the box
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |

  @AGIL-790
  Scenario Outline:User should be able to send a poll.
    Given The user logged in as "<user>"
    When The user clicks on Poll module
    And the user type Finally in the text box
    When the user clicks on SEND button
    Then the user should see the poll on Activity Stream
    Examples:
      | user               |
      | hr_username        |
      | helpdesk_username  |
      | marketing_username |