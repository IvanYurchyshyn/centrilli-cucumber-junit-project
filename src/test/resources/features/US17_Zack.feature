@US17
Feature: Accessing Modules as an Sales Manager

  Background: User is on home page
    Given user is already logged in as "sales" manager

  Scenario: Sales Manager can access different modules
    Given user click Discuss on sales module
    Then user sees #inbox on the title

  Scenario: Sales Manager can access different modules
    Given user click Calendar on sales module
    Then user sees Meetings on the title

  Scenario: Sales Manager can access different modules
    Given user click Notes on sales module
    Then user sees Notes on the title

  Scenario: Sales Manager can access different modules
    Given user click Contact on sales module
    Then user sees Contacts on the title

  Scenario: Sales Manager can access different modules
    Given user click CRM on sales module
    Then user sees Pipeline on the title

  Scenario: Sales Manager can access different modules
    Given user click Sales on sales module
    Then user sees Quotations on the title

  Scenario: Sales Manager can access different modules
    Given user click Website on sales module
    Then user sees Dashboard on the title

  Scenario: Sales Manager can access different modules
    Given user click Point of Sale on sales module
    Then user sees Point of Sale on the title

  Scenario: Sales Manager can access different modules
    Given user click Purchases on sales module
    Then user sees Requests for Quotation on the title

  Scenario: Sales Manager can access different modules
    Given user click Inventory on sales module
    Then user sees Inventory on the title

  Scenario: Sales Manager can access different modules
    Given user click Repair on sales module
    Then user sees Repair Orders on the title

  Scenario: Sales Manager can access different modules
    Given user click Invoicing on sales module
    Then user sees Invoicing Orders on the title

  Scenario: Sales Manager can access different modules
    Given user click Email Marketing on sales module
    Then user sees Mass Mailings on the title

  Scenario: Sales Manager can access different modules
    Given user click Events on sales module
    Then user sees Events on the title

  Scenario: Sales Manager can access different modules
    Given user click Employees on sales module
    Then user sees Employees on the title

  Scenario: Sales Manager can access different modules
    Given user click Leaves on sales module
    Then user sees Leaves Summary on the title

  Scenario: Sales Manager can access different modules
    Given user click Expenses on sales module
    Then user sees My Expenses to Submit on the title

  Scenario: Sales Manager can access different modules
    Given user click Maintenance on sales module
    Then user sees Maintenance Teams on the title

  Scenario: Sales Manager can access different modules
    Given user click Dashboard on sales module
    Then user sees My Dashboard on the title