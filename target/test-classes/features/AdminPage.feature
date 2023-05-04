Feature: Check Admin Page Data And Functionality

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on administration icon on left tool bar

#  Scenario: Check Letter information  on manage letter page
#    And User clicks on letter template icon on administration page
#    Then User will able to see list of existing letters
#
#  Scenario:To check whether Add template page is editable or not
#    And User clicks on letter template icon on administration page
#    And User clicks on edit icon against letter letter template name in list
#    Then User will redirects to edit letter template page
#    And User will able to edit available fields on page
#
#  Scenario:  Verify that the Administration page displays with a set of icons.Corresponding page opens on clicking icon.
#    Then Account page displays with icons and corresponding page displays by clicking on icon.
#
#  Scenario: To verify whether View Product page displays with product details with status after by clicking on product code on manage product page
#    When User clicks on product icon administration page
#    And User clicks on product code on manage product page
#    Then View product page displays with all product details
#
#  Scenario: To verify if insurer pop up windows displays by  clicking on insurer configuration pop up on setting icon on manage product page
#    When User clicks on product icon administration page
#    And User clicks on insurer configuration icon
#    Then Insurer configuration displays with all details
#
#  Scenario: To verify if agent configuration pop up windows displays by  clicking on agent configuration on setting icon on manage product page
#    When User clicks on product icon administration page
#    And User clicks on agent configuration icon
#    Then Agent configuration displays with all details
#
#  Scenario: Filter data on manage department page upon entering respective department value in search box
#    When User clicks on department icon on administrator page
#    When User enters department value in to search input on manage department page
#    And User clicks on search button on manage department page
#    Then Respected data upon department value will display on manage department page
#
#  Scenario: Manage Bank Account page displays with all details by clicking on bank account icon on administration page
#    When User clicks on bank account icon
#    Then Manage bank account page displays with all details
#
#
#  Scenario: Filter data of bank details upon bank account and insurer drop down items on manage bank account page
#    When User clicks on bank icon on administration page
#    And User selects any item from bank account drop down
#    And User selects any item from insurer drop down
#    And User clicks on search button on manage bank account page
#    Then User will find respected data under bank detail table
#
#  Scenario: Add Bank account page displays with details after clicking on add bank account button on manage bank account page
#    When User clicks on bank icon on administration page
#    And User clicks on add bank account icon on manage bank account page
#    Then Add bank account page displays with all details
#
#  Scenario: On the manage bank account page , click the Edit icon against a insurer name. The Edit Bank Account page should open with the  data in editable format.
#    When User clicks on bank icon on administration page
#    And User clicks on edit icon against insurer name on manage bank account page
#    Then Edit Bank account page displays with all fields in editable format
#
#  Scenario: Manage insurer page will displays with all details by clicking on insurer icon on Administrator page
#    When User clicks on insurer icon on administration page
#    Then Manage insurer page will displays with all details
#
#  Scenario: View Insurer page displays with all insurer details after clicking on insurer code link on manage insurer page
#    When User clicks on insurer icon on administration page
#    And User clicks on insurerCode link on manage insurer page
#    Then View insurer page displays with current insurer details
#
#  Scenario: On Manage insurer page list of data has filtered and displayed upon value of Type,Category,and Active drop down
#    When User clicks on insurer icon on administration page
#    And User selects appropriate options from Type,Category and Active drop down
#    Then On manage insurer page list of data reflects upon drop downs values
#
#  Scenario: Add insurer page displays with all fields by clicking on add insurer icon on manage insurer page
#    When User clicks on insurer icon on administration page
#    And User clicks on add insurer icon on manage insurer page
#    Then Add insurer page displays with all fields
#
#  Scenario: View Agent page displays with all details by clicking on agent reference number on Manage agent page
#    When User clicks on agent icon
#    And User clicks on agent reference number under list of agent details
#    Then View agent page displays with all information

  Scenario: Manage Company page displays with list of companies by clicking on company icon on administration page
    When User clicks on company icon
    Then Manage company page displays with list of available companies

