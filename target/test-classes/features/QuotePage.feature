Feature: Verify Data And Functionality Of Manage Quote Page


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on quote icon on left tool bar

  Scenario: User will redirect to manage quote page after clicking on quote icon on left tool bar
    When User clicks on quote icon on left tool bar
    Then User will see quote details

  Scenario:To Check Quote date and Expire date at quote table displays in dd-mm-yyyy format
    Then User will able to see all data under quote date and expire date column displays with dd-mm-yyyy format

  Scenario: One can redirect to add quote page by clicking add quote button on top right corner of manage quote
    When User clicks add quote button on manage quote page
    Then User will able to see add quote page with data

  Scenario:Verify data under total and monthly premium column preceding by £ sign
    Then User will able to see  all data under total and monthly premium colum prefixed by £ sign

  Scenario:To check whether user will able able to redirect and see data on microchip file upload  page after clicking on upload microchip button on manage quote page
    When User clicks on upload microchip file button
    Then User will be able to see microchip file upload page with data

