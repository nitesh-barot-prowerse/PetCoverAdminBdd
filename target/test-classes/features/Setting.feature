Feature: Verify Setting Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on look up values icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on setting page should work
    When User clicks on icon on setting page
    Then User will able to redirect to respected page

  #Product Type
  @Sanity
  Scenario: To verify whether Manage Policy Type page displays with policy type details by clicking on policy type icon on setting page
    When User clicks on policy type icon setting page
    Then Manage Policy Type page displays with all policy type details

  @Sanity
  Scenario:Add policy type page  displays will all details when user clicks on add policy type icon on manage policy type page
    When User clicks on policy type icon setting page
    And User clicks on add policy type icon on manage policy type page
    Then Add policy type page displays with all details

  @Sanity
  Scenario: Edit policy type page displays upon clicking on edit icon against policy type on manage policy type page
    When User clicks on policy type icon setting page
    And User clicks on edit icon against policy type on manage policy type page
    Then Edit policy type page displays in editable format

  #Client Class
  @Sanity
  Scenario: To verify whether Manage client class page displays with client class details by clicking on client lass icon on setting page
    When User clicks on client class icon setting page
    Then Manage client class page displays with all client class details

  @Sanity
  Scenario:Add client class page  displays will all details when user clicks on add client class icon on manage class client page
    When User clicks on client class icon setting page
    And User clicks on add client class icon on manage class client page
    Then Add client class page displays with all details

  @Sanity
  Scenario: Edit client class page displays upon clicking on edit icon against client class icon on manage client class page
    When User clicks on client class icon setting page
    And User clicks on edit icon against client class name on manage client class page
    Then Edit client class page displays in editable format

   #Insurer Class
  @Sanity
  Scenario: To verify whether Manage insurer class page displays with insurer class details by clicking on insurer lass icon on setting page
    When User clicks on insurer class icon setting page
    Then Manage insurer class page displays with all client class details

  @Sanity
  Scenario:Add Insurer class page displays will all details when user clicks on add insurer class icon on manage insurer class page
    When User clicks on insurer class icon setting page
    And User clicks on add insurer class icon on manage insurer class page
    Then Add insurer class page displays with all details


  Scenario:Edit Insurer class page displays upon clicking on edit icon against insurer icon on manage insurer class page
    When User clicks on insurer class icon setting page
    And User clicks on edit icon against insurer icon on manage insurer class page
    Then Edit insurer class page displays in editable format

  #Division


  Scenario: To verify whether Manage division page displays with division details by clicking on division icon on setting page
    When User clicks on division icon setting page
    Then Manage division page displays with all division details


  Scenario:Add division page displays will all details when user clicks on add division icon on manage division page
    When User clicks on division icon setting page
    And User clicks on add division icon on manage division page
    Then Add division page displays with all details


  Scenario:Edit division page displays upon clicking on edit icon against division name on manage division page
    When User clicks on division icon setting page
    And User clicks on edit icon icon against division name on manage division page
    Then Edit division page displays in editable format


    #Branch


  Scenario: To verify whether Manage branch page displays with branch details by clicking on branch icon on setting page
    When User clicks on branch icon setting page
    Then Manage branch page displays with all branch details


  Scenario:Add branch page displays will all details when user clicks on add branch icon on manage branch page
    When User clicks on branch icon setting page
    And User clicks on add branch icon on manage branch page
    Then Add branch page displays with all details


  Scenario:Edit branch page displays upon clicking on edit icon against branch code on manage branch page
    When User clicks on branch icon setting page
    And User clicks on edit icon against branch code on manage branch page
    Then Edit branch page displays in editable format

    #Change Area


  Scenario: To verify whether Manage change area page displays with area details by clicking on change area icon on setting page
    When User clicks on change area icon setting page
    Then Manage change area page displays with all area details


  Scenario:Add change area page displays will all details when user clicks on add change area icon on manage change area  page
    When  User clicks on change area icon setting page
    And User clicks on add change area icon on manage change area  page
    Then Add change area page displays with all details


  Scenario:Edit change area page displays upon clicking on edit icon against change area name on manage change area page
    When User clicks on change area icon setting page
    And User clicks on edit icon against change area name on manage change area page
    Then Edit change area page displays in editable format

     # Sex


  Scenario: To verify whether Manage sex page of pet displays with pet sex details by clicking on change sex icon on setting page
    When User clicks on sex icon on setting page
    Then Manage sex page displays with all area details


  Scenario:Add sex page of pet displays will all details when user clicks on add sex icon on manage sex page
    When  User clicks on sex icon on setting page
    And User clicks on add sex icon on manage sex page
    Then Add sex page of pet displays with all details


  Scenario:Edit sex page of pet displays upon clicking on edit icon against sex class on manage sex page of pet
    When  User clicks on sex icon on setting page
    And User clicks on edit icon against sex class on manage sex page of pet
    Then Edit sex page of pet displays in editable format

    #Debtor code


  Scenario: To verify whether Manage Debtor Codes of pet displays with debtor code details by clicking on debtor code icon on setting page
    When User clicks on debtor code on setting page
    Then Manage Debtor Codes page displays with all debtor code details


  Scenario:Add Debtor Codes page of  displays will all details when user clicks on add Debtor Code icon on manage Debtor Codes page
    When User clicks on debtor code on setting page
    And User clicks on add debtor code icon on manage debtor code page
    Then Add debtor code page displays with all details


  Scenario:Edit debtor code page displays upon clicking on edit icon against debtor code name on manage debtor page
    When User clicks on debtor code on setting page
    And User clicks on edit icon against debtor code name on manage debtor page
    Then Edit debtor page displays in editable format

      #Renewal Type


  Scenario: To verify whether Manage renewal type page displays with renewal type details by clicking on renewal type icon on setting page
    When User clicks on renewal type icon on setting page
    Then Manage renewal type page displays with all debtor code details


  Scenario:Add renewal type page displays will all details when user clicks on add renewal type icon on manage renewal type  page
    When User clicks on renewal type icon on setting page
    And User clicks on add renewal type icon on manage debtor code page
    Then Add renewal type page displays with all details


  Scenario:Edit renewal type  page displays upon clicking on edit icon against renewal type  name on manage renewal type  page
    When User clicks on renewal type icon on setting page
    And User clicks on edit icon against renewal type name on manage renewal type page
    Then Edit renewal type page displays in editable format


## Task Type

  Scenario: To verify whether Manage task type page displays with task type details by clicking on task type icon on setting page
    When User clicks on task type icon on setting page
    Then Manage task type page displays with all task details


  Scenario:Add task type page displays will all details when user clicks on add task type icon on manage task type  page
    When User clicks on task type icon on setting page
    And User clicks on add task type icon on manage task type page
    Then Add task type page displays with all details


  Scenario:Edit task type page displays upon clicking on edit icon against task type  name on manage task type  page
    When User clicks on task type icon on setting page
    And User clicks on edit icon against task type  name on manage task type  page
    Then Edit task type page displays in editable format

    ##Task Status


  Scenario: To verify whether Manage task status page displays with task status details by clicking on task status icon on setting page
    When User clicks on task status icon on setting page
    Then Manage task status page displays with all task details

  Scenario:Add task status page displays will all details when user clicks on add task status icon on manage task status  page
    When User clicks on task status icon on setting page
    And User clicks on add task status icon on manage task status page
    Then Add task status page displays with all details


  Scenario:Edit task status page displays upon clicking on edit icon against task status  name on manage task status  page
    When User clicks on task status icon on setting page
    And User clicks on edit icon against task status  name on manage task status  page
    Then Edit task status page displays in editable format

 ##Pet Breed

  @Sanity
  Scenario: To verify whether Manage Pet Breed page displays with Pet Breed details by clicking on Pet Breed icon on setting page
    When User clicks on pet breed icon on setting page
    Then Manage pet breed page displays with all task details

  @Sanity
  Scenario:Add Pet Breed page displays will all details when user clicks on add pet breed icon on manage pet breed  page
    When User clicks on pet breed icon on setting page
    And User clicks on add pet breed icon on manage pet breed page
    Then Add pet breed page displays with all details

  @Sanity
  Scenario:Edit Pet Breed page displays upon clicking on edit icon against pet breed name on manage pet breed page
    When User clicks on pet breed icon on setting page
    And User clicks on edit icon against pet breed  name on manage pet breed page
    Then Edit pet breed page displays in editable format

    ##Exclusion Page

  @Sanity
  Scenario: To verify whether Manage Exclusion page displays with exclusion details by clicking on exclusion icon on setting page
    When User clicks on exclusion icon on setting page
    Then Manage exclusion page displays with all task details

  @Sanity
  Scenario:Add exclusion page displays will all details when user clicks on add exclusion icon on manage exclusion page
    When User clicks on exclusion icon on setting page
    And User clicks on clicks on add exclusion icon on manage exclusion page
    Then Add exclusion page displays with all details

  @Sanity
  Scenario:Edit exclusion page displays upon clicking on edit icon against exclusion code on manage exclusion page
    When User clicks on exclusion icon on setting page
    And User clicks on edit icon against exclusion code on manage exclusion page
    Then Edit exclusion page displays in editable format

    #Regular Vet

  @Sanity
  Scenario: To verify whether Manage regular vet displays with vet details by clicking on regular vet icon on setting page
    When User clicks on regular vet icon on setting page
    Then Manage regular vet displays with all task details

  @Sanity
  Scenario:Add regular vet page displays will all details when user clicks on add regular vet icon on manage regular vet page
    When User clicks on regular vet icon on setting page
    And User clicks on add regular vet icon on manage regular vet page
    Then Add regular vet page displays with all details

      ##Hear About Us

#  @Sanity
#  Scenario: To verify whether Manage hear about us page displays with  details by clicking on hear about us icon on setting page
#    When User clicks on hear about us icon on setting page
#    Then Manage hear about us page displays with all task details
#
#
#  Scenario:Add hear about us page displays will all details when user clicks on add hear about us icon on manage hear about us page
#    When User clicks on hear about us icon on setting page
#    And User clicks on add hear about us icon on manage hear about us page
#    Then Add hear about us page displays with all details
#
#
#  Scenario:Edit hear about us page displays upon clicking on edit icon against hear about us name on manage hear about us page
#    When User clicks on hear about us icon on setting page
#    And User clicks on edit icon against hear about us name on manage hear about us page
#    Then Edit hear about us page displays in editable format

