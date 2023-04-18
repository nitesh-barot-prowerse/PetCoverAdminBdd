Feature:Launched Page Verification by displayed text

  Background:
    Given User is one the website login page

  Scenario: Check displayed text on homepage
    When User verify admin login page through url
    Then User will able to see text "(en-GB)" behind copyright message