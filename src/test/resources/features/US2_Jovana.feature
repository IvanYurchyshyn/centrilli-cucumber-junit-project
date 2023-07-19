@Jovana

Feature: Login as a sales and expenses manager
  with valid credentials and get the account name

  Background: user is already on log in page
    Given user is on a log in page


  Scenario: Sales manager can login with valid credentials
    Given Sales manager is typing correct "email" address into the email text box
    Then Sales manager is typing correct "password" into the password text box
    Then Sales manager is clicking on login button
    Then Sales manager is on the inbox page and can see the account name



  Scenario: Expenses manager can login with valid credentials
    Given Expenses manager is typing correct "email" address into the email text box
    Then Expenses manager is typing correct "password" into the password text box
    Then Expenses manager is clicking on login button
    Then Expenses manager is on the inbox page and can see the account name


    Scenario Outline: Sales manager can not login with invalid credentials
      Given Sales manager is typing "<email>" address into the email text box
      Then Sales manager is typing "<password>" into the password text box
      Then Sales manager is clicking on login button
      Then Sales manager should not be able to log in
      Examples:
        | email                   | password      |
        | wrongUserName           | salesmanager  |
        | salesmanager44@info.com | wrongPassword |
        | wrongUserName           | wrongPassword |
        | wrongUserName           | empty         |
        | empty                   | wrongPassword |
        | empty                   | empty         |

  Scenario Outline: Expenses manager can not login with invalid credentials
    Given Expenses manager is typing "<email>" address into the email text box
    Then Expenses manager is typing "<password>" into the password text box
    Then Expenses manager is clicking on login button
    Then Expenses manager should not be able to log in

    Examples:
      | email                   | password      |
      | wrongUserName           | salesmanager  |
      | salesmanager44@info.com | wrongPassword |
      | wrongUserName           | wrongPassword |
      | wrongUserName           | empty         |
      | empty                   | wrongPassword |
      | empty                   | empty         |

