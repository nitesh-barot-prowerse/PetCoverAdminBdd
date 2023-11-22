Feature: Verify Account Module Functionalities

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on account icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on account page should work
    When User clicks on icon
    Then User will redirect to respected page

  #Bank
#@Stage
#  Scenario: Filter data of manage bank page upon entering account number
#    When User clicks on bank icon
#    And User enters account number in search box on manage bank page
#    And User clicks on search button on manage bank page
#    Then Data on manage bank page reflects upon account number
  @Sanity
  Scenario: Filter data of manage bank page upon entering account number
    When User clicks on bank icon
    And User enters client name in search box on manage bank page
    And User clicks on search button on manage bank page
    Then Data on manage bank page reflects upon client name
  @Sanity
  Scenario: Bank Information page displays with details after clicking on bank code link on manage bank details
    When User clicks on bank icon
    And User clicks on bank code link on manage bank page
    Then Bank information page displays with details


  Scenario:Add Bank page  displays will all details when user clicks on add bank icon on manage bank page
    When User clicks on bank icon
    And User clicks on add bank icon on manage bank page
    Then Add bank page displays with all details


  #Receipt

  Scenario:Allocate Payment page displays will all details when user clicks on add receipt icon on manage receipt page
    When User clicks on manage receipt icon on account page
    And User clicks on add receipt icon on manage receipt page
    Then Allocate Payment page displays with all details

  #Manage Breach register


  Scenario:Add breach register page  displays will all details when user clicks on Add breach register on manage breach register page
    When User clicks on manage breach registers icon
    And User clicks on Add breach register icon on manage breach register page
    Then Add breach register page displays with all details

  ##Policy review

  @Sanity
  Scenario: Filter Policy review information upon policy end date and to date
    When User clicks on policy review button on account page
    And User enters policy end date and to date value on policy review page
    And User clicks on search button on policy review page
    Then Appropriate data displays on policy review page upon date values

     ##Process Credit Card Payment


  Scenario: Filter Process Credit Card Payment information upon payment due date and receipt date
    When User clicks on Process Credit Card button on account page
    And User enters payment due date and receipt date value on Process Credit Card page
    And User clicks on search button on Process Credit Card
    Then Appropriate data displays on Process Credit Card upon date values