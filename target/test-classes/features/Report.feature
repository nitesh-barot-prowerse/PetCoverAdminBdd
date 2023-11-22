Feature: Verify Report Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on reports icon on left tool bar

  @Sanity
  Scenario: Click on Report icon on the left tool bar.  Verify that the Report Page displays with six sections.
    Then User will able to see total six section of report category

  @Sanity
  Scenario: User will able to redirect on respected report page by clicking on report icon on report page
    When User clicks on reports icon
    Then Respected report page displays

  #Quote Report

  @Sanity
  Scenario: Filter quote report information upon option of product drop down
    When User clicks on quote report button on report page
    And User selects any option from product drop down on quote report page
    And User clicks on search button on quote report page
    Then Appropriate data displays on quote report page upon selected option from drop down

  @Sanity
  Scenario: Filter quote report information upon options value of quote status and quote from drop downs
    When User clicks on quote report button on report page
    And User selects any option from quote from and quote status drop down on quote report page
    And User clicks on search button on quote report page
    Then Appropriate data displays on quote report page upon selected options from drop down

  @Sanity
  Scenario: Sorting data on quote report page via quote number and sort direction dropdowns options
    When User clicks on quote report button on report page
    And User selects quote number option from sort by and Ascending option from sort by direction drop down respectively
    And User clicks on search button on quote report page
    Then All data on quote report page displays in sorting manner

  #Policy Summary Report


  Scenario: Filter policy report information upon option of product drop down
    When User clicks on policy summary report button on report page
    And User selects any option from product drop down on policy summary report page
    And User clicks on search button on policy summary report page
    Then Appropriate data displays on policy summary report page upon selected option from drop down


  Scenario: Filter policy report information upon option of status drop down
    When User clicks on policy summary report button on report page
    And User selects any option from status drop down on policy summary report page
    And User clicks on search button on policy summary report page
    Then Appropriate data displays on policy summary report page upon selected option from status drop down


  Scenario: Sorting data on policy summary report page via policy number and sort direction dropdowns options
    When User clicks on policy summary report button on report page
    And User selects policy number option from sort by and ascending option from sort direction drop down respectively
    And User clicks on search button on policy summary report page
    Then Appropriate data displays on policy summary report page upon selected option from both drop down

     ##Outstanding renewal report

  Scenario: Filter outstanding renewal report information upon from and to date values
    When User clicks on outstanding renewal report button on report page
    And User enters from and to date value on outstanding renewal report page
    And User clicks on search button on outstanding renewal report page
    Then Appropriate data displays on outstanding renewal report page upon selected option from drop down

  # Policy Payment history report

#  Scenario: Filter Policy Payment history report information upon from and to date
#    When User clicks on policy payment history button on report page
#    And User enters from and to date value on policy payment history page
#    And User clicks on search button on policy policy payment history page
#    Then Appropriate data displays on policy payment history page upon selected option from drop down

  #Policy Cancellation Report


  Scenario: Filter policy cancellation report information upon option of insurer drop down
    When User clicks on policy cancellation report button on report page
    And User selects any option from insurer drop down on policy cancellation report page
    And User clicks on search button on policy policy cancellation report page
    Then Appropriate data displays on policy policy cancellation report page upon selected option from drop down

  Scenario: Sorting data on policy cancellation report via sort by and sort direction dropdowns options
    When User clicks on policy cancellation report button on report page
    And User selects any option from sort by and option from sort direction drop down respectively
    And  User clicks on search button on policy policy cancellation report page
    Then Appropriate data displays on policy policy cancellation report page upon selected option from drop down

   #Outstanding claims report

  Scenario: Filter Outstanding Claims report information upon notified from and to date
    When User clicks on outstanding claims button on report page
    And User enters from and to date value on outstanding claims page
    And User clicks on search button on outstanding claims
    Then Appropriate data displays on outstanding claims upon date values


  Scenario: Sorting data on Filter Outstanding Claims report via sort by and sort direction dropdowns options
    When User clicks on outstanding claims button on report page
    And User selects any option from sort by and option from sort direction drop down respectively on Filter Outstanding Claims page
    And  User clicks on search button on outstanding claims
    Then Appropriate data displays on outstanding claims upon selected option from drop down

    #26 and 27 report

  @Sanity
  Scenario:Add premium and claim adjustments window opens by clicking on adjustment button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on adjustment button on section report page
    Then Add premium and claim adjustments window opens with all details

  @Sanity
  Scenario:Payment window opens by clicking on payments button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on payments button on section report page
    Then Payments window opens with all details

  @Sanity
  Scenario:Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on bank button on section report page
    Then Opening and Closing bank balance window opens with all details

