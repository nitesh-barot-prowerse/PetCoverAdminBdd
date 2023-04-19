Feature: Check Admin Page Data And Functionality

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on administration icon on left tool bar

  Scenario: Check Letter information  on manage letter page
    And User clicks on letter template icon on administration page
    Then User will able to see list of existing letters

  Scenario:To check whether Add template page is editable or not
    And User clicks on letter template icon on administration page
    And User clicks on edit icon against letter letter template name in list
    Then User will redirects to edit letter template page
    And User will able to edit available fields on page

  Scenario:  Verify that the Administration page displays with a set of icons.Corresponding page opens on clicking icon.
    Then Account page displays with icons and corresponding page displays by clicking on icon.



