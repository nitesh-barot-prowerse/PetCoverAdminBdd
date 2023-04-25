Feature: Check Manage Policy Page Data And Functionality

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on policy icon on left tool bar

  Scenario: Check of manage policy page
    Then User can see "Manage Policy" message with all policy data

  Scenario: Verify Date format of start date and and date column data
    Then All data under Start date and And date displays in dd-mm-yyyy format

  Scenario: User will able to see policy information page after clicking on policy link on manage policy page
    When User clicks on policy number
    Then User will redirect to policy information page

  Scenario:Verify that the user can download the client's policy letter
    When User clicks on policy number link
    And User clicks on letter tab on policy information page
    And User clicks on download icon
    Then User will able to see downloaded policy page

  Scenario: Check appropriate policy data should displays against option selected from status drop down on manage policy page
    When User selects any options from status dropdown
    Then Appropriate data displays on manage policy page depend on drop down option
