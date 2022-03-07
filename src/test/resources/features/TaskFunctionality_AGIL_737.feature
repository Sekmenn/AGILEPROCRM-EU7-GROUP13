

Feature: As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Taskspage.
Background:

  Given User enters "hr_username" information
  Then User should login
  When The user navigates to "Tasks"
  Then user clicks to New Task button
  And user adds things to do
  @ak
  Scenario: TC01_HR User can create a high priority task in duration of the certain deadline by mentioning about a user.

    Then user creates a high priority task
    And user creates  task in duration of the certain deadline
    And user mentions a user.
    Then user adds Task

  Scenario:  TC03 HR_User can edit the task for adding time tracking.
      Then  user clicks to "Time Tracking" button
      And user selects to task plan time section
      Then user creates the tracking time "2.30"
      Then user adds Task

    Scenario: TC04_HR User can edit the task for adding reminder to e-mail.
      When user clicks to "Add Reminder" button
      Then user selects the time
      Then user chooses the "mail" section
      Then user adds an email to reminder
      Then user adds Task

    Scenario: TC06_HR User can add one more responsible person by editing created task.
      Then User  adds one more responsible person as "marketing27@cybertekschool.com"
      Then user adds Task

    Scenario: TC09_HR User can add dependent tasks by editing the already created task.
      When user clicks to "More" button
      When user clicks "add dependent task" button
      Then user chooses "recent tasks" section
      Then user clicks to "select" button
      Then user adds Task

    Scenario: TC10_HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
      Then user clicks to "Task Templates" button
      Then user chooses "All templates" section
      Then user verify that user in the templates tasks page
      Then user adds Task

   Scenario: TC11_HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
        Then user creates a high priority task
        And user mentions  a user "marketing3@cybertekschool.com".
        Then user chooses "deadline" section
        Then user selects the time "5 day", "2 hour and half"
        Then user clicks to "Option" button
        Then user chooses the "Responsible person can change deadline" and "Approve task when completed" section
        Then user adds Task


    Scenario:TC12_HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
            Then user chooses "recent send task"
            Then user clicks to "SELECT ACTION" button
            Then user chooses "delete" section
            Then user clicks to "apply" button
            And user clicks to "continue" button
            Then user adds Task


