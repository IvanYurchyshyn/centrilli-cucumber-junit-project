@B29G29-232
Feature: As POS and eventCRM manager, I should be able to Login with valid credentials.

	
	@B29G29-224
	Scenario: POS Manager logs in with valid credentials by clicking on the "Login" button
		Given User is on the login page
		    When The user enters valid username "posmanager5@info.com" and valid password "posmanager"
		    And The user clicks on the "Login" button
		    Then The user should be logged in successfully	

	
	@B29G29-225
	Scenario: As POS and eventCRM manager, I should be able to Login with valid credentials.
		Given User is on the login page
		    When The user enters valid username "eventscrmmanager10@info.com" and valid password "eventscrmmanager"
		    And The user clicks on the "Login" button
		    Then The user should be logged in successfully	

	
	@B29G29-227
	Scenario Outline: As POS and eventCRM manager, I should be able to Login with valid credentials.
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

	
	@B29G29-229
	Scenario Outline: As POS and eventCRM manager, I should be able to Login with valid credentials.
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

	
	@B29G29-230
	Scenario: As POS and eventCRM manager, I should be able to Login with valid credentials.
		Given User is on the login page
		    When The user do not enters any username and enters valid password "posmanager"
		    And The user clicks on the "Login" button
		    Then The posmanager  gets the "Please fill out this field." message for at least one blank field.	

	
	@B29G29-231
	Scenario: As POS and eventCRM manager, I should be able to Login with valid credentials.
		Given User is on the login page
		    When The user enters valid username "eventscrmmanager10@info.com" and do not enters any password
		    And The user clicks on the "Login" button
		    Then The eventcrmmanager gets the "Please fill out this field." message for at least one blank field.