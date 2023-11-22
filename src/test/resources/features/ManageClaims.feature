Feature: Verify Manage Claim Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on manage claims icon on left tool bar

  @Sanity
  Scenario:Manage claims page should open with the claim details after clicking on manage claim icon on left tool bar
    Then User will able see all data available on manage claim page

  @Sanity
  Scenario: All data under date column displays with dd-mm-yyyy format and data under amount should prefixed by £ sign on manage claim page
    Then All data under treatment and cliam first advised date column displays in dd-mm-yyyy format
    Then  All data under Amount paybale column prefixed by £ sign

  @Sanity
  Scenario: User will redirect to respected claim information page by clicking on claim number link on manage claim page
    When User clicks on claim number on manage claim page
    Then User will redirects to respected claim information page

  @Sanity
  Scenario: Add claim page displays all dropdowns with valid items and date appears with calender icon
    When User clicks on add claim button
    Then User will redirect to add claim page
    And Page has all dropdown with valid list items'


#  Scenario: Treatment status should reflect upon option selected from treatment status drop down on manage claim page
#    When User selects any options from treatment status dropdown on manage claim page
#    Then Appropriate treatment status will display on manage claim page under claim details
#
#
#  Scenario:Verify edit claim page displays after clicking on edit claim icon on manage claim page
#    When User clicks on edit claim icon on cog icon on manage claim page
#    Then Edit claim page displays with editable form
#
#
#  Scenario:Verify view policy page displays after clicking on view policy icon on manage claim page
#    When User clicks on view policy  icon on cog icon on manage claim page
#    Then View policy  page displays with all details
#
#
#  Scenario:Filter Claim details on manage claim page upon option from claim status drop down
#    When User selects appropriate option from claim status dropdown
#    And User clicks on search button on manage claim page
#    Then Details of claim on manage claim page filters upon status drop dwon option
#
#
#  Scenario:Filter Claim details on manage claim page upon option from treatment status drop down
#    When User selects appropriate option from treatment status drop down
#    And User clicks on search button on manage claim page
#    Then Details of claim on manage claim page filters upon treatment status drop down option
#
#  @Sanity
#  Scenario:Filter Claim details on manage claim page upon from and to date value of claim first advised on manage claim page
#    When User enters value of from and to date value of claim first advised on manage claim page
#    And User clicks on search button on manage claim page
#    Then Details of claim on manage claim page filters upon value of from and to date value of claim first advised on manage claim page

  @Sanity
  Scenario: Add claim for any client
    When User clicks on add claim button
    And User enters client details
    And User enters policy details
    And User enters claim details
    And User clicks on save button


