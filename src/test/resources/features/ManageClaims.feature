Feature: Verify Available Data And Functionality On ManageClaims Page

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on manage claims icon on left tool bar

  Scenario: User will redirect to manage claims page after clicking on manage claim icon on left tool bar
    Then User will able see all data available on manage claim page

  Scenario: All data concern date displays with dd-mm-yyyy format and data of amount prefixed by £ sign on manage claim page
    Then All data under treatment and cliam first advised date column displays in dd-mm-yyyy format
    Then  All data under Amount paybale column prefixed by £ sign