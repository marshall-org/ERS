Feature: Employee login 

Scenario: Employee successfully logs in (positive test)
	Given I am at the login page 
	When I enter a valid username
	And I enter in a valid password 
	Then I should be taken to the employee welcome page and be able to see my first and last name displayed in the webpage
	
Scenario: Employee doesnt include username (negative test)
	Given I am at the login page 
	When I enter in a valid password
	Then I should see a message telling me to please enter in a username
	
Scenario: Employee doesnt include password (negative test)
	Given I am at the login page
	When I enter in a valid username
	Then I should see a message telling me to please enter in a password
	
Scenario: Employee doesnt provide valid username (negative test)
	Given I am at the login page 
	When I enter in an invalid username 
	And I enter in an invalid password
	Then I should see a message telling me I have an invalid username/password
	
Scenario: Employee doesnt provide valid password (negative test)
	Given I am at the login page 
	When I enter in a valid username
	And I enter in an invalid password
	Then I should see a message telling me I have an invalid username/password
	
