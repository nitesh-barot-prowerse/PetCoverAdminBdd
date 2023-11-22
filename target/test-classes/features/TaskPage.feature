Feature: Verify Task Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on task icon on left tool bar

  @Sanity
  Scenario: User will redirect to manage task page after clicking on task icon on left tool bar
    Then User redirects to "Manage Task" page
    And User see concern data on manage task page

  @Sanity
  Scenario: To check whether Assign to dropdown on add task page appears with current user after clicking on add task button on add task page
    When user clicks on add task button
    Then User redirects to page with "Add Task" message
    And Assigned to dropdown appears with initial current user
  @Sanity
  Scenario: Appropriate data should display upon selecting an option from the status drop down on managing task page
    When User Selects any option from status dropdown on manage task page
    Then Status tage of manage task data displays accordingly

  @Sanity
  Scenario:Appropriate data should display upon selecting an option from the priority drop down on managing task page
    When User Selects any option from priority dropdown on manage task page
    Then Data under priority column of task data displays accordingly

  @Sanity
  Scenario:Appropriate data should display upon selecting an option from the type drop down on managing task page
    When User Selects any option from type dropdown on manage task page
    Then Data under type column of task data displays accordingly


  Scenario: Appropriate data should display upon selecting an option from the client drop down on managing task page
    When User Selects any option from client dropdown on manage task page
    Then Data under client column of task data displays accordingly


  Scenario:To check task details should open after clicking on task title on manage task page
    When User clicks on task tile on task manage page
    Then Task details window will open with all task details


#  Scenario: To check add task page displays with all details  by clicking on add task button on manage task page
#    When user clicks on add task button
#    Then Add task page displays with all details
#
#
#    Scenario:Edit task page should open in editable format by clicking on edit icon on manage edit page
#      When User clicks on edit icon on manage task page
#      Then Edit task page opens in editable format


