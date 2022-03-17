Feature: Download Application


  Scenario Outline: User should be able to click on Mac OS icon under Desktop
  Client to download Mac version of Bitrix
    Given The user logged in as "<userType>"
    When The user click on "Mac OS" under Desktop Client
    Then The user should be able to download Desktop version of the application
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |

  @wip
  Scenario Outline: User should be able to click on Mac OS icon under Desktop
  Client to download Mac version of Bitrix
    Given The user logged in as "<userType>"
    When The user click on "Windows" under Desktop Client
    Then The user should be able to download Desktop version of the application
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |

  Scenario Outline: User should be able to click on Mac OS icon under Desktop Client to download Mac version of Bitrix
    Given The user logged in as "<userType>"
    When The user click on "Linux" under Desktop Client
    Then The user should be able to download Desktop version of the application
    Examples:
      | userType           |
      | marketing_username |
      | helpdesk_username  |
      | hr_username        |