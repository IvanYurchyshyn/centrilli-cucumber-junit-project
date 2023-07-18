@US15
Feature: Accessing Modules as an Event Manager

  Background: User is on home page
    Given user is already logged in as "event" manager

  Scenario: Event manager can access different modules
    Given user click Discuss on module
    Then user sees #inbox on title

  Scenario: Event manager can access different modules
    Given user click Calendar on module
    Then user sees Meetings on title

  Scenario: Event manager can access different modules
    Given user click Notes on module
    Then user sees Notes on title

  Scenario: Event manager can access different modules
    Given user click Contact on module
    Then user sees Contacts on title

  Scenario: Event manager can access different modules
    Given user click CRM on module
    Then user sees Pipeline on title

  Scenario: Event manager can access different modules
    Given user click Sales on module
    Then user sees Quotations on title

  Scenario: Event manager can access different modules
    Given user click Website on module
    Then user sees Dashboard on title

  Scenario: Event manager can access different modules
    Given user click Inventory on module
    Then user sees Inventory on title

  Scenario: Event manager can access different modules
    Given user click Repair on module
    Then user sees Repair Orders on title

  Scenario: Event manager can access different modules
    Given user click Events on module
    Then user sees Events on title

  Scenario: Event manager can access different modules
    Given user click Employees on module
    Then user sees Employees on title

  Scenario: Event manager can access different modules
    Given user click Leaves on module
    Then user sees Leaves Summary on title

  Scenario: Event manager can access different modules
    Given user click Expenses on module
    Then user sees My Expenses to Submit on title

  Scenario: Event manager can access different modules
    Given user click Maintenance on module
    Then user sees Maintenance Teams on title

  Scenario: Event manager can access different modules
    Given user click Dashboard on module
    Then user sees My Dashboard on title

