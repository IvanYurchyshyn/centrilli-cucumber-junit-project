@US14
Feature: Accessing Modules as an Inventory Manager

  Background: User is on home page
    Given user is already logged in as "inventory" manager

  Scenario: Inventory manager can access different modules
    Given user clicks Discuss on module
    Then user see #inbox on title

  Scenario: Inventory manager can access different modules
    Given user clicks Calendar on module
    Then user see Meetings on title

  Scenario: Inventory manager can access different modules
    Given user clicks Notes on module
    Then user see Notes on title

  Scenario: Inventory manager can access different modules
    Given user clicks Contact on module
    Then user see Contacts on title

  Scenario: Inventory manager can access different modules
    Given user clicks Website on module
    Then user see Login on title

  Scenario: Inventory manager can access different modules
    Given user clicks Inventory on module
    Then user see Inventory on title

  Scenario: Inventory manager can access different modules
    Given user clicks Manufacturing on module
    Then user see Manufacturing Orders on title

  Scenario: Inventory manager can access different modules
    Given user clicks Repair on module
    Then user see Repair Orders on title

  Scenario: Inventory manager can access different modules
    Given user clicks Invoicing on module
    Then user see Customer Invoices on title

  Scenario: Inventory manager can access different modules
    Given user clicks Email Marketing on module
    Then user see Mass Mailings on title

  Scenario: Inventory manager can access different modules
    Given user clicks Employees on module
    Then user see Employees on title

  Scenario: Inventory manager can access different modules
    Given user clicks Leaves on module
    Then user see Leaves Summary on title

  Scenario: Inventory manager can access different modules
    Given user clicks Expenses on module
    Then user see My Expenses to Submit on title

  Scenario: Inventory manager can access different modules
    Given user clicks Lunch on module
    Then user see New Order Teams on title

  Scenario: Inventory manager can access different modules
    Given user clicks Maintenance on module
    Then user see Maintenance Teams on title

  Scenario: Inventory manager can access different modules
    Given user clicks Dashboard on module
    Then user see My Dashboard on title