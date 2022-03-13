
@ak
Feature: As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Taskspage.


  Scenario:TC01_ HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
    Given User enters "hr_username" information
    Then User should login
    When The user navigates to "Tasks"
    Then user clicks to New Task button
    And user adds things to do
    Then user creates a high priority task
    And user creates  task in duration of the certain deadline
    And user mentions a user.
    Then user adds Task



  Scenario:TC02_Marketing User can edit the task by declaring himself/herself as responsible person.
    Given User enters "marketing_username" information
    Then User should login
    When The user navigates to "Tasks"
    Then user clicks to New Task button
    And user adds things to do
    Then user creates a high priority task
    And user adds himself herself as responsible person
    Then user adds Task




  Scenario:TC03_HR_User can edit the task for adding time tracking.
    Given User enters "hr_username" information
    Then User should login
    When The user navigates to "Tasks"
    Then user clicks to New Task button
    And user adds things to do
    When  user clicks to More button
    And user selects to task plan time section
    Then user creates the tracking time "hour" and "minute"
    Then user adds Task


    Scenario:TC04_HR User can edit the task for adding reminder to e-mail.
      Given User enters "hr_username" information
      Then User should login
      When The user navigates to "Tasks"
      Then user clicks to New Task button
      And user adds things to do
      When user clicks to More button
      Then user clicks to Add Reminder button
      Then user selects the time
      Then user chooses the mail section
      Then user adds an email to reminder
      Then user adds Task

Scenario: TC05_Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags
      Given User enters "marketing_username" information
      Then User should login
      When The user navigates to "Tasks"
      Then user clicks to New Task button
      And user adds things to do
      When  user clicks to More button
      Then user clicks to subtask button
      And user adds task
      Then  user clicks to subtask select button



    Scenario:TC06_HR User can add one more responsible person by editing created task.
      Given User enters "hr_username" information
      Then User should login
      When The user navigates to "Tasks"
      Then user clicks to New Task button
      And user adds things to do
      Then User  adds one more responsible person
      Then user adds Task



  Scenario: TC08_ Marketing User can add checklist to an already created task by editing
    Given User enters "marketing_username" information
    Then User should login
    When The user navigates to "Tasks"
    Then user clicks to New Task button
    And user adds things to do
    When user clicks to check list button
    Then user clicks check List add the item


    Scenario:TC09_HR User can add dependent tasks by editing the already created task.
      Given User enters "hr_username" information
      Then User should login
      When The user navigates to "Tasks"
      Then user clicks to New Task button
      And user adds things to do
      When user clicks to More button
      When user clicks add dependent task button
      Then user chooses recent tasks section
      Then user clicks to select button
      Then user adds Task



    Scenario:HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
      Given User enters "hr_username" information
      Then User should login
      When The user navigates to "Tasks"
      Then user clicks to New Task button
      And user adds things to do
      Then user clicks to  Task Templates button
      Then user chooses All templates section
      Then user verify that user in the templates tasks page


   Scenario:HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
     Given User enters "hr_username" information
     Then User should login
     When The user navigates to "Tasks"
     Then user clicks to New Task button
     And user adds things to do
     Then user creates a high priority task
     And user mentions  a marketing user .
     Then user chooses Time Planning
     Then user selects deadline
     Then user clicks to Option button
     Then user chooses the "Responsible person can change deadline" and "Approve task when completed" section
     Then user adds Task


    Scenario:HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
    Given User enters "hr_username" information
    Then User should login
    When The user navigates to "Tasks"
    Then user chooses main grid checkbox
    Then user clicks to SELECT ACTION button
    Then user chooses delete section
    Then user clicks to apply button
    And user clicks to continue button



