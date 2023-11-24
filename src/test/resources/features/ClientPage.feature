Feature:  Verify Client Module Features


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on client icon on left tool bar

  @Sanity
  Scenario:Ensure that the Manage Client page displays list of client data after clicking on client icon on left tool bar
    Then Manage client page displays with list of clients

#  Scenario Outline: Enter new client
#    When User clicks on add client icon on dashbord
#    And User enters client details from "<fileName>"
#    And User clicks on create button
#    Then View client page displays
#    Examples:
#      | fileName           |
#      | client/client.json |


#  Scenario Outline: To verify edit client functionality for existing client
#    When User clicks on client code on manage client page
#    And User selects edit client sections from setting dropdown besides the active text on view client page
#    And User enters all details of client on edit client window from  from "<fileName>"
#    Then Updated details can view on view client page
#    Examples:
#      | fileName           |
#      | client/editclient.json |


#    And User enters all client details "client/client.json"
#    And User clicks on create button on add client page
#    Then View client page appears with the details of currently added client

  @Sanity
  Scenario: Filter list of client based on active status dropdown option on manage client page also verifies client status on view client page
    When User selects appropriate option from Active dropdown on manage client page
    And User clicks on search button
    And User clicks on client code on manage client page
    Then Client status displays on view client page

  @Sanity
  Scenario: To check whether add quote page is displays for same user by clicking on add button on view client page
    When User clicks on client code on manage client page to add quote
    And User clicks on add button on view client page
    Then Add quote page displays with same client code


#  Scenario: view client page should displays with all details for each client code link on manage client page
#    When User clicks on client code link  on manage client page
#    Then View client page displays with all details
#
#
#  Scenario:Edit client page should display in editable format by clicking on edit client icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on edit client icon on cog dropdown menu on view client page
#    Then Edit client page displays in editable format
#
#  @Sanity
#  Scenario:Add quote page should display in editable format by clicking on add quote icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on add quote icon on cog dropdown menu on view client page
#    Then Add quote page should display in editable format
#
#
#  Scenario:Add policy page should display in editable format by clicking on add policy icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on add policy icon on cog dropdown menu on view client page
#    Then Add policy page should display in editable format
#
#  @Sanity
#  Scenario:Add claim page should display with all details by clicking on add claim icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on add claim icon on cog dropdown menu on view client page
#    Then Add claim page should display with all details
#
#  @Sanity
#  Scenario:Client Refund Unallocated Balance page displays with all details by clicking on client refund unallocated balance icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on client refund unallocated balance icon on cog dropdown menu on view client page
#    Then Client Refund Unallocated Balance page displays with all details
#
#  @Sanity
#  Scenario:Client Refund Credit Note page displays with all details by clicking on client refund credit note icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on client refund credit note icon on cog dropdown menu on view client page
#    Then Client Refund Credit Note page displays with all details
#
#  @Sanity
#  Scenario:Client Allocate Payment page displays with all details by clicking on client allocate payment icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on client allocate payment icon on cog dropdown menu on view client page
#    Then Client Allocate Payment page displays with all details
#
#  @Sanity
#  Scenario:Client Account Maintenance page displays with all details by clicking on client account maintenance page icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on client account maintenance page icon on cog dropdown menu on view client page
#    Then Client Account Maintenance page displays with all details
#
#  Scenario:Debtor ledger page should display in editable format by clicking on debtor ledger icon on cog dropdown menu on view client page
#    When User clicks on client code on manage client page
#    And User clicks on  clicking on debtor ledger icon on cog dropdown menu on view client page
#    Then Debtor ledger page should display in editable format
#
#
#
#  Scenario: Policies details of client displays by clicking on policy tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on policy tab on view client page
#    Then Policies details should display on view client page
#
#
#  Scenario: Claims details of client displays by clicking on claim tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on claim tab on view client page
#    Then Claim details should display on view client page
#
#
#  Scenario: Contacts details of client displays by clicking on contact tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on contact tab on view client page
#    Then Contact details should display on view client page
#
#
#  Scenario: Notes details of client displays by clicking on notes tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on notes tab on view client page
#    Then Notes details should display on view client page
#
#
#  Scenario: Task details of client displays by clicking on task tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on task tab on view client page
#    Then Task details should display on view client page
#
#  Scenario: History details of client displays by clicking on history tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on history tab on view client page
#    Then History details should display on view client page
#
#
#  Scenario: Quotes details of client displays by clicking on quote tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on quote tab on view client page
#    Then Quote details should display on view client page
#
#
#  Scenario: Policies Statement details of client displays by clicking on policies statement tab on view client page
#    When User clicks on client code on manage client page
#    And User clicks on policies statement tab on view client page
#    Then Policies Statement details should display on view client page
#
#
#
#
#  Scenario:Filter the list of Policies details under policy tab on view client page by selecting appropriate option from status dropdown
#    When User clicks on client code on manage client page
#    And User clicks on policy tab on view client page
#    And User selects  appropriate option from status dropdown
#    Then Filtered Policies details should display on view client page
#
#
#  Scenario:Filter the list of Policies details under claim tab on view client page by selecting appropriate option from status dropdown
#    When User clicks on client code on manage client page
#    And User clicks on claim tab on view client page
#    And User selects  appropriate option from status dropdown on view page
#    Then Filtered Policies details should display on view client page





#  @Qa
#  Scenario: Appropriate client data will display upon entering  code in search box
#    When User enters code number inside search box on manage client page
#    And User clicks on search button manage client page
#    Then Appropriate client information displays inside table on manage client page

#  @Qa @Stage
#  Scenario:Verify add contact feature of client
#    When User clicks on client code on manage client page
#    And User selects Add contact option from setting dropdown besides of active text on view client page
#    And User enters all details inside add client window
#    Then Contact details can view under contacts menu on view client page
#
#  @Qa @Stage
#  Scenario: Verify add notes feature of client
#    When User clicks on client code on manage client page
#    And User selects Add notes options from setting dropdown besides the active text on view client page
#    And User enters all details inside add notes window
#    Then Notes details can view under note menu tab on view client page
#
#  @Qa @Stage
#  Scenario: Verify add task feature of client
#    When User clicks on client code on manage client page
#    And User selects Add task options from setting dropdown besides the active text on view client page
#    And User enters all details inside add task window
#    Then Task details can view under task menu tab on view client page
#
#  @Qa @Stage
#  Scenario: To verify edit client functionality for existing client
#    When User clicks on client code on manage client page
#    And User selects edit client sections from setting dropdown besides the active text on view client page
#    And User enters all details of client on edit client window
#    Then Updated details can view on view client page

#  @Production
#  Scenario:Verify add primary contact feature of client on production
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects Add contact option from setting dropdown besides of active text on view client page
#    And User enters all details inside add client window
#    Then Contact details can view under contacts menu on view client page
#
#  @Production
#  Scenario: Verify add notes feature of client on production environment
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects Add notes options from setting dropdown besides the active text on view client page
#    And User enters all details inside add notes window
#    Then Notes details can view under note menu tab on view client page
#
#  @Production
#  Scenario: Verify add task feature of client on production environment
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects Add task options from setting dropdown besides the active text on view client page
#    And User enters all details inside add task window
#    Then Task details can view under task menu tab on view client page
#
#  @Production
#  Scenario: To verify edit client functionality for existing client on production environment
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects edit client sections from setting dropdown besides the active text on view client page
#    And User enters all details of client on edit client window
#    Then Updated details can view on view client page









