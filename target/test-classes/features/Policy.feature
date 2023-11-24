Feature: Verify Policy Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on policy icon on left tool bar

  @Sanity
  Scenario: List of policies should display by clicking on policy icon on left tool bar
    Then User can see "Manage Policy" message with all policy data

  @Sanity
  Scenario: Verify dates under start date and end date should display with dd-mm-yyyy format on manage policy page
    Then All data under Start date and And date displays in dd-mm-yyyy format

  @Sanity
  Scenario: Respected policy information should displays by clicking on individual policy number on manage policy page
    When User clicks on policy number
    Then User will redirect to policy information page

  @Sanity
  Scenario:Verify that the user can download the client's policy letter
    When User clicks on policy number link
    And User clicks on letter tab on policy information page
    And User clicks on download icon
    Then User will able to see downloaded policy page

  @Sanity
  Scenario:Appropriate policy data should display upon selecting an option from the status drop down on managing policy page
    When User selects any options from status dropdown
    Then Appropriate data displays on manage policy page depend on drop down option

#  @Sanity
#  Scenario:Filter policy details on manage policy page upon from and to date value of policy  on manage policy page
#    When User enters value of from and to date value of policy on manage policy page
#    And User clicks on search button on manage policy page
#    Then Details of policy on manage policy page filters upon value of from and to date value of policy
#
#  @sanity
#  Scenario: Verify that add claim page should open with all details by clicking on add claim icon of cog drop down against policy number on manage policy page
#    When User clicks on add claim icon of cog drop down against policy number on manage policy page
#    Then Add claim displays with all details

#  @Sanity
#  Scenario: Verify that add note window should open with all details by clicking on add note icon of cog drop down against policy number on manage policy page
#    When User clicks on add note window icon of cog drop down against policy number on manage policy page
#    Then Add note window displays with all details

#  @Sanity
#  Scenario:Verify that add latter page should open with all details by clicking on add latter icon of cog drop down against policy number on manage policy page for client
#    When User clicks on add latter window icon of cog drop down against policy number on manage policy page
#    And User enter all details to generate letter for client and selects send email and letter option
#    Then Generated letter should displays under letter tab on policy information page

#  @Sanity
#  Scenario:Verify that add latter page should open with all details by clicking on add latter icon of cog drop down against policy number on manage policy page for insurer
#    When User clicks on add latter window icon of cog drop down against policy number on manage policy page
#    And User enter all details for insurer to generate letter for client and selects send email and letter option
#    Then Generated letter should displays under letter tab on policy information page

#
#  @Sanity
#  Scenario: Verify that quote information page should open with all details by clicking on view quote icon of cog drop down against active policy number on manage policy page
#    When User clicks on view quote icon of cog drop down against policy number on manage policy page
#    Then Quote information page displays with all details
#
#  @Sanity
#  Scenario: Add claim page displays with all details by clicking add claim icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And  User clicks on policy number link on manage policy page
#    And User selects add claim page icon option from cog drop dowm on policy information page
#    Then Add claim page displays with all details
#
#  @Sanity
#  Scenario: Add note window displays with all details by clicking add note icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And User clicks on policy number link on manage policy page
#    And User selects add note icon option from cog drop down on policy information page
#    Then Add note window displays with all details
#
#  @sanity
#  Scenario: Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And User clicks on policy number link on manage policy page
#    And User selects add endorsement icon of cog drop down on policy information page
#    Then Policy endorsement page displays with all details
#
#  @Sanity
#  Scenario: Quote information page displays with all details by clicking view quote icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And User clicks on policy number link on manage policy page
#    And User selects view quote icon option from cog drop down on policy information page
#    Then Quote information displays with all required details
#
#  @Sanity
#  Scenario: Cancel  policy window displays with all details by clicking cancel policy icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And User clicks on policy number link on manage policy page
#    And User selects cancel policy icon of cog drop down on policy information page
#    Then Cancel policy window displays with all required details
#
#  @sanity
#  Scenario:Allocate payment page displays with all details by clicking add allocate payment icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And User clicks on policy number link on manage policy page
#    And User selects add allocate payment icon of cog drop down on policy information page
#    Then Add allocate payment page displays with all details
#
#  @Sanity
#  Scenario:Client account maintenance displays with all details by clicking add account maintenance icon of cog drop down on policy information page
#    When User selects any active option from status dropdown on manage policy page
#    And User clicks on policy number link on manage policy page
#    And User selects add account maintenance icon of cog drop down on policy information page
#    Then Client account maintenance displays with all details
#  @Sanity
#  Scenario:Verify appropriate details should reflect by clicking on  transactions tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on transactional tab on policy information page
#    Then User will able to see appropriate data
#
#
#  Scenario:Verify appropriate details should reflect by clicking on insurer tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on insurer tab on policy information page
#    Then User will able to see appropriate data upon clicking insurer tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on claim tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on claim tab on policy information page
#    Then User will able to see appropriate data upon clicking claim tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on reversal claim tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on reversal claim tab on policy information page
#    Then User will able to see appropriate data upon clicking reversal claim tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on credit note tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on credit note tab on policy information page
#    Then User will able to see appropriate data upon clicking credit note tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on policy invoice credit note tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on policy invoice credit note tab on policy information page
#    Then User will able to see appropriate data upon clicking policy invoice credit note tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on notes tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on notes tab on policy information page
#    Then User will able to see appropriate data upon clicking notes tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on installment tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on installment tab on policy information page
#    Then User will able to see appropriate data upon clicking installment tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on exclusion tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on exclusion tab on policy information page
#    Then User will able to see appropriate data upon clicking exclusion tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on history tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on history tab on policy information page
#    Then User will able to see appropriate data upon clicking history tab
#
#
#  Scenario:Verify appropriate details should reflect by clicking on policy ledger tab on policy information page
#    When User clicks on policy number link on manage policy page
#    And User clicks on policy ledger tab on policy information page
#    Then User will able to see appropriate data upon clicking policy ledger tab

#  @Sanity
#  Scenario: Add claim for existing policy
#    When User click on policy icon and selects add claim icon for existing policy
#    And User enters claim details
#    And User clicks on save button



