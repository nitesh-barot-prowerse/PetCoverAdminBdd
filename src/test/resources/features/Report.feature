Feature: Verify Report page hyperlinks

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on reports icon on left tool bar

  Scenario: All hyperlinks with icons on setting page should work
    Then User will able to see total six section of report category

  Scenario: User will able to redirect on respected report page by clicking on report icon on report page
    When User clicks on reports icon
    Then Respected report page displays

  Scenario: Filter quote report information upon product,status,quote from drop down
    When User clicks on quote report button on report button
    And User selects any option from product,quote from and quote status drop down on quote report page
    And User clicks on search button on quote report page
    Then Appropriate data displays on on quote report page upon selected options from drop down

  Scenario: Sorting data on quote report page via quote number
    When User clicks on quote report button on report button
    And User selects quote number option from sort by and Ascceding option from sort direction drop down
    Then All data on quote report page displays with quote number and acsceding manner
