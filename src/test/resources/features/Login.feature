Feature:Login To Admin Panel

  Background:
    Given User is one the website login page

@Sanity
  Scenario Outline: User login as an admin
    When User log in as "<fileName>"
    Then User should be logged in
    And User will be able to see dashBoard
    And User will be able to see "(en-GB)" text on right top corner of page
    Examples:
      |fileName           |
      |login/user.json|










