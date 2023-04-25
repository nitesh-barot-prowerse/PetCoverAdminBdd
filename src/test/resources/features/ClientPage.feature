Feature: Verify Data Of Manage Client Page


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on client icon on left tool bar

  Scenario: User will redirect to manage client page after clicking on client icon on left tool bar
    Then User will see client details

  Scenario: Appropriate client data will display upon entering  code in search box
    When User enters code number inside search box on manage client page
    And User clicks on search button manage client page
    Then Appropriate client information displays inside table on manage client page

  Scenario: Check status of client
    When User selects appropriate option from Active dropdown on manage client page
    And User clicks on search button
    And User clicks on client code on manage client page
    Then Client status displays on view client page

  Scenario: To check whether add quote page is displays for same user by clicking on add button on view client page
    When User clicks on client code on manage client page
    And User clicks on add button on view client page
    Then Add quote page displays with same client code
