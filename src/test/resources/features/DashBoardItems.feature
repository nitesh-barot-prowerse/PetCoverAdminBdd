Feature: Verify DashBoard Items

  Background:
  Given User should log in with username "sa" and password "Good2go@2019" to the admin panel

  @Sanity
  Scenario: Verify Client,Quote,Policy,Claim details on dash board page
    Then Dash board page displays with total and monthly numbers of client,quote,policy and claim











