@Login
Feature: Login Scenarios

@Login_Successfull
  Scenario: Login with valid credentials
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    Then Verify whether user is logged in successfully
@TC_6   
   Scenario: Is there an error if using an invalid username and/or password?
    Given User enters credentials to login and clicks submit button
    | Username | Password |
    |	fksjfk   | sfsddf   | 	
    Then Verify whether error message is displayed
@TC_15
	Scenario: Is the Username required?
    Given User enters credentials to login and clicks submit button
    | Username | Password |
    |			   	 |   cdsc 	| 	
    Then Verify whether blank error message is displayed
@TC_16
	Scenario: Does the Username require three or more characters and less than 50 characters?
    Given User enters credentials to login and clicks submit button
    | Username 																					 | Password |
    |	fk		   																					 | sfsddf   |
    |asseocarnisanguineoviscericartilaginonervomedullary | dffgdfg  | 	
    Then Verify whether username error message is displayed
@TC_23
	Scenario: Is the password required?
    Given User enters credentials to login and clicks submit button
    | Username | Password |
    |		dfdf	 |    			| 	
    Then Verify whether blank error message is displayed
@TC_186
  Scenario: COGs Menu - Does clicking on Log Off from the COGs navigation menu take the user to the login screen for the tennant in the same browser tab?
    Given User enters credentials to login and clicks submit button
    | Username  | Password     |
    |	autouser1 | Perfection@1 | 	
    Then Verify whether user is logged in successfully 
    Then Verify whether user reaches login page after logout
@Registration
  Scenario: User Registration
    Given User is on Login Page
    When User goes to registration page and fills in registration form
    | emailid  					 | username | password 		 | firstname | lastname | company | mobile no  |
    |	martin@yopmail.com | martin   | Perfection@1 | steeve    | martin   | test    | 9500813531 | 
    Then Verify whether user is Registered successfully 

	    
    
    