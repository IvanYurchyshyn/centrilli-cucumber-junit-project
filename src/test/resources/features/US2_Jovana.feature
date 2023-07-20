@Jovana

Feature: Login as a sales and expenses manager
  with valid credentials and get the account name

  Background: user is already on log in page
    Given user is on a log in page



  Scenario: Sales manager can login with valid credentials by clicking on login button
    When Sales manager is typing correct "email" address into the email text box
    And Sales manager is typing correct "password" into the password text box
    And Sales manager is clicking on login button
    Then Sales manager is on the inbox page and can see the account name


  Scenario: Sales manager can login with valid credentials by pressing "enter" from keyboard
    When Sales manager is typing correct "email" address into the email text box
    And Sales manager is typing correct "password" into the password text box and press enter
    Then Sales manager is on the inbox page and can see the account name




  Scenario: Expenses manager can login with valid credentials by clicking on login button
    When Expenses manager is typing correct "email" address into the email text box
    And Expenses manager is typing correct "password" into the password text box
    And Expenses manager is clicking on login button
    Then Expenses manager is on the inbox page and can see the account name

  Scenario: Expenses manager can login with valid credentials by pressing "enter" from keyboard
    When Expenses manager is typing correct "email" address into the email text box
    And Expenses manager is typing correct "password" into the password text box and press enter from keyboard
    Then Expenses manager is on the inbox page and can see the account name



    Scenario Outline: Sales manager can not login with invalid credentials
      When Sales manager is typing "<email>" address into the email text box
      And Sales manager is typing "<password>" into the password text box
      And Sales manager is clicking on login button
      Then Sales manager should not be able to log in and the error message is displayed
      Examples:
        | email                   | password      |
        | wrongUserName           | salesmanager  |
        | salesmanager44@info.com | wrongPassword |
        | wrongUserName           | wrongPassword |


  Scenario Outline: Expenses manager can not login with invalid credentials
    When Expenses manager is typing "<email>" address into the email text box
    And Expenses manager is typing "<password>" into the password text box
    And Expenses manager is clicking on login button
    Then Expenses manager should not be able to log in and the error message is displayed

    Examples:
      | email                   | password      |
      | wrongUserName           | salesmanager  |
      | salesmanager44@info.com | wrongPassword |
      | wrongUserName           | wrongPassword |


  @wip
  Scenario Outline: Expenses manager can not login with invalid credentials
    When Expenses manager is typing "<email>" address into the email text box
    And Expenses manager is typing "<password>" into the password text box
    And Expenses manager is clicking on login button
    Then Expenses manager should not be able to log in with the message **Please fill out this field.**

    Examples:
      | email           | password        |
      | wrongUserName   |                 |
      |                 |                 |
      |                 | wrongPassword   |
      | correctUserName |                 |
      |                 | correctPassword |

  Scenario Outline: Sales manager can not login with invalid credentials
    When Sales manager is typing "<email>" address into the email text box
    And Sales manager is typing "<password>" into the password text box
    And Sales manager is clicking on login button
    Then Sales manager should not be able to log in with the message **Please fill out this field.**
    Examples:

      | email           | password        |
      | wrongUserName   |                 |
      |                 |                 |
      |                 | wrongPassword   |
      | correctUserName |                 |
      |                 | correctPassword |