@Ihsan
Feature: As POS and eventCRM manager, I should be able to Login with valid credentials.

  @posmanagervalid
  Scenario: POS Manager logs in with valid credentials by clicking on the "Login" button
    Given User is on the login page
    When The user enters valid username "posmanager5@info.com" and valid password "posmanager"
    And The user clicks on the "Login" button
    Then The user should be logged in successfully

  @eventcrmmanagervalid
  Scenario: Event CRM Manager logs in with valid credentials by clicking on the "Login" button
    Given User is on the login page
    When The user enters valid username "eventscrmmanager10@info.com" and valid password "eventscrmmanager"
    And The user clicks on the "Login" button
    Then The user should be logged in successfully


  @posmanagerinvalid
  Scenario Outline: POS Manager logs in with invalid credentials by clicking on the "Login" button
    Given User is on the login page
    When The user enters invalid username "<username>" and invalid password "<password>"
    And The user clicks on the "Login" button
    Then Error message should be displayed after entering the invalid credentials

    Examples:
      |username|password|
      |wrongUserName|UserUser123|
      #| posmanager101   | wrongPassword |
      #| wrongUserName   | wrongPassword |
      #| wrongUserName   | empty         |
      #| empty           | wrongPassword |
      #| empty           | empty         |


  @eventcrmmanagerinvalid
  Scenario Outline: Event CRM Manager logs in with invalid credentials by clicking on the "Login" button
    Given User is on the login page
    When The user enters invalid username "<username>" and invalid password "<password>"
    And The user clicks on the "Login" button
    Then Error message should be displayed after entering the invalid credentials

    Examples:
      |username|password|
      |wrongUserName|UserUser123|
      #| eventmanager101 | wrongPassword |
      #| wrongUserName   | wrongPassword |
      #| wrongUserName   | empty         |
      #| empty           | wrongPassword |
      #| empty           | empty         |

  @posmanageroneblankfield
  Scenario: POS Manager logs in with at least one blank field by clicking on the "Login" button
    Given User is on the login page
    When The user do not enters any username and enters valid password "posmanager"
    And The user clicks on the "Login" button
    Then The posmanager  gets the "Please fill out this field." message for at least one blank field.

  @eventcrmmanageroneblankfield
  Scenario: Event CRM Manager logs in with at least one blank field by clicking on the "Login" button
    Given User is on the login page
    When The user enters valid username "eventscrmmanager10@info.com" and do not enters any password
    And The user clicks on the "Login" button
    Then The eventcrmmanager gets the "Please fill out this field." message for at least one blank field.

